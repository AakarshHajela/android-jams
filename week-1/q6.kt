import java.util.Scanner

fun main(args: Array<String>)
{
    val input = Scanner(System.`in`);
    print("Enter the character:");
    val a:Char = input.next().single();
    if((a in 'a'..'z') || (a in 'A'..'Z'))
        println("$a is an Alphabet");
    else
        println("$a is NOT an Alphabet");
}
