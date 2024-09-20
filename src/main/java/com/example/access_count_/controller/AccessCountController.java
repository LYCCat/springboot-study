package com.example.access_count_.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
//ctrl+alt+L
@Controller
public class AccessCountController {
    Map<String, Integer> map = new HashMap<>();

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
}
