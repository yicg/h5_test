package com.yilutong.handle;

import com.yilutong.common.ConstParam;
import com.yilutong.common.WebElementCommon;
import com.yilutong.page.MaintainInfoPageObject;
import com.yilutong.utils.ActionsUtil;
import com.yilutong.utils.WebElementUtil;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;

/**
 * @Author: yicg
 * @Date: 2020/6/15 13:43
 * @Version 1.0
 *
 * 保养服务handle
 */
@Slf4j
public class MaintainInfoHandle {
    private MaintainInfoPageObject maintainInfoPageObject;
    private WebElementCommon webElementCommon;

    public MaintainInfoHandle() {
        maintainInfoPageObject=new MaintainInfoPageObject();
        webElementCommon=new WebElementCommon();
    }

    /**
     * 进入到保养店信息页，点击车辆保养套餐
     * @return
     */
    public void maintainServiceTypeClick(){

        ActionsUtil.oneClick(maintainInfoPageObject.maintainServiceType());
        log.info("进入到保养店信息页，点击车辆保养套餐");
    }

    /**
     * 点击车辆保养套餐信息页面
     * @return
     */
    public void  maintainServiceConfirmButtonClick(){

        ActionsUtil.oneClick(maintainInfoPageObject.maintainServiceConfirmButton());
        log.info("点击保养套餐确认按钮元素");
    }

    /**
     * 点击车辆保养未完善信息
     */
    public void toImprovedTypeClick(){

        ActionsUtil.oneClick(maintainInfoPageObject.toImprovedType());
        log.info("点击车辆保养未完善信息");
    }
    /**
     * 获取车辆保养未完善信息详情页车牌号码信息
     */
    public String getToImprovedCarNo(){
        log.info("获取车辆保养未完善信息详情页车牌号码信息");
        return ActionsUtil.getText(maintainInfoPageObject.toImprovedCarNo());
    }
    /**
     * 点击车辆保养未完善信息详情页取消按钮
     */
    public void toImprovedCancelButtonClick(){

        ActionsUtil.oneClick(maintainInfoPageObject.toImprovedCancelButton());
        log.info("点击车辆保养未完善信息详情页取消按钮");
    }
    /**
     * 点击车辆保养未完善信息详情页未使用优惠券
     */
    public void maintainCouponButtonClick(){

        ActionsUtil.oneClick(maintainInfoPageObject.maintainCouponButton());
        log.info("点击车辆保养未完善信息详情页未使用优惠券");
    }

    /**
     * 点击去保养按钮
     */
    public void toMaintainButtonClick(){

        ActionsUtil.oneClick(maintainInfoPageObject.toMaintainButton());
        log.info("点击去保养按钮");
    }
    /**
     * 点击店家保养订单详情页，未使用优惠券按钮
     */
    public void maintainOrderCouponButtonClick(){

        ActionsUtil.oneClick(maintainInfoPageObject.maintainOrderCouponButton());
        log.info("点击店家保养订单详情页，未使用优惠券按钮");
    }
    /**
     * 获取保养订单详情页，支付总金额
     */
    public String getMaintainOrderTotalAmount(){
        log.info("获取保养订单详情页，支付总金额");
        return ActionsUtil.getText(maintainInfoPageObject.maintainOrderTotalAmount());
    }
    /**
     * 获取保养订单详情页，实际支付金额
     */
    public String getMaintainOrderActualAmount(){
        log.info("获取保养订单详情页，实际支付金额");
        return ActionsUtil.getText(maintainInfoPageObject.maintainOrderActualAmount());
    }
    /**
     * 获取保养订单详情页，底部文本框
     */
    public String getMaintainOrderBottomText(){
        log.info("获取保养订单详情页，底部文本框");
        return ActionsUtil.getText(maintainInfoPageObject.maintainOrderBottomText());
    }
    /**
     * 点击保养订单详情页，确认下单按钮
     */
    public void maintainOrderConfirmClick(){

        ActionsUtil.oneClick(maintainInfoPageObject.maintainOrderConfirm());
        log.info("点击保养订单详情页，确认下单按钮");
    }

    /**
     * 选择服务类别
     * @param name
     */
    public void maintainChoiceClick(String name){
        ActionsUtil.oneClick(webElementCommon.twoLayersElements(ConstParam.maintain_service_info,name));
    }
}

