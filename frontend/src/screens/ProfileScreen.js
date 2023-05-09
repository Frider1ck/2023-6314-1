import React, { useContext, useReducer, useState } from 'react';
import { Helmet } from 'react-helmet-async';
import { Store } from '../Store';
import { toast } from 'react-toastify';
import { getError } from '../utils';
import axios from 'axios';
import { Card, ListGroup } from 'react-bootstrap';

const reducer = (state, action) => {
    switch (action.type) {
        case 'UPDATE_REQUEST':
            return { ...state, loadingUpdate: true };
        case 'UPDATE_SUCCESS':
            return { ...state, loadingUpdate: false };
        case 'UPDATE_FAIL':
            return { ...state, loadingUpdate: false };

        default:
            return state;
    }
};

export default function ProfileScreen() {
    const { state, dispatch: ctxDispatch } = useContext(Store);
    const userInf = JSON.parse(localStorage.getItem('user'));
    const { userInfo } = state;
    return (
        <div className="container small-container">
            <Helmet>
                <title>User Profile</title>
            </Helmet>
            <h1 className="my-3">User Profile</h1>
            <Card>
                <Card.Body>
                    <Card.Title>Мой аккаунт</Card.Title>
                    <ListGroup variant="flush">
                        <ListGroup.Item>
                            <strong>Email: </strong>{userInf.email}
                        </ListGroup.Item>
                        <ListGroup.Item>
                            <strong>Password: </strong>{userInf.password}
                        </ListGroup.Item>
                    </ListGroup>
                </Card.Body>
            </Card>
        </div>
    );
}