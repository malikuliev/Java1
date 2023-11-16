import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Masin masin = new Masin();
		Masin masin2 = new Masin();
		Masin masin3 = new Masin();
		
		masin.setMakra("Mercedes");
		masin.setModel("w202");
		
		masin2.setMakra("BMW");
		masin2.setModel("e46");
		
		masin3.setMakra("Audi");
		masin3.setModel("A8");
		
		
		String masinMarkasi[] = new String[3];
		String masinModel[]= new String[3];
		
		
		masinMarkasi[0] = masin.getMarka();
		masinModel[0] = masin.getModel();
		
		masinMarkasi[1] = masin2.getMarka();
		masinModel[1] = masin2.getModel();
		
		masinMarkasi[2] = masin3.getMarka();
		masinModel[2] = masin3.getModel();
		
		System.out.print("Hansi marka isteyirsiniz?: ");
		Scanner sc1 = new Scanner(System.in);
		
		String input = sc1.next();

		input = input.toUpperCase();
		
		for (int i=0;i<masinMarkasi.length;i++) {
			if (masinMarkasi[i].toUpperCase().equals(input)) {
				System.out.print("Size teklif elediyimiz avtomobil " + masinMarkasi[i] +" "+masinModel[i]+ " modelidir.");
			}
		}	
		
	}

}
