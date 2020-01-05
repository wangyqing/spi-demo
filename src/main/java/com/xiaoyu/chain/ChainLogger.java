package com.xiaoyu.chain;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * @author wangyaqing10924@gmail.com
 * @date 2020/1/3 3:48 PM
 */
@SPI("Chain")
public interface ChainLogger {
    /**
     * 设置下一个责任链条
     *
     * @param nextLogger
     */
    void linkNextLogger(ChainLogger nextLogger);

    /**
     * 输入日志
     *
     * @param level
     * @param message
     */
    void logMessage(int level, String message);
}
