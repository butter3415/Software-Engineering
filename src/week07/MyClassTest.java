package week07;

class MyClass{
    private MyClass() {
    }

    public static MyClass getInstance(){
        return new MyClass();
    }
}

public class MyClassTest {
    public static void main(String[] args) {
        // MyClass m1 = new MyClass(); => private 이라 사용 불가
        MyClass m1 = MyClass.getInstance();
        System.out.println(m1.toString());  // week07.MyClass@3b07d329
        System.out.println(m1.hashCode());  // 990368553

        MyClass m2 = MyClass.getInstance();
        System.out.println(m2.toString());  // week07.MyClass@41629346
        System.out.println(m2.hashCode());  // 1096979270
        
        // 단일 객체 X new 가 여러번 되어서 객체 여러개

    }

}
