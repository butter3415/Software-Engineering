package week08.study.strategyPattern_Cat;

public class Habbong extends Cat{
    public Habbong() {
        attractivenessBehavior = new attractivenessLv1();
        meowBehavior = new meowLv0();
        display();
    }

    @Override
    public void display() {
        System.out.println("나는 해봉이야~ 날 누가 만지던 상관은 없고~ 잘 수 있는 곳과 밥만 있으면 나는 행복해~");
    }
}
