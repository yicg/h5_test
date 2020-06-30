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
        log.info("搜索标志按钮元素");
        WebElement element=WebElementUtil.findElement(ConstParam.check_search_button);

        return element;
    }

    /**
     * 店铺搜索框
     */
    public WebElement checkSearchInput(){
        log.info("店铺搜索框元素");
        WebElement element=WebElementUtil.findElement(ConstParam.check_search_input);

        return element;
    }

    /**
     *选择洗车店列表第一个店家
     */
    public WebElement selCarWashShop(){
        log.info("洗车店列表第一个店家元素");
        WebElement element= WebElementUtil.findElement(ConstParam.sel_car_wash_shop);

        return element;
    }
    /**
     * 洗车店地址信息文本
     */
    public WebElement shopAddrInfo(){
        log.info("洗车店地址信息文本元素");
        WebElement element= WebElementUtil.findElement(ConstParam.sel_shop_addr_info);

        return element;
    }
    /**
     * 联系店铺元素
     */
    public WebElement contactShop(){
        log.info("联系店铺元素");
        WebElement element= WebElementUtil.findElement(ConstParam.sel_contact_shop);

        return element;
    }

    /**
     * 页面导航元素
     * @return
     */
    public WebElement gpsInfo(){
        log.info("页面导航元素");
        WebElement element=WebElementUtil.findElement(ConstParam.sel_gps_info);

        return element;
    }

    /**
     * 导航页返回按钮元素
     */
    public WebElement backButton(){
        log.info("导航页返回按钮元素");
        WebElement element=WebElementUtil.findElement(ConstParam.back_button);

        return element;
    }

    /**
     * 小型轿车
     * @return
     */
    public WebElement smallCar(){
        log.info("小型轿车页面元素");
        WebElement element=WebElementUtil.findElement(ConstParam.sel_small_car);

        return element;
    }

    /**
     * suv车型
     * @return
     */
    public WebElement suvCar(){
        log.info("suv车型页面元素");
        WebElement element=WebElementUtil.findElement(ConstParam.sel_suv_car);

        return element;
    }

    /**
     * 未用券选项
     * @return
     */
    public WebElement unusedVoucher(){
        log.info("未用券选项页面元素");
        WebElement element=WebElementUtil.findElement(ConstParam.sel_unused_voucher);

        return element;
    }

    /**
     * 活动券勾选框元素
     */
    public WebElement tickActivity(){
        log.info("活动券勾选框元素");
        WebElement element=WebElementUtil.findElement(ConstParam.tick_activity);

        return element;
    }

    /**
     * 去洗车按钮按钮元素
     * @return
     */
    public WebElement toWashButton(){
        log.info("去洗车按钮按钮元素");
        WebElement element=WebElementUtil.findElement(ConstParam.sel_to_wash_button);

        return element;
    }




}
