package com.imooc.girl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.sql.DatabaseMetaData;

/**
 * @author JoeShine
 * 2019-10-04
 */

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class GirlApplication {

    public static void main(String[] args) {
        SpringApplication.run(GirlApplication.class, args);
    }

}
