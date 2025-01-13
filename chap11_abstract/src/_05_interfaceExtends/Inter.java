package _05_interfaceExtends;
/*
 * interface 사이에서도 상속가능, 다중상속 가능
 */
interface Inter1 {
	int method1();
}

interface Inter2 {
	int method2();
}
// 다중 클래스 및 인터페이스가 하나에 들어 있을경우 퍼블릭은 한개만 존재해야함 
public interface Inter extends Inter1, Inter2{
	int method();
}
