package DogDoor;

public class DoorSimulator {
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);

        System.out.println("Rover barks to go outside....");
        remote.pressButton();
        System.out.println();

        System.out.println("Rover has gone outside....");
        //remote.pressButton();
        System.out.println();

        System.out.println("Rover has done his business....");
        //remote.pressButton();
        System.out.println();
        try{
            Thread.currentThread().sleep(10000);
        }catch(InterruptedException e) {}

        System.out.println("Rover is back inside....");
        //remote.pressButton();
        System.out.println();
    }

}
