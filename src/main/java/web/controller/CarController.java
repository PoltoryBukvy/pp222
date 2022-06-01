package web.controller;

import models.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.CarService;

import java.util.ArrayList;
import java.util.Map;


@Controller
public class CarController {

	@GetMapping(value = "/cars")
	public String list(@RequestParam Map<String,String> params, ModelMap model) {
		System.out.println(params.get("count"));
		int count = 0;
		try {
			count = Integer.parseInt(params.get("count"));
			if (count > 5) {
				count = 5;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		CarService service = new CarService();
		model.addAttribute("cars", service.getCars(count));
		return "cars";
	}
	
}