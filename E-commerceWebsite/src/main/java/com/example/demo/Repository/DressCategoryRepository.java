package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.DressCategory;

public interface DressCategoryRepository extends JpaRepository<DressCategory,Long> {

}
