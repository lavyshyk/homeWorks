package hanoi;

import java.util.HashMap;
import java.util.Map;

public class Player {
    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setGamePlay(GamePlay gamePlay) {
        this.gamePlay = gamePlay;
    }

    String name;

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public GamePlay getGamePlay() {
        return gamePlay;
    }

    int score;
    GamePlay gamePlay;

    public Player(String name, GamePlay gamePlay) {
        this.name = name;
        this.gamePlay = gamePlay;
    }

    public Player(String name, int score, GamePlay gamePlay) {
        this.name = name;
        this.score = score;
        this.gamePlay = gamePlay;
    }
}
