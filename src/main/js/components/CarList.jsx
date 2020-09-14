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

import Car from './Car';

const CarList = props => {
    const { cars } = props;
    return (
        <table className="table">
            <thead>
                <tr>
                    <th>Brand</th>
                    <th>Model</th>
                    <th>VIN</th>
                    <th>Year of production</th>
                    <th>Registration number</th>
                </tr>
            </thead>
            <tbody>
                {cars && cars.map(car => <Car key={car._links.self.href} car={car} />)}
            </tbody>
        </table>
    );
};

CarList.propTypes = {
    cars: PropTypes.isRequired,
};

export default CarList;
