public class ToyotaCelicaTSFactory extends Factory{
    @Override
    public Car Make() {
        return new TS(new ToyotaCelica());
    }
}
