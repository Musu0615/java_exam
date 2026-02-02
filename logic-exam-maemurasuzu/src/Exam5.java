import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exam5 {
    public static void main(String[] args) {
        String[] words = {"soccer", "baseball", "jogging", "jogging", "soccer", "surfing", "surfing", "soccer", "surfing", "baseball", "boxing", "surfing", "soccer", "surfing", "jogging", "boxing", "jogging", "baseball", "soccer", "soccer"};
        Map<String, Integer> map = new HashMap<>();
        int max = 6;
        for (String country : words) {
			Integer count = map.get(country);
			if(count == null) {
				map.put(country, 1);
			} else {
				count++;
				map.put(country, count);
			}
            Set<String> keySet = map.keySet();
            Integer counts = map.get(country);
            if(counts == max){
                System.out.println("最も出現回数の多いスポーツは" +country + "で、出現回数は" + count +"回です");
            }
		}
		
			
	}
        
}
