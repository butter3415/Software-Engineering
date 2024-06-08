package week09.code_TG;

public class SquidGameCommandPattern {
    public static void main(String[] args) {
        GameControl gameControl = new GameControl();

        GameCommand mugunghwaGame = new MugunghwaGame();
        GameCommand dalgonaGame = new DalgonaGame();
        GameCommand tugofwargame = new TugOfWarGame();

        gameControl.setGameCommand(mugunghwaGame);
        gameControl.startGame();
        gameControl.setGameCommand(dalgonaGame);
        gameControl.startGame();
        gameControl.setGameCommand(tugofwargame);
        gameControl.startGame();
    }
}
