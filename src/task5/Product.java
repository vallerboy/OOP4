package task5;

/**
 * Created by Lenovo on 14.08.2017.
 */
public class Product {
    private String name;
    private String specification;
    private String description;

    public Product(String name, String specification, String description) {
        this.name = name;
        this.specification = specification;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
