package jimmy.jcore.utils;

public class Key<T> {

    private T value;

    public Key(T value){this.value = value;}

    public T getValue() {
        return value;
    }

}
