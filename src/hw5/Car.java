package hw5;

public class Car {

    public static void start(){
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private static String startElectricity(){
        return "turn on";
    }
    private static String startCommand(){return "start";}
    private static String startFuelSystem(){return "fuel";}
}
