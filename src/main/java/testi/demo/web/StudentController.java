package testi.demo.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import testi.demo.domain.Student;

@Controller
public class StudentController {

	@RequestMapping("hello")
	public String showStudents(Model model) {
		System.out.println("students");

		List<Student> opiskelijat = new ArrayList<>();
		opiskelijat.add(new Student("Matti", "Meikäläinen"));
		opiskelijat.add(new Student("Maija", "Meikäläinen"));
		opiskelijat.add(new Student("Pentti", "Korhonen"));
		opiskelijat.add(new Student("Keijo", "Virtanen"));

		model.addAttribute("students", opiskelijat);
		return "studentList";
	}
}
