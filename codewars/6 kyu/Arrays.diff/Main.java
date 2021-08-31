import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    
    public static void main(final String... args) {

    }

    public static int[] diff(int[] a, int[] b) {
        final Set<Integer> c = Arrays.stream(b).boxed().collect(Collectors.toSet());
        final Predicate<Integer> filterPredicate = Predicate.not(c::contains);
        return Arrays.stream(a).boxed().filter(filterPredicate).mapToInt(Integer::intValue).toArray();
    }

}
