package HW1;

import java.util.Arrays;
import java.util.ArrayList;

public class MassContainer<T extends Number> {
    private T[] mass;

    public MassContainer(T... mass) {
        this.mass = mass;
    }

    public T[] getMass() {
        return mass;
    }

    public void setMass(T[] mass) {
        this.mass = mass;
    }

    public void info() {
        System.out.println(Arrays.toString(mass));
    }

    //меняет два элемента массива местами.
    public T[] swapMass(int n1, int n2) {
        T item2;
        if (n1 > mass.length || n1 < 0 || n2 > mass.length || n2 < 0) {
        } else {
            for (int i = 0; i < mass.length; i++) {
                if (i == (n1 - 1)) {
                    item2 = mass[i];
                    mass[i] = mass[n2 - 1];
                    mass[n2 - 1] = item2;
                }
            }
        }
        return mass;
    }

    //преобразует массив в ArrayList.
    public ArrayList<T> arrayToArrayList() {
        ArrayList<T> list = new ArrayList<>(Arrays.asList(mass));
        return list;
    }
}
