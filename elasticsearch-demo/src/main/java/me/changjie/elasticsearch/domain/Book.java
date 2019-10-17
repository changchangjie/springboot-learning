package me.changjie.elasticsearch.domain;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * Created by ChangJie on 2019-09-25.
 */
@Document( indexName = "testindex" , type = "book")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private Integer id;
    private String bookName;
    private String author;

    public static void main(String[] args) {
        Book book = new Book();
        book.setId(1);
        book.setBookName("aaa");
        System.out.println(JSON.toJSONString(book));
    }
}
