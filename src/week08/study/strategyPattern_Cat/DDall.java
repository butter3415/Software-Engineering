package week08.study.strategyPattern_Cat;

public class DDall extends Cat{
    public DDall() {
        attractivenessBehavior = new attractivenessLv3();
        meowBehavior = new meowLv1();
        display();
    }

    @Override
    public void display() {
        System.out.println("나는 달이야~ 나는 하고 싶은 말이 너무 많아서 집사한테 맨날 내 이야기를 하고 있어~");
    }
}
