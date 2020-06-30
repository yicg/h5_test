package com.yilutong.page;

import com.yilutong.common.ConstParam;
import com.yilutong.utils.WebElementUtil;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;

/**
 * @Author: yicg
 * @Date: 2020/6/9 16:52
 * @Version 1.0
 * 个人中心页面page
 */
@Slf4j
public class UserCenterPageObject {

    /**
     * 个人中心页的头像元素
     * @return
     */
    public WebElement userCenterHead(){
        log.info("获取个人中心页的头像元素");
        WebElement webElement= WebElementUtil.findElement(ConstParam.user_center_head);

        return webElement;
    }
}
