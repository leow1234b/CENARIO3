package br.edu.up.telas;
import java.util.Scanner;
import br.edu.up.controles.*;
import br.edu.up.modelos.*;
public class Tela {
     
      Controle controle = new  Controle();
     
    private Scanner scanner;

    public Tela() {
        this.scanner = new Scanner(System.in);
    }

    public int exibirMenu() {
        System.out.println("1. Entrada de veículo");
        System.out.println("2. Saída de veículo");
        System.out.println("3. Emitir relatório");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public Veiculos obterDadosVeiculo() {
        scanner.nextLine();  
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Placa: ");
        String placa = scanner.nextLine();
        System.out.print("Cor: ");
        String cor = scanner.nextLine();
        return new Veiculos(modelo, placa, cor);
    }

    public String obterPlaca() {
        scanner.nextLine();  
        System.out.print("Placa do veículo: ");
        return scanner.nextLine();
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void exibirRelatorio(int veiculosEntrados, int veiculosSaidos, int valorPagamentos) {
        System.out.println("Relatório:");
        System.out.println("Veículos entrados: " + veiculosEntrados);
        System.out.println("Veículos saídos: " + veiculosSaidos);
        System.out.println("Valor total recebido: R$ " + valorPagamentos);
    }
}


