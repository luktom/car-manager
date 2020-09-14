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
import React from 'react';
import PropTypes from 'prop-types';

const Car = props => {
    const { car } = props;
    return (
        <tr>
            <td>{car.brand}</td>
            <td>{car.model}</td>
            <td>{car.VIN}</td>
            <td>{car.yearOfProduction}</td>
            <td>{car.registrationNumber}</td>
        </tr>
    );
};

Car.propTypes = {
    car: PropTypes.isRequired,
    brand: PropTypes.string.isRequired,
    model: PropTypes.string.isRequired,
    VIN: PropTypes.string.isRequired,
    yearOfProduction: PropTypes.number.isRequired,
    registrationNumber: PropTypes.string.isRequired,
};

export default Car;
