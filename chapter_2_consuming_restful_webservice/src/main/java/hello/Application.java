package hello;

import org.springframework.web.client.RestTemplate;

public class Application {

    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
	//        Page page = restTemplate.getForObject("http://graph.facebook.com/pivotalsoftware", Page.class);
        Page page = restTemplate.getForObject("http://localhost:8080/fakebook?name=mYnAmE", Page.class);
        System.out.println("Name:    " + page.getName());
        System.out.println("About:   " + page.getAbout());
    }

}
