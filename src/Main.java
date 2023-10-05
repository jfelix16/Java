{
        "java.project.sourcePaths": ["src"],
        "java.project.outputPath": "bin",
        "java.project.referencedLibraries": [
        "lib/**/*.jar"
        ]
        }

import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome, cargo e salário do funcionário
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o cargo do funcionário: ");
        String cargo = scanner.nextLine();

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        // Verifica se o salário é menor que 1000 reais
        if (salario < 1000) {
            // Calcula o novo salário com acréscimo de 10%
            salario = salario + (salario * 0.10);
        }

        // Exibe o nome, cargo e salário do funcionário
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Cargo do funcionário: " + cargo);
        System.out.println("Salário do funcionário: R$" + salario);

        // Fecha o scanner
        scanner.close();
    }
}

// progr 1

import java.util.Calendar;
        import java.util.Scanner;

public class CalculadoraIdade {

    public static void main(String[] args) {
        // Crie um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicite a data de nascimento do usuário
        System.out.println("Digite o dia de nascimento: ");
        int dia = scanner.nextInt();

        System.out.println("Digite o mês de nascimento: ");
        int mes = scanner.nextInt();

        System.out.println("Digite o ano de nascimento: ");
        int ano = scanner.nextInt();

        // Obtém a data atual
        Calendar dataAtual = Calendar.getInstance();
        int anoAtual = dataAtual.get(Calendar.YEAR);
        int mesAtual = dataAtual.get(Calendar.MONTH) + 1; // Note que os meses são indexados a partir de 0
        int diaAtual = dataAtual.get(Calendar.DAY_OF_MONTH);

        // Calcula a idade
        int idade = anoAtual - ano;

        // Verifica se o aniversário já ocorreu este ano
        if (mes < mesAtual || (mes == mesAtual && dia < diaAtual)) {
            idade--; // Subtrai 1 da idade se o aniversário já ocorreu este ano
        }

        // Classifica a idade e exibe a mensagem correspondente
        if (idade >= 50) {
            System.out.println("Boa idade!");
        } else if (idade >= 35) {
            System.out.println("Idade madura.");
        } else if (idade >= 18) {
            System.out.println("Você é jovem.");
        } else if (idade >= 14) {
            System.out.println("Adolescente.");
        } else {
            System.out.println("Criança.");
        }

        // Fecha o Scanner
        scanner.close();
    }
}


//prog 2 

import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {
        // Crie um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicite ao usuário que insira o peso em quilogramas
        System.out.println("Digite o peso em quilogramas: ");
        double peso = scanner.nextDouble();

        // Solicite ao usuário que insira a altura em metros
        System.out.println("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        // Calcule o IMC
        double imc = peso / (altura * altura);

        // Exiba o IMC
        System.out.println("Seu IMC é: " + imc);

        // Classifique o IMC com base na porcentagem de gordura corporal
        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc < 24.9) {
            System.out.println("Seu peso está dentro da faixa saudável.");
        } else if (imc < 29.9) {
            System.out.println("Você está com sobrepeso.");
        } else if (imc < 34.9) {
            System.out.println("Você está com obesidade grau 1.");
        } else if (imc < 39.9) {
            System.out.println("Você está com obesidade grau 2.");
        } else {
            System.out.println("Você está com obesidade grau 3 (obesidade mórbida).");
        }

        // Fecha o Scanner
        scanner.close();
    }
}

//prog 3

import java.util.Scanner;

public class VerificadorPositivoNegativo {

    public static void main(String[] args) {
        // Crie um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicite ao usuário que insira um número inteiro
        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Verifique se o número é positivo, negativo ou zero
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        // Fecha o Scanner
        scanner.close();
    }
}


// prog 4

import java.util.Scanner;

public class VerificadorParImpar {

    public static void main(String[] args) {
        // Crie um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicite ao usuário que insira um número
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        // Verifique se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        // Fecha o Scanner
        scanner.close();
    }
}


