package week09.code_TG;

public class GameControl {
    private  GameCommand gameCommand;

    public void setGameCommand(GameCommand gameCommand){
        this.gameCommand = gameCommand;
    }

    public void startGame(){
        System.out.println("게임을 시작합니다.");
        gameCommand.execute();
    }
}
