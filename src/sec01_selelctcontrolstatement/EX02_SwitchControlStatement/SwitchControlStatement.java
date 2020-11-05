package sec01_selelctcontrolstatement.EX02_SwitchControlStatement;

/*switch 선택제어문(break 미포함, break 포함, if문 변환)*/

public class SwitchControlStatement {
    public static void main(String[] args) {		
        //#1. break이 포함되지 않은 경우
        int value1 = 2;
        switch(value1) {
        case 1:
            System.out.println("A");
        case 2:
            System.out.println("B"); 	//점프 후 계속 실행
        case 3:
            System.out.println("C");
        default:
            System.out.println("D");
        }//BCD
        System.out.println();
        
        //#2. break이 포함된 경우
        int value2 = 2;
        switch(value2) {
        case 1:
            System.out.println("A");
            break;
        case 2:
            System.out.println("B"); 	//실행 후 탈출
            break;
        case 3:
            System.out.println("C");
            break;
        default:
            System.out.println("D");
        }//B
		
        System.out.println();		
        
        //@if - else if - else 구문으로 변환
        if(value1 == 1) {
            System.out.println("A");
        }
        else if(value1 == 2) {
            System.out.println("B");	//실행 후 탈출
        }
        else if(value1 == 3) {
            System.out.println("C");
        }
        else {
            System.out.println("D");
        }
    }
}



























