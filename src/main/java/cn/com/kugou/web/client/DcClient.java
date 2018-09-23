package cn.com.kugou.web.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 黄尚
 * @brief
 * @details
 * @date 2018/9/5
 */
@FeignClient(value = "kugou-provider", fallback = DcClientFallback.class)
public interface DcClient {

    @GetMapping("/user/user")
    String user(@RequestParam("id")Long id);

    @GetMapping("/email/email")
    String email();

    @GetMapping("/rabbit/rabbitTest")
    String rabbitTest();


}
