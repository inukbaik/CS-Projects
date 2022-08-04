package hw214_2;

public class practicepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poly<> a = new Poly<Rat>(new Rat[] {new Rat( 1,1), new Rat(2,1), new Rat(1,1)});
        Poly<Rat> b = new Poly<Rat>(new Rat[] {new Rat(-1,1), new Rat(0,1), new Rat(1,1)});
        Poly<Rat> c = new Poly<Rat>(new Rat[] {new Rat( 1,1), new Rat(1,1), new Rat(1,1)});
		
		
	}
	
	public class Practice<P>{
		private P practice;
		public Practice(P p) { practice = p; }
	}
	
	public class Act<A>{
		private A act;
		public Act(A a) { act = a; }
		
	}
}
