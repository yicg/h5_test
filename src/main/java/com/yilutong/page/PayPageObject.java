package com.yilutong.page;

import com.yilutong.common.ConstParam;
import com.yilutong.utils.WebElementUtil;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;

/**
 * @Author: yicg
 * @Date: 2020/6/15 17:18
 * @Version 1.0
 * 支付页面
 */
@Slf4j
public class PayPageObject {

    /**
     * 支付页面取消支付按钮元素
     */
    public WebElement cancelPayButton(){
        log.info("支付页面取消支付按钮元素");
        return WebElementUtil.findElement(ConstParam.cancel_pay_button);
    }

    /**
     * 取消支付页面的取消按钮元素
     */
    public WebElement choiceCancelButton(){
        log.info("取消支付页面的取消按钮元素");
        return WebElementUtil.findElement(ConstParam.choice_cancel_button);
    }
    /**
     * 支付页面的支付按钮元素
     */
    public WebElement toPayButton(){
        log.info("支付页面的支付按钮元素");
        return WebElementUtil.findElement(ConstParam.to_pay_button);
    }
    /**
     * 支付方式选择支付宝按钮元素
     */
    public WebElement choiceAlipay(){
        log.info("支付方式选择支付宝按钮元素");
        return WebElementUtil.findElement(ConstParam.choice_alipay);
    }

}
