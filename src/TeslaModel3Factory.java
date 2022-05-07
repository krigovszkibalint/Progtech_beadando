public class TeslaModel3Factory extends Factory{
    @Override
    public Car Make() {
        return new Performance(new TeslaModel3());
    }
}
