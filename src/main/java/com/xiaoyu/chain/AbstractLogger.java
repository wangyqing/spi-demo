package com.xiaoyu.chain;

/**
 * @author wangyaqing10924@gmail.com
 * @date 2020/1/3 3:40 PM
 */
public abstract class AbstractLogger implements ChainLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    /**
     * 责任链中的下一个元素
     */
    protected ChainLogger nextLogger;

    /**
     * 设置链条
     *
     * @param nextLogger
     */
    @Override
    public void linkNextLogger(ChainLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    /**
     * 输出日志
     *
     * @param level
     * @param message
     */
    @Override
    public void logMessage(int level, String message) {
        if (getLevel() <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    /**
     * 写日志
     *
     * @param message
     */
    abstract protected void write(String message);

    /**
     * 获取等级
     *
     * @return
     */
    abstract protected int getLevel();
}
