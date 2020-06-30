package com.yilutong.page;


import com.yilutong.common.ConstParam;
import com.yilutong.common.WebElementCommon;
import com.yilutong.utils.WebElementUtil;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;

/**
 * @Author: yicg
 * @Date: 2020/6/9 16:2
 * @Version 1.0
 */
@Slf4j
public class BasePageObject {

    private WebElementCommon webElementCommon;

    public BasePageObject() {
        webElementCommon=new WebElementCommon();
    }



    /**
     * 用户中心头像
     * @return
     */
    public WebElement userHead(){
        log.info("用户中心头像元素");
        WebElement element= WebElementUtil.findElement(ConstParam.user_head);
        return element;
    }

    /**
     * 洗车按钮元素
     */
    public WebElement carWashService(){
        log.info("首页洗车按钮元素");
        WebElement element= webElementCommon.twoLayersElements(ConstParam.service_list,"洗车");

        return element;
    }

    /**
     * 车辆检测服务
     * @return
     */
    public WebElement carInspectionService(){
        log.info("首页车辆检测按钮元素");
        WebElement element= webElementCommon.twoLayersElements(ConstParam.service_list,"检测");

        return element;
    }

    /**
     * 车辆保养服务
     * @return
     */
    public WebElement carMaintainService(){
        log.info("首页车辆保养按钮元素");
        WebElement element= webElementCommon.twoLayersElements(ConstParam.service_list,"保养");

        return element;
    }

}
