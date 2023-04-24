package com.library.library.domain.book;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BookModel {

    private Long id;

    private Long isbn;

    private String title;

    private Integer numberPages;

    //private String cover;

    private LocalDateTime publicationDate;

    private LocalDateTime creationDate;

    private LocalDateTime updateDate;

    private Boolean deleted;
}
