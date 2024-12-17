package com.Ek0wraith.mianshixiong.manager;

import javax.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Cos 操作测试
 *
 * @author <a href="https://github.com/PooHiR">Ek0wraith</a>
 * @from <a href="https://Ek0wraith.top">Ek0wraith的个人博客</a>
 */
@SpringBootTest
class CosManagerTest {

    @Resource
    private CosManager cosManager;

    @Test
    void putObject() {
        cosManager.putObject("test", "test.json");
    }
}