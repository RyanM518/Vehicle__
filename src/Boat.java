public class Boat extends Car {

    int NauticalMiles = 200;
    int Engines = 2;
    int Range = 300;



    public Boat (String inBrand, double inSpeed, int inPassengers, double inCargo,
                double inMPG, int inEngines, int inNauticalMiles, int inRange) {
        super(inBrand, inSpeed, inPassengers, inCargo, inMPG);

        NauticalMiles = inNauticalMiles;
        Engines = inEngines;
        Range = inRange;
        Speed = inSpeed;


    }
}
