package com.abc.consumer.controller;

import com.abc.searcher.service.NamesAggOutboundDto;
import com.abc.searcher.service.NameService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class NamesController {
    @DubboReference
    private NameService nameService;

    @GetMapping("names")
    public ResponseEntity<NamesAggOutboundDto> getSuggestedCompanyNames(
            String words) {
        return ResponseEntity.ok(nameService.getTop10(words));
    }
}
