package co.grandcircus.lab25;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class NewsController {
	
	@Autowired
	private NewsApiService newsApiService;

	@RequestMapping("/news")
	public String fetchNews(@RequestParam(defaultValue = "PlayStation 5") String topic, Model model) {
		model.addAttribute("topic", topic);		
		model.addAttribute("news", newsApiService.getArticlesWithHeader(topic));		
		return "news";
	}
	
}
