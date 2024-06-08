package week08.study.ObserverPattern_highlight;

public interface subject {
    public void registerLight(Observer o);
    public void removeLight(Observer o);
    public void notifyLight();
}
