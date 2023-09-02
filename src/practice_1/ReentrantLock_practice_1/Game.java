package practice_1.ReentrantLock_practice_1;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Game {
    private ReentrantLock locker;
    private Condition condition;
    private boolean pingTurn = true;
    Game(){
        locker = new ReentrantLock();
        condition = locker.newCondition();
    }
    public void ping(){
        locker.lock();
        try {
            while(!pingTurn){
                condition.await();
            }
            System.out.println("Ping");
            pingTurn = false;
            condition.signal();
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        finally {
            locker.unlock();
        }

    }

    public void pong(){
        locker.lock();
        try {
            while(pingTurn){
                condition.await();
            }
            System.out.println("Pong");
            pingTurn = true;
            condition.signal();
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        finally {
            locker.unlock();
        }


    }
}
