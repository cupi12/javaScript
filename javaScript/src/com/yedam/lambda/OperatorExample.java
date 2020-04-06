package com.yedam.lambda;

import java.util.function.IntBinaryOperator;

class IntBinaryClass implements IntBinaryOperator {

	@Override
	public int applyAsInt(int left, int right) {
		if (left >= right) {
			return left;
		} else {
			return right;
		}
	}

}// EndOf IntBinaryClass

public class OperatorExample {
	static int[] scores = { 92, 95, 87 };

	public static int maxOrMin(IntBinaryOperator oper) {
		int result = scores[0];
		for (Integer score : scores) {
			result = oper.applyAsInt(result, score);
		}
		return result;
	}// EndOf MaxOrMin()

	public static void main(String[] args) {
		IntBinaryClass iclass = new IntBinaryClass();
		// int result = iclass.applyAsInt(20, 30); 매개값으로 주기
		int result = maxOrMin(iclass);

		result = maxOrMin(new IntBinaryOperator() {
			@Override
			public int applyAsInt(int left, int right) { // 익명개체
				if (left >= right) {
					return right;
				} else {
					return left;
				}
			}
		});
		System.out.println("익명개체 결과값은 : " + result);
		result = maxOrMin((left, right) -> { // 람다식
			if (left >= right) {
				return right;
			} else {
				return left;
			}
		});
		System.out.println("람다식 결과값은 : " + result);
	}// EndOfMain
}
