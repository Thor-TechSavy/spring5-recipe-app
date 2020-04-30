package com.springframework.spring5recipeapp.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@EqualsAndHashCode
@Builder(toBuilder = true)
@Entity
@Table(name = "CATEGORY_CODE", uniqueConstraints = {
        @UniqueConstraint(name = "UNIQUE_VALUE_CATEGORY_CODE", columnNames = {"VALUE"})
})
@NoArgsConstructor
@AllArgsConstructor
public class CategoryCode {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CATEGORY_CODE")
    @SequenceGenerator(name = "SEQ_CATEGORY_CODE", sequenceName = "CATEGORY_CODE_SEQ",
            allocationSize = 1)
    @Column(name = "ID", updatable = false, nullable = false)
    private Long id;

    @Column(name = "VALUE", nullable = false)
    private String value;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "CATEGORY_CODE_ID")
    private List<SubcategoryCode> subcategoryCodeList;
}