package com.larissa.webServices.repositories;

import com.larissa.webServices.entities.Category;
import com.larissa.webServices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
