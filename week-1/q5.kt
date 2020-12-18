fun check(a:Int, b:Int, c:Int)
{
    if(a==b && b==c)
    	println("The triangle is Equilateral");
    else if((a==b && a!=c) || (b==c && a!=b) || (a==c && a!=b))
    	println("The triangle is Isosceles");
    else
    	println("The triangle is Scalene");
}
fun main(args: Array<String>)
{
    print("Enter the first side:");
    val side1:Int = Integer.parseInt(readLine());
    print("Enter the second side:");
    val side2:Int = Integer.parseInt(readLine());
    print("Enter the third side:");
    val side3:Int = Integer.parseInt(readLine());
    check(side1,side2,side3);
}
