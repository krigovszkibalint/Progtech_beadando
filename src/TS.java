public class TS extends CarDecorator {

    @Override
    public String GetMake() {
        return super.GetMake();
    }

    @Override
    public String GetModel() {
        return super.GetModel()+" T Sport";
    }

    @Override
    public int GetSeats() {
        return 4;
    }

    @Override
    public int GetHorsePower() {
        return 192;
    }

    public TS(Car car) {
        super(car);
    }
}
