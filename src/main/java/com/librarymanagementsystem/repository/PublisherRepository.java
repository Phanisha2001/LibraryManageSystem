package com.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.librarymanagementsystem.entity.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {

}
