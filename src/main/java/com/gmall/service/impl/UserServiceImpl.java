package com.gmall.service.impl;

import com.gmall.bean.UserAdress;
import com.gmall.service.UserService;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements UserService {

    private static final Logger logger =Logger.getLogger(UserServiceImpl.class) ;
    public List<UserAdress> getUserAdressList(String s) {
        //模拟获取数据过程，这里为简化，自定义两个地址对象返回
//        UserAddress address1 = new UserAddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "李老师", "010-56253825", "Y");
        UserAdress adrress3 = new UserAdress(1,"深圳市南山区软件园","3","许老师","4322","Y") ;
        UserAdress adrress4 = new UserAdress(2,"深圳市宝安区西部硅谷大厦B座9层","4","王老师","56253825","Y") ;
//        UserAddress address2 = new UserAddress(2, "深圳市宝安区西部硅谷大厦B座9层", "1", "王老师", "010-56253825", "N");

        logger.info("adress3"+adrress3.toString());
        return Arrays.asList(adrress3, adrress3);
    }
}
