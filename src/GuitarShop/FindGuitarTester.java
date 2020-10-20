package GuitarShop;

import java.util.Iterator;

import GuitarShop.*;

import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // set up guitar inventory
        Inventory inventory = new Inventory();
        initialiseInventory(inventory);

        //what customer is looking for
        GuitarSpec whatLookingFor = new GuitarSpec(Builder.GIBSON, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER,Wood.ALDER, "12-String");

        List matchingGuitars = inventory.search(whatLookingFor);
        if (!matchingGuitars.isEmpty()){
            System.out.println("You might like these: ");

            for(Iterator i = matchingGuitars.iterator(); i.hasNext(); ){
                Guitar guitar = (Guitar)i.next();
                GuitarSpec spec = guitar.getSpec();

                System.out.println("We have a " + spec.getBuilder() +
                        " " + spec.getModel() + " " + spec.getType() + " guitar: " +
                        guitar.getPrice());
            }
        }
        else {
            System.out.println("Sorry, we have nothing for you.");
        }

    }

    public static void initialiseInventory(Inventory inventory){
        //add guitars to the inventory
        GuitarSpec spec = new GuitarSpec(Builder.FENDER ,
                "Stratocastor",
                Type.ELECTRIC,
                Wood.ALDER,
                Wood.ALDER,"12-String");

        inventory.addGuitar("V00001",
                1499.99, spec);

        spec = new GuitarSpec(Builder.GIBSON,
                "Stratocastor",
                Type.ELECTRIC,
                Wood.ALDER,
                Wood.ALDER,"6-String");

        inventory.addGuitar("V00002",
                1199.99, spec);

        spec = new GuitarSpec(Builder.FENDER,
                "Stratocastor",
                Type.ELECTRIC,
                Wood.ALDER,
                Wood.ALDER,"12-String");

        inventory.addGuitar("V00003",
                1500.99,spec);

        spec = new GuitarSpec(Builder.GIBSON,
                "Stratocastor",
                Type.ELECTRIC,
                Wood.ALDER,
                Wood.ALDER,"6-String");

        inventory.addGuitar("V00004",
                1699.99,spec);

    }

}
