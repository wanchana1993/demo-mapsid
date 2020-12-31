package com.example.demo.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class BookInfoId implements Serializable {

    private String isbn;
    private Integer authorId;

    public BookInfoId() {
    }

    public BookInfoId(String isbn, Integer authorId) {
        this.isbn = isbn;
        this.authorId = authorId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookInfoId that = (BookInfoId) o;
        return isbn.equals(that.isbn) &&
                authorId.equals(that.authorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, authorId);
    }
}
