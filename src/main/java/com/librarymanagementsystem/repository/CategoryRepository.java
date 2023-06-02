package com.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.librarymanagementsystem.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
