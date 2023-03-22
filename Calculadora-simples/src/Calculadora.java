import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, resultado = 0.0;
        char operador;
        boolean fazerOutroCalculo = false;

        do {
            try {
                System.out.println("Digite o primeiro número:");
                while (!input.hasNextDouble()) {
                    System.out.println("Entrada inválida. Digite um número:");
                    input.next();
                }
                num1 = input.nextDouble();

                System.out.println("Digite o segundo número:");
                while (!input.hasNextDouble()) {
                    System.out.println("Entrada inválida. Digite um número:");
                    input.next();
                }
                num2 = input.nextDouble();

                System.out.println("Escolha o operador (+, -, *, /, div, %):");
                while (true) {
                    String operadorString = input.next();
                    if (operadorString.length() == 1) {
                        operador = operadorString.charAt(0);
                        if (operador == '+' || operador == '-' || operador == '*' || operador == '/' || operador == 'd' || operador == '%') {
                            break;
                        }
                    }
                    System.out.println("Operador inválido. Escolha (+, -, *, /, div, %):");
                }

                switch (operador) {
                    case '+':
                        resultado = num1 + num2;
                        break;

                    case '-':
                        resultado = num1 - num2;
                        break;

                    case '*':
                        resultado = num1 * num2;
                        break;

                    case '/':
                        if (num2 == 0) {
                            throw new IllegalArgumentException("Não é possível dividir por zero");
                        }
                        resultado = num1 / num2;
                        break;

                    case 'd':
                        if (num2 == 0) {
                            throw new IllegalArgumentException("Não é possível dividir por zero");
                        }
                        resultado = (int) num1 / (int) num2;
                        break;

                    case '%':
                        if (num2 == 0) {
                            throw new IllegalArgumentException("Não é possível dividir por zero");
                        }
                        resultado = num1 % num2;
                        break;

                    default:
                        throw new IllegalArgumentException("Operador inválido");
                }

                System.out.println("O resultado é: " + resultado);

                while (true) {
                    try {
                        System.out.println("Deseja fazer outro cálculo? (S/N)");
                        String resposta = input.next().toUpperCase();
                        if (resposta.equals("S")) {
                            fazerOutroCalculo = true;
                            break;
                        } else if (resposta.equals("N")) {
                            fazerOutroCalculo = false;
                            break;
                        } else {
                            throw new IllegalArgumentException("Entrada inválida. Por favor, digite S ou N.");
                        }
                    } catch (Exception e) {
                        System.out.println("Entrada inválida: " + e.getMessage());
                    }
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
                fazerOutroCalculo = true;
            } catch (Exception e) {
                System.out.println("Entrada inválida: " + e.getMessage());
                fazerOutroCalculo = true;
            }
        } while (fazerOutroCalculo);

        System.out.println("Obrigado por usar a calculadora");
    }
}