package cc.blog.singleton;

/**
 * Created by Elvis on 2017/10/13.
 */
public class InnerClassSingleton {
    static {
        System.out.println("我才被加载了...");
    }
    // 内部类只有被使用时才会被加载：
    // 当InnerClassSingleton类加载时，不会初始化内部类，只有当内部类被调用时，才会初始化。
    private static class LazyHolder {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
        static {
            System.out.println("内部类被加载了....");
        }
    }
    private InnerClassSingleton (){}
    public static InnerClassSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
