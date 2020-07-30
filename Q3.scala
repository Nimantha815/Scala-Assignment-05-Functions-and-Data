object Q3 {
  def main(args:Array[String])
  {
    class account(id:String,n:Int,b:Double)
    {
      val nic:String=id 
      val acnumber: Int = n 
      var  balance: Double = b
      
 
      override def toString =   "["+nic+":"+acnumber +":"+ balance+"]"
      
     def transfer(a:account,b:Double)=
       {
        this.balance=this.balance-b
        a.balance=a.balance+b
       }
    }
    val p=new account("986789052v",101,10000)
    val q=new account("962233457v",102,60000)
    val r=new account("714567899v",103,5000)
     
    val t=p.transfer(q,5000)
    println("New balance of q account:"+q.balance)
    println("New balance of p account:"+p.balance)
  }
}
