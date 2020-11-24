package com.shubham.controler;
import com.shubham.Dao.*;
import com.shubham.model.*;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Usercontroler {
	
    @Autowired
	private UserDaoService service;
    
    @Autowired
	private UserRepository userRepository;
    
    @Autowired
    private DrugRepository drugRepository;   
    
    //this function for create a user in user table
    @PostMapping("/setuser")
    public void retrieveall(@RequestBody User user ){
    	//System.out.println(user.getId());
    	userRepository.save(user);
     }
    //This function for return all user
    @GetMapping("/users")
	public List<User> retrieveAllUsers() {
		return userRepository.findAll();
	}
    
    //this function for find all the drugs have with particular user;
    @GetMapping("/user/{id}/getalldrugs")
    public List<Drugs> retriveallDrugs(@PathVariable long id){
          Optional<User> userOptional = userRepository.findById(id);
		
		/*if(!userOptional.isPresent()) {
			throw new UserNotFoundException("id-" + id);
		}*/
		 //System.out.println(userOptional.get());
		 
		 return userOptional.get().getDrugs();
    }
    
    //this function for adding one or more drugs to a particular user 
    @PostMapping("user/{id}/setdrugs")
	public void createPost(@PathVariable long id, @RequestBody List<Drugs> drugs) {
		
		Optional<User> userOptional = userRepository.findById(id);
		
		/*if(!userOptional.isPresent()) {
			throw new UserNotFoundException("id-" + id);
		}*/

		User user = userOptional.get();
		
        for(Drugs d: drugs){
		d.setUser(user);
		drugRepository.save(d);
	  }
		
		/*URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(post.getId())
				.toUri();

		return ResponseEntity.created(location).build();*/

	}
    
    @DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable long id) {
		userRepository.deleteById(id);
	}
}
