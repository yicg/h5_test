package com.yilutong.handle;


import com.yilutong.page.WashCarInfoPageObject;
import com.yilutong.utils.ActionsUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yicg
 * @Date: 2020/6/11 16:38
 * @Version 1.0
 *
 * 洗车详情页handle
 */
@Slf4j
public class WashCarInfoHandle {
    private WashCarInfoPageObject washCarInfoPageObject;

    public WashCarInfoHandle() {
        washCarInfoPageObject=new WashCarInfoPageObject();
    }

    /**
     * 点击搜索按钮
     */
    public void checkSearchButtonClick(){
        log.info("点击搜索按钮");
        ActionsUtil.oneClick(washCarInfoPageObject.checkSearchButton());
    }
    /**
     * 搜索框输入店铺信息并按下回车查询键
     */
    public void sendCheckSearchInputText(String shopName){
        log.info("搜索框输入的信息是="+shopName);
        //输入文本信息
        ActionsUtil.sendText(washCarInfoPageObject.checkSearchInput(),shopName);
        //回车
        ActionsUtil.clickEnterKey(washCarInfoPageObject.checkSearchInput());
    }

    /**
     * 点击第一个洗车店元素
     */
    public void selCarWashShopClick(){
        log.info("第一个洗车店点击进入");
        ActionsUtil.oneClick(washCarInfoPageObject.selCarWashShop());
    }
    /**
     * 获取文本信息
     */
    public String getShopAddrInfo(){
        String text= ActionsUtil.getText(washCarInfoPageObject.shopAddrInfo());
        log.info("获取的页面文本信息="+text);
        return text;
    }
    /**
     * 联系店铺按钮点击
     */
    public void contactShopClick(){
        log.info("点击联系店铺按钮");
        ActionsUtil.oneClick(washCarInfoPageObject.contactShop());
    }
    /**
     * 点击导航按钮
     */
    public void gpsInfoClick(){
        log.info("点击导航按钮");
        ActionsUtil.oneClick(washCarInfoPageObject.gpsInfo());
    }
    /**
     * 点击小型轿车
     */
    public void smallCarClick(){
        log.info("点击小型轿车");
        ActionsUtil.oneClick(washCarInfoPageObject.smallCar());
    }
    /**
     * 点击suv车型
     */
     public void suvCarClick(){
         log.info("点击suv车型");
         ActionsUtil.oneClick(washCarInfoPageObject.suvCar());
     }
    /**
     * 点击未用券选项
     */
    public void unusedVoucherClick(){
        log.info("点击未用券选项");
        ActionsUtil.oneClick(washCarInfoPageObject.unusedVoucher());
    }
    /**
     * 勾选用户券
     */
    public void tickActivityClick(){
        log.info("勾选用户券");
        ActionsUtil.oneClick(washCarInfoPageObject.tickActivity());
    }
    /**
     * 点击去洗车按钮
     */
    public void toWashButtonClick(){
        log.info("点击去洗车按钮");
        ActionsUtil.oneClick(washCarInfoPageObject.toWashButton());
    }

    /**
     * 点击返回按钮
     */
    public void backButtonClick(){
        log.info("点击返回按钮");
        ActionsUtil.oneClick(washCarInfoPageObject.backButton());
    }

}
