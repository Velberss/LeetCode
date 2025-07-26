import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        findRepeatedDnaSequences(null);
    }
    public static List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();

        for(int i = 0; i <= s.length()-10;i++){
            String substring = s.substring(i, i+10);
            if(!seen.add(substring)){
                repeated.add(substring);
            }
        }
        
        return new ArrayList<>(repeated);
    }
}