//prog 5
import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {
        // Crie um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicite ao usuário que insira o primeiro valor
        System.out.println("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        // Solicite ao usuário que insira o segundo valor
        System.out.println("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        // Verifique qual valor é o maior
        if (valor1 > valor2) {
            System.out.println("O primeiro valor é o maior: " + valor1);
        } else if (valor2 > valor1) {
            System.out.println("O segundo valor é o maior: " + valor2);
        } else {
            System.out.println("Os valores são iguais.");
        }

        // Fecha o Scanner
        scanner.close();
    }
}


// prog 6
import java.util.Scanner;

public class CalculadoraMedia {

    public static void main(String[] args) {
        // Crie um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicite ao usuário que insira as 4 notas
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        // Calcule a média das notas
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Verifique a situação do aluno com base na média
        if (media >= 7.0) {
            System.out.println("APROVADO! Média: " + media);
        } else if (media >= 5.0) {
            System.out.println("RECUPERAÇÃO! Média: " + media);
        } else {
            System.out.println("REPROVADO! Média: " + media);
        }

        // Fecha o Scanner
        scanner.close();
    }
}
// prog 7

public class NumerosDeUmADez {

    public static void main(String[] args) {
        // Use um loop for para imprimir números de 1 a 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

// prog 8
public class NumerosParesDeUmADez {

    public static void main(String[] args) {
        // Use um loop for para imprimir números pares de 1 a 10
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}


// prog 9

public class NumerosImparesDeZeroACinquenta {

    public static void main(String[] args) {
        // Use um loop for para imprimir números ímpares de 0 a 50
        for (int i = 1; i <= 50; i += 2) {
            System.out.println(i);
        }
    }
}


// prog 10 

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        // Crie um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicite ao usuário que insira um número
        System.out.println("Digite um número para a tabuada: ");
        int numero = scanner.nextInt();

        // Imprima a tabuada do número até 10
        System.out.println("Tabuada de " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        // Fecha o Scanner
        scanner.close();
    }
}

// prog 11

import java.util.Scanner;

public class TabuadaPersonalizada {

    public static void main(String[] args) {
        // Crie um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicite ao usuário que insira um número inteiro
        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Imprima a tabuada do número até 10
        System.out.println("Tabuada de " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        // Fecha o Scanner
        scanner.close();
    }
}


// prog 12

public class Fibonacci {

    public static void main(String[] args) {
        int n = 10; // Quantidade de números da sequência de Fibonacci a serem impressos
        long primeiroNumero = 0;
        long segundoNumero = 1;

        System.out.println("Os primeiros " + n + " números da sequência de Fibonacci são:");

        for (int i = 0; i < n; i++) {
            System.out.print(primeiroNumero + " ");
            long proximoNumero = primeiroNumero + segundoNumero;
            primeiroNumero = segundoNumero;
            segundoNumero = proximoNumero;
        }
    }
}

// prog 13
public class NumerosParesComWhile {

    public static void main(String[] args) {
        int numero = 0;

        System.out.println("Números pares de 0 a 20 usando o loop while:");

        while (numero <= 20) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        }
    }
}


// prog 14

public class SomaNumerosComWhile {

    public static void main(String[] args) {
        int numero = 1; // Inicializa o número com 1
        int soma = 0; // Inicializa a variável de soma com 0

        while (numero <= 100) {
            soma += numero; // Adiciona o número atual à soma
            numero++; // Incrementa o número para a próxima iteração
        }

        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}

// prog 15
import java.util.Scanner;

public class VerificadorIdade {

    public static void main(String[] args) {
        // Crie um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicite ao usuário que insira a idade
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Use um loop while para continuar pedindo a idade enquanto for menor que 18
        while (idade < 18) {
            System.out.println("Você é menor de idade. Digite sua idade novamente: ");
            idade = scanner.nextInt();
        }

        // Quando a idade for maior ou igual a 18, exiba uma mensagem
        System.out.println("Você é maior de idade!");

        // Fecha o Scanner
        scanner.close();
    }
}

// prog 16

import java.util.Scanner;

public class ContagemRegressiva {

    public static void main(String[] args) {
        // Crie um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicite ao usuário que insira um número
        System.out.println("Digite um número para a contagem regressiva: ");
        int numero = scanner.nextInt();

        // Verifique se o número é maior ou igual a 0
        if (numero >= 0) {
            System.out.println("Contagem regressiva de " + numero + " até 0:");

            while (numero >= 0) {
                System.out.println(numero);
                numero--;
            }
        } else {
            System.out.println("O número deve ser maior ou igual a 0.");
        }

        // Fecha o Scanner
        scanner.close();
    }
}

// prog 17

import java.util.Scanner;

public class SolicitacaoNumeros {

    public static void main(String[] args) {
        // Crie um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        int numero;

        do {
            // Solicite ao usuário que insira um número
            System.out.println("Digite um número (digite 0 para sair): ");
            numero = scanner.nextInt();
        } while (numero != 0);

        // Fecha o Scanner
        scanner.close();
    }
}


// prog 18 - todos

import java.util.Scanner;

public class ProgramaPrincipal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Apresente um menu de opções para o usuário
            System.out.println("Escolha uma opção:");
            System.out.println("1. Verificar se um número é positivo ou negativo");
            System.out.println("2. Calcular a média de 4 notas e verificar a situação do aluno");
            System.out.println("3. Imprimir os primeiros 10 números da sequência de Fibonacci");
            System.out.println("4. Imprimir números pares de 0 a 20");
            System.out.println("5. Calcular a soma dos números de 1 a 100");
            System.out.println("6. Solicitar idade até ser maior de idade (idade >= 18)");
            System.out.println("7. Contagem regressiva a partir de um número");
            System.out.println("8. Sair do programa");

            // Leia a escolha do usuário
            System.out.print("Opção: ");
            int escolha = scanner.nextInt();

            // Execute o programa correspondente à escolha do usuário
            switch (escolha) {
                case 1:
                    verificarPositivoNegativo();
                    break;
                case 2:
                    calcularMediaESituacao();
                    break;
                case 3:
                    imprimirFibonacci();
                    break;
                case 4:
                    imprimirNumerosPares();
                    break;
                case 5:
                    calcularSomaDeUmACem();
                    break;
                case 6:
                    solicitarIdadeAteMaiorIdade();
                    break;
                case 7:
                    contagemRegressiva();
                    break;
                case 8:
                    System.out.println("Programa encerrado.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void verificarPositivoNegativo() {
        // Coloque aqui o código para verificar se um número é positivo ou negativo
    }

    public static void calcularMediaESituacao() {
        // Coloque aqui o código para calcular a média de 4 notas e verificar a situação do aluno
    }

    public static void imprimirFibonacci() {
        // Coloque aqui o código para imprimir os primeiros 10 números da sequência de Fibonacci
    }

    public static void imprimirNumerosPares() {
        // Coloque aqui o código para imprimir números pares de 0 a 20
    }

    public static void calcularSomaDeUmACem() {
        // Coloque aqui o código para calcular a soma dos números de 1 a 100
    }

    public static void solicitarIdadeAteMaiorIdade() {
        // Coloque aqui o código para solicitar a idade até que o usuário seja maior de idade
    }

    public static void contagemRegressiva() {
        // Coloque aqui o código para a contagem regressiva a partir de um número
    }
}


//prog 19

import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome, cargo e salário do funcionário
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o cargo do funcionário: ");
        String cargo = scanner.nextLine();

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        // Verifica se o salário é menor que 1000 reais
        if (salario < 1000) {
            // Calcula o novo salário com acréscimo de 10%
            salario = salario + (salario * 0.10);
        }

        // Exibe o nome, cargo e salário do funcionário
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Cargo do funcionário: " + cargo);
        System.out.println("Salário do funcionário: R$" + salario);

        // Fecha o scanner
        scanner.close();
    }
}


//prog 20 salario

import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome, cargo e salário do funcionário
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o cargo do funcionário: ");
        String cargo = scanner.nextLine();

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        // Verifica se o salário é menor que 500 reais
        if (salario < 500) {
            // Calcula o novo salário com acréscimo de 30%
            salario = salario + (salario * 0.30);
            System.out.println("O funcionário tem direito a aumento.");
        } else {
            System.out.println("O funcionário não tem direito a aumento.");
        }

        // Exibe o nome, cargo e salário do funcionário
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Cargo do funcionário: " + cargo);
        System.out.println("Salário do funcionário: R$" + salario);

        // Fecha o scanner
        scanner.close();
    }
}
