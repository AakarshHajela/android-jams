import java.util.Scanner

fun Pyramid(a:Int)
{
    for(i in 1..a)
    {
        for(j in 1..i)
            print("#");
        println("");
    }
}

fun main(args: Array<String>)
{
    val input = Scanner(System.`in`);
    print("Enter the number:");
    val a:Int = input.nextInt();
    println("");
    Pyramid(a);
}
