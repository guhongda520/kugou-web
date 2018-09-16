package cn.com.kugou.web.client;

import org.springframework.stereotype.Component;

@Component
public class DcClientFallback implements DcClient{
    @Override
    public String user() {
        return "user服务已经降级";
    }

    @Override
    public String email() {
        return "email服务已经降级";
    }
}
