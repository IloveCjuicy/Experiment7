package com.example.experimentchapter45.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.experimentchapter45.Model.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BookMapper extends BaseMapper<Book>
{
    @Select("SELECT * FROM book")
    List<Book> findAllBooks();
    @Insert({"insert into book value(#{bookname},#{author},#{publishday},#{stock},#{publisher},#{per})"})
    int insert(Book book);
}
