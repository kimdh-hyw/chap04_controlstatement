package sec02_loopcontrolstatement.EX03_DoWhileControlStatement;

/*do-while의 기본문법구조, do-while vs. while의 비교*/

public class DoWhileControlStatement {	
    public static void main(String[] args) {
        //#1. 반복회수가 0인 경우 do-while과 while 문 비교
        int a;
        a=0;
        while(a<0) {
            System.out.print(a+" ");
            a++;
        } // 실행회수 0번
        System.out.println();
        a=0;
        do {
            System.out.print(a+" ");
            a++;
        } while(a<0); //실행회수 1번
        System.out.println();
        
        //#2. 반복회수가 1인 경우 do-while과 while 문 비교
        a=0;
        while(a<1) {
            System.out.print(a+" ");
            a++;
        } // 실행회수 1번
        System.out.println();
        a=0;
        do {
            System.out.print(a+" ");
            a++;
        } while(a<1); //실행회수 1번
        System.out.println();	
        
        //#3. 반복회수가 10인 경우 do-while과 while 문 비교
        a=0;
        while(a<10) {
            System.out.print(a+" ");
            a++;
        } // 실행회수 10번
        System.out.println();
        a=0;
        do {
            System.out.print(a+" ");
            a++;
        } while(a<10); //실행회수 10번		
    }	
}	
