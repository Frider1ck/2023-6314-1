import React, { useContext, useState } from 'react';
import { Helmet } from 'react-helmet-async';
import { Store } from '../Store';
import { Card, ListGroup } from 'react-bootstrap';

export default function ProfileScreen() {
    const { state, dispatch: ctxDispatch } = useContext(Store);
    const { userInfo } = state;
    const [name, setName] = useState(userInfo.name);
    const [email, setEmail] = useState(userInfo.email);


    return (
        <div className="container">
            <Helmet>
                <title>User Profile</title>
            </Helmet>
            <h1 className="my-3">User Profile</h1>
            <Card>
                <Card.Body>
                    <Card.Title>Мой аккаунт</Card.Title>
                    <ListGroup variant="flush">
                        <ListGroup.Item>
                            <strong>Имя: </strong>{name}
                        </ListGroup.Item>
                        <ListGroup.Item>
                            <strong>Email: </strong>{email ? email : '-'}
                        </ListGroup.Item>
                    </ListGroup>
                </Card.Body>
            </Card>
        </div>
    );
}