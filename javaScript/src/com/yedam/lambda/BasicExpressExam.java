package com.yedam.lambda;

//class RunnableImpl implements Runnable{
//
//	@Override
//	public void run() {
//		System.out.println("runnable call.");
//	}
//	
//}

interface MyInterface {
	void method(int a);
}

interface MyInterfaceReturn {
	int getResult(int a, int b);
}

public class BasicExpressExam {
	public static void main(String[] args) {

		MyInterfaceReturn mir = new MyInterfaceReturn() { //익명개체 구현해서 사용

			@Override
			public int getResult(int a, int b) {
				return a + b;
			}
		}; //END of MyInterfaceReturn()
		int result = mir.getResult(10, 20);
		System.out.println("result = " + result);
//============================================================================
		mir = (num1, num2) -> { //람다식으로 표현
			return num1 * num2;
		};
		result = mir.getResult(10, 20);
		System.out.println("result = " + result);
	}
	
//		Runnable runnable = new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("runnable call.");
//			}
//		}; //람다표현식 바꾸기 전,
//		runnable.run();
//
//		Runnable runnable1 = () -> {
//			System.out.println("runable lambda call.");
//		}; //람다 표현식으로 바꿈
//		runnable1.run();
//		Runnable runnable2 = () ->{
//			System.out.println("runnable lambda call2.");
//		};
//		runnable2.run();		
//	}
}
