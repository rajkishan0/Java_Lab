
/**
 * Using Method Overloading, Calculates the area of shapes
 *
 * @author (Kishan)
 * @version (01/10/2020)
 */
class Calc
{
    void area(float x)
    {
        System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z+" sq units");
    }

     public static void main(String args[]) 
	{
	   Calc ob = new Calc();
	   ob.area(5);
	   ob.area(11,12);
	   ob.area(2.5);
        }
}