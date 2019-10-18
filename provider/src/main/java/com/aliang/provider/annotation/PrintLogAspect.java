package com.aliang.provider.annotation;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

@Aspect
@Component
@Slf4j
public class PrintLogAspect {

    @Pointcut("@annotation(com.aliang.provider.annotation.PrintLog)")
    public void logPointCut(){
    }

    @Before(value = "logPointCut()")
    public void before(){
        log.info("方法执行开始，开始时间：{}", LocalDateTime.now());
    }

    @After(value = "logPointCut()")
    public void after(){
        log.info("方法执行结束，结束时间：{}", LocalDateTime.now());
    }

}
