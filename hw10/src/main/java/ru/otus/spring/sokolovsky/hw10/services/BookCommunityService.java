package ru.otus.spring.sokolovsky.hw10.services;

import ru.otus.spring.sokolovsky.hw10.domain.Book;
import ru.otus.spring.sokolovsky.hw10.domain.Comment;

import java.util.List;

public interface BookCommunityService {
    Comment registerBookComment(Book book, String comment);
}
