package com.springframework.spring5recipeapp.domain;

import lombok.*;

import javax.persistence.*;

@Data
@EqualsAndHashCode
@Builder(toBuilder = true)
@Entity
@Table(name = "SUB_CATEGORY_CODE", uniqueConstraints = {
        @UniqueConstraint(name = "UNIQUE_VALUE_SUB_CATEGORY_CODE", columnNames = {"VALUE"})
})
@NoArgsConstructor
@AllArgsConstructor
public class SubcategoryCode {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_SUB_CATEGORY_CODE")
    @SequenceGenerator(name = "SEQ_SUB_CATEGORY_CODE", sequenceName = "SUB_CATEGORY_CODE_SEQ",
    allocationSize = 1)
    @Column(name = "ID", updatable = false, nullable = false)
    private Long id;

    @Column(name = "VALUE", nullable = false)
    private String value;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_CODE_ID", referencedColumnName = "ID")
    private CategoryCode categoryCode;
}
