public class KronometreThread implements Runnable {
    private Thread thread;
    private String threadName;

    public KronometreThread(String threadName) {
        this.threadName = threadName;
        System.out.println("OLuşturuluyor" + threadName);
    }

    @Override
    public void run() {//thread şeklinde çalışması için gerekli sınıf
        System.out.println("Çalıştırılıyor: " + threadName);

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(threadName + ":" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Kesildi:"+threadName+":"+e);
        }
        System.out.println("Thread bitti:"+threadName);

    }
    public void start(){
        System.out.println("Thread nesnesi oluşuyor");
        if(thread==null){
            thread = new Thread(this,threadName);//thread çalışması için newlemwk gereklidir
            thread.start();
        }
    }
}

