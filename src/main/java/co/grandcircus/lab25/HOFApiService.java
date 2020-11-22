package co.grandcircus.lab25;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.lab25.model.Complete;
import co.grandcircus.lab25.model.HOFResponse;
import co.grandcircus.lab25.model.Tiny;

@Service
public class HOFApiService {

	private RestTemplate rt = new RestTemplate();
	
	private String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";

	public List<Tiny> listTinys() {		
		HOFResponse res = rt.getForObject(url, HOFResponse.class);		
		return res.getTiny();
	}
	public List<Complete> listCompletesByYear() {		
		HOFResponse res = rt.getForObject(url, HOFResponse.class);			
		return res.getComplete();
	}

}
