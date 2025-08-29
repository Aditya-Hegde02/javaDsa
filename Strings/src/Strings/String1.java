package Strings;

public class String1 {
	public static void main(String[] args) {
		//once String is declared cannot possible to change  because it is immutable
		String str=new String();
		StringBuffer sb=new StringBuffer();
		
		String s1="sapthagiri college of engineering";
		char ch=str.charAt(5);
		System.out.println("char:"+ch);
		int position =str.indexOf("n");
		String b=str.toUpperCase();
		String c=str.toLowerCase();
		String d=str.trim();
		String a=str.substring(1);
		String e=str.concat("college");
		
		sb.append("Sapthagiri");
		sb.append("NPS");
		sb.append("University");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}
