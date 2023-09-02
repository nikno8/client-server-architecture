package practice_1.ReentrantLock_practice_1;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Ping ping = new Ping(game);
        Pong pong = new Pong(game);
        new Thread(ping).start();
        new Thread(pong).start();
    }
}
