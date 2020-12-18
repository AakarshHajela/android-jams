fun check(n: Int): Int
{
    if(n%5 == 0 && n%11 == 0)
    	return 1;
    else
    	return 0;
}

fun main()
{
    val num = 55;
    if(check(num) == 1)
    	println("$num is divisible by 5 and 11");
    else
    	println("$num is NOT divisible by 5 and 11");
}
