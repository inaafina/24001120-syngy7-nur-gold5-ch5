public class HondaJazz extends Car {

    public HondaJazz() {
        super(42, "Automatic");
    }

    @Override
    public void moveForward() {
        System.out.println("Honda Jazz is moving forward smoothly");
    }

    public void playMusic() {
        System.out.println("Playing music in Honda Jazz");
    }
}
