package sec04_controlkeyword.EX02_ContinueControlKeyword;

/*continue 제어키워드*/

public class ContinueControlKeyword {
	public static void main(String[] args) {		
		//#1. 단일 루프에서의 continue
		for(int i=0; i<10; i++) {
			continue;
			//System.out.print(i+ " ");
		}
		
		for(int i=0; i<10; i++) {			
			System.out.print(i+ " ");
			continue;
		} //0~9
		System.out.println();
		
		for(int i=0; i<10; i++) {	
			if(i==5) {
				continue;
			}
			System.out.print(i+ " ");			
		} //0~4, 6~9
		System.out.println();			
		
		//#2. 다중(이중 루프에서의 continue)
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==3) {
					continue;
				}
				System.out.println(i+ ", "+j);
			}
		} 
		//
		System.out.println();
		POS1: for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==3) {
					continue POS1;
				}
				System.out.println(i+ ", "+j);
			}
		} //
	}
}
