package shuping.infrastructure;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by fuwei on 2018/9/7.
 */
@Slf4j
public class LogTest {
    @org.junit.Test
    public void testLog() {
        String s = ">>>{}";
        log.debug(s, "debug");
        log.warn(s, "warn");
        log.info(s, "info");
        log.error(s, "error");
        log.trace(s, "trace");
    }
}