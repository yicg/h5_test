package com.yilutong.page;

import com.yilutong.common.ConstParam;
import com.yilutong.utils.WebElementUtil;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;

/**
 * @Author: yicg
 * @Date: 2020/6/12 12:00
 * @Version 1.0
 * 下单页面
 */
@Slf4j
public class WashOrderPageObject {


    /**
     * 下单页面的店铺地址
     */
    public WebElement washOrderShopAddr(){
        WebElement element= WebElementUtil.findElement(ConstParam.wash_order_shop_addr);
        log.info("下单页面的店铺地址元素");
        return element;
    }

    /**
     * 下单页面的联系店铺元素
     */
    public WebElement washOrderContactShop(){
        WebElement element= WebElementUtil.findElement(ConstParam.wash_order_contact_shop);
        log.info("下单页面的联系店铺元素");
        return element;
    }

    /**
     * 下单页面的gps信息
     */
    public WebElement washOrderGpsInfo(){
        WebElement element= WebElementUtil.findElement(ConstParam.wash_order_gps_info);
        log.info("下单页面的gps信息元素");
        return element;
    }

    /**
     * 优惠券的信息
     */
    public WebElement washOrderActivityName(){
        WebElement element= WebElementUtil.findElement(ConstParam.wash_order_activity_name);
        log.info("优惠券的信息元素");
        return element;
    }

    /**
     * 总金额
     */
    public WebElement washOrderTotalAmount(){
        WebElement element= WebElementUtil.findElement(ConstParam.wash_order_total_amount);
        log.info("总金额元素");
        return element;
    }

    /**
     * 实际需要支付金额
     */
    public WebElement washOrderActualAmount(){
        WebElement element= WebElementUtil.findElement(ConstParam.wash_order_actual_amount);
        log.info("实际需要支付金额元素");
        return element;
    }

    /**
     * 绑定车牌输入框
     */
    public WebElement washOrderLicenseInput(){
        WebElement element= WebElementUtil.findElement(ConstParam.wash_order_license_input);
        log.info("绑定车牌输入框元素");
        return element;
    }

    /**
     * 底部文本内容
     */
    public WebElement washOrderBottomText(){
        WebElement element= WebElementUtil.findElement(ConstParam.wash_order_bottom_text);
        log.info("底部文本内容元素");
        return element;
    }

    /**
     * 立即下单
     */
    public WebElement washOrderConfirm(){
        WebElement element= WebElementUtil.findElement(ConstParam.wash_order_confirm);
        log.info("立即下单元素");
        return element;
    }

    /**
     * 检测下单页面底部一行文字
     */
    public WebElement checkOrderBottomText(){
        WebElement element=WebElementUtil.findElement(ConstParam.check_order_bottom_text);
        log.info("检测下单页面底部一行文字元素");
        return element;
    }

}
