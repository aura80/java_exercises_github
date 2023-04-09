package java_exercises_github.generics;

public class SomeBasicGenericClass<T, V> {
    private T keyT;
    private V valueV;

    public T getKeyT() {
        return keyT;
    }

    public void setKeyT(T keyT) {
        this.keyT = keyT;
    }

    public V getValueV() {
        return valueV;
    }

    public void setValueV(V valueV) {
        this.valueV = valueV;
    }

    @Override
    public String toString() {
        return "ABasicGenericClass{" +
                "keyT=" + keyT +
                ", valueV=" + valueV +
                '}';
    }
}
