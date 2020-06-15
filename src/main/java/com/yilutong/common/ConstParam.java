package com.yilutong.common;

import com.yilutong.config.DataSourceConfig;
import com.yilutong.dao.ElementInfoTableMapper;
import com.yilutong.model.ElementInfoTable;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.openqa.selenium.By;

/**
 * @author yicg
 * @createTime 2020年02月12日 18:06:00
 * @Description
 */
@Slf4j
public class ConstParam {
   static SqlSession sqlSession;
   static ElementInfoTableMapper elementInfoTableMapper;

    //从数据库读取数据
    public  static By getDataBy(String key){
        sqlSession= DataSourceConfig.getSqlSession("databaseConfig.xml");
        elementInfoTableMapper=sqlSession.getMapper(ElementInfoTableMapper.class);
        ElementInfoTable elementInfoTable=elementInfoTableMapper.selectByKey(key);
        String type=elementInfoTable.getType();
        String value=elementInfoTable.getElementValue();
        if("xpath".equalsIgnoreCase(type)){
            return By.xpath(value);

        }if("className".equalsIgnoreCase(type)){
            return By.className(value);

        }if("linkText".equalsIgnoreCase(type)){
            return By.linkText(value);

        }if("tagName".equalsIgnoreCase(type)){
            return By.tagName(value);

        }if("id".equalsIgnoreCase(type)){
            return By.id(value);
        }
        else {
            log.error("参数文件中的定位方式不存在.....");
            return null;
        }
    }


    /**
     * 首页展示的元素
     */

    //首页个人头像
    public static By user_head=getDataBy("user_head");
    //个人中心页头像
    public static By user_center_head=getDataBy("user_center_head");

    //列表元素
    public static By service_list=getDataBy("sel_service_list");
    //首页洗车元素
    public static By car_wash_service=getDataBy("sel_car_wash_service");




    /**
     * 洗车详情页
     */
    //选择洗车店列表第一个店家
    public static By sel_car_wash_shop=getDataBy("sel_car_wash_shop");
    //洗车店地址信息文本
    public static By sel_shop_addr_info=getDataBy("sel_shop_addr_info");
    //联系店铺元素
    public static By sel_contact_shop=getDataBy("sel_contact_shop");
    //导航元素
    public static By sel_gps_info=getDataBy("sel_gps_info");
    //返回元素
    public static By back_button=getDataBy("back_button");
    //小型轿车
    public static By sel_small_car=getDataBy("sel_small_car");
    //suv车型
    public static By sel_suv_car=getDataBy("sel_suv_car");
    //未用券选项
    public static By sel_unused_voucher=getDataBy("sel_unused_voucher");
    //勾选活动券
    public static By tick_activity=getDataBy("tick_activity");
    //去洗车按钮
    public static By sel_to_wash_button=getDataBy("sel_to_wash_button");


    /**
     * 检测下单页面
     */
    //店铺搜索按钮-放大镜标志
    public static By check_search_button=getDataBy("check_search_button");
    //店铺搜索框
    public static By check_search_input=getDataBy("check_search_input");
    public static By wash_order_shop_addr=getDataBy("wash_order_shop_addr");
    public static By wash_order_contact_shop=getDataBy("wash_order_contact_shop");
    public static By wash_order_gps_info=getDataBy("wash_order_gps_info");
    public static By wash_order_activity_name=getDataBy("wash_order_activity_name");
    public static By wash_order_total_amount=getDataBy("wash_order_total_amount");
    public static By wash_order_actual_amount=getDataBy("wash_order_actual_amount");
    public static By wash_order_license_input=getDataBy("wash_order_license_input");
    public static By wash_order_bottom_text=getDataBy("wash_order_bottom_text");
    public static By wash_order_confirm=getDataBy("wash_order_confirm");
    //检测下单页面底部一行文字
    public static By check_order_bottom_text=getDataBy("check_order_bottom_text");


    /**
     * 保养服务相关
     */
    public static By check_year_car_element=getDataBy("check_year_car_element");
    public static By wash_car_element=getDataBy("wash_car_element");
    public static By maintain_service_type=getDataBy("maintain_service_type");
    public static By maintain_service_info=getDataBy("maintain_service_info");
    public static By maintain_service_confirm_button=getDataBy("maintain_service_confirm_button");
    public static By to_improved_type=getDataBy("to_improved_type");
    public static By to_improved_car_no=getDataBy("to_improved_car_no");
    public static By to_improved_cancel_button=getDataBy("to_improved_cancel_button");
    public static By maintain_coupon_button=getDataBy("maintain_coupon_button");
    public static By to_maintain_button=getDataBy("to_maintain_button");
    public static By maintain_order_coupon_button=getDataBy("maintain_order_coupon_button");
    public static By maintain_order_total_amount=getDataBy("maintain_order_total_amount");
    public static By maintain_order_actual_amount=getDataBy("maintain_order_actual_amount");
    public static By maintain_order_bottom_text=getDataBy("maintain_order_bottom_text");
    public static By maintain_order_confirm=getDataBy("maintain_order_confirm");



}
