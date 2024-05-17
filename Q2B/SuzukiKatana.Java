public class SuzukiKatana extends Car {

    public SuzukiKatana() {
        super(50, "Manual");
    }

    @Override
    public void moveForward() {
        System.out.println("Suzuki Katana is moving forward with power");
    }

    public void openRoof() {
        System.out.println("Opening roof of Suzuki Katana");
    }
}
