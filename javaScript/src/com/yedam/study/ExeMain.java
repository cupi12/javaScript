package com.yedam.study;

import net.sf.json.JSONObject;
import com.yedam.study.Sample;

public class ExeMain {
	public static void main(String[] args) {
		int result = Sample.sum(3, 5);
		JSONObject obj = new JSONObject();
		obj.put("s1", "hello" );
		System.out.println(result);
	}
}
