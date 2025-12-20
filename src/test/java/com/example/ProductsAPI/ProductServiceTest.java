package com.example.ProductsAPI;

import com.example.ProductsAPI.dto.ProductDTO;
import com.example.ProductsAPI.models.Product;
import com.example.ProductsAPI.repository.ProductRepository;
import com.example.ProductsAPI.services.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class ProductServiceTest {

    //Mocka repository
    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    /**
     * Test createProduct method to ensure that a product is created correctly
     */
    @Test
    public void testCreateProduct_Success() {

        //Arrange
        // create sample ProductDTO without id
        ProductDTO productDTO = new ProductDTO();
        productDTO.setName("Product C");
        productDTO.setDescription("Description C");
        productDTO.setColor("Green");
        productDTO.setPrice(30.99);
        productDTO.setStockQuantity(300);

        // Create a product that represents the saved object without id
        Product savedProduct = new Product();
        savedProduct.setId("2");
        savedProduct.setName(productDTO.getName());
        savedProduct.setDescription(productDTO.getDescription());
        savedProduct.setColor(productDTO.getColor());
        savedProduct.setPrice(productDTO.getPrice());
        savedProduct.setStockQuantity(productDTO.getStockQuantity());

        // mock the behaviour of productRepository.save() and return the saved product
        when(productRepository.save(any(Product.class))).thenReturn(savedProduct);

        //Act
        //Call the createProduct method in ProductService
        Product result = productService.createProduct(productDTO);

        //Assert
        //Verify that the product was saved correctly
        assertNotNull(result.getId(), "Saved product should have an ID");
        assertEquals("Product C", result.getName(), "Product name should match");
        assertEquals("Description C", result.getDescription(), "Product description should match");
        assertEquals("Green", result.getColor(), "Product color should match");
        assertEquals(30.99, result.getPrice(), "Product price should match");
        assertEquals(300, result.getStockQuantity(), "Product stock quantity should match");

        //Verify that productRepository.save() only gets called once with a Product object
        verify(productRepository, times(1)).save(any(Product.class));

    }


}