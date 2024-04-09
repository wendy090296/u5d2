package wendydeluca.U5D7.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import wendydeluca.U5D7.entities.BlogPost;
import wendydeluca.U5D7.services.BlogPostsService;

import java.util.List;

@RestController
@RequestMapping("/blogPosts")
public class BlogPostController {

    @Autowired
    public BlogPostsService blogPostsService;

    @GetMapping
    public List<BlogPost> getAllBlogPosts(){
        return this.blogPostsService.getBlogPostsList();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) //STATUS 201 OK
    public BlogPost saveBlogPost(@RequestBody BlogPost body){
        return blogPostsService.saveBlogPost(body);
    }

    @GetMapping("{/123}")
    public BlogPost findBlogPostById(){
        return blogPostsService.findById(id);

    }


    @PutMapping("/{123}")
    public BlogPost findBlogPostByIdAndUpdate(@PathVariable BlogPost id, @RequestBody BlogPost body){}

    @DeleteMapping("/{123}")
    public void deleteBlogPost(@PathVariable BlogPost id){}


}
