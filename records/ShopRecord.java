package java_exercises_github.records;

public record ShopRecord(String name, Integer employeesNo, ShopSpeciality shopSpeciality) {     // canonical constructor

    // additional constructor
    public ShopRecord(String name, ShopSpeciality shopSpeciality) {
        this(name, 10, shopSpeciality);
    }

    public String name() {
        return name;
    }

    public Integer employeesNo() {
        return employeesNo;
    }

    public ShopSpeciality shopSpeciality() {
        return shopSpeciality;
    }

    @Override
    public String toString() {
        return "ShopRecord{" +
                "name='" + name + '\'' +
                ", employeesNo=" + employeesNo +
                ", speciality=" + shopSpeciality +
                '}';
    }
}
