/**
 * Created by Victory-x on 2017/6/19.
 */
public class MyThread extends Thread {
    public MyThread(){
        System.out.println("begin");
        System.out.println("getname()=" + Thread.currentThread().getName());
        System.out.println("this.getName()=" + this.getName());
        System.out.println("end");
    }
    @Override
    public void run() {
//        super.run();
//        System.out.println("MyThread");
//        try {
//            for (int i = 0; i < 10; i++) {
//                int time = (int) (Math.random() * 1000);
//                Thread.sleep(time);
//                System.out.println("run=" + Thread.currentThread().getName());
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("run--begin");
        System.out.println("getname()=" + Thread.currentThread().getName());
        System.out.println("this.getName()=" + this.getName());
        System.out.println("run--end");

    }
}
