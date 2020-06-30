package com.yilutong.handle;

import com.yilutong.common.ConstParam;
import com.yilutong.common.WebElementCommon;
import com.yilutong.page.BasePageObject;
import com.yilutong.utils.ActionsUtil;
import com.yilutong.utils.WebElementUtil;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;

/**
 * @Author: yicg
 * @Date: 2020/6/9 16:35
 * @Version 1.0
 */
@Slf4j
public class BaseHandle {
    private BasePageObject basePageObject;
    private WebElementCommon webElementCommon;

    public BaseHandle() {
        basePageObject=new BasePageObject();
        webElementCommon=new WebElementCommon();
    }

    /**
     * 点击头像
     */
    public void userHeadClick(){
        log.info("点击头像...");
        ActionsUtil.oneClick(basePageObject.userHead());

    }

    /**
     * 点击洗车按钮
     */
    public void carWashServiceClick(){
        log.info("点击洗车按钮...");
        ActionsUtil.oneClick(basePageObject.carWashService());

    }

    /**
     * 点击检测按钮
     */
    public void carInspectionServiceClick(){
        log.info("点击检测按钮...");
        ActionsUtil.oneClick(basePageObject.carInspectionService());

    }

    /**
     * 点击保养按钮
     */
    public void carMaintainServiceClick(){
        log.info("点击保养按钮...");
        ActionsUtil.oneClick(basePageObject.carMaintainService());

    }



    /**
     * 通过xpath找到的洗车页面元素位置
     */
    public WebElement washCarElement(){
        log.info("通过xpath找到的洗车页面元素位置");
        WebElement element= WebElementUtil.findElement(ConstParam.wash_car_element);

        return element;
    }

    /**
     * 通过xpath找到的年检服务页面元素
     */
    public WebElement checkYearCarElement(){
        log.info("年检服务页面元素");
        WebElement element=WebElementUtil.findElement(ConstParam.check_year_car_element);

        return element;
    }

}
