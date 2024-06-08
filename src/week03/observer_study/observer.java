package week03.observer_study;

public interface observer{

    // temp : 온도, humidity : 습도,  pressure : 기압

    // public void update(float temp, float humidity, float pressure);  push 방법
    public void update();   // pull 방법
    
}
