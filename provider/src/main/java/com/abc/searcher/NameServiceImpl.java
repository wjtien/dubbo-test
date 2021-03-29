package com.abc.searcher;

import com.abc.searcher.service.NamesAggOutboundDto;
import com.abc.searcher.service.NameService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.InitializingBean;

import java.util.Collections;


@DubboService(interfaceClass = NameService.class)
public class NameServiceImpl implements NameService, InitializingBean {
    @Override
    public NamesAggOutboundDto getTop10(String words) {
        return new NamesAggOutboundDto(words, Collections.emptyList());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("进行了" + this.getClass().getSimpleName() + "初始化");
    }
}
