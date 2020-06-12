package com.yilutong.common;

import com.yilutong.utils.ActionsUtil;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yicg
 * @Date: 2020/6/9 14:50
 * @Version 1.0
 */
@Slf4j
public class DriverBase {

    public static WebDriver driver;
    public static String driverPath;

    /**
     * 打开指定的浏览器
     */

    public static WebDriver openBrower(String brower){
        driverPath=System.getProperty("user.dir");

        Map<String, String> mobileEmulation = new HashMap<>();
        //设置设备,例如:Google Nexus 7/Apple iPhone 6
        //mobileEmulation.put("deviceName", "Google Nexus 7");
        mobileEmulation.put("deviceName", "iPhone X");
        Map<String, Object> chromeOptions = new HashMap<>();
        chromeOptions.put("mobileEmulation", mobileEmulation);
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

        if(brower.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver",driverPath+"/drivers/chromedriver.exe");
            driver=new ChromeDriver(capabilities);
            log.info("打开浏览器："+brower);
        }else {
            log.error("浏览器类型不存在："+brower);
        }
        driver.manage().window().maximize();
        return driver;
    }


    /**
     * 关闭浏览器
     */
    public static void close(){
        try {
            driver.quit();
            log.info("退出浏览器");
        }catch (Exception e){
            log.error("退出浏览器异常："+e.getMessage());
        }

    }
}
