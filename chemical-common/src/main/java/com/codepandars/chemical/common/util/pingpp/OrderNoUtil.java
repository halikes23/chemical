package com.codepandars.chemical.common.util.pingpp;

import java.util.Date;

public class OrderNoUtil {

	public static String build(){
		return new Date().getTime() + Main.randomString(7);
	}
	
}
