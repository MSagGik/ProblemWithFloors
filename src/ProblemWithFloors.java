import java.util.Scanner;

public class ProblemWithFloors {
    public static void main(String[] args) {
        System.out.println("Привет");
        System.out.println("Введите количество этажей");
        int N = enterNumber();
        System.out.println("Введите номер квартиры");
        int M = enterNumber();
        int floor = floorNumber(M, 3);
        if(floor > N) {
            System.out.println("Квартира отсутствует");
            return;
        }
        System.out.println("Нажмите " + buttonElevator(floor, N));
    }

    public static int enterNumber() {
        Scanner sc = new Scanner(System.in);
        int number;
        for(;;){
            if (!sc.hasNextInt()) {
                System.out.println("Вы ввели не число. Повторите ввод.");
                sc.nextLine();
                continue;
            }
            number = sc.nextInt();
            if (number > 0)
                return number;
            else
                System.out.println("Введите номер");
        }
    }

    public static int floorNumber(int flat, int series) {
        if (flat % series == 0)
            return flat / series;
        else
            return flat / series + 1;
    }

    public static int buttonElevator(int F, int N){
        if(F % 2 != 0)
            return F;
        if(F+1 > N)
            return F - 1;
        else
            return F + 1;
    }
}