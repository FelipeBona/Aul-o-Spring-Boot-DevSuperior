package com.devsuperior.myfirstproject.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.devsuperior.myfirstproject.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

	
}