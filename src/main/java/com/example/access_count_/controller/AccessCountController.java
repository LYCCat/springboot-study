package com.example.access_count_.controller;

import com.example.access_count_.pojo.User;
import com.example.access_count_.service.AccessCountService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

//ctrl+alt+L
@Controller
public class AccessCountController {
    Map<String, Integer> map = new HashMap<>();
    @Autowired
    private AccessCountService accessCountService;
    @GetMapping("/count")
    @ResponseBody
    public String count(HttpServletRequest request) {
        String remoteAddr = request.getRemoteAddr();
        if (map.containsKey(remoteAddr)) {
            Integer i = map.get(remoteAddr);
            map.put(remoteAddr, i + 1);

        } else {
            map.put(remoteAddr, 1);
        }
        return "ip: " + remoteAddr + ",访问次数：" + map.get(remoteAddr);
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user) {
//        if (ObjectUtils.isEmpty(user)) {
//            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("登录失败");
//        }

            accessCountService.register(user);

        return ResponseEntity.ok("登录成功");

    }
}
