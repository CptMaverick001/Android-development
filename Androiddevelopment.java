fun main()
{ 
println("Enter no. 1:")
var num1= Integer.parseInt(readLine())
println("Enter no. 2:")
var num2= Integer.parseInt(readLine())

var a= num1+num2
var s= num1-num2
var m= num1*num2
var d= num1/num2
var mod= num1%num2

println("Vidhi 9");
println("Addition=$a")
println("Subtraction=$s")
println("Multiplication=$m")
println("Division=$d")
println("Modulus=$mod")

}



##Write a program to accept two numbers from the user and swap the number
import java.util.*

fun main()
{
println("Vidhi Bora 9")
var reader=Scanner(System.`in`)
println("Enter two numbers: ")
var n1=reader.nextInt()
var n2=reader.nextInt()

println("Numbers before swapping:")
println("n1=$n1 \t n2=$n2")

var temp=n1
    n1=n2
    n2=temp

println("Numbers after swapping:")
println("n1=$n1 \t n2=$n2")
}


##Write a program to create an array of 10 integer numbers and display the first and the last number from array

fun main()
{
println("Vidhi Bora 9")
var id= arrayOf(1,2,3,4,5,6,7,8,9,10)
var firstid=id[0]
var lastid=id[id.size-1]

println("First No=$firstid")
println("Last No=$lastid")

}


##Write a program to accept a number from the user and check whether it is even or odd

import java.util.*

fun main()
{
println("Vidhi Bora 9")
var reader= Scanner(System.`in`)
println("Enter a number:")
var num= reader.nextInt()

if(num%2==0)
    {
println("$num is even")
    }
else
println("$num is odd")
}


##Write a program to accept two numbers from user and display the larger number

import java.util.*

fun main()
{
println("Vidhi Bora 9")
var reader= Scanner(System.`in`)
println("Enter number 1:")
var num1= reader.nextInt()
println("Enter number 2:")
var num2= reader.nextInt()
    if(num1> num2)
    {
println("$num1 is greater than $num2")
    }
    else
println("$num2 is greater than $num1")
}


##Write a program to accept number from user and check whether it is positive or negative


import java.util.*

fun main()
{
println("Vidhi Bora 10")
var reader= Scanner(System.`in`)
println("Enter the number:")
var num= reader.nextInt()
    if(num>0)
    {
println("$num is positive")
    }
    else
println("$num is negative")
}


##Write a program to accept two numbers and swap the number without 3rd variable.
import java.util.*

fun main()
{
println("Vidhi Bora 09")
var reader= Scanner(System.`in`)
println("Enter TWO numbers:")
var a = reader.nextInt()
var b = reader.nextInt()

println("Before Swapping")
println("Number 1: $a")
println("Number 2: $b")

a = a + b;
b = a - b;
a = a - b;

println("After Swapping")
println("Number 1: $a")
println("Number 2: $b")

}

##Write a program to accept a character from user and check whether it is vowel or consonant
import java.util.*
fun main() {
    println("Vidhi Bora 09")
    var scanner = Scanner(System.`in`)
	print("Enter Character : ")
    var c = scanner.next()[0]

    when (c) {
        'a','e' ,'i' ,'o' ,'u','A','E','I','O','U' -> println("The given character $c is vowel")
        else -> println("The given character $c is consonant")
    }
}


##Write a program to accept a number from user and display the reverse of that number

import java.util.*
fun main()
{
	println("Vidhi Bora 09")
	var reader=Scanner(System.`in`)
	println("Enter a number")
	var num= reader.nextInt()

	var rev=0
	while(num>0){
	var r = num % 10
	rev = rev * 10 + r
	num = num / 10
	}
	println("Reverse = $rev")
}


##Write a program to accept a number from user and check whether it is palindrome or not
import java.util.*
fun main()
{
	println("Vidhi Bora 09")
	var reader=Scanner(System.`in`)
	println("Enter a number")
	var num= reader.nextInt()
	
	var temp=num
	var rev=0

	while(num>0){
	var r = num % 10
	rev = rev * 10 + r
	num = num / 10
	}
	if(temp==rev){
	println("It is a palindrome")
	}
	else{
	println("It is a palindrome")
	}
}

##Write a program to accept a number from user and display factorial of that number

import java.util.*
fun main()
{
	println("Vidhi Bora 09")
	var reader=Scanner(System.`in`)
	println("Enter a number")
	var num= reader.nextInt()

	var f=1
	for(i in 1..num)
	{
		f=f*i
		println(f)
	}
	println("The factorial of $num is $f")

}



##Write a program to accept a number from user and display and check whether it is Armstrong number or not (153 is an Armstrong number).

