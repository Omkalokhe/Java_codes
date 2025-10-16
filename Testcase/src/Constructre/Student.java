package Constructre;

public class Student {
	
	Student(byte b){
		System.out.println("Byte type parametrize const value is "+b);
	}
	Student(byte b,short s){
		System.out.println("2 parametre const"+b+" "+s );
	}
	Student(byte b,short s,int i){
		
	}
	Student(byte b,short s,int i,long l){
		
	}
	Student(byte b,short s,int i,long l,float f){
		
	}
	Student(byte b,short s,int i,long l,float f,double d){
		
	}
	Student(byte b,short s,int i,long l,float f,double d,String str){
		
	}
	Student(byte b,short s,int i,long l,float f,double d,String str,boolean t){
		
	}
	Student(byte b,short s,int i,long l,float f,double d,String str,boolean t,char c){
		
	}
	public static void main(String[] args) {
		byte b=10;
		short st=11;
		Student s=new Student(b);
		Student s1=new Student(b,st);
		Student s3=new Student(b,st,12);
		Student s4=new Student(b,st,12,1462189512123l);
		Student s5=new Student(b,st,12,1462189512123l,1.23f);
		Student s6=new Student(b,st,12,1462189512123l,1.23f,1.48456);
		Student s7=new Student(b,st,12,1462189512123l,1.23f,1.48456,"ABC");
		Student s8=new Student(b,st,12,1462189512123l,1.23f,1.48456,"ABC",true);
		Student s9=new Student(b,st,12,1462189512123l,1.23f,1.48456,"ABC",true,'a');
		
	}

}
