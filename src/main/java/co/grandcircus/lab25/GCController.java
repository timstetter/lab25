package co.grandcircus.lab25;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GCController {

	@Autowired
	private GCApiService gcApiService;
	
	@RequestMapping("/gcinfo")
	public String gcinfo(Model model) {
		model.addAttribute("org", gcApiService.getOrganization());
		model.addAttribute("ceo", gcApiService.getCeo());
		model.addAttribute("rooms", gcApiService.getRooms());
		model.addAttribute("languages", gcApiService.getLanguages());
		return "gcinfo";
	}
}
