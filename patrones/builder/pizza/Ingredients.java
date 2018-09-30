package builder.pizza;

/**
 * Constructor de la pizza hawaina.
 */
public enum Ingredients {

    PEPPERONI, SALAMI, HAM, MUSHROOMS, PINEAPPLE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
