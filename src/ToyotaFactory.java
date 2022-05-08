public class ToyotaFactory extends Factory{
    @Override
    public Car Make() {
        return new ToyotaCelica();
    }
}
