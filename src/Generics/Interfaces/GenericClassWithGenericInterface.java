package Generics.Interfaces;

public class GenericClassWithGenericInterface<T> implements GenericInterface<T> {

    private T item;

    @Override
    public void addItem(T item) {
        this.item = item;
    }

    @Override
    public T getItem() {
        return item;
    }


}
