import LadderGame.LadderGame;
import domain.BooleanCreatorImplements;

public class Application {

    public static void main(String[] args) {
        LadderGame ladderGame = new LadderGame(new BooleanCreatorImplements());
        ladderGame.start();
    }
}
