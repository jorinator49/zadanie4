public class primer4_7 {

    // Нельзя перехватить брошенное исключение с помощью чужого catch, даже если перехватчик подходит
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        }
        try {
            System.out.println("0");
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("2");
        }
        System.out.println("3");
    }
}
