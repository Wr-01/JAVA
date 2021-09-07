package string.method;

import java.util.Locale;

/**
 * @Author: 19261
 * @Date: 2021/9/7 18:27
 */
public class StringPractice {

    public static void main(String[] args) {
        //字符串常量池  .intern()：手动将创建的String对象添加到常量池中，并返回常量对象地址
        String s1="hehe";
        String s2="hehe";
        String s3=new String("hehe");
        String s4=new String("hehe");
        String s5=new String("hehe").intern();
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s3==s4);
        System.out.println(s2==s5);
        System.out.println(s4==s5);
    }

    public static void main5(String[] args) {
        //字符串与字符、字符数组之间的转化
        String s="abcd";
        char a=s.charAt(0);
        char b=s.charAt(1);
        System.out.println(a);
        System.out.println(b);
        char c='h';
        char h='e';
        String str1=String.valueOf(c)+String.valueOf(h);
        String str2=Character.toString(c);
        System.out.println(str1);
        System.out.println(str2);
        char[] ch=s.toCharArray();
        ch[1]='x';
        for(char v:ch){
            System.out.println(v);
        }
        String ss=String.valueOf(ch);
        System.out.println(ss);

        //字符串大小写之间的转化
        String u=new String("abc");
        String l="ABC";
        System.out.println(u.toUpperCase());
        System.out.println(l.toLowerCase(Locale.ROOT));
    }

    public static void main4(String[] args) {
        //字符串与数值的相互转化
        int m=1024;
        double n=12.34;
        String s1 = String.valueOf(m);
        String s2 = Integer.toString(m);
        String s3 = String.valueOf(n);
        String s4=Double.toString(n);
        String s5=String.valueOf("false"+23);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        String str1="123";
        String str2=new String("11.22");
        int x=Integer.parseInt(str1);
        double y=Double.parseDouble(str1+str2);
        System.out.println(x);
        System.out.println(y);
    }

    public static void main3(String[] args) {
        //字符串查找
        String str="hello world!";
        String s="llo";
        char ch='l';
        System.out.println(str.charAt(1));
        System.out.println(str.indexOf('d'));
        System.out.println(str.indexOf('l',5));
        System.out.println(str.indexOf(s));
        System.out.println(str.indexOf(s,1));
        System.out.println(str.lastIndexOf(ch));
        System.out.println(str.lastIndexOf(ch,4));
        System.out.println(str.lastIndexOf(s));
        System.out.println(str.lastIndexOf(s,6));
    }

    public static void main2(String[] args) {
        //字符串比较
        String a="hhh";
        String b="hhh";
        String c="lll";
        String d=new String("hhh");
        String e=new String("ccc");
        String f=new String("ccc");
        //比较字符串内容是否相等 方法1： 字符串1.equals(字符串2)
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(c.equals(e));
        System.out.println(a.equals(d));
        System.out.println(e.equals(f));
        System.out.println("ccc".equals(e));

        //比较字符串内容是否相等 方法2： 字符串1.compareTo(字符串2) 利用字典序比较 相同返回0；字母序列在前返回负数，反之正数
        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(c));
        System.out.println(e.compareTo(c));
        System.out.println(a.compareTo(d));
        System.out.println(e.compareTo(d));
        System.out.println(e.compareTo(f));
        System.out.println("zzz".compareTo(f));

        //比较字符串内容 不区分大小写；字符串1.compareToIgnoreCase(字符串2)
        String s1="aa";
        String s2="AA";
        String s3=new String("cc");
        String s4=new String("dd");
        String s5=new String("EE");
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s1.compareToIgnoreCase(s3));
        System.out.println(s3.compareToIgnoreCase(s4));
        System.out.println(s5.compareToIgnoreCase(s4));
        System.out.println("sss".compareToIgnoreCase(s4));
    }

    public static void main1(String[] args) {
        //Java中字符串的三种构造方法：
        String s1="aaa";
        String s2=new String("bbb");
        char[] string={'c','c','c'};
        String s3=new String(string);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //字符串比较
        String a="hhh";
        String b="hhh";
        String c="lll";
        String d=new String("hhh");
        String e=new String("hhh");
        //字符串是引用类型；比较字符串引用的对象/保存对象的地址 是否相同 : "=="
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a==d);
        System.out.println(e==d);

        String str=new String("hello").intern();
        System.out.println(str=="hello");

//        String a="hehe";
//        String b="haha";
//        System.out.println(a==b);
//        System.out.println(a.equals(b));
//
//        String s=new String();
//        if(s.equals("heh")){
//            System.out.println("相等");
//        }else{
//            System.out.println("不相等");
//        }
    }

}
