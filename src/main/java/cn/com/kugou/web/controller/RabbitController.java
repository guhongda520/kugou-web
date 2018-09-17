package cn.com.kugou.web.controller;

import cn.com.kugou.web.client.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 黄尚
 * @brief
 * @details
 * @date 2018/9/13
 */
@RestController
public class RabbitController {

    @Autowired
    private DcClient dcClient;

    @GetMapping("/rabbitTest")
    public void rabbitTest(){

        dcClient.rabbitTest();
    }
}
