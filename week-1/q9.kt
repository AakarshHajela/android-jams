import java.util.Scanner

fun Sum(a:Int): Int
{
    var Sum=0;
    for(i in 1..a)
        if(i%2 == 0)
            Sum+=i;
    return Sum;
}

fun main(args: Array<String>)
{
    val input = Scanner(System.`in`);
    print("Enter the number:");
    val a:Int = input.nextInt();
    val SumEven = Sum(a);
    println("Sum of Even Numbers from 0 to $a = $SumEven");
}
