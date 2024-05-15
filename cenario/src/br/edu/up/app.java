package br.edu.up ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.up.modelos.Compromisso;
import br.edu.up.modelos.compromisso;

public class app{
       public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);
        List<Compromisso> compromissos = new ArrayList<>();
      
        for (int i = 0; i < 2; i++) {
            System.out.println("Cadastro de Compromisso " + (i + 1));

            System.out.print("Digite a descrição do compromisso: ");
            String descricao = scanner.nextLine();

            System.out.print("Digite a data do compromisso (dd/mm/yyyy): ");
            String data = scanner.nextLine();

            System.out.print("Digite a hora do compromisso (HH:mm): ");
            String hora = scanner.nextLine();
             
            Compromisso compromisso = new Compromisso(hora, assunto, local, pessoa);
            compromissos.add(compromisso);
        }

        System.out.println("\nLista de Compromissos:");
        for (Compromisso compromisso : compromissos) {
            System.out.println(compromisso);
        }

        scanner.close();
    }
}
    


        







