package pl.coderslab.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private long id;
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private String type;
}
