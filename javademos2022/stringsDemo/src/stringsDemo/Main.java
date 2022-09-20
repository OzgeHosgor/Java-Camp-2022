package stringsDemo;

public class Main {

	public static void main(String[] args) {

		String mesaj = "   Bugün hava çok güzel.   ";
		System.out.println(mesaj);

		System.out.println("Eleman sayısı: " + mesaj.length());
		System.out.println("5.eleman: " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];

		// Hocanın yazdığı bu kod satırı hata verdi. Alternatif yazım aşağıda//
		// mesaj.getChars(srcBegin:0,srcEnd:4,karakterler,dstBegin:0);
		
		
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);

		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("a"));

		System.out.println("-----------------------");

		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2, 5));

	
		
		// split //
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);

		}
		
		
		// özellikle veri tabanlarında arama yaparken kullanılır //
		// kelimelerin tüm harflerini küçültür //
		System.out.println(mesaj.toLowerCase());
		// kelimelerin tüm harflerini büyültür //
		System.out.println(mesaj.toUpperCase());
		
		//metinin başında ve sonundaki boşlukları atmak için //
		
		System.out.println(mesaj.trim());
		
		
	}
}
