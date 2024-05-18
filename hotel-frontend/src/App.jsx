import React, { useState, useEffect } from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import SearchHotels from './components/SearchHotels';
import NearbyHotels from './components/NearbyHotels';
import './App.css'

function App() {
  return (
    <>
      <Routes>
        <Route path='/' exact element={<SearchHotels />} />
        <Route path='/search' element={<NearbyHotels />} />
      </Routes>
    </>
  )
}

export default App
