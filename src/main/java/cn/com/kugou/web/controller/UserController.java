package cn.com.kugou.web.controller;

import cn.com.kugou.web.client.DcClient;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.annotations.ApiIgnore;

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
    @ApiOperation(value="获取用户信息", notes="用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long" , paramType= "query"),
    })
    public String user(@ApiIgnore Long id) {
        return dcClient.user();
    }
}
