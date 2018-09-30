package builder.pizza;

/**
 * Tipo de pan
 */
public enum Dough {

    CROSS, PANBAKED;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
