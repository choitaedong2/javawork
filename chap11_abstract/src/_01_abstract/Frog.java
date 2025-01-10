package _01_abstract;

public class Frog extends Pet{
		Frog() {
			this("청개구리", "초록색", "무념무상");
		}
		
		Frog(String kind, String color, String feature) {
			super(kind, color, feature);
		}
		/*
		void Sound() {
			// 구현할 내용이 없더라도 구조(빈껍데기)를 갖춰야 함
			
		}
		*/	
		@Override
		void Sound() {
			System.out.println("개굴 개굴");
		}
}