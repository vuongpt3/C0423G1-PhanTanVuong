package bai_7_abstractclass_and_interface.thuc_hanh.abstrac_method;

public abstract class Geometric {
    private String name;

    protected Geometric(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}