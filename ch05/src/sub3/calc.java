package sub3;



//싱글톤 객체
public class calc {
		
		private static calc instance = new calc();
		public static calc getInstance() {
			return instance;
		}
		calc() {}
		
		public int plus(int x, int y) {
			return x + y;
		}
		public int minus(int x, int y) {
			return x - y;
		}
		public int multi(int x, int y) {
			return x * y;
		}
		public int div(int x, int y) {
			return x / y;
		}
}
