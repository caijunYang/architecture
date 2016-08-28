package com.yang.architecture.common.exception;

/**
 * Created by caijun.yang on 2016/8/28.
 */
public class SystemException extends RuntimeException {
    private int code;
    public SystemException(String message) {
        super(message);
    }

    public SystemException(String message, Throwable cause) {
        super(message, cause);
    }

    public SystemException(Throwable cause) {
        super(cause);
    }
}
