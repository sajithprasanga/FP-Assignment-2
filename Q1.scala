object Q1{
	def main(args:Array[String]){
		var salary = take(1,1);
		println(f"Salary Amount: ${salary}%.2f");	
	}

	def wage(hours:Double):Double={
		hours*150;
	}

	def OT(hours:Double):Double={
		hours*75;
	}

	def income(h:Double , o:Double):Double={
		wage(h) + OT(o);
	}
	
	def tax(in:Double):Double={
		in*0.1;
	}

	def take(h:Double , o:Double):Double={
		income(h,o)-tax(income(h,o));
	}
	
}