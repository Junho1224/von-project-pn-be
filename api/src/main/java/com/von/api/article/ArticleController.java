package com.von.api.article;


import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class ArticleController {
    private final ArticleService service;

    public Map<?,?> findAll() throws SQLException {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
