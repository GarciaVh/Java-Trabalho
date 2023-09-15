package polimorfs;

import java.util.Scanner;

public class MenuAnimais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println(" ");
            System.out.println("Catalogo de animais:");
            System.out.println("Selecione uma opção");
            System.out.println("1. Criar um Animal terrestre");
            System.out.println("2. Criar uma Ave");
            System.out.println("3. Sair");
            System.out.print("Opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cT(scanner, new Terrestre());
                    break;
                case 2:
                    cA(scanner, new Ave());
                    break;
                case 3:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida, Tente novamente.");
            }
        } while (opcao != 3);
    }

    private static void cT(Scanner scanner, Animal animal) {
        System.out.print("Digite o nome do animal: ");
        String nome = scanner.next();
        System.out.print("Digite a idade do animal: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o habitat nativo do animal: ");
        String local = scanner.next();

        animal.setNome(nome);
        animal.setIdade(idade);
        animal.setLocal(local);

        animal.exibirInfoT();
    }

    private static void cA(Scanner scanner, Animal animal) {
        System.out.print("Digite o nome da ave: ");
        String nome = scanner.next();
        System.out.print("Digite a idade da ave: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o habitat nativo da ave: ");
        String local = scanner.next();

        animal.setNome(nome);
        animal.setIdade(idade);
        animal.setLocal(local);

        animal.exibirInfoA();
    }
}

class Animal {
    private String nome;
    private int idade;
    private String local;

    public String getNome(){return nome;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void exibirInfoT() {
        System.out.println("Detalhes do Animal:");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Habitat Nativo: " + getLocal());
    }

    public void exibirInfoA() {
        System.out.println("Detalhes do Animal:");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Habitat Nativo: " + getLocal());
    }
}

class Terrestre extends Animal {
    @Override
    public void exibirInfoT() {
        super.exibirInfoT();
        System.out.println("Características de um animal terrestre:");
        System.out.println("1. Vivem na terra ao invés dos céus.");
        System.out.println("2. Muitos têm patas.");
        System.out.println("3. Alguns são herbívoros, outros carnívoros.");
    }
}

class Ave extends Animal {
    @Override
    public void exibirInfoA() {
        super.exibirInfoA();
        System.out.println("Características de uma ave:");
        System.out.println("1. Possuem penas.");
        System.out.println("2. Põem ovos.");
        System.out.println("3. Têm bicos em vez de dentes.");
    }
}
