package HW2_3;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    // Конструкторы класса.
    public Box() {
        this.fruits = new ArrayList<T>();
    }

    public Box(T fruit) {
        this.fruits = new ArrayList<T>();
        fruits.add(fruit);
    }

    // высчитывает вес коробки.
    public float getWeightBox() {
        if (fruits.size() != 0) return fruits.size() * fruits.get(0).getWeight();
        return 0;
    }
    // срав две коробки.
    public boolean compare(Box<?> otherBox) {
        return getWeightBox() == otherBox.getWeightBox();
    }

    //пересыпает фрукты из текущей коробки в другую коробку.
    public void replaceOtherBox(Box<T> otherBox) {
        otherBox.fruits.addAll(fruits);
        fruits.clear();
    }

    //добавления фрукта в коробку.
    public void addFruit(T fruit){
        fruits.add(fruit);
    }
}