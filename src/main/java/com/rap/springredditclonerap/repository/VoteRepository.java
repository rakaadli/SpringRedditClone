package com.rap.springredditclonerap.repository;

import com.rap.springredditclonerap.model.Post;
import com.rap.springredditclonerap.model.User;
import com.rap.springredditclonerap.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
