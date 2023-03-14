public class FlyingCar extends Car{
    int wings = 2;
    int doors = 4;
    int engines = 4;
    int landingGear = 4;
    public FlyingCar(String inBrand, double inSpeed, int inPassengers, double inCargo,
                     int inEngines, int inLandingGear) {
        super (inBrand, inSpeed, inPassengers, inCargo);
        engines = inEngines;
        landingGear = inLandingGear;
    }


}
