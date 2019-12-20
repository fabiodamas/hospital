package io.github.fabiodamas.hospitalar.model;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Juergen Hoeller
 *         Can be Cat, Dog, Hamster...
 */
@Entity
@Table(name = "types")
public class PetType extends NamedEntity {

}
