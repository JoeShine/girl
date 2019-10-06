package com.imooc.girl.repository;

import com.imooc.girl.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author by JoeShine
 * 2019/10/5
 **/
public interface GirlRepository extends JpaRepository<Girl, Integer> {

    //通过年龄查询女生列表
    public List<Girl> findByAge(Integer age);
}
