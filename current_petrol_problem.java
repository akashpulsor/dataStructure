package algoPractice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class current_petrol_problem {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		current_petrol_problem  pump = new current_petrol_problem();
		petrolPump arr[] = new petrolPump[3] ;
		arr[0] = pump.new petrolPump(6,4); 
		arr[0] = pump.new petrolPump(3,6); 
		arr[0] = pump.new petrolPump(7,3); 
		 
		//petrolPumpTour(pump,arr);
	}
	
	/*
	public  static int  petrolPumpTour(current_petrol_problem  pump,petrolPump arr[]){
			
		int start = 0;
		int  end = 1;
		
	}
	*/
	
	public class petrolPump{
		
		int petrol;
		int pumpDistance;
		public petrolPump(int petrol,int pumpDistance){
			this.petrol = petrol;
			this.pumpDistance = pumpDistance; 
		}
	}
	
}
