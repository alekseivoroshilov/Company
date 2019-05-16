package service.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;


@Data // generates getters, setters, overrides equals, hash
@Entity
@Table(name = "residentials")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Residential {

    @Id
    @Column(name = "residentialId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int residentialId;

    @Column (name = "residentialName")
    private String residentialName;

    @Column (name = "companyId")
    private int companyId;
}
