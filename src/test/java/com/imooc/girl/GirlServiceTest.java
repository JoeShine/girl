package com.imooc.girl;

import com.imooc.girl.domain.Girl;
import com.imooc.girl.service.GirlService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author by JoeShine
 * 2019/10/7
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest {

    @Autowired
    public GirlService girlService;

    @Test
    public void findOneTest() {
        Girl girl = girlService.findOne(222);
        Assert.assertEquals(new Integer(18), girl.getAge());
    }
}
