package week07;

class Singleton{

//    private Singleton() {}
//
//    private static Singleton uniqueInstance;
//
//    public static Singleton getInstance(){
//        if (uniqueInstance == null){
//            uniqueInstance = new Singleton();
//        }
//        return uniqueInstance;
//    }


//    private Singleton() {}
//
//    private static Singleton uniqueInstance;
//
//    public static synchronized Singleton getInstance(){
//        if (uniqueInstance == null){
//            uniqueInstance = new Singleton();
//        }
//        return uniqueInstance;
//    }

//    // private static Singleton uniqueInstance;    // ★ / private 이라서 직접 접근은 안되고 getInstance로 접근

    private static Singleton uniqueInstance = new Singleton();

    public static Singleton getInstance(){
        return uniqueInstance;
    }

}

public class SingletonTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1); // week07.Singleton@3b07d329
        System.out.println(s2); // week07.Singleton@3b07d329    => 동일한 객체 (s1 == s2)


    }
}
