package calculadora;

public class Calculadora {

    public int calc(int a, int b, String op) {
        if (op == null) {
            System.out.println("Operacao invalida! Nenhum operador informado");
            return 0;
        }

        return switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> dividir(a, b);
            default -> {
                System.out.println("Operacao invalida: '" + op + "'");
                yield 0;
            }
        };
    }

    private int dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Erro! nao e possivel dividir por zero");
            return 0;
        }
        return a / b;
    }
}