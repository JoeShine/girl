package com.imooc.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author JoeShine
 * 2019-10-04
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

//    @RequestMapping(value = "say", method = RequestMethod.GET)
    @GetMapping(value = "say")
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0") String myId) {
//        return girlProperties.getCupSize();
        return "myId=" + myId;
    }
}
