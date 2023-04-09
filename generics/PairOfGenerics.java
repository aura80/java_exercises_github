package java_exercises_github.generics;

// defines a pair of two generics objects

public class PairOfGenerics <K, V> {
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PairOfGenerics{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
