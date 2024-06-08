package week08.study.strategyPattern_Cat;

public class meowLv0 implements meowBehavior{
    @Override
    public void meow() {
        System.out.println("집사야~ 밥 줘~ 밥~ 잠이나 자고 있지 말고 밥 줘~");
    }
}
