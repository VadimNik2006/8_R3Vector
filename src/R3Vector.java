public class R3Vector {
    private double x;
    private double y;
    private double z;

    public R3Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Сложение двух векторов - метод экземпляра
    public R3Vector add(R3Vector v) {
        return new R3Vector(
                x + v.x,
                y + v.y,
                z + v.z
        );
    }

    // Сложение двух векторов - метод класса
    public static R3Vector add(R3Vector v1, R3Vector v2) {
        return new R3Vector(
                v1.x + v2.x,
                v1.y + v2.y,
                v1.z + v2.z
        );
    }

    // Умножение вектора на число - метод экземпляра
    public R3Vector multiply(double number) {
        return new R3Vector(
                x * number,
                y * number,
                z * number
        );
    }

    // Умножение вектора на число - метод класса
    public static R3Vector multiply(R3Vector v, double number) {
        return new R3Vector(
                v.x * number,
                v.y * number,
                v.z * number
        );
    }

    // Скалярное произведение - метод экземпляра
    public double scalar(R3Vector v) {
        return x * v.x + y * v.y + z * v.z;
    }

    // Скалярное произведение - метод класса
    public static double scalar(R3Vector v1, R3Vector v2) {
        return v1.x * v2.x +
                v1.y * v2.y +
                v1.z * v2.z;
    }

    // Векторное произведение - метод экземпляра
    public R3Vector vector(R3Vector v) {
        return new R3Vector(
                y * v.z - z * v.y,
                z * v.x - x * v.z,
                x * v.y - y * v.x
        );
    }

    // Векторное произведение - метод класса
    public static R3Vector vector(R3Vector v1, R3Vector v2) {
        return new R3Vector(
                v1.y * v2.z - v1.z * v2.y,
                v1.z * v2.x - v1.x * v2.z,
                v1.x * v2.y - v1.y * v2.x
        );
    }

    // Сравнение - метод экземпляра
    public boolean equal(R3Vector v) {
        return x == v.x && y == v.y && z == v.z;
    }

    // Сравнение - метод класса
    public static boolean equal(R3Vector v1, R3Vector v2) {
        return v1.x == v2.x &&
                v1.y == v2.y &&
                v1.z == v2.z;
    }

    // Вывод вектора
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}