public class TeslaFactory extends Factory{
    @Override
    public Car Make() {
        return new TeslaModel3();
    }
}
