
public class condicionales {

	public static void main(String[] args) {
		
		//esto es un comentario
		
		/* esto 
		 es 
		 otro comentario*/
		
		
		int num1 = 5;
		int num2 = 6;
		char op = '-';
		
		float resultado = 0;
		
		/*switch (op){
			case '+':
				resultado = num1 + num2;
				break;
			case '-':
				resultado = num1-num2;
				break;
			case '*':
				resultado = num1*num2;
				break;
			case '/':
				resultado = num1/num2;
				break;
		}*/
		
		if (op == '+'){
			resultado = num1 + num2;
		}else if (op=='-'){
			resultado = num1 - num2;
		}else if(op =='*'){
			resultado = num1 * num2;
		}else if (op =='/'){
			resultado = num1 / num2;
		}
		
		System.out.println(resultado);
		
		

	}
}
