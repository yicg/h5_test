package com.yilutong.cases;

import com.yilutong.common.ConstParam;
import com.yilutong.common.DriverBase;
import com.yilutong.common.WebElementCommon;
import com.yilutong.handle.*;
import com.yilutong.utils.ActionsUtil;
import com.yilutong.utils.WebElementUtil;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.TestNG;
import org.testng.annotations.*;

import java.sql.DriverManager;
import java.util.List;

/**
 * @Author: yicg
 * @Date: 2020/6/9 16:40
 * @Version 1.0
 */
public class TestDemo extends DriverBase {

    static final long TIME=2000;

    int channelId=83;
    String openId="oI_kUw9jaumnO4sntgLJBBmM_FoM";
    String wechatId="gh_ddacef6564d5";
    String ticketId="3D9D8E227B2724F04EBC3E5940770A4B6931F311D685CDBCBD1B1E935732F613079D8AA2EFB11F2AF12ADB9E2A63A677B4C13C275244EABDA00567F19CA8172C";

    String testUrl="https://uat.yilutong.com/wechat_carowner/index.html?channelId="+channelId
            +"&openId="+openId
            +"&wechatId="+wechatId
            +"&curedirect=index&ticketId="+ticketId
            +"&YLT=1";

    private WebElementCommon webElementCommon;
    private BaseHandle baseHandle;
    private WashCarInfoHandle washCarInfoHandle;
    private WashOrderHandle washOrderHandle;
    private MaintainInfoHandle maintainInfoHandle;
    private PayHandle payHandle;


    public TestDemo() {
        webElementCommon=new WebElementCommon();
        baseHandle = new BaseHandle();
        washCarInfoHandle=new WashCarInfoHandle();
        washOrderHandle=new WashOrderHandle();
        maintainInfoHandle=new MaintainInfoHandle();
        payHandle=new PayHandle();
    }



    @BeforeTest
    public void beforeTest(){
        DriverBase.openBrower("chrome");
    }

