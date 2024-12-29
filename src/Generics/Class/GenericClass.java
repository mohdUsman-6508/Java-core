package Generics.Class;

public class GenericClass<K, V> {
    private K key;
    private V value;

    public GenericClass(){}

    public GenericClass(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
