package inheritance.stackOfStrings;

import java.util.ArrayList;

public class Stack {
    private ArrayList<String> data;
    private int size;

    public Stack() {
        this.data = new ArrayList<>();
        this.size = -1;
    }

    public void push(String item) {
        data.add(item);
        size++;
    }

    public String pop() {
        String elementToPop = data.get(size--);
        data.remove(elementToPop);
        return elementToPop;
    }

    public String peek() {
        return data.get(size);
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }
}
