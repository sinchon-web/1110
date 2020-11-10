package objects;

public class Test01 {

	public static void main(String[] args) {
		
		Exam[] ex=new Exam[3];
		//Exam 변수 3개
		//ex[0], ex[1], ex[2]
		
		//ex[0]=new Exam();
		//ex[0].name="조재청";
		
		//ex[1]=new Exam();
		//ex[1].name="진영수";
		
		//ex[2]=new Exam();
		//ex[2].name="신학철";
		
		//Exam ex0, ex1, ex2;
		///ex0=new Exam();
		///ex1=new Exam();
		
		ex[0]=new Exam("조재청", 90, 85, 100);
		ex[1]=new Exam("조인성", 80, 88, 95);
		ex[2]=new Exam("장동건", 88, 92, 90);
		
		for(int i=0; i<3; i++) {
			System.out.println( ex[i]);
			
		}
		
		
		
		
		
		

	}

}
