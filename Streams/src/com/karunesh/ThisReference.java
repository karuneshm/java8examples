package com.karunesh;

public class ThisReference {
	
	public void doProcess(int i, Process p) {
		p.process(i);
	}
	
	public void execute() {
		doProcess(10, (i)->{
			System.out.println(i);
			System.out.println(this);
		});
	}
	
	public static void main(String args[]) {
		ThisReference reference = new ThisReference();
//		reference.doProcess(10, new Process() {
//			
//			@Override
//			public void process(int i) {
//				System.out.println(" Value of i" +i);
//				System.out.println(this);
//				
//			}
//			
//			public String toString() {
//				return "This is Anonymous inner class";
//			}
//		});
		reference.doProcess(10, (i)->{
			System.out.println(i);
			//System.out.println(this);
		});
		
		reference.execute();
	}

}
