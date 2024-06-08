package week07;

public class SingletonThreadTest {
    public static void main(String[] args) {
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton s3 = Singleton.getInstance();
                System.out.println(s3.hashCode());  // 1573526172
            }
        });
        // 익명 객체 만들기

        Thread t4 = new Thread(()->{
            Singleton s4 = Singleton.getInstance();
            System.out.println(s4.hashCode());      // 1640880255
        });
        // 람다 코드 만들기

        // Singleton s3 = Singleton.getInstance();

        t3.start();
        t4.start();

        // t3 객체와 t4 객체가 같아야 하는데 s3, s4 객체가 각각 난입하여 초콜릿 보일러가 터졌다!
        //1836921654
        //1836921654 => synchronized 넣으니까 같아짐
        
        // s3, s4 각각 경쟁하는데 누가 먼저 들어갈지는 아무도 모름
        // 누가 먼저 들어가든 먼저 들어간 사람이 객체 만들면 다음에 들어간 사람은 객체 생성 불가, unique


    }
}
