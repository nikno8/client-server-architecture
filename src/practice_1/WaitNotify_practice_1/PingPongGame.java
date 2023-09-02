package practice_1.WaitNotify_practice_1;

public class PingPongGame {
    private boolean pingTurn = true;

    public synchronized void ping() {
        try {
            while (!pingTurn) {
                wait(); // Ждем уведомления от другого потока
            }
            System.out.print("Ping ");
            pingTurn = false;
            notify(); // Уведомляем другой поток, что его очередь
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized void pong() {
        try {
            while (pingTurn) {
                wait(); // Ждем уведомления от другого потока
            }
            System.out.print("Pong ");
            pingTurn = true;
            notify(); // Уведомляем другой поток, что его очередь
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
