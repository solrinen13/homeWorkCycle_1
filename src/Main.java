public class Main {
    public static void main(String[] args) {

        System.out.println("Home work Cycle part №1");
        for (int i = 0; i < 10; i++){

            System.out.println("Итерация цикла "+i);



        }

        System.out.println("Task №1");
        for (int i = 1; i < 11; i++){

            System.out.println(+i);



        }

        System.out.println("Task №2");
        for (int i = 10; i > 0; i--){

            System.out.println(+i);



        }

        System.out.println("Task №3");
        for (int i = 0; i < 17; i+=2){

                System.out.println(i);





        }

        System.out.println("Task №4");
        for (int i = 10; i > -11; i--){

            System.out.println(i);
        }

        System.out.println("Task №2.1 Високосные годы");
        for (int i = 1904; i < 2096; i = i + 4){

            System.out.println(i+" Год является високосным");
        }

        System.out.println("Task №2.2");
        for (int i = 7; i < 100; i = i + 7){

            System.out.println(i);
        }

        System.out.println("Task №2.3 ");
        for (int i = 1; i < 513; i = i * 2){

            System.out.println(i);
        }

        System.out.println("Task №3.0 ");
        {
            int salary = 65535;
            int totalSalary = 0;

            for (int i = 1; i < 13; i++) {
                totalSalary = totalSalary + totalSalary / 100;
                totalSalary = totalSalary + salary;
                System.out.println("Месяц " + i + " итого " + totalSalary);
            }
        }

        System.out.println("Task №3.1 ");
        {
            int deposit = 29000;
            int totalDeposit = 0;

            for (int i = 1; i < 13; i++) {
                totalDeposit = totalDeposit + deposit;
                System.out.println("Месяц " + i + " сумма накоплений равна " + totalDeposit+" рублей");
            }
        }


        System.out.println("Task №3.2 ");
        {
            int deposit = 29000;
            int totalDeposit = 0;

            for (int i = 1; i < 13; i++) {
                totalDeposit = totalDeposit + totalDeposit / 100;
                totalDeposit = totalDeposit + deposit;
                System.out.println("Месяц " + i + " итого " + totalDeposit);
            }
        }


    }
}