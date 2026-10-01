public class Main {
    public static void main(String[] args) {

        R3Vector a = new R3Vector(1, 2, 3);
        R3Vector b = new R3Vector(4, 5, 6);

        System.out.println("Вектор a = " + a);
        System.out.println("Вектор b = " + b);

        System.out.println();

        System.out.println("Сложение:");
        System.out.println(a.add(b));
        System.out.println(R3Vector.add(a, b));

        System.out.println();

        System.out.println("Умножение на число:");
        System.out.println(a.multiply(2));
        System.out.println(R3Vector.multiply(a, 2));

        System.out.println();

        System.out.println("Скалярное произведение:");
        System.out.println(a.scalar(b));
        System.out.println(R3Vector.scalar(a, b));

        System.out.println();

        System.out.println("Векторное произведение:");
        System.out.println(a.vector(b));
        System.out.println(R3Vector.vector(a, b));

        System.out.println();

        System.out.println("Сравнение:");
        System.out.println("Как метод экземпляра класса:" + a.equal(b));
        System.out.println("Как метод класса:" + R3Vector.equal(a, b));
    }
}