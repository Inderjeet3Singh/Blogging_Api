package SecondApiProject.Blogging_Api.payload;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	private int id;
	
	@NotEmpty
	@Size(min =4 , message ="username must be of 4 character")
	private String name;
	
	@Email (message ="your email address is not valid!")
	private String email;
	
    @NotEmpty
    @Size(min=3, max=10, message="password length 3-10 charcters")
	private String password;
	
	@NotEmpty
	private String about;
	
	

}
