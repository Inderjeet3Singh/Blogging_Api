package SecondApiProject.Blogging_Api.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="users")
@NoArgsConstructor //this will create no argconstructor with the help of lombok
@Getter            //create getters
@Setter            //create setters
public class User {
	
	@Id // this will indicate this will be your primary key
	//strategy = GenerationType.AUTO --this will auto increment the values
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	//@column - is used to change the name of the field in database
	//length- this will specify the length of the name of the user
	//nullable-this will allow whether you want to have null values or not
	@Column(name="user_name", nullable=false, length=100)
	private String name;
	private String email;
	private String password;
	private String about;
	

	@OneToMany(mappedBy="user", cascade= CascadeType.ALL, fetch=FetchType.LAZY )
	private List<Post> posts = new ArrayList<>();

}
