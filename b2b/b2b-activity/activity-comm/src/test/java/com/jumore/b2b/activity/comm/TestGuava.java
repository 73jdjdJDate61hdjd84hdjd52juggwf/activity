package com.jumore.b2b.activity.comm;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import com.google.common.base.CaseFormat;
import com.google.common.base.CharMatcher;
import com.google.common.base.Charsets;
import com.google.common.base.Optional;
import com.google.common.primitives.Bytes;

public class TestGuava {

	public static void main(String[] args) {

		//testStr();
		
		testOptionl();
		
		
	}
	public static void testOptionl(){
		List<Long> list=new ArrayList<Long>();
		list.add(1L);
		list.add(null);
		System.out.println(list.size());

		Optional<List<Long>> possible  =Optional.of(list);
		System.out.println(possible.isPresent());
		System.out.println(possible.get().size());
		System.out.println(possible.orNull());
	}

	private static void testStr() {
		String str = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "CONSTANT_NAME");
		System.out.println(str);

		str = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "CONSTANT__NAME");
		System.out.println(str);

		str = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "_CONSTANT_NAME");
		System.out.println(str);

		str = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "_CONSTANT_NAME_");
		System.out.println(str);
		
		
		
		//LOWER_CAMEL	lowerCamel
		//LOWER_HYPHEN	lower-hyphen
		//LOWER_UNDERSCORE	lower_underscore
		//UPPER_CAMEL	UpperCamel
		//UPPER_UNDERSCORE	UPPER_UNDERSCORE
		
		
		str = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_HYPHEN, "_CONSTANT_NAME_");
		System.out.println(str);
		
		str = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_UNDERSCORE, "_CONSTANT_NAME_");
		System.out.println(str);
		
		str = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, "_CONSTANT_NAME_");
		System.out.println(str);
		
		str = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_UNDERSCORE, "_CONSTANT_NAME_");
		System.out.println(str);
		
		String string=" HELL_0W_2O_3R_4L5-D  ";
		String noControl = CharMatcher.JAVA_ISO_CONTROL.removeFrom(string); //移除control字符
		String theDigits = CharMatcher.DIGIT.retainFrom(string); //只保留数字字符
		String spaced = CharMatcher.WHITESPACE.trimAndCollapseFrom(string, ' ');
		//去除两端的空格，并把中间的连续空格替换成单个空格
		String noDigits = CharMatcher.JAVA_DIGIT.replaceFrom(string, "*"); //用*号替换所有数字
		String lowerAndDigit = CharMatcher.JAVA_DIGIT.or(CharMatcher.JAVA_LOWER_CASE).retainFrom(string);
		// 只保留数字和小写字母
		
		System.out.println(noControl);
		System.out.println(theDigits);
		System.out.println(spaced);
		System.out.println(noDigits);
		System.out.println(lowerAndDigit);
	}
	
	

}
