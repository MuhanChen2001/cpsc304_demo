package ubc.cpsc304.group20.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import ubc.cpsc304.group20.demo.model.Performance;
import ubc.cpsc304.group20.demo.repository.DemoRepository;
import ubc.cpsc304.group20.demo.wrapper.PerformanceAttendanceByDate;

import java.util.List;

@Controller
public class DemoController {

    private DemoRepository demoRepository;

    public DemoController(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    @GetMapping("/test")
    public ModelAndView test() {

        List<Performance> performances = demoRepository.getAllPerformance();
        System.out.println(performances);

//        List<PerformanceAttendanceByDate> result = new LinkedList<>();
//        List<Object[]> list = demoRepository.getPerformanceAttendanceByDate();
//        list.forEach(objArr -> result.add(new PerformanceAttendanceByDate(objArr)));
//        result.forEach(System.out::println);

        List<PerformanceAttendanceByDate> attendances = demoRepository.getPerformanceAttendanceByDate2();
        attendances.forEach(System.out::println);

        return null;
    }

    @GetMapping("/")
    public String index() {
        return "index.html";
    }
}
