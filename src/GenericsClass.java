public class GenericsClass<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T valueToSet) {
        this.t = valueToSet;
    }

    public static boolean isEqual(GenericsClass gc1, GenericsClass gc2) {
        if (gc1.getT().equals(gc2.getT())) {
            return true;
        } else {
            return false;
        }
    }
}
