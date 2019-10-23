package com.aliang.provider;

import com.aliang.api.UserInfoService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProviderApplicationTests {

    @Autowired
    private UserInfoService userInfoService;

    @Test
    public void contextLoads() {
        userInfoService.getUserInfo();
    }

    @Test
    public void list() {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("apple");
        list.add("apple");
        LinkedHashSet set = new LinkedHashSet();
        set.addAll(list);
        list.clear();
        list.addAll(set);
        Assert.assertEquals(list.size(), 1);
        Assert.assertEquals(list.get(0), "apple");
    }

    @Test
    public void hashMapSort() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("c", "ccc");
        map.put("e", "eee");
        map.put("b", "bb");
        map.put("f", "fff");
        List<Map.Entry<String, String>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, Comparator.comparing(o -> o.getValue()));
        for (Map.Entry<String, String> mapping : list){
            System.out.println(mapping.getKey() + ":" + mapping.getValue());
        }
    }
}
