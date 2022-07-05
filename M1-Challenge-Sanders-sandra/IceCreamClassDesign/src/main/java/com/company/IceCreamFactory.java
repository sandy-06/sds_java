package com.company;

    public class IceCreamFactory {
        public static void main(String[] args) {
            IceCream iceCream = IceCreamFactory.createIceCream("vanilla");
            System.out.println(iceCream.getDescription());
        }

        public IceCreamFactory() {

        }

        public static <IceCream> IceCream createIceCream(String type) {
            if (type.equals("vanilla")) {
                return (IceCream) new Vanilla();
            } else if (type.equals("chocolate")) {
                return (IceCream) new Chocolate();
            } else if (type.equals("strawberry")) {
                return (IceCream) new Strawberry();
            } else {
                return null;
            }
        }

        private static class Vanilla extends IceCream {
            public Vanilla() {
                String description = "Vanilla Ice Cream";
                String model = "Vanilla";
                String flavor = "Vanilla";
                String base= "Cream";
                String sweetener = "Sugar";

            }
        }
        private static class Chocolate extends IceCream {
            public Chocolate() {
                String description = "Chocolate Ice Cream";
                String model = "Chocolate";
                String flavor = "Chocolate";
                String base= "Cream";
                String sweetener = "Sugar";

            }
        }
        private static class Strawberry extends IceCream {
            public Strawberry() {
                String description = "Strawberry Ice Cream";
                String model = "Strawberry";
                String flavor = "Strawberry";
                String base= "Cream";
                String sweetener = "Sugar";

            }
        }

    public void stir() {
        System.out.println("Stirring...");
    }
    public void mix() {
        System.out.println("Mixing...");
    }
    public void packing() {
        System.out.println("Packing...");
    }
}
