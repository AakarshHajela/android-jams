fun max(a: Int,b: Int,c: Int):Int
{
    if(a>b && a>c)
    	return a;
    else if(b>a && b>c)
    	return b;
    else
    	return c;
}
fun main() {
    val a=5;
    val b=8;
    val c=3;
    val max = max(a,b,c);
    print(max);
}
