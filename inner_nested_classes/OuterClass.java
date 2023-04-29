package java_exercises_github.inner_nested_classes;

public class OuterClass {

    private String name;
    private int age;

    public OuterClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "OuterClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public class InnerClass {

        private String name;
        private int age;
        private String town;
        private Boolean hasCar;

        public InnerClass(String name, int age, String town, Boolean hasCar) {
            this.name = name;
            this.age = age;
            this.town = town;
            this.hasCar = hasCar;
        }

        public String getTown() {
            return town;
        }

        public Boolean getHasCar() {
            return hasCar;
        }

        @Override
        public String toString() {
            return "InnerClass{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", town='" + town + '\'' +
                    ", hasCar=" + hasCar +
                    '}';
        }
    }

    public static class StaticNestedClass {

        private String girlfriendName;
        private Integer age;

        public StaticNestedClass(String girlfriendName, Integer age) {
            this.girlfriendName = girlfriendName;
            this.age = age;
        }

        public String getGirlfriendName() {
            return girlfriendName;
        }

        public Integer getAge() {
            return age;
        }

        public String generalInfo() {
            OuterClass outerClass = new OuterClass("Julien", getAge());
            OuterClass.InnerClass innerClass = outerClass.new InnerClass(outerClass.getName(), outerClass.getAge(), "Marseille", true);

            return outerClass.getName() + ", "+ outerClass.getAge() + ", from " + innerClass.getTown()
                    + ", with car: " + innerClass.getHasCar() + ", has a girlfriend named " + getGirlfriendName()
                    + " of " + getAge() + " years old";
        }
    }
}
