package cc.blog.test;

import cc.blog.singleton.InnerClassSingleton;

/**
 * Created by Elvis on 2017/10/13.
 */
public class Demo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        InnerClassSingleton singleton1 = InnerClassSingleton.getInstance();
        InnerClassSingleton singleton2 = InnerClassSingleton.getInstance();
        if (singleton1 == singleton2) {
            System.out.println("same");
        }
    }
}
