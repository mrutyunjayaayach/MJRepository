  class MethodOver
{	
	double res;
	void area(float l, float b) {
		res = l * b ;
		System.out.println("Area of the Rectangle is : "+res);
	}
	void area(float r) {
		res = r * r;
		System.out.println("Area of the Square is : "+res);
	}
	void area(double r) {
		res = 3.14 * r * r;
		System.out.println("Area of thr circle is : "+res);
	}
}
	class MethodOverloading
	{
	    public static void main(String[] args)
	    {
	    	MethodOver obj = new MethodOver();
	     obj.area(3,5);
	     obj.area(9);
	     obj.area(9,7);
	    }
	}
	