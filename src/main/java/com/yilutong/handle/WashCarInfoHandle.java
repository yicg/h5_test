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
        ActionsUtil.oneClick(washCarInfoPageObject.checkSearchButton());
        log.info("点击搜索按钮");
    }
    /**
     * 搜索框输入店铺信息并按下回车查询键
     */
    public void sendCheckSearchInputText(String shopName){

        //输入文本信息
        ActionsUtil.sendText(washCarInfoPageObject.checkSearchInput(),shopName);
        //回车
        ActionsUtil.clickEnterKey(washCarInfoPageObject.checkSearchInput());
        log.info("搜索框输入的信息是="+shopName);
    }

    /**
     * 点击第一个洗车店元素
     */
    public void selCarWashShopClick(){

        ActionsUtil.oneClick(washCarInfoPageObject.selCarWashShop());
        log.info("第一个洗车店点击进入");
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

        ActionsUtil.oneClick(washCarInfoPageObject.contactShop());
        log.info("点击联系店铺按钮");
    }
    /**
     * 点击导航按钮
     */
    public void gpsInfoClick(){

        ActionsUtil.oneClick(washCarInfoPageObject.gpsInfo());
        log.info("点击导航按钮");
    }
    /**
     * 点击小型轿车
     */
    public void smallCarClick(){

        ActionsUtil.oneClick(washCarInfoPageObject.smallCar());
        log.info("点击小型轿车");
    }
    /**
     * 点击suv车型
     */
     public void suvCarClick(){

         ActionsUtil.oneClick(washCarInfoPageObject.suvCar());
         log.info("点击suv车型");
     }
    /**
     * 点击未用券选项
     */
    public void unusedVoucherClick(){

        ActionsUtil.oneClick(washCarInfoPageObject.unusedVoucher());
        log.info("点击未用券选项");
    }
    /**
     * 勾选用户券
     */
    public void tickActivityClick(){

        ActionsUtil.oneClick(washCarInfoPageObject.tickActivity());
        log.info("勾选用户券");
    }
    /**
     * 点击去洗车按钮
     */
    public void toWashButtonClick(){

        ActionsUtil.oneClick(washCarInfoPageObject.toWashButton());
        log.info("点击去洗车按钮");
    }

    /**
     * 点击返回按钮
     */
    public void backButtonClick(){

        ActionsUtil.oneClick(washCarInfoPageObject.backButton());
        log.info("点击返回按钮");
    }

}
