package com.yilutong.cases;

import com.yilutong.common.ConstParam;
import com.yilutong.common.DriverBase;
import com.yilutong.common.WebElementCommon;
import com.yilutong.handle.BaseHandle;
import com.yilutong.handle.UserCenterHandle;
import com.yilutong.handle.WashCarInfoHandle;
import com.yilutong.handle.WashOrderHandle;
import com.yilutong.utils.ActionsUtil;
import com.yilutong.utils.WebElementUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.sql.DriverManager;
import java.util.List;

/**
 * @Author: yicg
 * @Date: 2020/6/9 16:40
 * @Version 1.0
 */
public class TestDemo extends DriverBase {

    int channelId=83;
    String openId="oI_kUw9jaumnO4sntgLJBBmM_FoM";
    String wechatId="gh_ddacef6564d5";
    String ticketId="3D9D8E227B2724F04EBC3E5940770A4B6931F311D685CDBCBD1B1E935732F613079D8AA2EFB11F2AF12ADB9E2A63A677B7CB68E98EDB3170A7361CEC7D516472";

    String testUrl="https://uat.yilutong.com/wechat_carowner/index.html?channelId="+channelId
            +"&openId="+openId
            +"&wechatId="+wechatId
            +"&curedirect=index&ticketId="+ticketId
            +"&YLT=1";

    private WebElementCommon webElementCommon;

    private BaseHandle baseHandle;
    private UserCenterHandle userCenterHandle;
    private WashCarInfoHandle washCarInfoHandle;
    private WashOrderHandle washOrderHandle;


    public TestDemo() {
        baseHandle = new BaseHandle();
        userCenterHandle=new UserCenterHandle();
        webElementCommon=new WebElementCommon();
        washCarInfoHandle=new WashCarInfoHandle();
        washOrderHandle=new WashOrderHandle();
    }



    @BeforeMethod
    public void beforeTest() throws InterruptedException {
        DriverBase.openBrower("chrome");

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
        //选择第一个洗车店
        washCarInfoHandle.selCarWashShopClick();
        Thread.sleep(5000);
        //获取洗车店详情页的洗车店名称
        String addr=washCarInfoHandle.getShopAddrInfo();
        //调用一个复用的元素操作方法
        common();
        //点击suv
        washCarInfoHandle.suvCarClick();
        Thread.sleep(3000);
        washCarInfoHandle.smallCarClick();
        //点击活动券按钮
        Thread.sleep(3000);
        washCarInfoHandle.unusedVoucherClick();
        //选择活动券
        Thread.sleep(3000);
        washCarInfoHandle.tickActivityClick();
        //点击去洗车按钮
        washCarInfoHandle.toWashButtonClick();

        //获取下单页面的店铺信息   上海市虹口区七浦路133号B1
        Thread.sleep(5000);
        String shop_addr=washOrderHandle.getWashOrderShopAddrText();
        //Assert.assertEquals(addr,shop_addr);
        //联系店铺
        //washOrderHandle.washOrderContactShopClick();
        //导航
        Thread.sleep(5000);
        washOrderHandle.washOrderGpsInfoClick();
        Thread.sleep(8000);
        //退出导航
        washCarInfoHandle.backButtonClick();
        Thread.sleep(3000);
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
        //选择第一个店
        washCarInfoHandle.selCarWashShopClick();
        Thread.sleep(5000);
        //获取车辆检测店详情页中的地址
        String addr=washCarInfoHandle.getShopAddrInfo();
       //调用复用元素操作的方法
        common();
        //点击用券，如果没有券提示一个弹框
        washCarInfoHandle.unusedVoucherClick();
        //点击去检测
        Thread.sleep(5000);
        washCarInfoHandle.toWashButtonClick();

        //获取下单页面的店铺信息   上海市虹口区七浦路133号B1
        Thread.sleep(5000);
        String shop_addr=washOrderHandle.getWashOrderShopAddrText();
        System.out.println(shop_addr);
        //Assert.assertEquals(addr,shop_addr);
        //联系店铺
        //washOrderHandle.washOrderContactShopClick();
        //导航
        Thread.sleep(5000);
        washOrderHandle.washOrderGpsInfoClick();
        Thread.sleep(8000);
        //退出导航
        washCarInfoHandle.backButtonClick();
        Thread.sleep(3000);
        //获取服务总价值金额,做断言  ￥460
        String total_amount=washOrderHandle.getWashOrderTotalAmountText();
        Assert.assertEquals(total_amount,"￥0.01");
        //实际付款金额，做断言  ￥0.03
         String actual_amount=washOrderHandle.getWashOrderActualAmountText();
        Assert.assertEquals(actual_amount,"￥0.01");
        //获取底部文字
       // String actul_text=ActionsUtil.getText(WebElementUtil.findElement(By.xpath("/html/body/div[1]/p[2]")));
        String actul_text=washOrderHandle.getCheckOrderBottomText();
        String expect_text="*每个订单仅限当天有效，下单后请在门店营业时间内到店服务哦~";
        Assert.assertEquals(actul_text,expect_text);
        //点击下单按钮
        washOrderHandle.washOrderConfirmClick();

    }



    @AfterMethod
    public void afterTest() throws InterruptedException {
        Thread.sleep(5000);
         close();
    }



    /**
     * 洗车和检测复用部分的代码
     */
    public void common() throws InterruptedException {
        //点击联系店铺
        // washCarInfoHandle.contactShopClick();
        //跳转至GPS页面
        washCarInfoHandle.gpsInfoClick();
        //Thread.sleep(5000);
        //点击返回按钮
        washCarInfoHandle.backButtonClick();
        //Thread.sleep(5000);
        //再次选择洗车店
        washCarInfoHandle.selCarWashShopClick();
        Thread.sleep(5000);
    }


}
