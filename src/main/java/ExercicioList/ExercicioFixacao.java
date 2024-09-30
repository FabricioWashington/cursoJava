package ExercicioList;

import ExercicioList.entities.Funcionarios;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionarios> list = new ArrayList<>();

        // Part 1 - Adicionar 
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i+1) + ": ");

            System.out.println("Id: ");
            int id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }

            System.out.println("Name: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Salary: ");
            double salary = sc.nextDouble();
            list.add(new Funcionarios(id, nome, salary));
        }
        // Part 2 - Atualizar 

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Funcionarios funcionarios = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (funcionarios == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.println("Enter the percentage: ");
            double porcentagem = sc.nextDouble();
            funcionarios.increaseSalary(porcentagem);
        }

        //Part 3 -- Listagem de funcionarios
        System.out.println();
        System.out.println("List of employees:");
        for (Funcionarios obj : list) {
            System.out.println(obj);
        }

        sc.close();
    }

    public static boolean hasId(List<Funcionarios> list, int id) {
        Funcionarios funcionarios = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return funcionarios != null;
    }

}
