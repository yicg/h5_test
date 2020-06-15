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
        log.info("进入到保养店信息页，点击车辆保养套餐");
        ActionsUtil.oneClick(maintainInfoPageObject.maintainServiceType());
    }

    /**
     * 点击车辆保养套餐信息页面
     * @return
     */
    public void  maintainServiceConfirmButtonClick(){
        log.info("点击保养套餐确认按钮元素");
        ActionsUtil.oneClick(maintainInfoPageObject.maintainServiceConfirmButton());
    }

    /**
     * 点击车辆保养未完善信息
     */
    public void toImprovedTypeClick(){
        log.info("点击车辆保养未完善信息");
        ActionsUtil.oneClick(maintainInfoPageObject.toImprovedType());
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
        log.info("点击车辆保养未完善信息详情页取消按钮");
        ActionsUtil.oneClick(maintainInfoPageObject.toImprovedCancelButton());
    }
    /**
     * 点击车辆保养未完善信息详情页未使用优惠券
     */
    public void maintainCouponButtonClick(){
        log.info("点击车辆保养未完善信息详情页未使用优惠券");
        ActionsUtil.oneClick(maintainInfoPageObject.maintainCouponButton());
    }

    /**
     * 点击去保养按钮
     */
    public void toMaintainButtonClick(){
        log.info("点击去保养按钮");
        ActionsUtil.oneClick(maintainInfoPageObject.toMaintainButton());
    }
    /**
     * 点击店家保养订单详情页，未使用优惠券按钮
     */
    public void maintainOrderCouponButtonClick(){
        log.info("点击店家保养订单详情页，未使用优惠券按钮");
        ActionsUtil.oneClick(maintainInfoPageObject.maintainOrderCouponButton());
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
        log.info("点击保养订单详情页，确认下单按钮");
        ActionsUtil.oneClick(maintainInfoPageObject.maintainOrderConfirm());
    }

    /**
     * 选择服务类别
     * @param name
     */
    public void maintainChoiceClick(String name){
        ActionsUtil.oneClick(webElementCommon.twoLayersElements(ConstParam.maintain_service_info,name));
    }
}

