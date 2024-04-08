package fiestasUteMitas.fiestasUteMitas.service;

import fiestasUteMitas.fiestasUteMitas.models.UserModel;
import fiestasUteMitas.fiestasUteMitas.repositoires.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUserRepository userRepository;

    public ArrayList<UserModel> getUsers()
    {
        return  (ArrayList<UserModel>) userRepository.findAll();
        // Metodo que ya viene definido en los JPA repository
    }

    public  UserModel saveUser(UserModel user)
    {
        return  userRepository.save(user);
    }

    public Optional<UserModel> getUserById(Long IdUser)
    {
        return userRepository.findById(IdUser);
    }

    public UserModel updateById(UserModel request, Long IdUser)
    {
        UserModel  userModel = userRepository.findById(IdUser).get();
        userModel.setName(request.getName());
        userModel.setCorreo(request.getCorreo());
        userRepository.save(userModel);
        return userModel;
    }
    public Boolean delete(Long id)
    {
        try{
            userRepository.deleteById(id);
            return  true;
        }catch (Exception e){
           return  false;
        }
    }
}
