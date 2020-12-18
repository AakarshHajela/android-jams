import java.util.Scanner
import java.lang.Math.pow

fun power(a:Int,b:Int): Int
{
    var pow=1;
    for(i in 1..b)
        pow*=a;
    return pow;
}

fun CheckArmstrong(a:Int)
{
    var n = a;
    var m =a;
    var Sum=0;
    var dig=0;
    while(m!=0)
    {
        m/=10;
        dig++;
    }
    while(n!=0)
    {
        var num:Int = n%10;
        Sum+=power(num,dig);
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
