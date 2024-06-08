package week08.study.strategyPattern_Cat;

public class attractivenessLv3 implements attractivenessBehavior{
    @Override
    public void attractiveness() {
        System.out.println("집사가 제일 좋아 집사랑 하루종일 붙어있을거야! 날 이뻐하고 나한테 관심줘! 집사 최고!");
    }
}
