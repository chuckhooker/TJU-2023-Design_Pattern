package Singleton.DoubleLock;

public class VirtualUserGenerator {
	
	// volatile 关键字用于确保多线程下的可见性和禁止指令重排序
	private static volatile VirtualUserGenerator virtualUserGenerator;

    private VirtualUserGenerator() {

    }

    public static VirtualUserGenerator getInstance() {
    	// 第一次检查：检查实例是否已经存在
        if (virtualUserGenerator == null) {
            // 进入同步块，确保只有一个线程可以进入
            synchronized (VirtualUserGenerator.class) {
                // 第二次检查：在同步块内再次检查实例是否为null (防止前面的线程在第一次检查后，进入同步块前停止)
                if (virtualUserGenerator == null) {
                    // 如果仍为null，创建唯一的实例
                	virtualUserGenerator = new VirtualUserGenerator();
                }
            }
        }
        return virtualUserGenerator;
    }

}
