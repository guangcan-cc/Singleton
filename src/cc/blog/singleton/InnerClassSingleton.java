package cc.blog.singleton;

/**
 * Created by Elvis on 2017/10/13.
 */
public class InnerClassSingleton {
    static {
        System.out.println("�Ҳű�������...");
    }
    // �ڲ���ֻ�б�ʹ��ʱ�Żᱻ���أ�
    // ��InnerClassSingleton�����ʱ�������ʼ���ڲ��ֻ࣬�е��ڲ��౻����ʱ���Ż��ʼ����
    private static class LazyHolder {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
        static {
            System.out.println("�ڲ��౻������....");
        }
    }
    private InnerClassSingleton (){}
    public static InnerClassSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
