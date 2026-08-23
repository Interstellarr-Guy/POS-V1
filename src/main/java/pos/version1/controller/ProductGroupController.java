package pos.version1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pos.version1.entity.ProductGroup;
import pos.version1.service.ProductGroupService;

@RestController
@RequestMapping("/api/product-groups")
@CrossOrigin
public class ProductGroupController {

    private final ProductGroupService productGroupService;

    public ProductGroupController(
            ProductGroupService productGroupService) {
        this.productGroupService = productGroupService;
    }

    @PostMapping
    public ProductGroup createGroup(
            @RequestBody ProductGroup group) {

        return productGroupService.createGroup(group);
    }

    @GetMapping
    public List<ProductGroup> getGroups() {

        return productGroupService.getGroups();
    }
}
