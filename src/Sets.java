import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Murat Çelik 01:40:02 9 Nis 2021
 *
 */
public class Sets {

	public static void main(String[] args) {

		/////////////////
		/////HashSet/////
		/////////////////

		HashSet<String> tatli = new HashSet<>();
		tatli.add("Baklava");
		tatli.add("Kadayýf");
		tatli.add("Þekerpare");
		tatli.add("Künefe");
		tatli.add("Revani");

		// Yinelenen element ekle
//		tatli.add("Lokum");  //ÖNEMLÝ NOT:YÝNELENEN ELEMENT EKLENMEZ.

		// Elementler sýrasýzdýr. Rastgele sýralanýr.
//		tatli.add("Burma Kadayýf"); 
//		tatli.add("Bülbül Yuvasý");
//		tatli.add("KemalPaþa"); 

		// Element sil (Ýstenilen);
//		tatli.remove("Revani"); //Ýstenilen element silinir.

		// " " (boþluk) ekle(en baþa);
//		tatli.add(" ");  //ÖNEMLÝ NOT:Boþluk eklenir. Yinelenen eklenmez.

		// "null" ekle(en baþa);
//		tatli.add(null);  //null eklenir. Yinelenen eklenmez.

		// Element sayýsý;
//		System.out.println(tatli.size());

		System.out.println("HashSet; ");
		System.out.println(" ");
//		Bütün elementleri listele;
		for (String leziz : tatli) {
			System.out.println(leziz);
		}

//HASHSET: 
//Yinelenen element eklenmez.		
//Elementler sýrasýzdýr. Rastgele sýralanýr.		
//Boþluk ve null eklenir.
System.out.println("----------------");

		
		
		///////////////////
		///LinkedHashSet///
		///////////////////

		LinkedHashSet<String> il = new LinkedHashSet<>();
		il.add("Ýstanbul");
		il.add("Ankara");
		il.add("Ýzmir");
		il.add("Tunceli");
		il.add("Artvin");

		// Yinelenen element ekle
//		il.add("Tunceli");  //ÖNEMLÝ NOT:YÝNELENEN ELEMENT EKLENMEZ.

		// Element ekle(en sona).
//		il.add("Sivas"); //ÖNEMLÝ NOT: Elementler en sona yazýldýðý sýra ile eklenir.
//		il.add("Samsun");

		// null ekle(en sona)
//		il.add(null);

		// Boþluk ekle(en sona)
//		il.add(" ");

		System.out.println("**LinkedHashSet; ");
		System.out.println(" ");
//		Bütün elementleri listele;
		for (String iller : il) {
			System.out.println(iller);
		}

//LÝNKEDHASHSET:
//Yinelenen element eklenmez.			
//Elementler sýralýdýr(Eklendiði sýra)
//Boþluk ve null eklenir.
System.out.println("----------------");



		///////////////
		////TreeSet////
		///////////////

		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(1);
		numbers.add(12);
		numbers.add(3);
		numbers.add(7);
		numbers.add(5);

		// Ýlk elementi listele;
//		System.out.println("Treeset: "+ numbers.first());

		// son elementi listele;
//		System.out.println("Treeset2: "+ numbers.last());

		// Yinelenen element ekle
//		numbers.add(11);  //ÖNEMLÝ NOT:ARTAN SIRA

		// null ekle
//		numbers.add(null); //ÖNEMLÝ NOT:NULL EKLENMEZ

		// Boþluk eklenmez
//		//numbers.add(" ");	ÖNEMLÝ NOT:boþluk eklenmez	

		System.out.println("TreeSet; ");
		System.out.println(" ");
//		Bütün elementleri listele;
		for (Integer number : numbers) {
			System.out.println(number);
		}

//TREESET:	
//Yinelenen element eklenmez.
//Elementler artan sýrada saklanýr(ASC)		
//Boþluk ve null eklenmez.	
System.out.println("----------------");



		///////////////
		///SortedSet///
		///////////////

		SortedSet<String> cars = new TreeSet<>();
		cars.add("Tofaþ");
		cars.add("BMW");
		cars.add("Mercedes");
		cars.add("Togg");

		// Element ekle;
//		cars.add("Volvo");
//		cars.add("Audi");

		// Ýlk Element;
//		System.out.println("Ýlk Deðer: " + cars.first());

		// Son Element;
//		System.out.println("Son Deðer: " + cars.last());

		// null ekle;
//		cars.add(null);

		// boþluk ekle(baþa);
//		cars.add(" ");

		System.out.println("SortedSet; ");
		System.out.println(" ");
//		Bütün elementleri listele;
		for (String car : cars) {
			System.out.println(car);
		}

//SORTEDSET:
//Yinelenen element eklenmez.		
//Elementler artan sýrada saklanýr(ASC)		
//null eklenmez	
//Boþluk eklenir.
		
	}
}
