public class CarDecorator extends Car {
    private Car car;

    @Override
    public String GetMake() {
        return car.GetMake();
    }

    @Override
    public String GetModel() {
        return car.GetModel();
    }

    @Override
    public int GetSeats() {
        return car.GetSeats();
    }

    @Override
    public int GetHorsePower() {
        return car.GetHorsePower();
    }

    public CarDecorator(Car car) {
        this.car = car;
    }
}