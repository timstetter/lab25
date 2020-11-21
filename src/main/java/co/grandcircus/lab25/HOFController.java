package co.grandcircus.lab25;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HOFController {

	@Autowired
	private HOFApiService hofApiService;
	
	@RequestMapping("/hof")
	public String tiny(Model model) {
		model.addAttribute("tinys", hofApiService.listTinys());
		return "hof";
	}

	@RequestMapping("/complete")
	public String complete(Model model) {
		model.addAttribute("completes", hofApiService.listCompletesByYear());
		return "complete";
	}
	
}
