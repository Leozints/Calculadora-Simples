import java.util.Scanner;

public class CalculoAreaPerimetro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha = 0;
        while (escolha != 4) {
            System.out.println("Escolha a figura geométrica:");
            System.out.println("1 - Pentágono");
            System.out.println("2 - Círculo");
            System.out.println("3 - Quadrado ou Retângulo");
            System.out.println("4 - Sair");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    calcularAreaOuPerimetroPentagono(sc);
                    break;
                case 2:
                    calcularAreaOuPerimetroCirculo(sc);
                    break;
                case 3:
                    calcularAreaOuPerimetroQuadradoRetangulo(sc);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha novamente.");
                    break;
            }
        }
    }
    //Calculo da área e perímetro do pentágono
    private static void calcularAreaOuPerimetroPentagono(Scanner sc) {
        int escolha = 0;
        while (escolha != 3) {
            System.out.println("Escolha o que deseja calcular:");
            System.out.println("1 - Área");
            System.out.println("2 - Perímetro");
            System.out.println("3 - Sair");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    calcularAreaPentagono(sc);
                    break;
                case 2:
                    calcularPerimetroPentagono(sc);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha novamente.");
                    break;
            }
        }
    }
    
    private static void calcularAreaPentagono(Scanner sc) {
        double lado = 0;
        while (lado <= 0) {
            System.out.print("Digite o comprimento do lado do pentágono: ");
            lado = sc.nextDouble();
            if (lado <= 0) {
                System.out.println("Valor inválido para o lado do pentágono! Digite um valor positivo.");
            }
        }
        double apotema = (lado / 2) * Math.tan(Math.toRadians(54)); // 54 é a medida do ângulo interno do pentágono
        double area = 5 * lado * apotema / 2;
        System.out.println("A área do pentágono é: " + area);
    }

    private static void calcularPerimetroPentagono(Scanner sc) {
        double lado = 0;
        while (lado <= 0) {
            System.out.print("Digite o comprimento do lado do pentágono: ");
            lado = sc.nextDouble();
            if (lado <= 0) {
                System.out.println("Valor inválido para o lado do pentágono! Digite um valor positivo.");
            }
        }
        double perimetro = 5 * lado;
        System.out.println("o Perímetro do pentágono é: " + perimetro);
    }

    //Calculo da área e perímetro do Círculo
    private static void calcularAreaOuPerimetroCirculo(Scanner sc) {
        int escolha = 0;
        while (escolha != 3) {
            System.out.println("Escolha o que deseja calcular:");
            System.out.println("1 - Área");
            System.out.println("2 - Perímetro");
            System.out.println("3 - Sair");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    calcularAreaCirculo(sc);
                    break;
                case 2:
                    calcularPerimetroCirculo(sc);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha novamente.");
                    break;
            }
        }
    }

    private static void calcularAreaCirculo(Scanner sc) {
        double raio = 0;
        while (raio <= 0) {
            System.out.print("Digite o raio do círculo: ");
            raio = sc.nextDouble();
            if (raio <= 0) {
                System.out.println("Valor inválido para o raio do círculo! Digite um valor positivo.");
            }
        }
        double area = Math.PI * raio * raio;
        System.out.println("A área do círculo é: " + area);
    }

    private static void calcularPerimetroCirculo(Scanner sc) {
        double raio = 0;
        while (raio <= 0) {
            System.out.print("Digite o raio do círculo: ");
            raio = sc.nextDouble();
            if (raio <= 0) {
                System.out.println("Valor inválido para o raio do círculo! Digite um valor positivo.");
            }
        }
        double perimetro = Math.PI * raio * 2;
        System.out.println("A área do círculo é: " + perimetro);
    }

    //Calculo da área e perímetro do Quadrado ou do Retângulo
 private static void calcularAreaOuPerimetroQuadradoRetangulo(Scanner sc) {
        int escolha = 0;
        while (escolha != 3) {
            System.out.println("Escolha o que deseja calcular:");
            System.out.println("1 - Área");
            System.out.println("2 - Perímetro");
            System.out.println("3 - Sair");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    calcularAreaQuadradoOuRetangulo(sc);
                    break;
                case 2:
                    calcularPerimetroQuadradoOuRetangulo(sc);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha novamente.");
                    break;
            }
        }
    }

    private static void calcularAreaQuadradoOuRetangulo(Scanner sc) {
        double comprimento = 0;
        double largura = 0;
        while (comprimento <= 0 || largura <= 0) {
            System.out.print("Digite o comprimento: ");
            comprimento = sc.nextDouble();
            System.out.print("Digite a largura: ");
            largura = sc.nextDouble();
            if (comprimento <= 0 || largura <= 0) {
                System.out.println("Valores inválidos para o comprimento ou a largura! Digite valores positivos.");
            }
        }
        double area = comprimento * largura;
        System.out.println("A área é: " + area);
        if (largura == comprimento) {
            System.out.println("A forma geométrica é um Quadrado");
        }
    }


    private static void calcularPerimetroQuadradoOuRetangulo(Scanner sc) {
        double comprimento = 0;
        double largura = 0;
        while (comprimento <= 0 || largura <= 0) {
            System.out.print("Digite o comprimento: ");
            comprimento = sc.nextDouble();
            System.out.print("Digite a largura: ");
            largura = sc.nextDouble();
            if (comprimento <= 0 || largura <= 0) {
                System.out.println("Valores inválidos para o comprimento ou a largura! Digite valores positivos.");
            }
        }
        double perimetro = (2 * comprimento) * (2 * largura);
        System.out.println("A área é: " + perimetro);
        if (largura == comprimento) {
            System.out.println("A forma geométrica é um Quadrado");
        }
    }
}