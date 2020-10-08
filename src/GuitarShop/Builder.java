package GuitarShop;

public enum Builder {
    COLLINS,FENDER,GIBSON,MARTIN;


    public String toString() {
        switch (this){
            case COLLINS: return "Collins";
            case FENDER: return "Fender";
            case GIBSON: return "Gibson";
            case MARTIN: return "Martin";
            default: return "Collins";
        }

    }
}
