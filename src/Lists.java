import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Murat Çelik 14:49:53 7 Nis 2021
 *
 */
public class Lists {

	public static void main(String[] args) {

		/////////////////
		////ArrayList////
		/////////////////

		ArrayList<String> tatli = new ArrayList<String>();
//		List<String> tatli = new ArrayList<>();  //Bu collection yöntemi de kullanýlabilir.
		tatli.add("Baklava"); 	// 0
		tatli.add("Kadayýf"); 	// 1
		tatli.add("Þekerpare"); // 2
		tatli.add("Künefe"); 	// 3
		tatli.add("Revani"); 	// 4

		// Element ekle(en sona);
//		tatli.add("Þöbiyet"); 

		// Elementi güncelle(2.index);
//		tatli.set(2, "Tulumba Tatlýsý"); //ÖNEMLÝ NOT:Ýndexteki elementin yerine yazýlýr.

		// Elementi sil(2.index);
//		tatli.remove(2); //Silinen index son index deðilse sonrasýnda gelen index ve indexlerde kayma olur.Ör: 4.index-->3.index olur.

		// Elementi listele(3.index);
//		System.out.println("Element: " + tatli.get(3));

		// Yinelenen element ekle(en sona);
//		tatli.add("Lokum");

		// " " (boþluk) ekle(en sona);
//		tatli.add(" "); 

		// "null" ekle(en sona);
//		tatli.add(null);

		System.out.println("ArrayList; ");
		System.out.println(" ");
//		Bütün elementleri listele;
		for (String leziz : tatli) {
			System.out.println(leziz);
		}
		
//ARRAYLÝST: 
//Element istenilen index deðiþtirilerek veya dizi sonuna eklenebilir.
//Yinelenen element eklenebilir.
//Boþluk ve null eklenebilir.
System.out.println("----------------");		



		////////////////
		///LinkedList///
		////////////////

		LinkedList<String> diziler = new LinkedList<String>();
		diziler.add("Son Yaz"); 		// 0
		diziler.add("Kardeþlerim"); 	// 1
		diziler.add("The Irregulars");  // 2
		diziler.add("The Mandalorian"); // 3
		diziler.add("Rookie");		    // 4

		// Elementi ekle(en baþa);
//		diziler.addFirst("Çukur");  //Not:Diðer index lerde kayma olur.

		// Elementi ekle(en sona);
//		diziler.addLast("Çukur");

		// Elementi ekle(en sona);
//		diziler.add("Çukur");

		// Elementi ekle(1.index);
//		diziler.add(1, "Çukur"); //ÖNEMLÝ NOT:Ýndex ARAYA eklenir. Mevcut indexteki element ve sonraki elementler indexsel olarak kayar.

		// Elementi güncelle(yerine); //ÖNEMLÝ NOT:Ýndexteki elementin yerine yazýlýr.
//		diziler.set(0, "Çukur");

		// Elementi sil(0.index);
//		diziler.remove(0);  //ÖNEMLÝ NOT:silinen indexten sonraki indexlerde kayma olur. Ör:"Rookie" index 4-->3 olur. 		

		// Elementi sil(en son);
//		diziler.removeLast();

		// Elementi sil(en baþ);
//		diziler.removeFirst(); //ÖNEMLÝ NOT:Diðer indexler kayar. ÖR:1.index-->0.index olur.

		// Elementi listele(3.index);
//		System.out.println("Element: " + diziler.get(3));

		// Elementi listele(ilk deðer);
//		System.out.println("Element: " + diziler.getFirst()); 

		// Elementi listele(son deðer);
//		System.out.println("Element: " + diziler.getLast()); 

		// Yinelenen element ekle(en sona);
//		diziler.add("Son Yaz");

		// " " (boþluk) ekle(en sona);
//		diziler.add(" "); 

		// "null" ekle(en sona);
//		diziler.add(null);

		System.out.println("LinkedList; ");
		System.out.println(" ");
//		Bütün elementleri listele;
		for (String dizi : diziler) {
			System.out.println(dizi);
		}

//LÝNKED LÝST: 
//Element listenin baþýna, sonuna, araya ve yerine eklenebilir.
//Yinelenen element, boþluk ve null eklenebilir.
		
	}
}
