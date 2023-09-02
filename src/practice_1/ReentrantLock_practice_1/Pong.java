package practice_1.ReentrantLock_practice_1;

public class Pong implements Runnable{
    private Game game;

    public Pong(Game game) {
        this.game = game;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            game.pong();
        }

    }
}
