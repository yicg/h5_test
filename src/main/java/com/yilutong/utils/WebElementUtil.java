package com.yilutong.utils;

import com.yilutong.common.DriverBase;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * @author yicg
 * @createTime 2020年06月09日 14:12:00
 * @Description
 */
@Slf4j
public class WebElementUtil{

    public static WebDriver driver=DriverBase.driver;

    /**
     * 查询单个的element
     */
    public static WebElement findElement(By by){

        try {
            //显示等待10秒，若未查到报超时
            WebDriverWait wait=new WebDriverWait(driver,40);
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
            log.info("元素查找等待："+by);
            ActionsUtil.successScreenShort();
        }catch (Exception e){
            log.error("元素查询超时："+by);
            //失败页面截图
            ActionsUtil.failScreenShort();
        }
        WebElement element=driver.findElement(by);
        return element;
    }

    /**
     * 查询多个elements
     */
    public static List<WebElement> findElements(By by){
        try {
            WebDriverWait wait=new WebDriverWait(driver,40);
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
            log.info("多个元素查找等待："+by);
        }catch (Exception e){
            log.error("多个元素查询超时："+by);
            //失败页面截图
            ActionsUtil.failScreenShort();
        }
        List<WebElement> list=driver.findElements(by);
        return list;
    }


}
