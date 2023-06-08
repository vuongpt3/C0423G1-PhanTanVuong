package bai_5_access_modifier_static_method_static_property.thuc_hanh.bai_1_static_roperty;

public class StaticProperty {
        private String name;
        private String engine;

        public static int numberOfCars;

        public StaticProperty(String name, String engine) {

            this.name = name;

            this.engine = engine;

            numberOfCars++;

        }
        // getters and setters
    public static void main(String[] args) {
        StaticProperty car1 = new StaticProperty("Mazda 3","Skyactiv 3");

            System.out.println(car1.numberOfCars);

        StaticProperty car2 = new StaticProperty("Mazda 6","Skyactiv 6");

            System.out.println(car2.numberOfCars);

    }
}
