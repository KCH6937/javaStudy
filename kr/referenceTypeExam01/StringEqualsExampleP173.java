package kr.referenceTypeExam01;

/* new는 객체 생성 연산자이며, 생성한 객체는 힙 영역에 저장 및 생성됩니다.
   * '==' 연산자는 변수의 값이 같은지, 아닌지를 조사하지만 참조 타입 변수들 간의 연산 시 동일한 객체를 참조하는지를 알아볼 때 사용합니다.  */
public class StringEqualsExampleP173 {
    public static void main(String[] args) {
        String strVar1 = "신민철";
        String strVar2 = "신민철";
        
        if(strVar1 == strVar2) {
            System.out.println("strVar1과 strVar2는 참조가 같음"); // O
        } else {
            System.out.println("strVar1과 strVar2는 참조가 같음");
        }
        
        
        if(strVar1.equals(strVar2)) {
            System.out.println("strVal1과 strVar2는 문자열이 같음"); // O
        }
        
        String strVar3 = new String("신민철");    // strVar3와 strVar4는 서로다른 객체를 참조
        String strVar4 = new String("신민철");    //
        
        if(strVar3 == strVar4) {
            System.out.println("strVar3과 strVar4는 참조가 같음");
        } else {
            System.out.println("strVar3과 strVar4는 참조가 다름"); // O
        }
        
        if(strVar3.equals(strVar4)) {
                    System.out.println("strVal3과 strVar4는 문자열이 같음"); // O
        }
    }
}