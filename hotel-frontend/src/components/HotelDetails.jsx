import React, { useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';
import axios from 'axios';

const HotelDetails = () => {
    const { hotel_ID } = useParams();
    const [rooms, setRooms] = useState([]);

    useEffect(() => {
        axios.get(`http://localhost:8080/api/hotels/${hotel_ID}/available-rooms`)
            .then(response => {
                setRooms(response.data);
            })
            .catch(error => {
                console.error('There was an error fetching the rooms!', error);
            });
    }, [hotel_ID]);

    return (
        <div>
            <h1>Available Rooms</h1>
            <ul>
                {rooms.map(room => (
                    <li key={room.id}>
                        Room Number: {room.roomNumber}, Price: {room.price}
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default HotelDetails;
