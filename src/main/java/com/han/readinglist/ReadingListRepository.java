package com.han.readinglist;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: Hanjiafeng
 * @Date: 2019-07-09
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {
    List<Book> findBooksByReader(String reader);
}
