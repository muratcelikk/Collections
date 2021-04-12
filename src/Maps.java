import java.util.HashMap;
import java.util.Hashtable;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author Murat Çelik 19:58:53 9 Nis 2021
 *
 */
public class Maps {

	public static void main(String[] args) {

		/////////////
		///HashMap///
		/////////////

		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Mac");
		hm.put(2, "Asus");
		hm.put(4, "Lenovo");
		hm.put(3, "HP");
		hm.put(5, "Huawei");

		// Element güncelle (key e göre-->4);
//		hm.put(4, "Sony");

		// Yinelenen veri eklenebilir.
//		hm.put(6, "Mac");
//		hm.put(7, "Mac");

		// Element sil;
//		hm.remove(2);

		// Element boyutu;
//		System.out.println("hm boyutu: " + hm.size());

		// null ekle;
//		hm.put(5, null);

		// boþluk ekle;
//		hm.put(5, " ");

		System.out.println("HashMap: ");
		System.out.println(" ");
		for (Integer cep : hm.keySet()) {
			System.out.println(cep + "-" + hm.get(cep));
		}
//		hm.forEach((sýraNo, pcAdý)->System.out.println(sýraNo + "-" + pcAdý));

//HASHMAP:
//Yinelenen element eklenmez.		
//Elementler sýralýdýr(ASC)		
//Boþluk ve null eklenebilir.
System.out.println("------------------");



		///////////////
		///HashTable///
		///////////////

		Hashtable<Integer, String> alisveris = new Hashtable<>();
		alisveris.put(1, "Binboða Bal");
		alisveris.put(2, "Koska Pekmez");
		alisveris.put(3, "Kavurma");
		alisveris.put(4, "Kaþar Peynir");
		alisveris.put(5, "Beyaz Peynir");

		// Yinelenen element eklenmez.
//		alisveris.put(2, "Salça");
//		alisveris.put(2, "Salça");

		// Element güncelle (key e göre-->2);
//		alisveris.put(2, "Salça");

		// Element sil;
//		alisveris.remove(2);

		// Element boyutu;
//		System.out.println("alisveris boyutu: " + alisveris.size());

		// null eklenmez;
//		alisveris.put(6, null);

		// boþluk eklenir;
//		alisveris.put(6, " ");

		System.out.println("**HashTable: ");
		System.out.println(" ");
		for (Integer market : alisveris.keySet()) {
			System.out.println(market + "-" + alisveris.get(market));
		}

//HASHTABLE:
//Yinelenen element eklenmez.
//Elementler sýralýdýr(DESC) <===		
//null eklenmez.
//Boþluk eklenir.	
System.out.println("------------------");



		/////////////
		///TreeMap///
		/////////////

		TreeMap<Integer, String> cafeMenu = new TreeMap<>();
		cafeMenu.put(1, "Hamburger");
		cafeMenu.put(2, "Tost");
		cafeMenu.put(5, "Pasta");
		cafeMenu.put(3, "Köfte");
		cafeMenu.put(4, "Cheeseburger");

		// Element ekle;
//		cafeMenu.put(6, "Tost");
//		cafeMenu.put(5, "Tost");

		// Element güncelle (key e göre-->2);
//		cafeMenu.put(2, "Föndü");

		// Element sil;
//		cafeMenu.remove(2);

		// null eklenir;
//		cafeMenu.put(6, null);

		// boþluk eklenir;
//		cafeMenu.put(6, " ");

		// Element boyutu;
//		System.out.println("cafeMenu boyutu: " + cafeMenu.size());

		System.out.println("TreeMap: ");
		System.out.println(" ");
		for (Integer menu : cafeMenu.keySet()) {
			System.out.println(menu + "-" + cafeMenu.get(menu));
		}

//TREEMAP:
//Yinelenen element eklenmez.		
//Elementler sýralýdýr(ASC)
//null eklenir.
//Boþluk eklenir.
System.out.println("------------------");



		/////////////
		//SortedMap//
		/////////////

		SortedMap<Integer, String> employee = new TreeMap<>();
		employee.put(1, "Murat");
		employee.put(2, "Mesut");
		employee.put(5, "Fýrat");
		employee.put(3, "Veli");
		employee.put(4, "Sultan");

		// Element ekle;
//	employee.put(6, "Sultan");

		// Element güncelle (key e göre-->2);
//	employee.put(2, "Esin");

		// Element sil;
//	employee.remove(2);

		// null eklenir;
//	employee.put(5, null);

		// boþluk eklenir;
//	employee.put(6, " ");

		// Element boyutu;
//	System.out.println("employee boyutu: " + employee.size());

		System.out.println("SortedMap: ");
		System.out.println(" ");
		for (Integer emp : employee.keySet()) {
			System.out.println(emp + "-" + employee.get(emp));
		}

//SORTEDMAP:
//Yinelenen element eklenmez.
//Elementler sýralýdýr(ASC)
//null eklenir
//Boþluk eklenir	

	}
}
