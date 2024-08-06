package Practice.Sample_Project_7.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class ProjectService {

    public float convertCelsiusToFahrenheit(float celsius) {
        return celsius * 9 / 5 + 32;
    }

    public int countTheVowels(String word) {
        int count = 0;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                ++count;
            }
        }
        return count;
    }

    public int sum(List<Integer> numbers) {
       int sum1 = 0;
       for (Integer number : numbers) {
        sum1 += number;
       }
       return sum1;
    }

}
