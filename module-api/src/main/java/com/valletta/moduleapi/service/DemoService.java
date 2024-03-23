package com.valletta.moduleapi.service;

import com.valletta.modulecommon.domain.Member;
import com.valletta.modulecommon.repository.MemberRepository;
import com.valletta.modulecommon.service.CommonDemoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class DemoService {

    @Value("${profile-name}")
    private String profileName;

    private final CommonDemoService commonDemoService;
    private final MemberRepository memberRepository;

    public String save() {
        log.info("# profileName: {}", profileName);
        
        memberRepository.save(Member.builder()
//            .name("테스트")
            .name(Thread.currentThread().getName())
            .build());
//        System.out.println(CodeEnum.SUCCESS.getCode());
//        System.out.println(commonDemoService.commonService());
        return "save";
    }

    public String find() {
        int size = memberRepository.findAll().size();
        log.info("# DB Size: {}", size);
        return "find";
    }

    public String exception() {
        return "exception";
    }
}
