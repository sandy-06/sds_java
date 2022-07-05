package com.company;

public class IceCream {
    private String description;
    private String model;
    private String flavor;
    private String base;
    private String sweetener;

    public IceCream() {

    }

    public String getDescription() {
        return description;
    }

    public String getModel() {
        return model;
    }

    public String getFlavor() {
        return flavor;
    }

    public String getBase() {
        return base;
    }

    public String getSweetener() {
        return sweetener;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void setSweetener(String sweetener) {
        this.sweetener = sweetener;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
