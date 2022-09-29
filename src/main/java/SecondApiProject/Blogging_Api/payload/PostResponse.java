package SecondApiProject.Blogging_Api.payload;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Getter
@Setter
@NoArgsConstructor
public class PostResponse {
	
	//this post response will be shared to the client
	private List<PostDto> content;
	private int pageNumber;
	private int pageSize;
	private long totalElements;
	private long totalPages;
	
	private boolean lastPage; // this will tell whether we are at last page or not
	

}
