public class Main {
    public static void main(String[] args) {
        //creates plane
        Vehicle plane = new Vehicle();
        plane.color = "black";
        plane.weight = 500.6;
        plane.sound = "whoosh,whhosh";
        System.out.println("plane sound is "+plane.sound);
        //creates plane2
        Vehicle plane2 = new Vehicle();
        plane2.color = "black";
        plane2.weight = 500.6;
        plane2.sound = "whoosh,whhosh";
        //creates sportcar
        Vehicle sportcar = new Vehicle();
        sportcar.color = "white";
        sportcar.weight = 51;
        sportcar.sound = "vroom,vroom";
        System.out.println("sportcar sound is "+sportcar.sound);
        //creates car
        Vehicle car = new Vehicle();
        car.color = "black";
        car.weight = 500.6;
        car.sound = "beep,beep";
        System.out.println("car sound is "+car.sound);
        //creates car
        Vehicle car2 = new Vehicle();
        car2.color = "black";
        car2.weight = 500.6;
        car2.sound = "beep,beep";
    }
}
