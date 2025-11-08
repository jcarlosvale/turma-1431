import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class Algoritmos {



    public boolean ehPar(int x) {
        if (x <= 0) throw new IllegalArgumentException();
        return x % 2 == 0;
    }

    public long contarNumeroDeOcorrencias(List<Integer> lista,
                                          Integer numero) {

        Objects.requireNonNull(lista, "A lista nao pode estar vazia");
        Objects.requireNonNull(numero, "O numero fornecido nao pode ser nulo");

        return lista.stream()
                .filter(item -> Objects.equals(item, numero))
                .count();
    }

    public Optional<Integer> verificarSeAListaContemElemento(List<Integer> numbers, int target) {
        List<Integer> safeNumbers = Objects.requireNonNull(numbers, "numbers");
        for (int index = 0; index < safeNumbers.size(); index++) {
            Integer current = safeNumbers.get(index);
            if (current != null && current == target) {
                return Optional.of(index);
            }
        }
        return Optional.empty();
    }

    public String inverterString(String entrada) {
        StringBuilder stringBuilder = new StringBuilder(entrada);
        return stringBuilder.reverse().toString();
    }

    public boolean ehAnagram (String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> contador1 = new HashMap<>();
        for(char c : str1.toCharArray()) {
            contador1.put(c, contador1.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> contador2 = new HashMap<>();
        for(char c : str2.toCharArray()) {
            contador2.put(c, contador2.getOrDefault(c, 0) + 1);
        }

        return contador1.equals(contador2);
    }
}

