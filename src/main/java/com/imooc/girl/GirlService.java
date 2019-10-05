package com.imooc.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author by JoeShine
 * 2019/10/5
 **/

@Service
public class GirlService {

    @Autowired
    GirlRepository girlRepository;

    @Transactional
    public void insertTwo() {
        Girl girlA = new Girl();
        girlA.setAge(50);
        girlA.setCupSize("I");
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setAge(50);
        girlB.setCupSize("HH");
        girlRepository.save(girlB);
    }
}
