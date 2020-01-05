package com.xiaoyu.chain;

/**
 * @author wangyaqing10924@gmail.com
 * @date 2020/1/3 3:42 PM
 */
public class ErrorLogger extends AbstractLogger {
    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
    @Override
    protected int getLevel() {
        return AbstractLogger.ERROR;
    }
}
