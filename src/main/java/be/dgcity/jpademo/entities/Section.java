package be.dgcity.jpademo.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "section")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor

public class Section {

    @Id
    @Column(name = "section_id")
    private int id;

    @Column(name = "section_name")
    private String name;

    @Column(name = "delegate_id")
    private int delegateId;


}
