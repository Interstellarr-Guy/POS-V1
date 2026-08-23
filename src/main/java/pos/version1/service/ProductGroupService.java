package pos.version1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import pos.version1.entity.ProductGroup;
import pos.version1.repository.ProductGroupRepository;

@Service
public class ProductGroupService {

    private final ProductGroupRepository productGroupRepository;

    public ProductGroupService(
            ProductGroupRepository productGroupRepository) {
        this.productGroupRepository = productGroupRepository;
    }

    public ProductGroup createGroup(ProductGroup group) {
        return productGroupRepository.save(group);
    }

    public List<ProductGroup> getGroups() {
        return productGroupRepository.findAll();
    }
}