package com.yilutong.handle;

import com.yilutong.page.WashOrderPageObject;
import com.yilutong.utils.ActionsUtil;
import lombok.extern.slf4j.Slf4j;
import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @Author: yicg
 * @Date: 2020/6/12 12:54
 * @Version 1.0
 *
 * 下单详情页面
 */
@Slf4j
public class WashOrderHandle {
    private WashOrderPageObject washOrderPageObject;

    public WashOrderHandle() {
        washOrderPageObject=new WashOrderPageObject();
    }

    /**
     * 获取下单页面的店铺地址
     */
    public String getWashOrderShopAddrText(){
        log.info("获取下单页面的店铺地址");
        return ActionsUtil.getText(washOrderPageObject.washOrderShopAddr());
    }

    /**
     * 点击下单页面的联系店铺元素
     */
    public void washOrderContactShopClick(){

        ActionsUtil.oneClick(washOrderPageObject.washOrderContactShop());
        log.info("点击下单页面的联系店铺元素");
    }
    /**
     * 点击下单页面的gps信息
     */
    public void washOrderGpsInfoClick(){

        ActionsUtil.oneClick(washOrderPageObject.washOrderGpsInfo());
        log.info("点击下单页面的gps信息");
    }
    /**
     * 获取优惠券的信息，获取名字做断言
     */
    public String getWashOrderActivityNameText(){
        log.info("获取优惠券的名字信息");
        return ActionsUtil.getText(washOrderPageObject.washOrderActivityName());
    }
    /**
     * 获取总金额
     */
    public String getWashOrderTotalAmountText(){
        log.info("获取总金额");
        return ActionsUtil.getText(washOrderPageObject.washOrderTotalAmount());
    }
    /**
     * 获取实际需要支付金额
     */
    public String getWashOrderActualAmountText(){
        log.info("获取实际需要支付金额");
        return ActionsUtil.getText(washOrderPageObject.washOrderActualAmount());
    }
    /**
     * 绑定车牌输入框,填写车牌
     */
    public void setWashOrderLicenseInputText(String carLicense){
        log.info("绑定车牌输入框,填写车牌="+carLicense);
        ActionsUtil.sendText(washOrderPageObject.washOrderLicenseInput(),carLicense);
    }
    /**
     * 获取底部文本内容
     */
    public String getWashOrderBottomText(){
        log.info("获取底部文本内容");
        return ActionsUtil.getText(washOrderPageObject.washOrderBottomText());
    }

    /**
     * 获取立即下单按钮的文本
     */
    public String getWashOrderConfirmText(){
        log.info("获取立即下单按钮的文本");
        return ActionsUtil.getText(washOrderPageObject.washOrderConfirm());
    }

    /**
     * 点击立即下单按钮
     */
    public void washOrderConfirmClick(){

        ActionsUtil.oneClick(washOrderPageObject.washOrderConfirm());
        log.info("点击立即下单按钮");
    }

    /**
     * 获取检测订单底部的一行文字
     */
    public String getCheckOrderBottomText(){
        log.info("获取检测订单底部的一行文字");
        return ActionsUtil.getText(washOrderPageObject.checkOrderBottomText());
    }

}
