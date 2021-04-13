package com.xhldtc.util;

import com.xhldtc.bean.User;
import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class UTest extends TestCase {

    public void testPartitionListToMap() {
        User a = new User(1, 100, "alice");
        User b = new User(2, 100, "bob");
        User c = new User(3, 200, "cat");
        User d = new User(4, 200, "dude");
        User e = new User(5, 300, "ever");
        Map<Integer, List<User>> map = U.partitionListToMap(Arrays.asList(a, b, c, d, e));
        assertEquals(3, map.size());
        assertEquals(2, map.get(100).size());
        assertEquals(1, map.get(300).size());
    }
}