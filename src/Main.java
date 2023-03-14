public class Main {
    public static void main(String[] args){
//create a base Vehicle object 9 in this case a Boat
        Vehicle v = new Vehicle("BMW", 100.0, 2000, 100000.00);
//print out the object (toString)
        System.out.println(v);
//now create a child object (a Car)
        Car myCar = new Car("BMW", 200.00, 2, 100.00, 30.0);
//couple of variables to alter, to change the output a little
        myCar.setSpoiler(true);

//myCar.setStereo(true);
        FlyingCar car = new FlyingCar("FCar", 3, 5, 100, 3, 6);
        System.out.println(myCar);



    }
}