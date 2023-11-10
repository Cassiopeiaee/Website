package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BlogController {
    private List<BlogEntry> blogEntries = new ArrayList<>();

    @GetMapping("/blog/entries")
    public List<BlogEntry> getBlogEntries() {
        return blogEntries;
    }

    @PostMapping("/blog/entries")
    public BlogEntry createBlogEntry(@RequestBody BlogEntry blogEntry) {
        // ID für einen Blog Eintrag
        blogEntry.setId(System.currentTimeMillis());
        // Neuer Blogeintrag in der Liste
        blogEntries.add(blogEntry);
        // Rückgabe Blogeintrag
        return blogEntry;
    }
}