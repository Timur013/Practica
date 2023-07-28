import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Main {
     private static  <T> Set<T> findCommonElements(List<T> first, List<T> second) {
        Set<T> collection = new HashSet<>(second);
        return first.stream().filter(collection::contains).collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        List<Integer> first = Arrays.asList(1, 3, 1, 6, 5, 7, 3);
        List<Integer> second = Arrays.asList(2, 3, 4, 5, 3);

        Set<Integer> common = findCommonElements(first, second);
        System.out.println(common);
    }
}