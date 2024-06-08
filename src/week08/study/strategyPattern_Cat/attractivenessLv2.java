package week08.study.strategyPattern_Cat;

public class attractivenessLv2 implements attractivenessBehavior{
    @Override
    public void attractiveness() {
        System.out.println("집사한테 하고 싶은 말이 많아! 내 말 좀 들어주고 날 이뻐해 얼른!");
    }
}
