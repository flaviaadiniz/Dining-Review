package com.codecademy.diningreview.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "dining_reviews")
public class DiningReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String submittedBy;
    private Long restaurantId;
    private String review;

    private Integer peanutScore;
    private Integer dairyScore;
    private Integer eggScore;

}
