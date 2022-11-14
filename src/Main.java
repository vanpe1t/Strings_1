public class Main {
    public static void main(String[] args) {

        System.out.println("Задача_1");

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName  = "Ivanovich";
        String fullName = firstName + " " + middleName + " " +lastName;

        System.out.println(fullName);

        System.out.println();
        System.out.println("Задача_2");

        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());

        System.out.println();
        System.out.println("Задач_3");

        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника - " + fullName.replace("ё", "е"));

    }
}