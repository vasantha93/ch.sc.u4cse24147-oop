abstract class Game {
    abstract void initialize();
    abstract void start();
    abstract void end();

      public final void play() {
        initialize();
        start();
        end();
    }
}

class Chess extends Game {
    @Override
    void initialize() {
        System.out.println("Initializing Chess...");
    }

    @Override
    void start() {
        System.out.println("Chess has started!");
    }

    @Override
    void end() {
        System.out.println("Chess has ended.");
    }
}

class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Setting up Football field...");
    }

    @Override
    void start() {
        System.out.println("Football match begins!");
    }

    @Override
    void end() {
        System.out.println("Football match ends.");
    }
}

public class Game_Info {
    public static void main(String[] args) {
        Game chess = new Chess();
        chess.play();

        System.out.println();

        Game football = new Football();
        football.play();
    }
}
