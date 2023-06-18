import scala.io.StdIn

object tute_02 extends App{

	printf("Emter the number of working hours : ")
	var w_hrs:Double = StdIn.readDouble()
	printf("Emter the number of OT hours : ")
	var ot_hrs:Double = StdIn.readDouble()
	
	
	def wage(w:Double):Double = 250 * w
	
	def ot(o:Double):Double = 85 * o
	
	def income(w:Double, o:Double):Double = wage(w) + ot(o)
	
	def tax(incm:Double):Double = incm * 0.12
	
	def take_home(): Double = income(w_hrs, ot_hrs) - tax(income(w_hrs, ot_hrs)) 
	
	printf("Working hours = %f\n", w_hrs)
	printf("OT hours = %f\n", ot_hrs)
	printf("Take home salary = %f\n", take_home())
	
}


