package week08.study.strategyPattern_Cat;

public class CatSimulator {
    public static void main(String[] args) {
        Cat NYANG = new Habbong();

        NYANG.performAttractiveness();
        NYANG.performMeow();

    }
}
