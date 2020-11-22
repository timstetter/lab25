package co.grandcircus.lab25;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.lab25.model.gcinfo.GCResponse;
import co.grandcircus.lab25.model.gcinfo.Language;
import co.grandcircus.lab25.model.gcinfo.Person;
import co.grandcircus.lab25.model.gcinfo.Room;

@Service
public class GCApiService {

	private RestTemplate rt = new RestTemplate();
	
	private String url = "https://grandcircusco.github.io/demo-apis/grand-circus.json";
	
	public String getOrganization() {
		GCResponse res = rt.getForObject(url, GCResponse.class);
		return res.getOrganization();
	}
	
	public Person getCeo() {
		GCResponse res = rt.getForObject(url, GCResponse.class);
		return res.getCeo();
	}
	
	public List<Room> getRooms() {
		GCResponse res = rt.getForObject(url, GCResponse.class);
		return res.getRooms();
	}
	
	public List<Language> getLanguages() {
		GCResponse res = rt.getForObject(url, GCResponse.class);
		return res.getLanguages();
	}
}
