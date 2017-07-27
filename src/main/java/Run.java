/**
 * Created by Victory-x on 2017/6/19.
 */
public class Run {
    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.start();
//        System.out.println("运行结束！");
//        /**print：
//         * 运行结束！
//         * MyThread
//         * 使用多线程，代码的运行结果与代码执行顺序或调用顺序无关
//         */
//        myThread.setName("myThread");
//        try {
//            for (int i = 0; i < 10; i++) {
//                int time = (int) (Math.random() * 1000);
//                myThread.sleep(time);
//                System.out.println("main="+myThread.currentThread().getName());
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.setName("A");
        thread.start();
//        thread.run();
    }
}
