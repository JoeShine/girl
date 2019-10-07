package com.imooc.girl.utils;

import com.imooc.girl.domain.Result;

/**
 * @author by JoeShine
 * 2019/10/7
 **/
public class ResultUtil {
    //成功,返回data
    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    //成功，不返回数据
    public static Result success() {
        return success(null);
    }

    //失败
    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
