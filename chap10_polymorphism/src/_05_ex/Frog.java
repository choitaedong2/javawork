package _05_ex;

public class Frog extends Pet{
		Frog() {
			this("청개구리", "초록색", "무념무상");
		}
		
		Frog(String kind, String color, String feature) {
			super(kind, color, feature);
		}
		
		@Override
		void Sound() {
			System.out.println("개굴 개굴");
		}
}