package service.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;


@Data // generates getters, setters, overrides equals, hash
@Entity
@Table(name = "houses")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class House {

    @Id
    @Column(name = "houseId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int houseId;

    @Column(name = "companyId")
    private int companyId;

    @Column(name = "residentialId")
    private int residentialId;

    @Column(name = "floors")
    private int floors;

    @Column(name = "apartments")
    private int apartments;

    @Column (name = "address")
    private String address;
}