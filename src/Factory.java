public abstract class Factory {

    public Car CarMaking() {
        return Make();
    }

    public abstract Car Make();

}
