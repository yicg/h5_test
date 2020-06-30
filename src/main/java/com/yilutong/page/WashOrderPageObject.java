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
        log.info("下单页面的店铺地址元素");
        WebElement element= WebElementUtil.findElement(ConstParam.wash_order_shop_addr);

        return element;
    }

    /**
     * 下单页面的联系店铺元素
     */
    public WebElement washOrderContactShop(){
        log.info("下单页面的联系店铺元素");
        WebElement element= WebElementUtil.findElement(ConstParam.wash_order_contact_shop);

        return element;
    }

    /**
     * 下单页面的gps信息
     */
    public WebElement washOrderGpsInfo(){
        log.info("下单页面的gps信息元素");
        WebElement element= WebElementUtil.findElement(ConstParam.wash_order_gps_info);

        return element;
    }

    /**
     * 优惠券的信息
     */
    public WebElement washOrderActivityName(){
        log.info("优惠券的信息元素");
        WebElement element= WebElementUtil.findElement(ConstParam.wash_order_activity_name);

        return element;
    }

    /**
     * 总金额
     */
    public WebElement washOrderTotalAmount(){
        log.info("总金额元素");
        WebElement element= WebElementUtil.findElement(ConstParam.wash_order_total_amount);

        return element;
    }

    /**
     * 实际需要支付金额
     */
    public WebElement washOrderActualAmount(){
        log.info("实际需要支付金额元素");
        WebElement element= WebElementUtil.findElement(ConstParam.wash_order_actual_amount);

        return element;
    }

    /**
     * 绑定车牌输入框
     */
    public WebElement washOrderLicenseInput(){
        log.info("绑定车牌输入框元素");
        WebElement element= WebElementUtil.findElement(ConstParam.wash_order_license_input);

        return element;
    }

    /**
     * 底部文本内容
     */
    public WebElement washOrderBottomText(){
        log.info("底部文本内容元素");
        WebElement element= WebElementUtil.findElement(ConstParam.wash_order_bottom_text);

        return element;
    }

    /**
     * 立即下单
     */
    public WebElement washOrderConfirm(){
        log.info("立即下单元素");
        WebElement element= WebElementUtil.findElement(ConstParam.wash_order_confirm);

        return element;
    }

    /**
     * 检测下单页面底部一行文字
     */
    public WebElement checkOrderBottomText(){
        log.info("检测下单页面底部一行文字元素");
        WebElement element=WebElementUtil.findElement(ConstParam.check_order_bottom_text);

        return element;
    }

}
