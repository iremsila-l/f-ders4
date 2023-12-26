package tr.edu.medipol.yazilimorg.webservis;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/ogrenci")
public class OgrenciWebServisi {

	public record Ogrenci(String adSoyad, String numara) {}
	
	private static final List<Ogrenci> OGRENCI_LISTESI = new ArrayList<>();
		static {
			OGRENCI_LISTESI.add(new Ogrenci("Aslan", "1"));
			OGRENCI_LISTESI.add(new Ogrenci("Furkan", "2"));
			OGRENCI_LISTESI.add(new Ogrenci("Irem", "3"));
		}
		
		@GetMapping("/")
		public List<Ogrenci> listele(){
			return OGRENCI_LISTESI;
		}
}
