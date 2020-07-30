class rationalNum(n:Int,d:Int)
{
	require(d>0,"d must be greater than zero");
    def numer=n/gcd(n,d);
    def denom=d/gcd(n,d);
    def this(n:Int)=this(n,1);
    private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b);
    def +(r:rationalNum)=new rationalNum(this.numer*r.denom + this.denom*r.numer,this.denom*r.denom);
    def neg=new rationalNum(-this.numer,this.denom);
    def -(r:rationalNum)=this+r.neg;
    override def toString= numer+"/"+denom;
}

object Q2
{
	def main(args:Array[String])
	{
		println("-------------------------------------");
		println("\tSubstraction-->X-Y-Z");
		println("-------------------------------------\n");

		val rat1=new rationalNum(3,4);
		val rat2=new rationalNum(5,8);
		val rat3=new rationalNum(2,7);
		val rat4=rat1-rat2-rat3;
		println("X-Y-Z = "+rat4);

		println("\n-------------------------------------");
	}

}
