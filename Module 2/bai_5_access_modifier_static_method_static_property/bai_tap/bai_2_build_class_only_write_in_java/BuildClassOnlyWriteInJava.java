package bai_5_access_modifier_static_method_static_property.bai_tap.bai_2_build_class_only_write_in_java;

public class BuildClassOnlyWriteInJava {
    public String name;
    public String classes;

    public BuildClassOnlyWriteInJava() {
        name = "Vương";
        classes = "C0323G1";
    }

    public void setName(String name) {this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}
