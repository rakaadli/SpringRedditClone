package com.rap.springredditclonerap.repository;

import com.rap.springredditclonerap.model.Post;
import com.rap.springredditclonerap.model.Subreddit;
import com.rap.springredditclonerap.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