import java.util.*
fun main() 
{
println("Vidhi Bora 09")
var reader = Scanner(System.`in`)
println("Enter the number:")
var number = reader.nextInt()
    var originalNumber: Int
    var remainder: Int
    var result = 0
    originalNumber = number

    while (originalNumber != 0) {
        remainder = originalNumber % 10
        result += Math.pow(remainder.toDouble(), 3.0).toInt()
        originalNumber /= 10
    }

    if (result == number)
        println("$number is an Armstrong number.")
    else
        println("$number is not an Armstrong number.")
}

##Write a program to accept two numbers from user and display GCD and LCM of that number
import java.util.*
fun main()
{
	println("Vidhi Bora 09")
	var reader=Scanner(System.`in`)
	println("Enter Two number")
	var n1= reader.nextInt()
	var n2= reader.nextInt()

	var t1=n1
	var t2=n2
	var gcd = 0
	var lcm = 0

	while(n1 != n2)
	{
	if(n1>n2){
		n1= n1-n2
		gcd= n1
	}
	else{
		n2= n2-n1
		gcd= n2
	}
}
	lcm= (t1*t2)/gcd
	println("GCD= $gcd")
	println("LCM= $lcm")

}


##Write a program to accept a number from user and check whether it is prime number or not
import java.util.*

fun main() 
{
println("Vidhi bora 09")
var reader = Scanner(System.`in`)
println("Enter the number:")
var num = reader.nextInt()
var flag = false 

for(i in 2..num/2){
if(num%1==0){
	flag == true
	break
	}
}
if(!flag)
println("$num is prime")
else
println("$num is not prime")
}


##Declare a function which returns multiplication of two numbers
fun mul(a:Int,b:Int):Int{
	return a*b
}
fun main()
{
	var x=5
	var y=2
	println("Multiplication is:")
	println(mul(x,y))
	println("Vidhi Bora 09")
}

##Declare a student function which returns details of a student.
fun student(Name:String,Rollno:Int,Grade:Char)
{
	println("Name of the student:$Name")
	println("Roll no of the student:$Rollno")
	println("Grade of the student:$Grade")
}
fun main()
{
	var Name="Vidhi Bora"
	var Rollno=9
	var Grade='O'
	student(Name,Rollno,Grade)
	println("Vidhi Bora 09")
}


##Demonstrate implicit and explicit array.
(IMPLICIT ARRAY)

fun main()
{
	val arr=arrayOf(1,2,3,4,5)
	println("Length Of Array=" +arr.size)
	for(i in 0..arr.size-1)
	{
		print(" "+arr[i])
	}
	println()
	println("Vidhi Bora 09");
}


##EXPLICIT ARRAY:Interger Datatype

fun main()
{
	val arr1=arrayOf<Int>(10,20,30,40,50)
	println("Length Of Array="+arr1.size)
	for(i in 0..arr1.size-1)
	{
		print(" "+arr1[i])
	}
	println()
	println("Vidhi Bora 09");
}


##EXPLICIT ARRAY:String Datatype

fun main()
{
val arr1=arrayOf<String>("RED","GREEN","BLUE","YELLOW","PINK","GOLD")
	println("Length Of Array=" +arr1.size)
	for(i in 0..arr1.size-1)
	{
		print(" " +arr1[i])
	}
println()
	println("Vidhi Bora 09");
}


##Write a program to create an array of 10 integers, display all the elements and also display all the even numbers from array list

fun main()
{
	val arr=arrayOf<Int>(1,2,3,4,5,6,7,8,9,10)
	println("Length Of Array=" +arr.size)
	println("Array Elements Are:");
	for(i in 0..arr.size-1)
	{
		print(" "+arr[i])
	}
	println()
	println("Even Numbers Are:")
	for(i in 0..arr.size-1)
	{
		if(arr[i] % 2 == 0)
		{
			print(" " +arr[i])
		}
	}
println()
	println("Vidhi Bora 09");
}


##Use factory method to create array

fun main()
{
	val arr=charArrayOf('A','B','C','D','E','F','G')
	println("Length Of Char Array=" +arr.size)
	for(i in 0..arr.size-1)
	{
		print(" " +arr[i])
	}
	val num=intArrayOf(1,2,3,4,5,6,7,8,9,10)
	println()
	println("Length Of Number Array=" +num.size)
	for(i in 0..num.size-1)
	{
		print(" "+num[i])
	}
println()
	println("Vidhi Bora 09");
}


##Write a program to create a character array with 10 characters and display the vowels from the array.

fun main()
{
	val arr=charArrayOf('A','a','C','i','e','F','o','E','l','p','u')
	println("Length Of Char Array=" +arr.size)
	println("THE VOWELS ARE:");
	for(i in arr)
	{
		if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u')
		{
			print(" "+i)
		}
	}
	println()
	println("Vidhi Bora 09");
}


##

