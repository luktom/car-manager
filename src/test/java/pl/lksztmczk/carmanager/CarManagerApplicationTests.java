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
package pl.lksztmczk.carmanager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.lksztmczk.carmanager.data.model.Car;
import pl.lksztmczk.carmanager.data.repository.CarRepository;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CarManagerApplicationTests {

    @Autowired
    private CarRepository carRepository;

    @Test
    void objectReturnedByGetShouldMatchInsertedOne() {
        Car save = carRepository.save(
                new Car("M", "B", "1234", 2000, "ABCD"));
        Optional<Car> carById = carRepository.findById(save.getId());
        assertThat(carById.isPresent());
        assertThat(carById.get()).isEqualTo(save);
    }
}
