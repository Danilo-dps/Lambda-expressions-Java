package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		/* Classe anônima
		 * Comparator<Product> comp = new Comparator<Product>(){
		 * 		@Override
		 * 		public int compare(Product p1, Product p2){
		 * 				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		 * 		}
		 * };
		 */
		// Para usar a classe anônima
		// list.sort(comp);
		
		/* Função anônima ou arrow function
		 * Comparator<Product> comp =(p1, p2) -> {
		 * 		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		 * };
		 *  Ou assim 
		 *  Comparator<Product> comp =(p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		 */
		// Para usar a função anônima
		// list.sort(comp);
		
		// A expressão lambda como argumento para a chamada do método .sort
		// Aqui é um Comparator definido com a sintaxe de expressão lambda
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (Product p : list) {
			System.out.println(p);
		}
	}
}
