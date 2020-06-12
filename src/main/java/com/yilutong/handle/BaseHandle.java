package com.yilutong.handle;

import com.yilutong.page.BasePageObject;
import com.yilutong.utils.ActionsUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yicg
 * @Date: 2020/6/9 16:35
 * @Version 1.0
 */
@Slf4j
public class BaseHandle {
    private BasePageObject basePageObject;

    public BaseHandle() {
        basePageObject=new BasePageObject();
    }

    /**
     * 点击头像
     */
    public void userHeadClick(){
        ActionsUtil.oneClick(basePageObject.userHead());
        log.info("点击头像...");
    }

    /**
     * 点击洗车按钮
     */
    public void carWashServiceClick(){
        ActionsUtil.oneClick(basePageObject.carWashService());
        log.info("点击洗车按钮...");
    }

    /**
     * 点击检测按钮
     */
    public void carInspectionServiceClick(){
        ActionsUtil.oneClick(basePageObject.carInspectionService());
        log.info("点击检测按钮...");
    }
}
