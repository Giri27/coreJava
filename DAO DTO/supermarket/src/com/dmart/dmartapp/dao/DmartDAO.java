package com.dmart.dmartapp.dao;

import com.dmart.dmartapp.dto.ProductDTO;

public interface DmartDAO {
	
	public boolean createProduct(ProductDTO dto);
	public ProductDTO[] getProduct();
	public boolean updateProductPriceBYProductName(double price, String productName);
    public boolean deleteByProductName(String productName);
}
