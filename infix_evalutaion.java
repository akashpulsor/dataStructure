package algoPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.regex.Pattern;

public class infix_evalutaion {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			String[] input1 = br.readLine().split("\\s");
			Stack<Integer> stk = new Stack<Integer>();
			Stack<String> stk1 = new Stack<String>();
			int cnt=0;
			for(int i =0; i < input1.length;i++){				
				if(input1[i].equals("(")){
					stk1.push(input1[i]);
				}
				else if(input1[i].equals(")")){
					while(!stk1.peek().equals("(")){
						int value = applyOP(stk1.pop(),stk.pop(),stk.pop());
						stk.push(value);
					}
					stk1.pop();
				}
				else if(input1[i].equals("+")||
						input1[i].equals("-") ||
						input1[i].equals("/")||
						input1[i].equals("*")){//)
					while(!stk1.isEmpty() && (hasPrecedence(input1[i], stk1.peek()))){
						int value = applyOP(stk1.pop(),stk.pop(),stk.pop());
						stk.push(value);
					}
					stk1.push(input1[i]);
				}
				else{
					try{
					int num = Integer.parseInt(input1[i]);
					stk.push(num);
					}
					catch(NumberFormatException e){
						System.out.println("Wrong number");
					}
				}
				
			}
			while(!stk1.isEmpty()){
				int value = applyOP(stk1.pop(),stk.pop(),stk.pop());
				stk.push(value);
			}
			System.out.println(stk.pop());
		}
	}
	
	public static boolean hasPrecedence(String op1, String op2){
		if (op2.equals("(") || op2.equals(")")){
            return false;
		}
        if ((op1.equals("*") || op1.equals("/") && (op2.equals("+") || op2.equals("-")))){
            return false;
        }
        else{
            return true;
        }
	}
	
	public static int  applyOP(String op1,int a, int b){
		switch (op1)
        {
        case "+":
            return a + b;
        case "-":
            return a - b;
        case "*":
            return a * b;
        case "/":
            if (b == 0)
                throw new
                UnsupportedOperationException("Cannot divide by zero");
            return a / b;
        }
        return 0;
	}

}
