package week08.study.strategyPattern_Cat;

public class meowLv1 implements meowBehavior{
    @Override
    public void meow() {
        System.out.println("집사! 집사! 집사! 집사! 집사! 얼른 내 말 좀 들어주고 날 이뻐해줘!!!");
    }
}
