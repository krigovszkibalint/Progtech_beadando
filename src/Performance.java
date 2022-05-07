public class Performance extends CarDecorator {

    @Override
    public String GetMake() {
        return super.GetMake();
    }

    @Override
    public String GetModel() {
        return super.GetModel()+" Performance";
    }

    @Override
    public int GetHorsePower() {
        return 900;
    }

    public Performance(Car car) {
        super(car);
    }
}
