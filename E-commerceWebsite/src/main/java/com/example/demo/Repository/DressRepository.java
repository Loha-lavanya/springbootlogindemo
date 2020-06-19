package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Dress;

public interface DressRepository  extends JpaRepository<Dress,Long> {

}
