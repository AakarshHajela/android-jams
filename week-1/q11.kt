import java.util.Scanner

fun CheckArmstrong(a:Int)
{
    var n = a;
    var Sum=0;
    while(n!=0)
    {
        var num = n%10;
        Sum+=(num*num*num);
        n/=10;
    }
    if(Sum == a)
        println("$a is an Armstrong Number");
    else
        println("$a is NOT an Armstrong Number");
}

fun main(args: Array<String>)
{
    val input = Scanner(System.`in`);
    print("Enter the number:");
    val a:Int = input.nextInt();
    CheckArmstrong(a);
}