    @Test
    public void demo() throws InterruptedException {
        ActionsUtil.getUrl(testUrl);
        Thread.sleep(20000);
        baseHandle.carWashServiceClick();
        //点击洗车订单，进入到已下单页面
        ActionsUtil.oneClick(WebElementUtil.findElement(By.xpath("//*[@id=\"taskTo\"]")));
        //选择下单列表的第一个订单
        ActionsUtil.oneClick(WebElementUtil.findElement(By.xpath("/html/body/ul/div[1]/div[1]/div[2]/div[1]/div[2]")));
        //取消支付
        ActionsUtil.oneClick(WebElementUtil.findElement(By.xpath("//*[@id=\"toCancel\"]")));
        //弹框选择取消
        ActionsUtil.oneClick(WebElementUtil.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/button[1]")));
        //点击立即支付
        ActionsUtil.oneClick(WebElementUtil.findElement(By.xpath("//*[@id=\"toPay\"]")));
        //选择支付宝支付
        Thread.sleep(5000);
        ActionsUtil.oneClick(WebElementUtil.findElement(By.xpath("//*[@id=\"p_one_channelList\"]/div/div")));
        Thread.sleep(5000);


    }

    /**
     * 洗车服务
     * @throws InterruptedException
     */
    @Test
    public void washServiceTest() throws InterruptedException {
        //打开应该
        ActionsUtil.getUrl(testUrl);
        Thread.sleep(20000);
        baseHandle.carWashServiceClick();
        //点击搜索按钮
        washCarInfoHandle.checkSearchButtonClick();
        //搜框里输入门店并点击键盘回车键    爱座驾汽车养护专家（七浦店）
        washCarInfoHandle.sendCheckSearchInputText("爱座驾汽车养护专家（七浦店）");
        Thread.sleep(TIME);
        //选择查询结果的门店
        washCarInfoHandle.selCarWashShopClick();
        //点击GPS
        Thread.sleep(TIME);
        washCarInfoHandle.gpsInfoClick();
        //点击返回按钮
        washCarInfoHandle.backButtonClick();
        //再次选择洗车店
        Thread.sleep(TIME);
        baseHandle.carWashServiceClick();
        Thread.sleep(TIME);
        washCarInfoHandle.checkSearchButtonClick();
        washCarInfoHandle.sendCheckSearchInputText("爱座驾汽车养护专家（七浦店）");
        Thread.sleep(TIME);
        //选择查询结果的门店进入
        washCarInfoHandle.selCarWashShopClick();
        Thread.sleep(TIME);
        //点击suv
        washCarInfoHandle.suvCarClick();
        Thread.sleep(TIME);
        washCarInfoHandle.smallCarClick();
        //点击活动券按钮
        Thread.sleep(TIME);
        washCarInfoHandle.unusedVoucherClick();
        //选择活动券
        Thread.sleep(TIME);
        washCarInfoHandle.tickActivityClick();
        //点击去洗车按钮
        washCarInfoHandle.toWashButtonClick();
        //获取下单页面的店铺信息   上海市虹口区七浦路133号B1
        //联系店铺
        //washOrderHandle.washOrderContactShopClick();
        //导航
        Thread.sleep(TIME);
        washOrderHandle.washOrderGpsInfoClick();
        Thread.sleep(TIME);
        //退出导航
        washCarInfoHandle.backButtonClick();
        Thread.sleep(TIME);
        //确认优惠券已勾选,获取勾选的优惠券名字，做断言   198元洗车年卡
        String activity_name=washOrderHandle.getWashOrderActivityNameText();
        Assert.assertEquals(activity_name,"198元洗车年卡");
        //获取服务总价值金额,做断言  ￥460
        String total_amount=washOrderHandle.getWashOrderTotalAmountText();
        System.out.println(total_amount);
        Assert.assertEquals(total_amount,"￥460");
        //实际付款金额，做断言  ￥0.03
        String actual_amount=washOrderHandle.getWashOrderActualAmountText();
        Assert.assertEquals(actual_amount,"￥0.03");
        System.out.println(actual_amount);
        //绑定车牌输入框   沪K123456
        washOrderHandle.setWashOrderLicenseInputText("沪K123456");
        //获取下方文本信息,可以做断言   *该年卡仅限此车牌使用，下单后将无法修改
        String bottom_text= washOrderHandle.getWashOrderBottomText();
        Assert.assertEquals(bottom_text,"*该年卡仅限此车牌使用，下单后将无法修改");
       //获取立即下单按钮的文本信息，可以做断言。获取这个按钮属性  立即下单/true
        String button_text=washOrderHandle.getWashOrderConfirmText();
        Assert.assertEquals(button_text,"立即下单");
        //点击下单按钮
        washOrderHandle.washOrderConfirmClick();
        Thread.sleep(TIME);
        payMethod();
    }

    /**
     * 检测服务
     */
    @Test
    public void checkServiceTest() throws InterruptedException {
        //打开应该
        ActionsUtil.getUrl(testUrl);
        Thread.sleep(20000);
        //选择检测服务
        baseHandle.carInspectionServiceClick();
        //搜索店铺
        washCarInfoHandle.checkSearchButtonClick();
        washCarInfoHandle.sendCheckSearchInputText("爱座驾汽车养护专家（七浦店）");
        //选择搜索到的店铺
        Thread.sleep(TIME);
        washCarInfoHandle.selCarWashShopClick();
        //点击联系店铺
        // washCarInfoHandle.contactShopClick();
        //跳转至GPS页面
        Thread.sleep(TIME);
        washCarInfoHandle.gpsInfoClick();
        //点击返回按钮
        washCarInfoHandle.backButtonClick();
        Thread.sleep(TIME);
        //再次选择检测服务
        baseHandle.carInspectionServiceClick();
       //点击搜索的放大镜
        Thread.sleep(TIME);
        washCarInfoHandle.checkSearchButtonClick();
        //搜索框精确搜索店铺
        washCarInfoHandle.sendCheckSearchInputText("爱座驾汽车养护专家（七浦店）");
        //点击进入选择搜索到的店铺
        Thread.sleep(TIME);
        washCarInfoHandle.selCarWashShopClick();
        Thread.sleep(TIME);
        //点击用券，如果没有券提示一个弹框
        washCarInfoHandle.unusedVoucherClick();
        //点击去检测
        Thread.sleep(TIME);
        washCarInfoHandle.toWashButtonClick();
        //联系店铺
        //washOrderHandle.washOrderContactShopClick();
        //导航
        Thread.sleep(TIME);
        washOrderHandle.washOrderGpsInfoClick();
        Thread.sleep(TIME);
        //退出导航
        washCarInfoHandle.backButtonClick();
        Thread.sleep(TIME);
        //获取服务总价值金额,做断言  ￥0.01
        String total_amount=washOrderHandle.getWashOrderTotalAmountText();
        Assert.assertEquals(total_amount,"￥0.01");
        //实际付款金额，做断言  ￥0.01
         String actual_amount=washOrderHandle.getWashOrderActualAmountText();
        Assert.assertEquals(actual_amount,"￥0.01");
        //获取底部文字
        String actul_text=washOrderHandle.getCheckOrderBottomText();
        String expect_text="*每个订单仅限当天有效，下单后请在门店营业时间内到店服务哦~";
        Assert.assertEquals(actul_text,expect_text);
        //点击下单按钮
        washOrderHandle.washOrderConfirmClick();
        //支付订单
        payMethod();


    }

    /**
     * 车辆保养服务
     */
    @Test
    public void maintainServiceTest() throws InterruptedException {
        ActionsUtil.getUrl(testUrl);
        Thread.sleep(20000);
        //把代办年检元素拖拽到最左边洗车元素页面
        ActionsUtil.dropToElement(baseHandle.checkYearCarElement(),baseHandle.washCarElement());
        Thread.sleep(TIME);
        //点击保养
        baseHandle.carMaintainServiceClick();
        Thread.sleep(TIME);
        //点击搜索按钮
        washCarInfoHandle.checkSearchButtonClick();
        //搜框里输入门店并点击键盘回车键    自解报销(实报实销)
        Thread.sleep(TIME);
        washCarInfoHandle.sendCheckSearchInputText("自解报销(实报实销)");
        Thread.sleep(TIME);
        //选择查询结果的门店
        washCarInfoHandle.selCarWashShopClick();
        Thread.sleep(TIME);
        washCarInfoHandle.gpsInfoClick();
        //点击返回按钮
        washCarInfoHandle.backButtonClick();
        Thread.sleep(TIME);
        //再次点击保养服务
        baseHandle.carMaintainServiceClick();
        Thread.sleep(TIME);
        //点击搜索按钮
        washCarInfoHandle.checkSearchButtonClick();
        //搜框里输入门店并点击键盘回车键    自解报销(实报实销)
        washCarInfoHandle.sendCheckSearchInputText("自解报销(实报实销)");
        Thread.sleep(TIME);
        //选择查询结果的门店
        washCarInfoHandle.selCarWashShopClick();
        Thread.sleep(TIME);
        //点击进入保养类型(展示一个测试保养套餐)
        maintainInfoHandle.maintainServiceTypeClick();
        //查看第一个保养项目内容信息
        Thread.sleep(TIME);
        //第一次点击A类小保养服务，打开详情子保养
        maintainInfoHandle.maintainChoiceClick("A类小保养服务");
        //第二次点击A类小保养服务，关闭详情子保养
        maintainInfoHandle.maintainChoiceClick("A类小保养服务");
        //第一次点击B类大保养服务，打开详情子保养
        maintainInfoHandle.maintainChoiceClick("B类大保养服务");
        //第二次点击B类大保养服务，关闭详情子保养
        maintainInfoHandle.maintainChoiceClick("B类大保养服务");
        //点击确定按钮
        maintainInfoHandle.maintainServiceConfirmButtonClick();
        //点击待完善 沪K123456选选
        Thread.sleep(TIME);
        maintainInfoHandle.toImprovedTypeClick();
        //获取详情页车牌号码
        Thread.sleep(TIME);
        String number=maintainInfoHandle.getToImprovedCarNo();
        Assert.assertEquals(number,"沪K123456");
        //点击取消
        maintainInfoHandle.toImprovedCancelButtonClick();
        //点击一下未用券按钮
        maintainInfoHandle.maintainCouponButtonClick();
        Thread.sleep(TIME);
        //点击去保养
         maintainInfoHandle.toMaintainButtonClick();
        Thread.sleep(TIME);
        //点击导航
        washOrderHandle.washOrderGpsInfoClick();
        Thread.sleep(TIME);
        //点击返回按钮
        washCarInfoHandle.backButtonClick();
        Thread.sleep(TIME);
        //点击下单页面的未用券按钮
        maintainInfoHandle.maintainOrderCouponButtonClick();
        //获取总价值   ￥0.02
        String total_mount=maintainInfoHandle.getMaintainOrderTotalAmount();
        Assert.assertEquals(total_mount,"￥0.02");
        //获取实际付款 ￥0.02
        String actul_mount=maintainInfoHandle.getMaintainOrderActualAmount();
        Assert.assertEquals(actul_mount,"￥0.02");
        //获取下单页面底部文字    *每个订单仅限当天有效，下单后请在门店营业时间内到店服务哦~
        String text=maintainInfoHandle.getMaintainOrderBottomText();
        Assert.assertEquals(text,"*每个订单仅限当天有效，下单后请在门店营业时间内到店服务哦~");
        //点击立即下单按钮
        maintainInfoHandle.maintainOrderConfirmClick();
        //支付订单
        payMethod();
    }

    @AfterTest
    public void afterTest() throws InterruptedException {
        Thread.sleep(TIME);
         close();
    }


    /**
     * 下单后立即进行订单支付公共方法
     */
    public void payMethod() throws InterruptedException {
        //取消支付
        payHandle.cancelPayButtonClick();
        //弹框选择取消
        payHandle.choiceCancelButtonClick();
        //点击立即支付
        payHandle.toPayButtonClick();
        //选择支付宝支付
        Thread.sleep(TIME);
        payHandle.choiceAlipayClick();
        Thread.sleep(TIME);
    }

}
