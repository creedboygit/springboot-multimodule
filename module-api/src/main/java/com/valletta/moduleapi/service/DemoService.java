package com.valletta.moduleapi.service;

import com.valletta.modulecommon.enums.CodeEnum;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public String save() {
        System.out.println(CodeEnum.SUCCESS.getCode());
        return "save";
    }

    public String find() {
        return "find";
    }
}
