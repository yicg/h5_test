package com.yilutong.handle;

import com.yilutong.page.UserCenterPageObject;
import com.yilutong.utils.ActionsUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yicg
 * @Date: 2020/6/9 16:55
 * @Version 1.0
 */
@Slf4j
public class UserCenterHandle {
    private UserCenterPageObject userCenterPageObject;

    public UserCenterHandle() {
        userCenterPageObject=new UserCenterPageObject();
    }

    /**
     * 点击个人中心页的头像
     */
    public void userCenterHeadClick(){

        ActionsUtil.oneClick(userCenterPageObject.userCenterHead());
        log.info("点击个人中心页头像");

    }
}
