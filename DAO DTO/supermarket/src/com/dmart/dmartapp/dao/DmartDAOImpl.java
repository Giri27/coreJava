package com.dmart.dmartapp.dao;

import com.dmart.dmartapp.dto.ProductDTO;

public class DmartDAOImpl implements DmartDAO{
	
	public ProductDTO[] products;
	private int index;
	
	public DmartDAOImpl(int size) {
	
		products = new ProductDTO[size];
	}
	
	@Override
	public boolean createProduct(ProductDTO dto) {
		
		boolean productAdded = false;
		try {
					
			if(dto != null && !dto.getProductId().isEmpty() ) {
				products[index++] = dto;
				productAdded = true;
			
			} else if (dto.getProductId().isEmpty() ) {
				System.out.println("Cannot add product as product id is empty");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return productAdded;
	}
	
	@Override
	public ProductDTO[] getProduct() {
		return products;
		
	}

	@Override
	public boolean updateProductPriceBYProductName(double price, String productName) {
		boolean priceUpdated = false;
		if(price > 0 && productName != null) {
			for(ProductDTO productDTO : products) {
				if(productDTO.getProductName().equals(productName)) {
					productDTO.setPrice(price);
					priceUpdated = true;
				} else {
					System.out.println("No product name found");
				}
			}
		}
		return priceUpdated;
	}

	@Override
	public boolean deleteByProductName(String productName) {
		boolean productDetailsDeleted = false;
		if(productName != null ) {
			for(ProductDTO productDTO : products) {
				if(productDTO.getProductName().equals(productName)) {
					productDTO = null;
					//products[] = productDTO;
					productDetailsDeleted = true;
				} else {
					
					System.out.println("product name not found");
				}
			}
		}
		return productDetailsDeleted;
	}

}
