package calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // {a, b, operação, esperado}
       Object[][] casos = {
    {15, 8, "+", 23},
    {15, 8, "-", 7},
    {6, 9, "*", 54},
    {36, 6, "/", 6},
    {14, 0, "/", 0},   // divisão por zero
    {8, 2, "%", 0}     // operação inválida
};

        int falhas = 0;
        for (Object[] caso : casos) {
            if (!testar(calc, (int) caso[0], (int) caso[1], (String) caso[2], (int) caso[3])) {
                falhas++;
            }
        }

        System.out.printf("%n%d de %d testes passaram.%n", casos.length - falhas, casos.length);
        if (falhas > 0) {
            System.exit(1);
        }
    }

    static boolean testar(Calculadora calc, int a, int b, String op, int esperado) {
        int obtido = calc.calc(a, b, op);
        boolean ok = obtido == esperado;
        System.out.printf("%d %s %d | esperado: %d | obtido: %d | %s%n",
                a, op, b, esperado, obtido, ok ? "OK" : "FALHOU");
        return ok;
    }
}