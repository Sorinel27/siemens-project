import React, { useEffect, useState } from 'react';
import { useLocation } from 'react-router-dom';
import axios from 'axios';

const useQuery = () => {
    return new URLSearchParams(useLocation().search);
};

const NearbyHotels = () => {
    const query = useQuery();
    const latitude = query.get('latitude');
    const longitude = query.get('longitude');
    const radius = query.get('radius');
    const [hotels, setHotels] = useState([]);

    useEffect(() => {
        if (latitude && longitude && radius) {
            axios.get('http://localhost:8080/api/hotels/nearby', {
                params: {
                    latitude: latitude,
                    longitude: longitude,
                    radius: radius
                }
            })
            .then(response => {
                setHotels(response.data);
            })
            .catch(error => {
                console.error("There was an error fetching the hotels!", error);
            });
        }
    }, [latitude, longitude, radius]);

    return (
        <div>
            <h1>Search Results</h1>
            {hotels.map(hotel => (
                <div key={hotel.id}>
                    <h2>{hotel.name}</h2>
                    <p>{hotel.latitude}</p>
                    <p>{hotel.longitude}</p>
                </div>
            ))}
        </div>
    );
};

export default NearbyHotels;
