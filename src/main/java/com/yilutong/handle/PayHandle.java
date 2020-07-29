package com.yilutong.handle;

import com.yilutong.page.PayPageObject;
import com.yilutong.utils.ActionsUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yicg
 * @Date: 2020/6/15 17:42
 * @Version 1.0
 *
 * 支付Handle
 */
@Slf4j
public class PayHandle {
    private PayPageObject payPageObject;
    public PayHandle() {
        payPageObject=new PayPageObject();
    }

    /**
     * 点击支付页面取消支付按钮元素
     */
    public void cancelPayButtonClick(){

        ActionsUtil.oneClick(payPageObject.cancelPayButton());
        log.info("点击支付页面取消支付按钮元素");
    }

    /**
     * 点击取消支付页面的取消按钮
     */
    public void  choiceCancelButtonClick(){

        ActionsUtil.oneClick(payPageObject.choiceCancelButton());
        log.info("点击支付页面取消支付按钮元素");
    }

    /**
     * 点击订单页面的支付按钮
     */
    public void toPayButtonClick(){

        ActionsUtil.oneClick(payPageObject.toPayButton());
        log.info("点击订单页面的支付按钮");
    }

    /**
     * 点击支付宝支付按钮
     */
    public void choiceAlipayClick(){

        ActionsUtil.oneClick(payPageObject.choiceAlipay());
        log.info("点击支付宝支付按钮");
    }
}
