package com.example.experimentchapter45;

import com.example.experimentchapter45.Mapper.BookMapper;
import com.example.experimentchapter45.Model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/c")
public class ControllerC
{
    @Autowired
    BookMapper bookMapper;

    @GetMapping("/register")
    public String register()
    {
        return "index";
    }
    @PostMapping ("/booklist")
    public String booklist(Model model)
    {

        List<Book> books= bookMapper.findAllBooks();
        model.addAttribute("books",books);
        return "index2";
    }
    @GetMapping("/affix")
    public String affix(Model model)
    {
        return "index3";
    }
    @PostMapping("/succeed")

    public String succeed(@ModelAttribute("form")Book book)
    {
//        System.out.println(book);
        bookMapper.insert(book);
        return "index4";
    }
}
