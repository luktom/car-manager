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
package pl.lksztmczk.carmanager.data.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

/**
 * Entity describing a car.
 */
@Entity
public class Car {

    @Id
    @GeneratedValue
    private Long id;

    private String brand;

    private String model;

    private String VIN;

    private Integer yearOfProduction;

    private String registrationNumber;

    public Car() {
    }

    public Car(String brand, String model, String VIN, Integer yearOfProduction,
               String registrationNumber) {
        this.brand = brand;
        this.model = model;
        this.VIN = VIN;
        this.yearOfProduction = yearOfProduction;
        this.registrationNumber = registrationNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(Integer yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return id.equals(car.id)
                && brand.equals(car.brand)
                && model.equals(car.model)
                && VIN.equals(car.VIN)
                && yearOfProduction.equals(car.yearOfProduction)
                && registrationNumber.equals(car.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, VIN, yearOfProduction, registrationNumber);
    }
}
