package com.xiaoyu.chain;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

/**
 * @author wangyaqing10924@gmail.com
 * @date 2020/1/3 3:43 PM
 */
public class ChainDemo {
    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger();
        AbstractLogger fileLogger = new FileLogger();
        AbstractLogger consoleLogger = new ConsoleLogger();

        errorLogger.linkNextLogger(fileLogger);
        fileLogger.linkNextLogger(consoleLogger);

        return errorLogger;
    }


    private static ChainLogger getSpiChainOfLoggers() {
        ExtensionLoader<ChainLogger> extensionLoader =
                ExtensionLoader.getExtensionLoader(ChainLogger.class);
        ChainLogger firstLogger = null;
        ChainLogger preLogger = null;
        for (String name : extensionLoader.getSupportedExtensions()) {
            ChainLogger logger = extensionLoader.getExtension(name);
            if (preLogger != null) {
                preLogger.linkNextLogger(logger);
            } else {
                firstLogger = logger;
            }
            preLogger = logger;
        }
        return firstLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");

        ChainLogger logger = getSpiChainOfLoggers();
        if (logger != null) {
            logger.logMessage(AbstractLogger.INFO, "INFO");
            logger.logMessage(AbstractLogger.DEBUG, "DEBUG");
            logger.logMessage(AbstractLogger.ERROR, "ERROR");
        }
    }
}
