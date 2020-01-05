package com.xiaoyu.chain;

/**
 * @author wangyaqing10924@gmail.com
 * @date 2020/1/3 3:41 PM
 */
public class ConsoleLogger extends AbstractLogger {
    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }

    @Override
    protected int getLevel() {
        return AbstractLogger.INFO;
    }
}
