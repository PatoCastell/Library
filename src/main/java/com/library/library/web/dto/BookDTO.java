package com.library.library.web.dto;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BookDTO {
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
