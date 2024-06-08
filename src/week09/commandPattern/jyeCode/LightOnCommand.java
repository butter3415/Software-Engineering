package week09.commandPattern.jyeCode;

public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void excute() {

    }
}
