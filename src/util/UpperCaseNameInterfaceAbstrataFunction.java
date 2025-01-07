package util;

import java.util.function.Function;

import entities.Product;

public class UpperCaseNameInterfaceAbstrataFunction implements Function <Product, String>{

	@Override
	public String apply(Product p) {
		// TODO Auto-generated method stub
		return p.getName().toUpperCase();
	}

		
}
