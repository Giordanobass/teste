package entities;

public class Student {
	
	public String name;
	//vale 30
	public double notaTrimestre_1;
	//vale 35
	public double notaTrimestre_2;
	//vale 33
	public double notaTrimestre_3;
	
	public double notaFaltando = 60;
	
	public double notaFinal;
	
	public void mediaNotas() {
		this.notaFinal = this.notaTrimestre_1 + this.notaTrimestre_2 + this.notaTrimestre_3;
		
		if(notaFinal >= 60) {
			System.out.println("Primeira nota: " + notaTrimestre_1 + " | Segunda nota: " + notaTrimestre_2 + 
					" | Terceira nota: " + notaTrimestre_3);
			System.out.println("Student " + name + " PASS! " + " Nota: " + notaFinal);
		}
		else if(notaFinal < 60) {
			System.out.println("Primeira nota: " + notaTrimestre_1 + " | Segunda nota: " + notaTrimestre_2 + 
					" | Terceira nota: " + notaTrimestre_3);
			System.out.println("Student " + name + " FAILED!" + " Nota: " + notaFinal);
			
			notaFaltando -= notaFinal; 
			System.out.println("MISSING " + notaFaltando + " POINTS");
			} 
	}
}
