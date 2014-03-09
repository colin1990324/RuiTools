package rui.tools.basic;

import java.util.regex.Pattern;

/**
 * Class PatterMatcher can help do regular pattern matching.
 * using Regular Expression
 */
public class PatternMatcher {
	public static final int EDUCATIONAL = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test
//		System.out.println("test for matchEmailPattern"); 
//		System.out.println("abc@g.com.cn"+" is email= "+PatternMatcher.matchEmailPattern("abc@g.com.cn"));
//		System.out.println("a+c@d.com"+" is email= "+PatternMatcher.matchEmailPattern("a+c@d.com"));
//		System.out.println("a+@d.com"+" is email= "+PatternMatcher.matchEmailPattern("a+@d.com"));
//		System.out.println("a--c@d.org"+" is email= "+PatternMatcher.matchEmailPattern("a--c@d.org"));
//		System.out.println("a-c@d.org"+" is email= "+PatternMatcher.matchEmailPattern("a-c@d.org"));
//		System.out.println("a.b.c@mail.d.cn"+" is email= "+PatternMatcher.matchEmailPattern("a.b.c@mail.d.cn"));
//		System.out.println("rw2z5@mail.missouri.edu"+" is email= "+PatternMatcher.matchEmailPattern("rw2z5@mail.missouri.edu"));
//		System.out.println("a.org"+" is email= "+PatternMatcher.matchEmailPattern("a.org"));
//		System.out.println("www.google.com"+" is email= "+PatternMatcher.matchEmailPattern("www.google.com"));
//		System.out.println("\ntest for matchEducationEmailPattern"); 
//		System.out.println("abc@g.com.cn"+" is education email= "+PatternMatcher.matchEmailPattern("abc@g.com.cn",PatternMatcher.EDUCATIONAL));
//		System.out.println("a+c@d.com"+" is education email= "+PatternMatcher.matchEmailPattern("a+c@d.com",PatternMatcher.EDUCATIONAL));
//		System.out.println("a--c@d.org"+" is education email= "+PatternMatcher.matchEmailPattern("a--c@d.org",PatternMatcher.EDUCATIONAL));
//		System.out.println("a.b.c@hust.edu.cn"+" is education email= "+PatternMatcher.matchEmailPattern("a.b.c@hust.edu.cn",PatternMatcher.EDUCATIONAL));
//		System.out.println("rw2z5@mail.missouri.edu"+" is education email= "+PatternMatcher.matchEmailPattern("rw2z5@mail.missouri.edu",PatternMatcher.EDUCATIONAL));
//		System.out.println("a.org"+" is education email= "+PatternMatcher.matchEmailPattern("a.org",PatternMatcher.EDUCATIONAL));
//		System.out.println("www.google.com"+" is education email= "+PatternMatcher.matchEmailPattern("www.google.com",PatternMatcher.EDUCATIONAL));
//		System.out.println("\ntest for strong password"); 
//		System.out.println("password"+" is strong password= "+PatternMatcher.matchStrongPassword("password"));
//		System.out.println("Abcd"+" is strong password= "+PatternMatcher.matchStrongPassword("Abcd"));
//		System.out.println("Abcd#"+" is strong password= "+PatternMatcher.matchStrongPassword("Abcd#"));
//		System.out.println("ABCDd11@!"+" is strong password= "+PatternMatcher.matchStrongPassword("ABCDd11@!"));
//		System.out.println("Abcd#11111111111111111111111"+" is strong password= "+PatternMatcher.matchStrongPassword("Abcd#11111111111111111111111"));
//		System.out.println("Ab#1"+" is strong password= "+PatternMatcher.matchStrongPassword("Ab#1"));
	}
	/**
	 * matchEmailPattern.
	 * check email format like xxxx@xxx.com; yyy@yyy.edu
	 * @param s
	 * @return true if matches then false
	 */
	public static boolean matchEmailPattern(String s){
		try{
			return Pattern.matches("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*",s);
		}catch(NullPointerException e){
			System.out.println("input String is null");
		}
		return false;
	}
	/**
	 * matchEmailPattern.
	 * check educational email format only like xxxx@xxx.edu.cn; yyy@yyy.edu
	 * @param s
	 * @param flag
	 * @return true if matches then false
	 */
	//email end with .edu and .edu.cn
	public static boolean matchEmailPattern(String s,int flag ){
		if(flag==PatternMatcher.EDUCATIONAL){
			return Pattern.matches("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*",s)
        		&& (Pattern.matches(".+\\.edu$",s) || Pattern.matches(".+\\.edu\\.cn$",s));
		}else
			return false;
	}
	/**
	 * matchStrongPassword.
	 * strong password satisfaction
	 * @param s
	 * @return true if matches then false
	 */
	public static boolean matchStrongPassword(String s){
		return Pattern.matches("^(?=.*\\d)(?=.*[a-zA-Z])(?=.*[\\W])[\\da-zA-Z\\W]{8,}$",s);
	}
}
