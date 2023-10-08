package com.map.mappingPractise.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {

    @Id
    private String bookId;

    private String bookTitle;
    private String bookAuthor;
    private String bookDescription;
    private String bookPrice;

    @ManyToOne
    @JoinColumn(name = "fk_student_id")
    private Student student;
}