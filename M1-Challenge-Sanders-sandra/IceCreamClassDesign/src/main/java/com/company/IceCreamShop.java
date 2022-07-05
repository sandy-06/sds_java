package com.company;

public class IceCreamShop {
    public static void main(String[] args) {
        class IceCreamCone {
            private String flavor;
            private String size;
            private String toppings;
            private double price;

            public String getFlavor() {
                return flavor;
            }

            public void setFlavor(String flavor) {
                this.flavor = flavor;
            }

            public String getSize() {
                return size;
            }

            public void setSize(String size) {
                this.size = size;
            }

            public String getToppings() {
                return toppings;
            }

            public void setToppings(String toppings) {
                this.toppings = toppings;
            }

            public double getPrice() {
                return price;
            }

            public void setPrice(double price) {
                this.price = price;
            }

            IceCreamCone(String flavor, String size, String toppings, double price) {
                this.flavor = flavor;
                this.size = size;
                this.toppings = toppings;
                this.price = price;
            }
        }
        String flavor = "strawberry";
        String size = "singleScoop";
        String toppings= "sprinkles";
        double price =1.00;
        IceCreamCone cone = new IceCreamCone(flavor, size, toppings, price);
    }
    class IceCreamTub {
        private String flavor;
        private String size;

        public String getFlavor() {
            return flavor;
        }

        public void setFlavor(String flavor) {
            this.flavor = flavor;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        private double price;


        IceCreamTub(String flavor, String size, double price) {
            this.flavor = flavor;
            this.size = size;
            this.price = price;
        }
    }
    String flavor = "vanilla";
    String size = "pint";
    double price = 2.00;
    IceCreamTub tub = new IceCreamTub(flavor, size, price);

    }

class MilkShake {
    private String flavor;
    private String size;
    private double price;

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public MilkShake getMilkShake() {
        return milkShake;
    }

    public void setMilkShake(MilkShake milkShake) {
        this.milkShake = milkShake;
    }

    MilkShake(String flavor, String size, double price) {
        this.flavor = flavor;
        this.size = size;
        this.price = price;
    }


    MilkShake milkShake = new MilkShake(flavor, size, price);
}
