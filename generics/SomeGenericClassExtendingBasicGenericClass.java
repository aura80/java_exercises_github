package java_exercises_github.generics;

public class SomeGenericClassExtendingBasicGenericClass<T> extends SomeBasicGenericClass<T, Integer> {
    private T key;
    private Integer value;

    public SomeGenericClassExtendingBasicGenericClass() {

    }

    public SomeGenericClassExtendingBasicGenericClass(T key, Integer value) {
        super();
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "AGenericClassExtendingBasicGenericClass{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
