package com.erato.demomall.common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author ZhangYuan
 * @date 2023/2/13
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CommonResp<T> {
    
    private Integer code;
    
    private String message;
    
    private T data;
    
    public static <T> CommonResp<T> ok() {
        return new CommonResp<T>().setCode(200).setMessage("Success!");
    }
    
    public static <T> CommonResp<T> ok(T data) {
        return new CommonResp<T>().setCode(200).setMessage("Success!").setData(data);
    }
}
