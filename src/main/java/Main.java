import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Race race = new Race();

        for (int i = 0; i < 3; i++) {
            String name = "";
            while (true) {
                System.out.print("Введите название машины №" + (i + 1) + ":");
                name = scanner.nextLine();
                name = name.trim();

                if (name.isEmpty()) {
                    System.out.print("Имя не может быть пустым. ");
                } else {
                    break;
                }
            }

            int speed = 0;

            while (true) {
                System.out.print("Введите скорость машины " + name +  " (0-250 км/ч): ");

                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();

                    if (speed >= 0 && speed <= 250) {
                        break;
                    } else {
                        System.out.println("Ошибка! Скорость должна быть от 0 до 250 км/ч. Повторите ввод.");
                    }
                } else {
                    System.out.println("Ошибка! Введите целое число от 0 до 250 км/ч.");

                }

                scanner.nextLine();
            }

            scanner.nextLine();
            Car car = new Car(name, speed);

            race.checkLeader(car);
        }

        System.out.println("Самая быстрая машина: " + race.leaderName);
        System.out.println("Пройденная дистанция: " + race.leaderDistance + "км.");

        scanner.close();
    }

 }
