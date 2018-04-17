package jdbc;

import java.math.BigDecimal;

public class Dog {
	public static void main(String[] args) {
		String a="anji";
		a="gopala";
		a.concat("m");
		System.out.println(a);
		StringBuffer sb=new StringBuffer();
		sb.append("phani");
		sb.append("12");
		
		System.out.println(sb);
		StringBuilder builder=new StringBuilder();
		builder.append("anji");
		builder.append("maddula");
		System.out.println(builder);
				String string=new String();
				string="vasavi";
				string+="maddula";
		System.out.println(string);
		
		BigDecimal bigDecimal = null;
		System.out.println(bigDecimal);
	}
}
