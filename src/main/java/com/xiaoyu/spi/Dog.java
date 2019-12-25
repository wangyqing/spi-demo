package com.xiaoyu.spi;

/**
 * @author wangyaqing10924@gmail.com
 * @date 2019/12/24 11:11 AM
 */
@Animal("Dog")
public class Dog implements IShout {
    @Override
    public void shout() {
        System.out.println("wang wang");
    }
}
