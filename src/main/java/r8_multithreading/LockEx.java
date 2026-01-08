package r8_multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockEx {
    public static void main(String[] args) {
        Call call = new Call();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.mobileCall();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.zoomCall();
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.viberCall();
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}


class Call{
    private Lock lock = new ReentrantLock();

    void mobileCall(){
        lock.lock();
        try {
            System.out.println("Mobile call starts");
            Thread.sleep(3000);
            System.out.println("Mobile call ends" + '\n' + "----------");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }

    void zoomCall(){
        lock.lock();
        try {
            System.out.println("Zoom call starts");
            Thread.sleep(5000);
            System.out.println("Zoom call ends" + '\n' + "----------");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }

    void viberCall(){
        lock.lock();
        try {
            System.out.println("Viber call starts");
            Thread.sleep(7000);
            System.out.println("Viber call ends" + '\n' + "----------");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }
}