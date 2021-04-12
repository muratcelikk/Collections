import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Murat �elik 01:40:02 9 Nis 2021
 *
 */
public class Sets {

	public static void main(String[] args) {

		/////////////////
		/////HashSet/////
		/////////////////

		HashSet<String> tatli = new HashSet<>();
		tatli.add("Baklava");
		tatli.add("Kaday�f");
		tatli.add("�ekerpare");
		tatli.add("K�nefe");
		tatli.add("Revani");

		// Yinelenen element ekle
//		tatli.add("Lokum");  //�NEML� NOT:Y�NELENEN ELEMENT EKLENMEZ.

		// Elementler s�ras�zd�r. Rastgele s�ralan�r.
//		tatli.add("Burma Kaday�f"); 
//		tatli.add("B�lb�l Yuvas�");
//		tatli.add("KemalPa�a"); 

		// Element sil (�stenilen);
//		tatli.remove("Revani"); //�stenilen element silinir.

		// " " (bo�luk) ekle(en ba�a);
//		tatli.add(" ");  //�NEML� NOT:Bo�luk eklenir. Yinelenen eklenmez.

		// "null" ekle(en ba�a);
//		tatli.add(null);  //null eklenir. Yinelenen eklenmez.

		// Element say�s�;
//		System.out.println(tatli.size());

		System.out.println("HashSet; ");
		System.out.println(" ");
//		B�t�n elementleri listele;
		for (String leziz : tatli) {
			System.out.println(leziz);
		}

//HASHSET: 
//Yinelenen element eklenmez.		
//Elementler s�ras�zd�r. Rastgele s�ralan�r.		
//Bo�luk ve null eklenir.
System.out.println("----------------");

		
		
		///////////////////
		///LinkedHashSet///
		///////////////////

		LinkedHashSet<String> il = new LinkedHashSet<>();
		il.add("�stanbul");
		il.add("Ankara");
		il.add("�zmir");
		il.add("Tunceli");
		il.add("Artvin");

		// Yinelenen element ekle
//		il.add("Tunceli");  //�NEML� NOT:Y�NELENEN ELEMENT EKLENMEZ.

		// Element ekle(en sona).
//		il.add("Sivas"); //�NEML� NOT: Elementler en sona yaz�ld��� s�ra ile eklenir.
//		il.add("Samsun");

		// null ekle(en sona)
//		il.add(null);

		// Bo�luk ekle(en sona)
//		il.add(" ");

		System.out.println("**LinkedHashSet; ");
		System.out.println(" ");
//		B�t�n elementleri listele;
		for (String iller : il) {
			System.out.println(iller);
		}

//L�NKEDHASHSET:
//Yinelenen element eklenmez.			
//Elementler s�ral�d�r(Eklendi�i s�ra)
//Bo�luk ve null eklenir.
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

		// �lk elementi listele;
//		System.out.println("Treeset: "+ numbers.first());

		// son elementi listele;
//		System.out.println("Treeset2: "+ numbers.last());

		// Yinelenen element ekle
//		numbers.add(11);  //�NEML� NOT:ARTAN SIRA

		// null ekle
//		numbers.add(null); //�NEML� NOT:NULL EKLENMEZ

		// Bo�luk eklenmez
//		//numbers.add(" ");	�NEML� NOT:bo�luk eklenmez	

		System.out.println("TreeSet; ");
		System.out.println(" ");
//		B�t�n elementleri listele;
		for (Integer number : numbers) {
			System.out.println(number);
		}

//TREESET:	
//Yinelenen element eklenmez.
//Elementler artan s�rada saklan�r(ASC)		
//Bo�luk ve null eklenmez.	
System.out.println("----------------");



		///////////////
		///SortedSet///
		///////////////

		SortedSet<String> cars = new TreeSet<>();
		cars.add("Tofa�");
		cars.add("BMW");
		cars.add("Mercedes");
		cars.add("Togg");

		// Element ekle;
//		cars.add("Volvo");
//		cars.add("Audi");

		// �lk Element;
//		System.out.println("�lk De�er: " + cars.first());

		// Son Element;
//		System.out.println("Son De�er: " + cars.last());

		// null ekle;
//		cars.add(null);

		// bo�luk ekle(ba�a);
//		cars.add(" ");

		System.out.println("SortedSet; ");
		System.out.println(" ");
//		B�t�n elementleri listele;
		for (String car : cars) {
			System.out.println(car);
		}

//SORTEDSET:
//Yinelenen element eklenmez.		
//Elementler artan s�rada saklan�r(ASC)		
//null eklenmez	
//Bo�luk eklenir.
		
	}
}
