public class ToyotaFortuner extends Car {

    public ToyotaFortuner() {
        super(80, "Manual");
    }

    @Override
    public void turn() {
        System.out.println("Toyota Fortuner is turning with high stability");
    }

    public void engage4WD() {
        System.out.println("4WD engaged in Toyota Fortuner");
    }
}
