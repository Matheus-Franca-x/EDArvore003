package view;

import model.matheus.libArvoreChar.ArvoreChar;

public class Main {

	public static void main(String[] args) 
	{
		char[] vet = {'k', 'd', 'b', 'm', 'l', 't', 'p', 'z', 'r', 'f', 'c'};
		
		
		ArvoreChar arvore = new ArvoreChar();
		
		for (char each : vet)
			arvore.insert(each);
		
		try {
			arvore.prefixSearch();
			System.out.println("\n");
			arvore.infixSearch();
			System.out.println("\n");			
			arvore.postfixSearch();
			System.out.println("\n");						
			arvore.search('r');
			arvore.remove('m');
			System.out.println("\n");
			arvore.infixSearch();
			System.out.println("\n");			
			arvore.postfixSearch();
			System.out.println("\n");	
			arvore.search('r'); //Valor de r permaneceu no nivel 4 por conta que o l substituiu o m
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
