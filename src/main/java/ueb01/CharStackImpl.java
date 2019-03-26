package ueb01;

import java.util.NoSuchElementException;

class CharStackImpl implements CharStack {

    private CharElement top;
    private int size;

    @Override
    public void push(char c) {
        top = new CharElement(c, top);
        size++;
    }

    @Override
    public char pop() {
        if (top == null)
            throw new NoSuchElementException();
        char v = top.value;
        top = top.next;
        size--;
        return v;
    }

    @Override
    public int size() {
        return size;
    }
}
