package com.yilutong.utils;


import com.yilutong.common.DriverBase;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author yicg
 * @createTime 2020年06月09日 14:36:00
 * @Description
 */
@Slf4j
public class ActionsUtil extends DriverBase {
    /**
     * 打开网站
     */
    public static void getUrl(String url){
        try {
            driver.get(url);
            log.info("打开测试网站："+url);
        }catch (Exception e){
            log.error("打开的地址有误："+e.getMessage());
        }
    }

    /**
     * 二次封装click()
     */
    public static void oneClick(WebElement element){
        element.click();
        log.info("单击元素："+element);
    }


    /**
     * 二次封装文本输入方法
     */
    public static void sendText(WebElement element,String text){
       //清空操作
        element.clear();
        element.sendKeys(text);
        log.info("在文本框处："+element+"输入文本信息："+text);
    }

    /**
     * 获取某个元素处的文本信息
     */
    public static String getText(WebElement element){
        String text=element.getText();
        log.info("获取元素："+element+"文本信息为："+text);
        return text;

    }

    /**
     * 获取某个元素多个文本值
     */
    public static List<String> getAllText(By by){
        List<String> list=new ArrayList<String>();
        List<WebElement> webElementList= WebElementUtil.findElements(by);
        for (WebElement webElements:webElementList
             ) {
            list.add(webElements.getText());
        }
        log.info("获取元素："+by+"文本信息为："+list);
        return list;
    }

    /**
     * 封装鼠标操作双击
     */
    public static void twoClick(WebElement element){
        Actions actions=new Actions(driver);
        actions.doubleClick(element).perform();
        log.info("鼠标双击元素："+element);
    }

    /**
     * 鼠标右键点击
     */
    public static void rightClick(WebElement element){
        Actions actions=new Actions(driver);
        actions.contextClick(element).perform();
        log.info("鼠标右键点击："+element);
    }

    /**
     * 鼠标移到某个元素
     */
    public static void moveMouse(WebElement element){
        Actions actions=new Actions(driver);
        actions.moveToElement(element).perform();
        log.info("鼠标移到元素："+element);
    }

    /**
     * 元素拖拽到x,y轴上
     */
    public static void drop(WebElement element,int x,int y){
        Actions actions=new Actions(driver);
        actions.dragAndDropBy(element,x,y).perform();
        log.info("用鼠标把元素拖拽到："+element+"x轴="+x+"y轴="+y);
    }





    /**
     * 截图功能封装
     */
    public static void screenShort(){
        String path=System.getProperty("user.dir");
        String screenName=DateFormatUtils.format(DateFormatUtils.ZH_DATE_FORMAT);

        File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file,new File(path+"/screen/"+screenName+".png"));
        }catch (Exception e){
            log.error("错误页面截图失败:"+e.getMessage());
            e.getMessage();
        }

    }

    /**
     * 切换句柄到新页面进行操作
     * 切换回原来页面方法：driver.switchTo().window(handle);
     *
     */
    public static void changeHandle(String handle){
        //获取页面所有的句柄，一般是两个句柄
        Set<String> handleList=driver.getWindowHandles();
        for (String s:handleList
             ) {
            if(handle.equals(s)){
                continue;
            }else {
                //切换句柄
                driver.switchTo().window(s);
                log.info("切换句柄："+handle);
            }
        }
    }

    /**
     * 控制权转交至frame
     * 控制权交回      driver.switchTo().defaultContent();
     * @param
     */
    public static void switchToIframe(WebElement element){
        //进入到某个元素定位到的iframe
        driver.switchTo().frame(element);
        log.info("控制权转交到iframe表单:"+element);

    }

    /**
     * 控制权交给弹框alert
     * @throws InterruptedException
     */
    public static void switchToAlert(WebElement element){

        driver.switchTo().alert();
        log.info("控制权交给弹框alert");
    }


    /**
     * 刷新页面
     */
    public static void refresh(){
        driver.navigate().refresh();
        log.info("刷新当前页面");
    }

}
