package week08.study.strategyPattern_Cat;

public class GGami extends Cat{

    public GGami() {
        attractivenessBehavior = new attractivenessLv3();
        meowBehavior = new meowLv2();
        display();
    }

    @Override
    public void display() {
        System.out.println("나는 까미! 누나가 제일 좋아!");
    }
}
