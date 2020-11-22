package co.grandcircus.lab25;

import java.net.URI;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import co.grandcircus.lab25.model.news.Article;
import co.grandcircus.lab25.model.news.NewsResponse;

@Service
public class NewsApiService {
	
	private RestTemplate rt = new RestTemplate();
	
	private String apiKey = "REDCATED";
	
	public List<Article> getArticlesWithHeader(String query) {
		
		URI url = UriComponentsBuilder.fromHttpUrl("https://newsapi.org/v2/everything")
				.queryParam("q", query)
				.queryParam("from", "2020-11-15")
				.queryParam("sortBy", "popularity")
				.build().toUri();
		
		// Set up headers.
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-Api-Key", apiKey);
		
		NewsResponse response = rt.exchange(url, HttpMethod.GET, new HttpEntity<>(headers), NewsResponse.class).getBody();

		return response.getArticles();
	}
	
}