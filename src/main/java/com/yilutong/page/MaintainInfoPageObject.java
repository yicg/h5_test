package com.yilutong.page;

import com.yilutong.common.ConstParam;
import com.yilutong.utils.WebElementUtil;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;

/**
 * @Author: yicg
 * @Date: 2020/6/15 11:35
 * @Version 1.0
 *
 * 保养页面信息
 */
@Slf4j
public class MaintainInfoPageObject {

    /**
     * 进入到保养店信息页，车辆保养套餐元素
     * @return
     */
    public WebElement maintainServiceType(){
        log.info("进入到保养店信息页，车辆保养套餐元素");
        return WebElementUtil.findElement(ConstParam.maintain_service_type);
    }

    /**
     * 车辆保养套餐元素
     * @return
     */
    public WebElement maintainServiceInfo(){
        log.info("车辆保养套餐元素");
        return WebElementUtil.findElement(ConstParam.maintain_service_info);
    }

    /**
     * 车辆保养套餐信息页面
     * @return
     */
    public WebElement maintainServiceConfirmButton(){
        log.info("保养套餐确认按钮元素");
        return WebElementUtil.findElement(ConstParam.maintain_service_confirm_button);
    }


    /**
     * 车辆保养未完善信息元素
     * @return
     */
    public WebElement toImprovedType(){
        log.info("车辆保养未完善信息元素");
        return WebElementUtil.findElement(ConstParam.to_improved_type);
    }


    /**
     * 车辆保养未完善信息详情页车牌号码信息
     * @return
     */
    public WebElement toImprovedCarNo(){
        log.info("车辆保养未完善信息详情页车牌号码信息元素");
        return WebElementUtil.findElement(ConstParam.to_improved_car_no);
    }


    /**
     * 车辆保养未完善信息详情页取消按钮元素
     * @return
     */
    public WebElement toImprovedCancelButton(){
        log.info("车辆保养未完善信息详情页取消按钮元素");
        return WebElementUtil.findElement(ConstParam.to_improved_cancel_button);
    }

    /**
     * 车辆保养未完善信息详情页未使用优惠券元素
     * @return
     */
    public WebElement maintainCouponButton(){
        log.info("车辆保养未完善信息详情页未使用优惠券元素");
        return WebElementUtil.findElement(ConstParam.maintain_coupon_button);
    }

    /**
     * 去保养按钮元素
     */
    public WebElement toMaintainButton(){
        log.info("去保养按钮元素");
        WebElement element=WebElementUtil.findElement(ConstParam.to_maintain_button);

        return element;
    }

    /**
     * 保养订单详情页，未使用优惠券按钮元素
     * @return
     */
    public WebElement maintainOrderCouponButton(){
        log.info("保养订单详情页，未使用优惠券按钮元素");
        return WebElementUtil.findElement(ConstParam.maintain_order_coupon_button);
    }

    /**
     * 保养订单详情页，支付总金额元素
     * @return
     */
    public WebElement maintainOrderTotalAmount(){
        log.info("保养订单详情页，支付总金额元素");
        return WebElementUtil.findElement(ConstParam.maintain_order_total_amount);
    }


    /**
     * 保养订单详情页，实际支付金额元素
     * @return
     */
    public WebElement maintainOrderActualAmount(){
        log.info("保养订单详情页，实际支付金额元素");
        return WebElementUtil.findElement(ConstParam.maintain_order_actual_amount);
    }

    /**
     * 保养订单详情页，底部文本框元素
     * @return
     */
    public WebElement maintainOrderBottomText(){
        log.info("保养订单详情页，底部文本框元素");
        return WebElementUtil.findElement(ConstParam.maintain_order_bottom_text);
    }

    /**
     * 保养订单详情页，确认下单按钮元素
     * @return
     */
    public WebElement maintainOrderConfirm(){
        log.info("保养订单详情页，确认下单按钮元素");
        return WebElementUtil.findElement(ConstParam.maintain_order_confirm);
    }
}
