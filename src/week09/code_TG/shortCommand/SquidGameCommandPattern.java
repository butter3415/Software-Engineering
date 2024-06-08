package week09.code_TG.shortCommand;

public class SquidGameCommandPattern {
    public static void main(String[] args) {
        GameControl gameControl = new GameControl();

        gameControl.setGameCommand(()-> System.out.println("무궁화 꽃이 피었습니다 게임 시작"));
        gameControl.startGame();
        gameControl.setGameCommand(()-> System.out.println("달고나 게임 시작"));
        gameControl.startGame();
        gameControl.setGameCommand(()-> System.out.println("줄다리기 게임 시작"));
        gameControl.startGame();
    }
}
