import java.util.List;
import java.util.ArrayList;
import static java.util.Arrays.*;
import java.util.Collections;

public class Main {

    public static void main(final String... args) {
        asList(formatDuration(365), formatDuration(1), formatDuration(62), formatDuration(120), formatDuration(3600), formatDuration(3662)).stream().forEach(System.out::println);
    }

    public static String formatDuration(int seconds) {
        if (seconds == 0) return "now";
        List<Integer> l = asList(60, 60, 24, 365);
        List<String> lll = new ArrayList<>();
        List<String> ll = asList(" second", " minute", " hour", " day", " year");
        for (int i = 0; i < l.size(); i++) {
            if (seconds > l.get(i)) {
                if (seconds % l.get(i) != 0) lll.add(seconds % l.get(i) + ll.get(i) + (seconds % l.get(i) > 1 ? "s" : ""));
                seconds /= l.get(i);
            } else if (seconds == l.get(i)) {
                lll.add(1 + ll.get(i+1));
                seconds = 0;
                break;
            } else { 
                lll.add(seconds + ll.get(i) + (seconds > 1 ? "s" : ""));
                seconds = 0;
                break;
            }
        }
        if (seconds > 0) lll.add(seconds + " year" + (seconds > 1 ? "s": ""));
        Collections.reverse(lll);
        String result = String.join(", ", lll);
        return lll.size() >= 2 ? result.substring(0, result.lastIndexOf(", ")) + " and " + result.substring(result.lastIndexOf(", ") + 2) : result;
    }

}