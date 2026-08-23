package pos.version1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pos.version1.dto.ProductRequest;
import pos.version1.entity.Product;
import pos.version1.entity.ProductGroup;
import pos.version1.repository.ProductGroupRepository;
import pos.version1.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private final ProductRepository productRepository;
	
	@Autowired
	private final ProductGroupRepository groupRepository;

	public ProductService(
			ProductRepository productRepository, 
			ProductGroupRepository productGroupRepository) {
		
		this.productRepository = productRepository;
		this.groupRepository = productGroupRepository;
	}
	
	public Product createProduct(ProductRequest request) {
		
		ProductGroup group = groupRepository.findById(request.getGroupId())
				               .orElseThrow(()-> new RuntimeException("Group not foundd"));
		
		Product product = new Product();
		
		product.setName(request.getName());
		product.setPrice(request.getPrice());
		product.setTax(request.getTax());
		product.setGroup(group);
		
		return productRepository.save(product);
	}
	
	
	
}
