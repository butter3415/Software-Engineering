package week08.study.strategyPattern_Cat;

public abstract class Cat {
    attractivenessBehavior attractivenessBehavior;
    meowBehavior meowBehavior;

    public abstract void display();

    public void performAttractiveness(){
        attractivenessBehavior.attractiveness();
    }

    public void performMeow(){
        meowBehavior.meow();
    }

    public void setAttractivenessBehavior(attractivenessBehavior attractivenessBehavior) {
        this.attractivenessBehavior = attractivenessBehavior;
    }

    public void setMeowBehavior(meowBehavior meowBehavior) {
        this.meowBehavior = meowBehavior;
    }
}
