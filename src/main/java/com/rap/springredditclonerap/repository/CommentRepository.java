package com.rap.springredditclonerap.repository;

import com.rap.springredditclonerap.model.Comment;
import com.rap.springredditclonerap.model.Post;
import com.rap.springredditclonerap.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
