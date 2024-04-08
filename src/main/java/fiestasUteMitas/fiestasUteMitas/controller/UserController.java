package fiestasUteMitas.fiestasUteMitas.controller;

import fiestasUteMitas.fiestasUteMitas.models.UserModel;
import fiestasUteMitas.fiestasUteMitas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    // Inyeccion de dependencia
    @Autowired
    private UserService userService;
    @GetMapping
    public ArrayList<UserModel> getUsers()
    {
        return  this.userService.getUsers();
    }

    @PostMapping
    //ResponseBody enviar un request atravez del body
    public UserModel saveUser(@RequestBody UserModel user)
    {
        return  this.userService.saveUser(user);
    }

    @GetMapping(path = "/{id}")
    public Optional<UserModel> getUserById(@PathVariable Long IdUSer)
    {
        return  this.userService.getUserById(IdUSer);
    }
    @PutMapping(path = "/{id}")
    public UserModel updateUserById(@RequestBody UserModel request ,@PathVariable Long id){
        return this.userService.updateById(request, id);
    }
    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable Long id )
    {
        boolean request_delete = this.userService.delete(id);
        if(request_delete)
        {
            return "User with id"+id+"deleted!";
        }else {
            return "NOt"+id+" NOT deleted!";
        }
    }
}
