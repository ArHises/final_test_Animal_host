package Methods;

public class Counter {

    private int count;

    public Counter() {
        this.count = 0;
    }

    public void Add() {
        this.count++;
    }

    public int getCount() {
        return this.count;
    }
}
