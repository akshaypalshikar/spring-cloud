/**
 * 
 */
package org.aks.cloud.service.repo;

import java.util.List;

import org.aks.cloud.service.bean.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author aksma
 *
 */
public interface UserRepo extends CrudRepository<User, Long> {
	List<User> findAllByName(String name);
}
