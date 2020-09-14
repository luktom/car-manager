/**
 * Copyright (C) 2020 Łukasz Tomczak <lksztmczk@gmail.com>.
 *
 * This file is part of Car Manager application.
 *
 * Car Manager application is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Car Manager application is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Car Manager application. If not, see <http://www.gnu.org/licenses/>.
 */
package pl.lksztmczk.carmanager.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.lksztmczk.carmanager.data.model.Car;
import pl.lksztmczk.carmanager.data.repository.CarRepository;

@Component
public class DemoDataLoader implements CommandLineRunner {

    private final CarRepository carRepository;

    @Autowired
    public DemoDataLoader(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void run(String... args) {
        this.carRepository.save(new Car("Brand", "Model", "ABC12345", 2000, "AB 00000"));
    }
}