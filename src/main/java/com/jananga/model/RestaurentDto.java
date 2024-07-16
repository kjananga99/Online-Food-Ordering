package com.jananga.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.util.List;

@Data
@Embeddable
public class RestaurentDto {
    private String title;

    @Column
    private List<String> images;

    private String description;
    private Long id;

}
