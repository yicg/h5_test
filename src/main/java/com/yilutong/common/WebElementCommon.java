package com.yilutong.common;

import com.yilutong.utils.WebElementUtil;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * @Author: yicg
 * @Date: 2020/6/10 18:10
 * @Version 1.0
 *
 * 通用工具，可以做父子节点，list等等
 */
@Slf4j
public class WebElementCommon {

    /**
     * 查找多个元素，通过关键字获取
     * @return
     */
    public  WebElement twoLayersElements(By by, String keyword ){
        List<WebElement> list= WebElementUtil.findElements(by);
        for (WebElement webElement:list){
            if(! keyword.equals(webElement.getText())){
                continue;
            }else if(null==webElement.getText()){
                continue;
            }else {
                return webElement;
            }

        }
        return null;
    }

    public  List<WebElement> twoLayersElements(By by){
        List<WebElement> list= WebElementUtil.findElements(by);
        return list;
    }
}


