package builder.pizza;

/**
 * Tipo de salsa
 */
public enum Sauce {

    HOT, MILD;

    @Override
    public String toString() {
        return name().toLowerCase();
    }

}
