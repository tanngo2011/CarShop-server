package com.example.CarShop.service;

import com.example.CarShop.dto.CarDto;
import com.example.CarShop.entity.Car;
import com.example.CarShop.form.CarCreateForm;
import com.example.CarShop.form.CarUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CarService {

    CarDto create(CarCreateForm form);

    Page<CarDto> findAll(Pageable pageable);

    CarDto update(CarUpdateForm form);

    void deleteById(Car.PrimaryKey pk);

}
