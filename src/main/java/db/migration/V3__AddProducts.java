package db.migration;

import com.sysc4806.project.Category;
import com.sysc4806.project.Product;
import org.flywaydb.core.api.migration.spring.SpringJdbcMigration;
import org.springframework.jdbc.core.JdbcTemplate;

public class V3__AddProducts implements SpringJdbcMigration {

    @Override
    public void migrate(JdbcTemplate jdbcTemplate) throws Exception {
        Product monitor = new Product("Monitor.com", Category.MONITORS);
        Product wrench = new Product("Wrench.com", Category.TOOLS);
        Product laptop = new Product("Laptop.com", Category.ELECTRONICS);

        insertProduct(monitor, jdbcTemplate);
        insertProduct(wrench, jdbcTemplate);
        insertProduct(laptop, jdbcTemplate);
    }

    private void insertProduct(Product product, JdbcTemplate jdbcTemplate) {
        jdbcTemplate.execute("INSERT INTO product (url, category) VALUES ('" + product.getUrl() + "', " + (product.getCategory().ordinal()) + ")");
    }
}
