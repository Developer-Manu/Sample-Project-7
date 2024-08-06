package Practice.Sample_Project_7.TestController;

import Practice.Sample_Project_7.Controller.ProjectController;
import org.assertj.core.internal.Integers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
public class TestController {

    @Autowired
    ProjectController projectController;



    @Test
    public void testController() {
        float f = projectController.celsiusToFahrenheit(36.6f);
        assertEquals(97.88f, f);
    }

    @Test
    public void testVowels(){
        int a = projectController.vowelsCount("Manohar");
        assertEquals(3, a);
    }

    @Test
    public void testArraySum(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
       int a = projectController.updateCount(list);
       assertEquals(15, a);
    }
}
