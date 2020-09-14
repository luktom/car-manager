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
import React, { Component } from 'react';
import ReactDOM from 'react-dom';

import axios from 'axios';
import CarList from './components/CarList';

import '../css/main.scss';

class App extends Component {
    constructor(props) {
        super(props);
        this.state = { cars: [] };
    }

    componentDidMount() {
        axios.get('/api/cars')
            .then(response => {
                this.setState({ cars: response.data._embedded.cars });
            });
    }

    render() {
        const { cars } = this.state;
        return (
            // eslint-disable-next-line react/jsx-filename-extension
            <CarList cars={cars} />
        );
    }
}

ReactDOM.render(
    <App />,
    document.getElementById('react'),
);