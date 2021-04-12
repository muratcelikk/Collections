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
		tatli.add("Kadayıf");
		tatli.add("Şekerpare");
		tatli.add("Künefe");
		tatli.add("Revani");

		// Yinelenen element ekle
//		tatli.add("Lokum");  //ÖNEMLİ NOT:YİNELENEN ELEMENT EKLENMEZ.

		// Elementler sırasızdır. Rastgele sıralanır.
//		tatli.add("Burma Kadayıf"); 
//		tatli.add("Bülbül Yuvası");
//		tatli.add("KemalPaşa"); 

		// Element sil (İstenilen);
//		tatli.remove("Revani"); //İstenilen element silinir.

		// " " (boşluk) ekle(en başa);
//		tatli.add(" ");  //ÖNEMLİ NOT:Boşluk eklenir. Yinelenen eklenmez.

		// "null" ekle(en başa);
//		tatli.add(null);  //null eklenir. Yinelenen eklenmez.

		// Element sayısı;
//		System.out.println(tatli.size());

		System.out.println("HashSet; ");
		System.out.println(" ");
//		Bütün elementleri listele;
		for (String leziz : tatli) {
			System.out.println(leziz);
		}

//HASHSET: 
//Yinelenen element eklenmez.		
//Elementler sırasızdır. Rastgele sıralanır.		
//Boşluk ve null eklenir.
System.out.println("----------------");

		
		
		///////////////////
		///LinkedHashSet///
		///////////////////

		LinkedHashSet<String> il = new LinkedHashSet<>();
		il.add("İstanbul");
		il.add("Ankara");
		il.add("İzmir");
		il.add("Tunceli");
		il.add("Artvin");

		// Yinelenen element ekle
//		il.add("Tunceli");  //ÖNEMLİ NOT:YİNELENEN ELEMENT EKLENMEZ.

		// Element ekle(en sona).
//		il.add("Sivas"); //ÖNEMLİ NOT: Elementler en sona yazıldığı sıra ile eklenir.
//		il.add("Samsun");

		// null ekle(en sona)
//		il.add(null);

		// Boşluk ekle(en sona)
//		il.add(" ");

		System.out.println("**LinkedHashSet; ");
		System.out.println(" ");
//		Bütün elementleri listele;
		for (String iller : il) {
			System.out.println(iller);
		}

//LİNKEDHASHSET:
//Yinelenen element eklenmez.			
//Elementler sıralıdır(Eklendiği sıra)
//Boşluk ve null eklenir.
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

		// İlk elementi listele;
//		System.out.println("Treeset: "+ numbers.first());

		// son elementi listele;
//		System.out.println("Treeset2: "+ numbers.last());

		// Yinelenen element ekle
//		numbers.add(11);  //ÖNEMLİ NOT:ARTAN SIRA

		// null ekle
//		numbers.add(null); //ÖNEMLİ NOT:NULL EKLENMEZ

		// Boşluk eklenmez
//		//numbers.add(" ");	ÖNEMLİ NOT:boşluk eklenmez	

		System.out.println("TreeSet; ");
		System.out.println(" ");
//		Bütün elementleri listele;
		for (Integer number : numbers) {
			System.out.println(number);
		}

//TREESET:	
//Yinelenen element eklenmez.
//Elementler artan sırada saklanır(ASC)		
//Boşluk ve null eklenmez.	
System.out.println("----------------");



		///////////////
		///SortedSet///
		///////////////

		SortedSet<String> cars = new TreeSet<>();
		cars.add("Tofaş");
		cars.add("BMW");
		cars.add("Mercedes");
		cars.add("Togg");

		// Element ekle;
//		cars.add("Volvo");
//		cars.add("Audi");

		// İlk Element;
//		System.out.println("İlk Değer: " + cars.first());

		// Son Element;
//		System.out.println("Son Değer: " + cars.last());

		// null ekle;
//		cars.add(null);

		// boşluk ekle(başa);
//		cars.add(" ");

		System.out.println("SortedSet; ");
		System.out.println(" ");
//		Bütün elementleri listele;
		for (String car : cars) {
			System.out.println(car);
		}

//SORTEDSET:
//Yinelenen element eklenmez.		
//Elementler artan sırada saklanır(ASC)		
//null eklenmez	
//Boşluk eklenir.
		
	}
}
