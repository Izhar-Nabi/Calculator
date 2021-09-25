class Calculator
{
	public static void main(String args[]){
	int num1=3;
	int num2=7;
	int choice=3;
	switch(choice){
	case 1:
	System.out.println("Addition"+ (num1+num2));
	break;
	case 2:
	System.out.println("Substraction "+ (num1-num2));
	break;
	case 3:
	System.out.println("Multiplication "+ (num1*num2));
	break;
	case 4:
	System.out.println("Division "+ (num1/num2));
	break;
	case 5:
	System.out.println("Mudulus "+ (num1%num2));
	break;
	case 6:
	System.out.println("Square Of First Number "+ (num1*num1));
	break;
	case 7:
	System.out.println("Square of 2nd Number "+ (num2*num2));
	default:
	System.out.println("Sorry!!! You put Wrong one!!! No Operation Perfome");	
		}
	}

}