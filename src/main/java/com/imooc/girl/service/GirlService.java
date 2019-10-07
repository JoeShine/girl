package com.imooc.girl.service;

import com.imooc.girl.domain.Girl;
import com.imooc.girl.exception.GirlException;
import com.imooc.girl.repository.GirlRepository;
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

    public void getAge(Integer id) throws Exception {
        Girl girl = girlRepository.findById(id).orElse(null);
        Integer age = girl.getAge();
        if (age < 10) {
            throw new GirlException(100, "你还在上小学吧");
        } else if (age > 10 && age < 16) {
            throw new GirlException(101, "你还在上初中吧");
        } else {
            throw new GirlException(102, "你该好好学习了吧");
        }
    }

    /**
     * 通过ID获取女生信息
     *
     * @param id
     * @return
     */
    public Girl findOne(Integer id) {
        return girlRepository.findById(id).orElse(null);
    }
}
