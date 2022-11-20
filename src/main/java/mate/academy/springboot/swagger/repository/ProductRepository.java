package mate.academy.springboot.swagger.repository;

import mate.academy.springboot.swagger.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;
import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    @Query(value = "from Product p where p.price between ?1 and ?2")
    List<Product> findAllByPriceBetween(BigDecimal from, BigDecimal to, Pageable pageable);
}