package low_level_design.inventory_update_service.repository;

import low_level_design.inventory_update_service.entity.Product;

import java.util.Optional;

public interface ProductRepository {
    void save(Product product);
    Optional<Product> findById(String productId);
}
