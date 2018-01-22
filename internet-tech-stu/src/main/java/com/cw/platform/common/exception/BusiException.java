package com.cw.platform.common.exception;

/**
 * 业务异常判断提示。用了在controller层区分是否要提示给jsp界面上。
 *
 * @author huang.zigao 20120927
 */
public class BusiException extends Exception {
    private static final long serialVersionUID = 1L;

    public BusiException() {
    }

    public BusiException(String message) {
        super(message);
    }

    public BusiException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusiException(Throwable cause) {
        super(cause);
    }
}
