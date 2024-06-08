package week08.study.ObserverPattern;

public interface subject {
    public void registerOb(observer observer);
    public void removeOb(observer observer);
    public void notifyOb();

}
