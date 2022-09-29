package SecondApiProject.Blogging_Api.payload;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {

	private Integer categoryId;
    
	@NotEmpty
	@Size(min =3 , message ="categoryTitle must be of 3 character")
	private String categoryTitle;

	private String categoryDescription;

}
