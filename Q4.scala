class account(id:String,aNumber:Int,balance:Double)
{
	var nic=id;
	var accNumber=aNumber;
	var aBalance=balance;
}

object Q4
{
	def main(args:Array[String])
	{
		println("-------------------------------------");
		println("  Overdraft-Total Balance-Interest");
		println("-------------------------------------\n");

		var acc1=new account("S123",1001,25000);
		var acc2=new account("S124",1002,10000);
		var acc3=new account("S125",1003,50000);
		var acc4=new account("S126",1004,-1000);
		var acc5=new account("S127",1005,-10000);
		var acc6=new account("S128",1006,0);
		val bank:List[account]=List(acc1,acc2,acc3,acc4,acc5,acc6);
		
		//Overdraft account numbers
		print("Overdraft account numbers   : ");
		var ODlist=overdraft(bank);
		ODlist.foreach(x=>print(x.accNumber+"   "));

		//Total account balance
		var tBalance=balance(bank);
		print("\nTotal account balance       : "+tBalance.aBalance);

		//Account balance after adding Balance-Interest
		print("\nAccount balances + interest : ")
		var interestList=interest(bank);
		interestList.foreach(x=>print(x+" "));

		println("\n-------------------------------------");
	}

	val overdraft=(list:List[account])=>list.filter(x=>x.aBalance<=0);
	val balance=(list:List[account])=>list.reduce((x,y)=>new account("S000",1000,x.aBalance+y.aBalance));
	val interest=(list:List[account])=>list.map(x=>(if(x.aBalance>0) x.aBalance*1.05d else x.aBalance*1.01d));
}
