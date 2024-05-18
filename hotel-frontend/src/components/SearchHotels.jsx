import React, { useState, useEffect } from 'react';
import {useNavigate} from 'react-router-dom';


const SearchHotels = () => {
    const [latitude, setLatitude] = useState(null);
    const [longitude, setLongitude] = useState(null);
    const [radius, setRadius] = useState(20); // Default radius in kilometers
    const navigate = useNavigate();

    useEffect(() => {
        if (navigator.geolocation) {
            navigator.geolocation.getCurrentPosition((position) => {
                setLatitude(position.coords.latitude);
                setLongitude(position.coords.longitude);
            });
        } else {
            alert("Geolocation is not supported by this browser.");
        }
    }, []);

    const handleSubmit = (e) => {
        e.preventDefault();
        if (latitude && longitude) {
            navigate(`/search?latitude=${latitude}&longitude=${longitude}&radius=${radius}`);
        } else {
            alert("Unable to get your location.");
        }
    };

    return (
        <div>
            <h1>Nearby Hotels</h1>
            <form onSubmit={handleSubmit}>
                <label>
                    Radius (km):
                    <input
                        type="number"
                        value={radius}
                        onChange={(e) => setRadius(e.target.value)}
                    />
                </label>
                <button type="submit">Search nearby hotels</button>
            </form>
        </div>
    );
};

export default SearchHotels;
