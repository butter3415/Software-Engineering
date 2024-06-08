package week08.study.strategyPattern_Cat;

public class JJong extends Cat{
    public JJong() {
        attractivenessBehavior = new attractivenessLv0();
        meowBehavior = new meowLv3();
        display();
    }

    @Override
    public void display() {
        System.out.println("나는 쫑이야 날 건드리면 큰코 다칠걸?");
    }
}
