/**
 * 
 */
package org.aks.cloud.service.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

/**
 * @author Akshay
 *
 */
@Data
@ToString
@Entity
@Table(name="USER")
public class User {

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="NAME")
	private String name;
	
}
