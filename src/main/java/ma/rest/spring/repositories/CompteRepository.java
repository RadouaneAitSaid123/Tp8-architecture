package ma.rest.spring.repositories;

import ma.rest.spring.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author radouane
 **/
@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {
}
