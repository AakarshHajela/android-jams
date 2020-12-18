import java.util.Scanner

fun fact(a:Int): Int
{
    if(a == 0)
        return 1;
    else
        return a*fact(a-1);
}

fun main(args: Array<String>)
{
    val input = Scanner(System.`in`);
    print("Enter the number:");
    val a:Int = input.nextInt();
    var Sum=0;
    for(i in 1..a-1)
    {
        Sum+=fact(i);
        print("$i!+");
    }
    Sum+=fact(a)
    print("$a! = $Sum");
}
