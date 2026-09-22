import java.util.*;

public class ShoppingList {

    private Map<String, Integer> available;
    private Map<String, Integer> required;

    public ShoppingList() {
        available = new HashMap<>();
        required = new HashMap<>();