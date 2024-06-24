package com.apiweb.ApiWeb.repository;


import com.apiweb.ApiWeb.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoriesRepository extends JpaRepository<Categories, Long> {

}
