package GuitarShop;

public class GuitarSpec {

    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private String numStrings;

    public GuitarSpec( Builder builder, String model, Type type, Wood backWood, Wood topWood,String numString) {

        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numStrings = numString;
    }


    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public void setBackWood(Wood backWood) {
        this.backWood = backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public void setTopWood(Wood topWood) {
        this.topWood = topWood;
    }

    public String getNumStrings() {
        return numStrings;
    }

    public boolean matches(GuitarSpec searchSpec){

     this.builder = searchSpec.getBuilder();
        if (searchSpec.getBuilder() != this.builder)
            return false;

        String model = searchSpec.getModel().toLowerCase();

        if ((model != null) && (!model.equals("")) &&
                (!model.equals(this.getModel().toLowerCase())))
            return false;
        if (searchSpec.getType() != this.getType())
            return false;
        if (searchSpec.getBackWood() != this.getBackWood())
            return false;
        if (searchSpec.getTopWood() != this.getTopWood())
            return false;
        if (!searchSpec.getNumStrings().equals(this.numStrings))
            return  false;

        return true;


    }
}
