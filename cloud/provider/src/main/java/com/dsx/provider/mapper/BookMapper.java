package com.dsx.provider.mapper;

import com.dsx.provider.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Mapper
@Repository("BookMapper")
public interface BookMapper {

    @Select("SELECT * FROM book where book_id = #{bookId}")
    Book getBookById(@Param("bookId") Integer bookId);
}
