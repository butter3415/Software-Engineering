package week09.commandPattern.jyeCode;

public class GarageDoor {
    String location = "";

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up(){
        System.out.println("문이 열립니다.");
    }

    public void down(){
        System.out.println("문이 닫힙니다.");
    }

    public void stop(){
        System.out.println("문이 멈춥니다.");
    }

    public void lightOn(){
        System.out.println("주차장 조명이 켜집니다.");
    }

    public void lightOff(){
        System.out.println("주차장 조명이 꺼집니다.");
    }

}

