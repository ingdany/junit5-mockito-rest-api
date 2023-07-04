package com.kaligent.springboot.junitmockitorestapi;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "book_record")
@Data
@NoArgsConstructor
// @AllArgsConstructor
@Builder
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookId;

    @NonNull
    private String name;

    @NonNull
    private String summary;

    private int rating;

    public Long getBookId() {
        return this.bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Book(Long bookId, @NonNull String name, @NonNull String summary, int rating) {
        this.bookId = bookId;
        this.name = name;
        this.summary = summary;
        this.rating = rating;
    }
}
