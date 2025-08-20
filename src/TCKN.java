import java.util.Random;

public class TCKN {
	private Long id;
	
	private String dogumYeri;
	
	private String tckn;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDogumyeri() {
		return dogumYeri;
	}
	public void setDogumyeri() {
		this.dogumYeri = dogumYeri;
	}
	
	public String getTckn() {
		return tckn;
	}
	
	boolean kontrol = false;
	
	public void setTckn() {
		if(tckn.length() == 11) {
			for(int i=0; i<tckn.length();i++) {
				char karakter = tckn.charAt(i);
				if(Character.isDigit(karakter)) {
					kontrol = true;
				}else {
					kontrol=false;
					break;
				}
			}if(kontrol) {
				Random random = new Random();
				int giseNo = random.nextInt(100);
				
				sonuc("Gişe numarası:" + giseNo);
			}else {
				System.out.println("Lütfen bütün karakterler rakam olacak şekilde giriş yapınız");
			}
		}else {
			sonuc("TC'niz 11 karakterli olmalı");
		}
	}
	
	public void sonuc(String sonuc) {
		System.out.println(sonuc);
	}
}
