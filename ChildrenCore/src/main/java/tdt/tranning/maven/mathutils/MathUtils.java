package tdt.tranning.maven.mathutils;

import org.apache.commons.lang3.StringUtils;

public class MathUtils {
	public static void main(String[] args) {
		String text1 = "0123a4";
		String text2 = "01234";

		boolean result1 = StringUtils.isNumeric(text1);
		boolean result2 = StringUtils.isNumeric(text2);

		System.out.println(text1 + " is a numeric ? " + "\n" + result1);
		System.out.println("-----------------------------------------");
		System.out.println(text2 + " is a numeric ? " + "\n" + result2);

	}
}
