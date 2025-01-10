package _02_abstractPhone;

public class Phone_main {

	public static void main(String[] args) {
//		Phone phone = new Phone(); 추상 클래스이므로 객체 생성 자체가 불가능
		SmartPhone smp = new SmartPhone("스마트폰", "검정색");
		System.out.println(smp.model);
		smp.bell();
		smp.hangUp();
		smp.bell();
		smp.sendVoice("아무말");
		smp.receveVoice("dkanakf");
		smp.hangOut();
		smp.search("dkanakf");
		
		System.out.println("================");
		FolderPhone fp = new FolderPhone();
		System.out.println(fp.model);
		fp.bell();
		fp.hangUp();
		fp.bell();
		fp.sendVoice("아무말");
		fp.receveVoice("dkanakf");
		fp.hangOut();
	}

}
