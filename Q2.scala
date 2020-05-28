object Q2{
	def main(args:Array[String]){
		print("Enter Ticket Price: ");
		var tp = scala.io.StdIn.readInt();
		printf("Number of attendees depends on this price: %d",prof(tp));
	}
	
	def atten(p2:Int):Int={
		120+(15-p2)/5*20;
	}
	
	def rev(p3:Int):Int={
		atten(p3)*p3;
	}

	def cost(p3:Int):Int={
		500 + 3*atten(p3);
	}

	def prof(p3:Int):Int={
		rev(p3) - cost(p3);
	}
}