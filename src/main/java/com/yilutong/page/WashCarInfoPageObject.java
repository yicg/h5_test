package com.yilutong.page;


import com.yilutong.common.ConstParam;
import com.yilutong.utils.WebElementUtil;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;

/**
 * @Author: yicg
 * @Date: 2020/6/11 16:08
 * @Version 1.0
 *
 * 洗车详情页
 */
@Slf4j
public class WashCarInfoPageObject {

    /**
     * 搜索标志按钮，点击后触发搜索框
     */
    public WebElement checkSearchButton(){
        WebElement element=WebElementUtil.findElement(ConstParam.check_search_button);
        log.info("搜索标志按钮元素");
        return element;
    }

    /**
     * 店铺搜索框
     */
    public WebElement checkSearchInput(){
        WebElement element=WebElementUtil.findElement(ConstParam.check_search_input);
        log.info("店铺搜索框元素");
        return element;
    }

    /**
     *选择洗车店列表第一个店家
     */
    public WebElement selCarWashShop(){
        WebElement element= WebElementUtil.findElement(ConstParam.sel_car_wash_shop);
        log.info("洗车店列表第一个店家元素");
        return element;
    }
    /**
     * 洗车店地址信息文本
     */
    public WebElement shopAddrInfo(){
        WebElement element= WebElementUtil.findElement(ConstParam.sel_shop_addr_info);
        log.info("洗车店地址信息文本元素");
        return element;
    }
    /**
     * 联系店铺元素
     */
    public WebElement contactShop(){
        WebElement element= WebElementUtil.findElement(ConstParam.sel_contact_shop);
        log.info("联系店铺元素");
        return element;
    }

    /**
     * 页面导航元素
     * @return
     */
    public WebElement gpsInfo(){
        WebElement element=WebElementUtil.findElement(ConstParam.sel_gps_info);
        log.info("页面导航元素");
        return element;
    }

    /**
     * 导航页返回按钮元素
     */
    public WebElement backButton(){
        WebElement element=WebElementUtil.findElement(ConstParam.back_button);
        log.info("导航页返回按钮元素");
        return element;
    }

    /**
     * 小型轿车
     * @return
     */
    public WebElement smallCar(){
        WebElement element=WebElementUtil.findElement(ConstParam.sel_small_car);
        log.info("小型轿车页面元素");
        return element;
    }

    /**
     * suv车型
     * @return
     */
    public WebElement suvCar(){
        WebElement element=WebElementUtil.findElement(ConstParam.sel_suv_car);
        log.info("suv车型页面元素");
        return element;
    }

    /**
     * 未用券选项
     * @return
     */
    public WebElement unusedVoucher(){
        WebElement element=WebElementUtil.findElement(ConstParam.sel_unused_voucher);
        log.info("未用券选项页面元素");
        return element;
    }

    /**
     * 活动券勾选框元素
     */
    public WebElement tickActivity(){
        WebElement element=WebElementUtil.findElement(ConstParam.tick_activity);
        log.info("活动券勾选框元素");
        return element;
    }

    /**
     * 去洗车按钮按钮元素
     * @return
     */
    public WebElement toWashButton(){
        WebElement element=WebElementUtil.findElement(ConstParam.sel_to_wash_button);
        log.info("去洗车按钮按钮元素");
        return element;
    }




}
