package ImageHoster.service;

import ImageHoster.model.Comment;
import ImageHoster.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.CompositeName;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;
    //call createComment on the comment repository
    public Comment createComment(Comment comment) {
        return commentRepository.createComment(comment);
    }

}

