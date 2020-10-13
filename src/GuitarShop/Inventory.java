package GuitarShop;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List guitars;

    public Inventory(){
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price, GuitarSpec spec){
        //Guitar guitar = new Guitar(serialNumber, price, model, type, builder, backwood , topwood);
        Guitar guitar = new Guitar(serialNumber,price,spec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber){
        for(Iterator i = guitars.iterator(); ((Iterator) i).hasNext();){
            Guitar guitar = (Guitar)i.next();
            if(guitar.getSerialNumber().equals(serialNumber)){
                return guitar;
            }
        }
        return null;
    }

    public List search(GuitarSpec searchGuitar) {
        List matchingGuitars = new LinkedList();

        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            //ignore serialNumber since it is unique
            //ignore price since it is irrelevant

            Builder builder = searchGuitar.getBuilder();
            if (searchGuitar.getBuilder() != guitar.getBuilder())
                continue;

            String model = searchGuitar.getModel().toLowerCase();

            if ((model != null) && (!model.equals("")) &&
                    (!model.equals(guitar.getModel().toLowerCase())))
                continue;
            if (searchGuitar.getType() != guitar.getType())
                continue;
            if (searchGuitar.getBackwood() != guitar.getBackwood())
                continue;
            if (searchGuitar.getTopwood() != guitar.getTopwood())
                continue;
            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }
}

