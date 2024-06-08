package week03.observer_study;

public interface subject {
    public void registerObserver(observer o);   // 옵저버 구독 추가
    public void removeObserver(observer o);     // 옵저버 구독 해지
    public void notifyobservers();     // 옵저버 새 정보 알림

}
