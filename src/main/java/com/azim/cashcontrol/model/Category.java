package com.azim.cashcontrol.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@ApiModel(description = "class representing the category")
@Table(name = "category")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    @SequenceGenerator(
            name = "category_sequence",
            sequenceName = "category_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "category_sequence"
    )
    @ApiModelProperty(notes = "Id is autogenerated", example = "1", required = false, allowEmptyValue = true)
    private Long id;

    @ApiModelProperty(notes = "Name of the category", example = "fitness", required = true, allowEmptyValue = false)
    private String name;

    @Size(max = 500)
    @ApiModelProperty(notes = "Description of the category", example = "Fitness supplements", required = false, allowEmptyValue = true)
    private String description;
}
