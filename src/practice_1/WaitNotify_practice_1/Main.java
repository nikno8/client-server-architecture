package practice_1.WaitNotify_practice_1;

public class Main {
    public static void main(String[] args) {
        PingPongGame game = new PingPongGame();
        Thread pingThread = new Thread(new PingThread(game));
        Thread pongThread = new Thread(new PongThread(game));
        pingThread.start();
        pongThread.start();
    }
}
