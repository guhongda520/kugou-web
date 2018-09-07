package cn.com.kugou.web.controller;

import cn.com.kugou.web.client.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 黄尚
 * @brief
 * @details
 * @date 2018/9/4
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private DcClient dcClient;


    @GetMapping("/user")
    public String user() {
        return dcClient.consumer();
    }
}
