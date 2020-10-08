package GuitarShop;

public enum Wood {
    ALDER,CEDAR,MAHOGANY;


    public String toString() {
        switch (this){
            case ALDER: return "Alder";
            case CEDAR: return "Cedar";
            case MAHOGANY: return "Mahogany";
            default: return "Cedar";
        }

    }
}
