package Practice.Sample_Project_7.TestService;

import Practice.Sample_Project_7.Service.ProjectService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TestService {

    @Autowired
    ProjectService projectService;

    @Test
    public void test() {
        float f = projectService.convertCelsiusToFahrenheit(21.7f);
        assertEquals(71.06f,f);
    }

    @Test
    public void test2() {
        int n = projectService.countTheVowels("Sampath");
        assertEquals(2, n);
    }


    @Test
    public void test3() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int n = projectService.sum(list);
        assertEquals(6, n);
    }

}
