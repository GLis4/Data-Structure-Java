package aulas.estrutura_dados.desafio.pilhas;

public class SimbolosBalanceados {

	public static void main(String[] args) {
		String spli = "((B+C))";
		String[] splitted = spli.split("()");
		
		int o = 0;
		int p = 0;
		
		for(int i = 0; i < spli.length(); i++) {
			
			if (splitted[i].equals("(")) {
				o++; 
			}else if(splitted[i].equals(")")) {
				p++;
			}
		}
		
		if(o == p && splitted[0].contains("(")) {
			System.out.println("balanced");
		}else System.out.println("not balanced");
		
	}

}

