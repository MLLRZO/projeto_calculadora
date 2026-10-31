package calculadora;

/**
 * Classe responsável por realizar operações matemáticas básicas no FinançApp.
 * <p>
 * Suporta operações de soma, subtração, multiplicação e divisão, tratando
 * exceções de divisão por zero e operações inválidas.
 * </p>
 * 
 * @author FinançApp Dev Team
 * @version 2.0
 */
public class Calculadora {

    /**
     * Executa a operação matemática com base nos dois operandos e no operador informado.
     *
     * @param a Primeiro operando inteiro.
     * @param b Segundo operando inteiro.
     * @param op Operador matemático desejado ("+", "-", "*", "/").
     * @return O resultado numérico da operação ou uma mensagem de erro em formato String.
     */
    public String calc(int a, int b, String op) {
        if (op == null) {
            return "Erro: Operação inválida!";
        }

        switch (op) {
            case "+":
                return String.valueOf(somar(a, b));
            case "-":
                return String.valueOf(subtrair(a, b));
            case "*":
                return String.valueOf(multiplicar(a, b));
            case "/":
                return dividir(a, b);
            default:
                return "Erro: Operação inválida!";
        }
    }

    /**
     * Realiza a soma de dois números inteiros.
     *
     * @param a Primeiro número.
     * @param b Segundo número.
     * @return Resultado da soma.
     */
    private int somar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a subtração de dois números inteiros.
     *
     * @param a Primeiro número.
     * @param b Segundo número.
     * @return Resultado da subtração.
     */
    private int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a multiplicação de dois números inteiros.
     *
     * @param a Primeiro número.
     * @param b Segundo número.
     * @return Resultado da multiplicação.
     */
    private int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a divisão entre dois números inteiros.
     *
     * @param a Dividendo.
     * @param b Divisor.
     * @return O resultado da divisão em formato String ou mensagem de erro caso o divisor seja zero.
     */
    private String dividir(int a, int b) {
        if (b == 0) {
            return "Erro: Divisão por zero!";
        }
        return String.valueOf((double) a / b);
    }
}