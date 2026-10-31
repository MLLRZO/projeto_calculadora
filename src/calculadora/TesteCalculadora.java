package calculadora;

/**
 * Classe responsável por testar as funcionalidades da classe Calculadora.
 * 
 * @author Enzo Müller Santana
 * @version 2.0
 */
public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int erros = 0;

        System.out.println("=== EXECUÇÃO DOS TESTES UNITÁRIOS METÓDICOS ===\n");

        erros += executarTeste(calc, 15, 8, "+", "23", "Teste de Soma");
        erros += executarTeste(calc, 15, 8, "-", "7", "Teste de Subtração");
        erros += executarTeste(calc, 6, 9, "*", "54", "Teste de Multiplicação");
        erros += executarTeste(calc, 36, 6, "/", "6.0", "Teste de Divisão");
        erros += executarTeste(calc, 14, 0, "/", "Erro: Divisão por zero!", "Teste de Divisão por Zero");
        erros += executarTeste(calc, 8, 2, "%", "Erro: Operação inválida!", "Teste de Operação Inválida");

        System.out.println("----------------------------------------");
        if (erros == 0) {
            System.out.println("RESULTADO FINAL: TODOS OS TESTES PASSARAM COM SUCESSO!");
        } else {
            System.out.println("RESULTADO FINAL: " + erros + " TESTE(S) FALHARAM.");
        }
    }

    private static int executarTeste(Calculadora calc, int a, int b, String op, String esperado, String nomeTeste) {
        String obtido = calc.calc(a, b, op);
        boolean passou = esperado.equals(obtido);

        System.out.println("[" + (passou ? "PASSOU" : "FALHOU") + "] " + nomeTeste);
        System.out.println("   Entradas: a = " + a + ", b = " + b + ", op = '" + op + "'");
        System.out.println("   Esperado: " + esperado);
        System.out.println("   Obtido:   " + obtido + "\n");

        return passou ? 0 : 1;
    }
}