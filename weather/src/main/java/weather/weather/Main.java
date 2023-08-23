package weather.weather;

import java.io.IOException;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner (System.in);
		
		String ID = sc.next();
		
		String city = sc.next();
		
		Document doc = Jsoup.connect("https://meteo.ua/" + ID + "/" + city).get();
		
		Elements weather = doc.select("div.weather-detail-desktop");
		
		for (Element element : weather.select("a[href]")) {
			System.out.println(element.text());
		}
		
	//	for (Element element : weather.select("p")) {
		//	System.out.println(element.text());
	//	}

	}

}
