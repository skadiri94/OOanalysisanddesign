package GuitarShop;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // set up guitar inventory
        Inventory inventory = new Inventory();
        initialiseInventory(inventory);

        //what customer is looking for
        Guitar whatLookingFor = new Guitar("", 0, Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER,Wood.ALDER);

        Guitar guitar = inventory.search(whatLookingFor);
        if (guitar !=null){
            System.out.println("You might like this: " + guitar.getSerialNumber() + " " +
            guitar.getPrice()); //and whatever other details you desire
        }
        else {
            System.out.println("Sorry, we have nothing for you.");
        }
    }

    public static void initialiseInventory(Inventory inventory){
        //add guitars to the inventory
        inventory.addGuitar("V00001",
                1499.99,
                Builder.FENDER,
                "Stratocastor",
                Type.ELECTRIC,
                Wood.ALDER,
                Wood.ALDER);

        inventory.addGuitar("V00002",
                1699.99,
                Builder.FENDER,
                "Stratocastor",
                Type.ELECTRIC,
                Wood.ALDER,
                Wood.ALDER);

    }
}
