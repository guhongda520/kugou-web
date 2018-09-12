package cn.com.kugou.web.controller;

import cn.com.kugou.web.client.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 黄尚
 * @brief
 * @details
 * @date 2018/9/12
 */
@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private DcClient dcClient;

    // 发送失败，报错解析不了host
    @GetMapping("/email")
    public void emailTest() throws Exception {
        dcClient.email();
    }
}
