package week09.commandPattern.jyeCode;

public class Light {
    String location = "";

    public Light(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println(location + " 조명 ON");
    }

    public void off(){
        System.out.println(location + " 조명 OFF");
    }
}
