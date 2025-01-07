package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseNameInterfaceAbstrataFunction;

public class InterfaceFuncionalFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Table", 350.00));
		list.add(new Product("H", 80.90));

		List <String> name = list.stream().map(new UpperCaseNameInterfaceAbstrataFunction()).collect(Collectors.toList());
		
		name.forEach(System.out::println);
	}

}
