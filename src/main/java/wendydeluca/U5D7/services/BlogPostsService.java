package wendydeluca.U5D7.services;

import org.springframework.stereotype.Service;
import wendydeluca.U5D7.entities.BlogPost;
import wendydeluca.U5D7.exceptions.NotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class BlogPostsService {

    public List<BlogPost> blogPostsList = new ArrayList<>();

    public List<BlogPost> getBlogPostsList(){
        return this.blogPostsList;
    } //GET ALL

    public BlogPost saveBlogPost(BlogPost body){ //SAVE
        Random rndm = new Random();
        body.setId(rndm.nextLong(1,100));
        this.blogPostsList.add(body);
        return body;

    }

    public BlogPost findById(long id){
        BlogPost found = null;
        for(BlogPost blogPost: blogPostsList){
            if(blogPost.getId() == id)
                found = blogPost;
//            return blogPost;
        }
        if(found == null) throw new NotFoundException(id);
        else return found;
    }


}
