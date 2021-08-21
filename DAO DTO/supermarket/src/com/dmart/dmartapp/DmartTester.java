package com.dmart.dmartapp;

import java.util.Scanner;

import com.dmart.dmartapp.dao.DmartDAO;
import com.dmart.dmartapp.dao.DmartDAOImpl;
import com.dmart.dmartapp.dto.ProductDTO;

public class DmartTester {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		DmartDAO dmartDAO = new DmartDAOImpl(size);
		
		for(int i=0; i < size; i++) {
			
			ProductDTO dto = new ProductDTO();
			dto.setProductId(sc.next());
			dto.setProductName(sc.next());
			dto.setBrandName(sc.next());
			dto.setPrice(sc.nextDouble());
			dto.setQuality(sc.next());
			dto.setProductType(sc.next());
			
			dmartDAO.createProduct(dto);
		}
		
		ProductDTO[] productDTOs = dmartDAO.getProduct();
		for(ProductDTO productDTO : productDTOs) {
			
			System.out.println(productDTO);
		}
		
		System.out.println("Enter the price and product name to update product price ");
		dmartDAO.updateProductPriceBYProductName(sc.nextDouble(), sc.next());
		ProductDTO[] productDTOs1 = dmartDAO.getProduct();
		for(ProductDTO productDTO : productDTOs1) {
			
			System.out.println(productDTO);
		}
		
		System.out.println("Enter the product name to delete product details ");
		dmartDAO.deleteByProductName(sc.next());
		ProductDTO[] productDTOs2 = dmartDAO.getProduct();
		for(ProductDTO productDTO : productDTOs2) {
			
			System.out.println(productDTO);
		}
		
		
	}

}
