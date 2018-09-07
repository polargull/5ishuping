package shuping;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by fuwei on 2018/9/7.
 */
@Slf4j
public class Test {
    @org.junit.Test
    public void name() {
        log.info(">>>>> {}", "info");
        log.warn(">>>>>>> {}", "warn");
        log.error(">>>>>>>> {}", "error");
    }
}
