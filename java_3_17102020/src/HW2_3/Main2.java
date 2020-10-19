package HW2_3;

public class Main2 {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box<Apple> appleBox1 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();

        appleBox1.addFruit(apple1);
        appleBox1.addFruit(apple2);
        appleBox1.addFruit(apple3);

        orangeBox1.addFruit(orange1);
        orangeBox1.addFruit(orange2);
        orangeBox1.addFruit(orange3);

        System.out.println("Вес коробки 1 с яблоками: " + appleBox1.getWeightBox());
        System.out.println("Вес коробки с апельсинами: " + orangeBox1.getWeightBox());
        if (appleBox1.compare(orangeBox1)) System.out.println("Веса коробок совпадают");
        System.out.println("Веса коробок не совпадает");

        Box<Apple> appleBox2 = new Box<>(apple1);

        System.out.println("Вес коробки 2 с яблоками: " + appleBox2.getWeightBox());

        System.out.println("смешиваем две коробки яблок");
        appleBox1.replaceOtherBox(appleBox2);
        System.out.println("Вес первой коробки с яблоками: " + appleBox1.getWeightBox());
        System.out.println("Вес второй коробки с яблоками: " + appleBox2.getWeightBox());

    }
}
