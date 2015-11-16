public class Keeper <T> {
    protected T element;

    public Keeper(T element) {
        this.element = element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public static void main(String[] args) {
        Keeper<Integer> integerKeeper = new Keeper<>(5);
        Keeper<String> stringKeeper = new Keeper<>("Test");

        System.out.println(integerKeeper.getElement());
        System.out.println(stringKeeper.getElement());
    }
}
