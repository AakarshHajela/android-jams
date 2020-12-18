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
    val fact = fact(a);
    println("$a! = $fact");
}
