package week08.study.strategyPattern_Cat;

public class meowLv2 implements meowBehavior{
    @Override
    public void meow() {
        System.out.println("집사 뭐해? 나랑 안 놀아? 그럼 무릎 좀 줘봐 내가 앉을게! 집사 사랑해~");
    }
}
