package week08.study.strategyPattern_Cat;

public class attractivenessLv1 implements attractivenessBehavior{
    @Override
    public void attractiveness() {
        System.out.println("날 만지면 기분 좋아~ 근데 우선 밥 줘! 아침에도 제때제때 밥 주란 말이야!");
    }
}
