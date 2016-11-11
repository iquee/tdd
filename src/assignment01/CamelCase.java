package assignment01;

import java.util.ArrayList;
import java.util.List;

public class CamelCase {
	
	private static String pattern = "(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z0-9][a-z0-9])";

	public List<String> converterCamelCase(String palavraTeste) {
		validacaoInicial(palavraTeste);
		List<String> lista = new ArrayList<String>();
		for (String palavra : palavraTeste.split(pattern)) {
			lista.add(verificaAoAdicionar(palavra));
		}
		return lista; 
	}
	
	/**
	 * Verifica se a palavra comeca com número ou contém algum caracter especial
	 * @param palavraTeste
	 * @throws IllegalArgumentException
	 */
	private void validacaoInicial(String palavraTeste){
		String pattern = "^[a-zA-Z][a-zA-Z0-9]*$";		
		if(!palavraTeste.matches(pattern)){
			throw new IllegalArgumentException("Palavra não pode iniciar com números ou conter algum caracter especial");
		}
	}
	
	/**
	 * Antes de adicionar na lista, verifica se as letras permanecem ou ficam maiúsculas
	 * @param palavra
	 * @return String
	 */
	private String verificaAoAdicionar(String palavra){
		if(palavra.length() == 1){
			return palavra;		
		} else{
			if(Character.isUpperCase(palavra.charAt(1))){
				return palavra;
			} else{
				return palavra.toLowerCase();
			}
		}
	}

}
