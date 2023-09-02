package practice_1.WaitNotify_practice_1;

public class PongThread implements Runnable {
    PingPongGame game;

    public PongThread(PingPongGame game) {
        this.game = game;
    }

    @Override
    public void run() {
        while (true){
            game.pong();
        }
    }
}
