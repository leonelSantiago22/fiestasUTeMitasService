package fiestasUteMitas.fiestasUteMitas.repositoires;

import fiestasUteMitas.fiestasUteMitas.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<UserModel, Long> {


}
