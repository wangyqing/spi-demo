package com.xiaoyu.spi;

import java.util.ServiceLoader;

/**
 * @author wangyaqing10924@gmail.com
 * @date 2019/12/24 11:14 AM
 */
public class JavaSpiMain {
    public static void main(String[] args) {
        ServiceLoader<IShout> shouts = ServiceLoader.load(IShout.class);
//        for (IShout s : shouts) {
//            System.out.println(s.getClass());
//            s.shout();
//        }
        shouts.forEach(IShout::shout);
    }
}
