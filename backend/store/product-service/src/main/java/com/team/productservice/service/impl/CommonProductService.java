package com.team.productservice.service.impl;

import com.team.productservice.data.Image;
import com.team.productservice.data.Product;
import com.team.productservice.repository.ProductRepository;
import com.team.productservice.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class CommonProductService implements ProductService {
  private final ProductRepository productRepository;
  private static final String RESOURCE_DIRECTORY = System.getProperty("user.dir") + "src/main/resources/static/";

  @Override
  public List<Product> getAll() {
    return productRepository.findAll();
  }
}