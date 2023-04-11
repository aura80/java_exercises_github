package java_exercises_github.reflections;

public class Astronomer {
    private String name;
    private Integer years;
    private Float yearsInSpace;
    private Boolean isInSpace;

    public Astronomer() {}

    private Astronomer(String name, Integer years, Float yearsInSpace, Boolean isInSpace) {
        this.name = name;
        this.years = years;
        this.yearsInSpace = yearsInSpace;
        this.isInSpace = isInSpace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }

    public Float getYearsInSpace() {
        return yearsInSpace;
    }

    public void setYearsInSpace(Float yearsInSpace) {
        this.yearsInSpace = yearsInSpace;
    }

    public String getInSpace() {
        if (isInSpace) {
            return " is still there";
        } else {
            return " is at home now";
        }
    }

    public void setInSpace(Boolean inSpace) {
        isInSpace = inSpace;
    }

    public String getInfo() {
        return "The astronomer " + getName() + ", " + getYears() + " years old, has now "
                + getYearsInSpace() + " years in space and he" + getInSpace();
    }

    private void getSalary() {
        if (getYearsInSpace() > 5 && getYears() >= 40) {
            System.out.printf("The astronomer %s has a big salary and will get a bonus \n", getName());
        } else {
            System.out.println("The astronomer " + getName() + " has a big salary");
        }
    }

    @Override
    public String toString() {
        return "Astronomer{" +
                "name='" + name + '\'' +
                ", years=" + years +
                ", yearsInSpace=" + yearsInSpace +
                ", isInSpace=" + isInSpace +
                '}';
    }
}
