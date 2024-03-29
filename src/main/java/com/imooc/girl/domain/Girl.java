package com.imooc.girl.domain;

import javax.persistence.*;
import javax.validation.constraints.Min;

/**
 * @author by JoeShine
 * 2019/10/5
 **/

@Entity
public class Girl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Min(value = 18,message = "禁止未成年少女入内")
    private Integer age;
    private String cupSize;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", age=" + age +
                ", cupSize='" + cupSize + '\'' +
                '}';
    }
}
