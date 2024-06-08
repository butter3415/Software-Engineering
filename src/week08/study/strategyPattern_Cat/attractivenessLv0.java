package week08.study.strategyPattern_Cat;

public class attractivenessLv0 implements attractivenessBehavior{
    @Override
    public void attractiveness() {
        System.out.println("나는 집사를 따라다닐거지만 날 만지지는 말거라 집사");
    }
}
