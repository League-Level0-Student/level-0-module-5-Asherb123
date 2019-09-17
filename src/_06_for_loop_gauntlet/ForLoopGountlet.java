package _06_for_loop_gauntlet;

import javax.swing.JOptionPane;

public class ForLoopGountlet {
public static void main(String[] args) {
	


 for (int i = 0; i < 100; i++) {
	System.out.println(i);
}

for (int i = 100; i > 0; i--) {
	System.out.println(i);
}
for (int i = 0; i < 100; i++) {
	if (i%2==0) {
	System.out.println(i);	
	}
}

for (int i = 0; i <99; i++) {
	if (i%2==1) {
		System.out.println(i);
	}
}
for (int i = 1; i < 500; i++) {
	if (i%2==0) {
	System.out.print(i);	
	//JOptionPane.showMessageDialog(null, "Even number");
		System.out.println("		Even Number");
			
		}
	if (i%2==1) {
		//JOptionPane.showMessageDialog(null, "Number is odd");
	
	System.out.print(i);

	System.out.println("		odd number");
}


}


for (int i = 1; i < 14; i++) {
	System.out.println( "In   " +(2006+i)+"  my age was  "+i);
	
}



















}























}
