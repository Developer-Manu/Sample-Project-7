package Practice.Sample_Project_7.Controller;

import Practice.Sample_Project_7.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @GetMapping("/celsius/{celsius}")
    public float celsiusToFahrenheit(@PathVariable float celsius) {
        return projectService.convertCelsiusToFahrenheit(celsius);
    }

    @GetMapping("/vowelscount")
    public int vowelsCount(@RequestParam String str){
        return projectService.countTheVowels(str);
    }

    @GetMapping("/sumofarray")
    public int updateCount(@RequestBody List<Integer> array1){
        return projectService.sum(array1);
    }
}
