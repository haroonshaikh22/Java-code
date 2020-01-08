public static void main(string []args){
	system.out.println("hello world");// this is comment
	
	int myNum = 15;// crete a variable to store integer value
	system.out.println(myNum);
	
	String myName = "haroon";//crete a vqariable to store strintg value
	system.out.println(myName);
	
	// you can declare variable without assign value 
	int myNum;
	myNum = 15;
	system.out.println(myNum);
	
	//overwrite the value
	int myNum = 15;
	myNum = 20;//now the value 20
	system.out.println(myNum);
	
	//other other data type
	int myNum = 15;
	float myFloat = 5.5;
	string myString = "haroon";
	char myChar = 'a';
	boolean mybooolean = true;
	
	//to add text and variable 
	String myName = "haroon";
	system.out.println("hello"+myName);
	
	
	 //to add variable to variable
	 string firstname = "haroon";
	 string lastname = "shaikh";
	 srting fullname = firstname + last lastname;
	 system.out.println(fullname);
	 
	 //to add integer to integer
	 int x = 5;
	 int y = 6;
	 system.out.println(x+y);//print the value of x+you
	 
	 
	 //declare many variable
	 int x = 5;y = 6;z = 7;
	 system.out.println(x+y+z);
	 
	 
	//primitive data type...
	//byte -128 to 127
	byte myNum=100;
	system.out.println(myNum);
	
	//short -32768 to 32767
	short myNum=30000;
	
	//int -2147483648 to 2147483647
	int myNum=2000000000;
	
	//long -9223372036854775808 to 9223372036854775807
	long myNum=900000000000000;
	
	//float(f) upto 7 digit
	float myNum=1.000000(f);
	
	//double (d)upto 15 dgit
	double muNum=1.00000000000011d;
	
	//type casting converting primitive data type
	//wideing casting convert small tpye to large type
	
	public class MyClass{
	public static void main(string[]arg){
		int myInt=15;
		double myDouble=myInt;//automatic casting int into double
		system.out.println(myInt);//output:-15
		system.out.println(myDouble);//output:-15.0
	}
	}
	
	//narrow casting convert large type into small type
     public class MyClass{
         public static vpoid main(string[]args){
        double myDouble=9.78;
        int myInt=(int) myDouble;// manually casting double into int
        system.out.println(myDouble);//output:-9.78
        system.put.println(myInt);//output:-9
		 }
	 }

// java string is used to sorting text
public class MyClass{
public static void main(string[]args){
String myName = "haroon";// 
system.out.println(myName);

//length method
String txt = "abcdefghinkmnlopqrstwxyz";
system.out.println("this is length of string" +txt.length()); //output= 26

//Uppercase and lowercase
String txt = "hello world";
system.out.println(txt.toUpperCase()); // print string in uppercase
system.out.println(txt.toLowerCase()); //print string in lower case

//concatenation to join two string
String firstname = "haroon";
String lastname = "shaikh";
system.out.println(firstname.concat()lastname);// concat() joing firstname and lastname



}
}

public class MyClass{
	public static void main(string[]args){
		boolean isJavaFun = true;
		boolean isFishTaste = false;
		system.out.println(isJavaFun); //output= true
		system.out.println(isFishTaste); //output= false
		
		// take two int check boolean 
		int x = 10;
		int y = 5;
		system.out.println(x>y); // output true because x is greater then y 
		 // easy check boolean
		 system.out.println(10>5);// output is true 
		 
	}
}
/*if condition statements(if the contions is true)
we test two values to find out if 20 is greater than 18. If the condition is true, print some text*/
public class MyClass{
	public static void main(string[]args){
		if (20>10){
			system.out.println("20 is greater then 10");
		}
		
		int x = 5;
		int y = 3;
		if (x>y){
			system.out.println("x is greater then y");
		}
	}
}
// if else statements if the condition is false
public class MyClass{
	public static void main(string[]args){
		int time = 20;
		if (time<18){
			system.out.println("good days");// this is first condition
		}else{
			system.out.println("good evening");// this is second condition
			// output = good evening because 1st condition is false
		}
	}
}


// else if statements
public class MyClass{
	public static void main(string[]args){
		int time=22;
		if(time<10){
			system.out.println("good morning");// first condition is false
		}else if(time<20){
			system.out.println("good days");// second contion is false
		}else{
			system.out.println("good evening");
			//output = good evening
		}
	}
}

// switch statements
public class Myclass{
	public static void main(string[]args){
		int day = 3;
		switch(day){
			case 1:// this is case 1 of switch statements
			system.out.println("monday");
			break;// this is break to stop execution of code
			
			case 2:
			system.out.println("tuesday");
			break;
			
			case 3:
			system.out.println("wednesday");
			break;
			
			case 4:
			system.out.println("thursday");
			break;
			
			default:
			system.out.println(" not found");// this is for default output
		}
	}
}

// while loop statements
public class MyClass{
	public static void main(string[]args){
		int i=0;  //variable statement1
		while(i<5){ // while condition statement2
			system.out.println(i);
			i++; // increase the value by 1 statement3
		}
	}
}

// do while loop statements
public cladss MyClass{
	public static void main(string[]args){
		int i = 0;
		do{
			system.out.println(i);// first execute code block without check conditon
		}
		while(i<5); // check the condition as long as conditon is true 
		i++; // increment value by 1 till the condition is true
	}
}

// for loop condition statement 
public class MyClass{
	public static void main(string[]args){
	for(int i = 0; i<5; i++){   //(statement1;statement2;statement3)
	system.out.println(i);// code of block print 
	}
	}
}

// break statement in loop 
public class MyClass{
	public static void main(string[]args){
		for(int i = 0; i<10; i++){ //for statement
			if(i==4){ //if this condition is true take break statements
				break;
			}
			system.out.println(i);// code of block
		}
	}
}

// continue statement in loop if condition occur  continue with next itration
public class MyClass{
	public static void main(string[]args){
		for(int i = 0; i<10; i++){
			if(i==4){  // if this condition is occur dnot break continue with next itration
				continue;
			}
			system.out.println(i);
		}
	}
}

// array in java
public class MyClass{
	public static void main(string[]args){
		String[] car = {"volvo","bmw","opel"}; // string array
		system.out.println(car);
		
		int[] myNum = {12,13,14,15}; // integer array
		system.out,.println(myNum);
		
		system.out.println(car[0]); // access array element by index number
		
		car[1] = "nissan"; //change array elements
		
		system.out.println(car.length);// print array length output= 3
	}
}

// array on loop
public class MyClass{
	public static void main(String[] args){
		String[] = {"volvo","bmw","nissan","opel"};
		for(int i = 0; i < car.length; i++){
			system.out.println(car[i]);
		}
	}
}



		
		