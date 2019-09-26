package me.changjie.elasticsearch.repository;

import me.changjie.elasticsearch.domain.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * Created by ChangJie on 2019-09-25.
 */
public interface BookRepository extends ElasticsearchRepository<Book, Integer> {

    List<Book> findByBookNameLike(String bookName);
}
