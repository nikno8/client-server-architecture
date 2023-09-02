package practice_1.WaitNotify_practice_1;

public class PingThread implements Runnable{
    PingPongGame game;

    public PingThread(PingPongGame game) {
        this.game = game;
    }

    @Override
    public void run() {
        while (true){
            game.ping();
        }
    }
}
