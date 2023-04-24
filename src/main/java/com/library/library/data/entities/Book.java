package com.library.library.data.entities;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@SQLDelete(sql = "UPDATE BOOK SET DELETED = TRUE WHERE ID = ?")
@Where(clause = "DELETED = FALSE")
@Table(name = "BOOK", schema = "LIBRARY_APP")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "ISBN")
    private Long isbn;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "NUMBER_PAGES")
    private Integer numberPages;
    //private String cover;

    @Column(name = "PUBLICATION_DATE")
    private LocalDateTime publicationDate;

    //private Gender gender;
    //private Author author;
    //private Editory editory;

    @CreationTimestamp
    @Column(name = "CREATION_DATE")
    private LocalDateTime creationDate;

    @UpdateTimestamp
    @Column(name = "UPDATE_DATE")
    private LocalDateTime updateDate;

    @Column(name = "DELETED")
    @Builder.Default
    private Boolean deleted = Boolean.FALSE;

}
