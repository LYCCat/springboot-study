package com.example.access_count_;

import com.example.access_count_.pojo.User;
import com.example.access_count_.service.AccessCountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AccessCountApplicationTests {

    @Autowired
    AccessCountService accessCountService;
    @Test
    public void m(){
        User user=new User();
        accessCountService.register(user);
    }
    void contextLoads() {
    }


}
