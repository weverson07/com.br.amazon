import java.util.LinkedHashMap;
import java.util.Map;

public class ConversorRomano {

    private static final Map<Character, Integer> mapaRomano = Map.of(
        'I', 1, 'V', 5, 'X', 10,
        'L', 50, 'C', 100,
        'D', 500, 'M', 1000
    );

    public static int romanoParaInteiro(String romano) {
        romano = romano.toUpperCase(); // permite entrada em minúsculas
        int total = 0;
        int anterior = 0;

        for (int i = romano.length() - 1; i >= 0; i--) {
            int atual = mapaRomano.get(romano.charAt(i));
            if (atual < anterior) {
                total -= atual;
            } else {
                total += atual;
            }
            anterior = atual;
        }
        return total;
    }

    private static final LinkedHashMap<Integer, String> mapaInteiroRomano = new LinkedHashMap<>();

    static {
        mapaInteiroRomano.put(1000, "M");
        mapaInteiroRomano.put(900, "CM");
        mapaInteiroRomano.put(500, "D");
        mapaInteiroRomano.put(400, "CD");
        mapaInteiroRomano.put(100, "C");
        mapaInteiroRomano.put(90, "XC");
        mapaInteiroRomano.put(50, "L");
        mapaInteiroRomano.put(40, "XL");
        mapaInteiroRomano.put(10, "X");
        mapaInteiroRomano.put(9, "IX");
        mapaInteiroRomano.put(5, "V");
        mapaInteiroRomano.put(4, "IV");
        mapaInteiroRomano.put(1, "I");
    }

    public static String inteiroParaRomano(int numero) {
        StringBuilder resultado = new StringBuilder();
        for (Map.Entry<Integer, String> entrada : mapaInteiroRomano.entrySet()) {
            while (numero >= entrada.getKey()) {
                resultado.append(entrada.getValue());
                numero -= entrada.getKey();
            }
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        System.out.println("Romano para Inteiro:");
        System.out.println("M     = " + romanoParaInteiro("M"));      // 1000
        System.out.println("l     = " + romanoParaInteiro("l"));      // 50
        System.out.println("lV    = " + romanoParaInteiro("lV"));     // 55

        System.out.println("\nInteiro para Romano:");
        System.out.println("1990  = " + inteiroParaRomano(1990));     // MCMXC
    }
}
