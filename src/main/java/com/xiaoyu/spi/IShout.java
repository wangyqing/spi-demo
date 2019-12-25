package com.xiaoyu.spi;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * @author wangyaqing10924@gmail.com
 * @date 2019/12/24 11:11 AM
 */
@SPI
public interface IShout {
    /**
     * 发出叫声
     */
    void shout();
}
