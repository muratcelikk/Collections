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
 * @author Murat �elik 14:49:53 7 Nis 2021
 *
 */
public class Lists {

	public static void main(String[] args) {

		/////////////////
		////ArrayList////
		/////////////////

		ArrayList<String> tatli = new ArrayList<String>();
//		List<String> tatli = new ArrayList<>();  //Bu collection y�ntemi de kullan�labilir.
		tatli.add("Baklava"); 	// 0
		tatli.add("Kaday�f"); 	// 1
		tatli.add("�ekerpare"); // 2
		tatli.add("K�nefe"); 	// 3
		tatli.add("Revani"); 	// 4

		// Element ekle(en sona);
//		tatli.add("��biyet"); 

		// Elementi g�ncelle(2.index);
//		tatli.set(2, "Tulumba Tatl�s�"); //�NEML� NOT:�ndexteki elementin yerine yaz�l�r.

		// Elementi sil(2.index);
//		tatli.remove(2); //Silinen index son index de�ilse sonras�nda gelen index ve indexlerde kayma olur.�r: 4.index-->3.index olur.

		// Elementi listele(3.index);
//		System.out.println("Element: " + tatli.get(3));

		// Yinelenen element ekle(en sona);
//		tatli.add("Lokum");

		// " " (bo�luk) ekle(en sona);
//		tatli.add(" "); 

		// "null" ekle(en sona);
//		tatli.add(null);

		System.out.println("ArrayList; ");
		System.out.println(" ");
//		B�t�n elementleri listele;
		for (String leziz : tatli) {
			System.out.println(leziz);
		}
		
//ARRAYL�ST: 
//Element istenilen index de�i�tirilerek veya dizi sonuna eklenebilir.
//Yinelenen element eklenebilir.
//Bo�luk ve null eklenebilir.
System.out.println("----------------");		



		////////////////
		///LinkedList///
		////////////////

		LinkedList<String> diziler = new LinkedList<String>();
		diziler.add("Son Yaz"); 		// 0
		diziler.add("Karde�lerim"); 	// 1
		diziler.add("The Irregulars");  // 2
		diziler.add("The Mandalorian"); // 3
		diziler.add("Rookie");		    // 4

		// Elementi ekle(en ba�a);
//		diziler.addFirst("�ukur");  //Not:Di�er index lerde kayma olur.

		// Elementi ekle(en sona);
//		diziler.addLast("�ukur");

		// Elementi ekle(en sona);
//		diziler.add("�ukur");

		// Elementi ekle(1.index);
//		diziler.add(1, "�ukur"); //�NEML� NOT:�ndex ARAYA eklenir. Mevcut indexteki element ve sonraki elementler indexsel olarak kayar.

		// Elementi g�ncelle(yerine); //�NEML� NOT:�ndexteki elementin yerine yaz�l�r.
//		diziler.set(0, "�ukur");

		// Elementi sil(0.index);
//		diziler.remove(0);  //�NEML� NOT:silinen indexten sonraki indexlerde kayma olur. �r:"Rookie" index 4-->3 olur. 		

		// Elementi sil(en son);
//		diziler.removeLast();

		// Elementi sil(en ba�);
//		diziler.removeFirst(); //�NEML� NOT:Di�er indexler kayar. �R:1.index-->0.index olur.

		// Elementi listele(3.index);
//		System.out.println("Element: " + diziler.get(3));

		// Elementi listele(ilk de�er);
//		System.out.println("Element: " + diziler.getFirst()); 

		// Elementi listele(son de�er);
//		System.out.println("Element: " + diziler.getLast()); 

		// Yinelenen element ekle(en sona);
//		diziler.add("Son Yaz");

		// " " (bo�luk) ekle(en sona);
//		diziler.add(" "); 

		// "null" ekle(en sona);
//		diziler.add(null);

		System.out.println("LinkedList; ");
		System.out.println(" ");
//		B�t�n elementleri listele;
		for (String dizi : diziler) {
			System.out.println(dizi);
		}

//L�NKED L�ST: 
//Element listenin ba��na, sonuna, araya ve yerine eklenebilir.
//Yinelenen element, bo�luk ve null eklenebilir.
		
	}
}
