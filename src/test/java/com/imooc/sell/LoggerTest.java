package com.imooc.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

//    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);


    @Test
    public void test1(){
        String name = "wdd";
        log.info("info");
//        logger.info("name:{}",name);
//        logger.info("info..");

//        log.debug("debug...");
//        log.info("info...");
//        log.error("error...");
    }
}
