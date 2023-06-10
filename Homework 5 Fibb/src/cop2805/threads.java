package cop2805;

public class threads {

	public static void main(String[] args) {
		
		threads t = new threads();
	    fibonacciR rThread = t.new fibonacciR();
	    rThread.findN(40);
	    rThread.start();
	    
	    fibonacciD dThread = t.new fibonacciD();
	    dThread.findN(40);
	    dThread.start();   
		
		
	}
			
			public class fibonacciR extends Thread{
				private int n;
				private int result;
				
				public void findN(int n) {
					this.n = n;
			}
				@Override
				public void run() {
					 long startTime = System.nanoTime();
						result = fibonacci(n);
						long endTime = System.nanoTime();
					
					System.out.println("Fibonacci Recursive: " + result + ", Time: " + (endTime - startTime) + "ns");
				}
					private int fibonacci(int n) {
				        if (n == 0) {
				            return 0;
				        } else if (n == 1) {
				            return 1;
				        } else {
				            return fibonacci(n - 1) + fibonacci(n - 2);
				        }
				    }
				
			}
			
			public class fibonacciD extends Thread{
				private int n;
				private int result;
				
				public void findN(int n) {
					this.n = n;
			}
				@Override
				public void run() {
					 long startTime = System.nanoTime();
					result = fibonacci(n);
					long endTime = System.nanoTime();
					
					System.out.println("Fibonacci Iterative: " + result + ", Time: " + (endTime - startTime) + "ns");
				}
					private int fibonacci(int n) {
						int v1 = 0, v2 = 1, v3 = 0;
						for (int i = 2; i<=n; i++) {
							v3 = v1 + v2;
							v1 = v2;
							v2 = v3;							
							
						}
						return v2;
				     
				    }
					

				
			}
		
		}
		


	


