package week11.Adapter.code_TG;

public class Client {
    public static void main(String[] args) {
        Unit u1 = new UnitImpl(197.5, 64);
        System.out.println(u1.getBmi());

        AmericanUnit au1 = new AmericanUnitImpl(5.5, 150);
        AmericanUnitAdapter aud1 = new AmericanUnitAdapter(au1);
        System.out.println(aud1.getBmi());
    }
}
