package week07;

class LazyHolderSingleton{
    // private static LazyHolderSingleton uniqueInstance = new LazyHolderSingleton();

    private LazyHolderSingleton() {
    }

    private static class singleInstanceHolder{
        private static final LazyHolderSingleton UNIQUE_INSTANCE = new LazyHolderSingleton(); // final : 오버라이드 불가, 상수
    }
    public static LazyHolderSingleton getInstance(){
        return singleInstanceHolder.UNIQUE_INSTANCE;
    }
}

public class LazyHolderTest {
    public static void main(String[] args) {
        // LazyHolderSingleton l1 = new LazyHolderSingleton(); => private 이라 불가
        LazyHolderSingleton l1 = LazyHolderSingleton.getInstance();
        LazyHolderSingleton l2 = LazyHolderSingleton.getInstance();

        System.out.println(l1);
        System.out.println(l2);

        //week07.LazyHolderSingleton@41629346
        //week07.LazyHolderSingleton@41629346

        // 두 객체는 동일함
        // 매개변수 던지기 가능
        
        // 스레드로부터도 안전, 성능도 챙기고, 메모리도 원하는 시점에 getInstance 가능, 매개변수, 내용 변경 등 추가 수정 사용 가능

        




    }
}
