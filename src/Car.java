public abstract class Car {
    public abstract String GetMake();
    public abstract String GetModel();
    public abstract int GetSeats();
    public abstract int GetHorsePower();

    public String Info() {
        return "Márka: "+this.GetMake()+", Típus: "+this.GetModel()+", Ülések: "+this.GetSeats()+", Lóerő: "+this.GetHorsePower();
    }
}