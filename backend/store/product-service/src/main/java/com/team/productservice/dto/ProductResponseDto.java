package com.team.productservice.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponseDto {
  @NotNull
  private Long id;

  @NotBlank
  private String name;

  @NotBlank
  private String description;

  @Positive
  private Double cost;

  @Positive
  private Long countInStock;

  @Size(min = 1, max = 20)
  private List<Long> imageIds;


}
