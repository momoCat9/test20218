package com.cui.util;

public class BaseResponseInfo {
    public int code;    //标记
    public Object data;     //传输数据

    public BaseResponseInfo() {
        code = 400;
        data = null;
    }
}
