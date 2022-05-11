package io.wisoft.springsecurity.domain.posts;

import io.wisoft.springsecurity.domain.posts.entity.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
