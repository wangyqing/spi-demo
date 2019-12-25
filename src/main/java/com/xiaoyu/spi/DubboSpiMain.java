package com.xiaoyu.spi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

/**
 * @author wangyaqing10924@gmail.com
 * @date 2019/12/24 3:17 PM
 */
public class DubboSpiMain {
    public static void main(String[] args) {
        ExtensionLoader<IShout> extensionLoader =
                ExtensionLoader.getExtensionLoader(IShout.class);
        IShout cat = extensionLoader.getExtension("cat");
        IShout dog = extensionLoader.getExtension("dog");

        cat.shout();
        dog.shout();
        cat.shout();
        cat.shout();
        dog.shout();
        dog.shout();
    }
}
