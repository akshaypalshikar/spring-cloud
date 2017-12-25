/**
 * 
 */
package org.aks.cloud.service.ctrl;

import java.util.List;

import org.aks.cloud.service.bean.User;
import org.aks.cloud.service.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Akshay
 *
 */
@RestController
@RequestMapping(value="/users")
public class UserController {
	
	@Autowired
	UserRepo userRepo;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<User> getAllUsers(){
		return (List<User>) userRepo.findAll();
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/findByName",method=RequestMethod.GET)
	public List<User> findUsersByName(@RequestParam(name="name",required=false) String name){
		if(StringUtils.isEmpty(name)) {
			return getAllUsers();
		}
		return (List<User>)userRepo.findAllByName(name);
	}
}
