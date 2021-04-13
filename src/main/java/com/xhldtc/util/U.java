package com.xhldtc.util;

import com.xhldtc.bean.User;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class U {

    /**
     * 将list按对象的某一个字段分组
     * @param list
     * @return
     */
    public static Map<Integer, List<User>> partitionListToMap(List<User> list) {
        return list.stream().collect(Collectors.groupingBy(User::getCompanyId));
    }
}
