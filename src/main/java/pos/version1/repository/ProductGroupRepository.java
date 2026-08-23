package pos.version1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pos.version1.entity.ProductGroup;

public interface ProductGroupRepository extends JpaRepository<ProductGroup, Long> {

}
