import scala.io.StdIn

object tute_02 extends App{

	def attendees(t_price:Int):Int = 120 + (15 - t_price)/5*20
	
	def income(t_price:Int):Int = attendees(t_price)*t_price
	
	def cost(t_price:Int):Int = 500 + 3 * attendees(t_price)
	
	def profit(t_price:Int):Int = income(t_price) - cost(t_price)
	
	var t_price:Int = 1
	while(t_price != 0){
		print("Enter ticket price (enter '0' to exit) : ")
		t_price = StdIn.readInt()
		
		if(t_price > 0){
			printf("Entered price : %dRs\n", t_price)
			printf("Profit : %dRs\n\n", profit(t_price))
		}else{
			t_price = 0
		}
	}
	
}


