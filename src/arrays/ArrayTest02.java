package arrays;

public class ArrayTest02 {

	public static void main(String[] args) {
		
		
		//과목 : 영어,수학,컴퓨터
		//총점 ,평균, 반석차
		
		String[] subjectName= {"국어","영어","수학"};
		//국,영,수,총,석차
		
		//점수3개,총점,석차
		int record[][]= {
				{80,90,100,0,1},
				{70,80,90,0,1},
				{88,99,100,0,1},
				{75,85,95,0,1}
		};
		double avg[]=new double[4];
		
		for(int i=0; i< record.length; i++) {
			//총점계산
			for(int j=0; j<3; j++) {
				record[i][3] += record[i][j];
			}
			//평균계산
			avg[i] = record[i][3] / 3.0;
		}
		
		
		//출력
		
		
		
		
		

	}

}
