

public class Main {
    public static void main(String[] args) {

        int[] list = new int[]{1,2,3,4,5};

        double result = 0.0;
        double harmOrt;

        for (double i = 1; i <= list.length; i++) {

            result += (1 / i);
        }

        harmOrt = list.length / result;

        System.out.println("Harmonik Ortalama : "+ harmOrt);
    }
}
