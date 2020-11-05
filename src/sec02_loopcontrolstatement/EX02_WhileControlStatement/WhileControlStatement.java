package sec02_loopcontrolstatement.EX02_WhileControlStatement;

/*while 반복제어문의 기본문법구조, for로 변환, 특수한 형태, 무한루프 탈출*/

public class WhileControlStatement {	
    public static void main(String[] args) {
        //#1.while의 기본문법구조
        int a=0;
        while(a<10) {			
            System.out.print(a +" ");
            a++;
        } // 0, 1, 2, ~ 9 : 10회
        System.out.println();
        
        //@for문으로 변환
        for(int i=0; i<10; i++) {
            System.out.print(i + " ");
        } // 0, 1, 2, ~ 9 : 10회
        System.out.println();
				
        int b=10; 
        while(b>0) {
            System.out.print(b+" ");
            b--;
        } //10, 9, ~, 1 : 10회
        System.out.println();
        
        //@for문으로 변환
        for(int i=10; i>0; i--) {
            System.out.print(i + " ");
        } //10, 9, ~, 1 : 10회
        		
        //#2.while의 특수한 형태(무한루프)
        /*
        while(true) {
            System.out.println("무한루프");
        }
        */
        System.out.println();
        
        //#3.무한루프 탈출하기 break
        int c = 0;
        while(true) {
            if(c>10) {
                break;
            }
            System.out.print(c+ " ");	
            c++;
        } //0~ 10 : 11번 수행		
    }	
}
