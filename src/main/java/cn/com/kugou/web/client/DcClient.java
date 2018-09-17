package cn.com.kugou.web.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 黄尚
 * @brief
 * @details
 * @date 2018/9/5
 */
@FeignClient("kugou-provider")
public interface DcClient {

    @GetMapping("/user")
    String user();

    @GetMapping("/email")
    String email();

    @GetMapping("/rabbitTest")
    String rabbitTest();


}
