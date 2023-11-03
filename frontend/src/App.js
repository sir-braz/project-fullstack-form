import axios from 'axios';
import React, { useState } from 'react';
import './App.css';

const baseURL = "http://localhost:8080/api/register"; 


function App() {
  const [user, setUser] = useState({
    email: '',
    password: '',
    text: '',
  });

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      const response = await axios.post(baseURL, user);
      console.log('POST response:', response.data);
    } catch (error) {
      console.error('Error:', error);
    }
  };

  return (
    <form>
      <div className='form-row'>
        <label htmlFor="inputEmail4">Email</label>
        <input type='email' className='form-control' id='inputEmail4' placeholder='Email' />
      </div>
      <div className="form-group col-md-6">
        <label htmlFor="inputPassword4">Password</label>
        <input type='password' className="form-control" id='inputPassword4' placeholder='Password' />
      </div>
      <div className="form-group">
        <label htmlFor="inputAddress">Address</label>
        <input type='text' className="form-control" id='inputAddress' placeholder='1234 Main St' />
      </div>
      <div className='form-group'>
        <label htmlFor="inputAddress2">Address 2</label>
        <input type='text' className="form-control" id="inputAddress2" placeholder='Apartment, studio, or floor' />
      </div>
      <div className="form-row">
        <div className="form-group col-md-6">
          <label htmlFor="inputCity">City</label>
          <input type='text' className="form-control" id='inputCity' />
        </div>
        <div className="form-group col-md-4">
          <label htmlFor="inputState">State</label>
          <select id='inputState' className="form-control">
            <option>Choose...</option>
            <option>...</option>
          </select>
        </div>
      </div>
      <div className="form-group">
        <div className="form-check">
          <input className="form-check-input" type='checkbox' id='gridCheck' />
          <label className="form-check-label" htmlFor="gridCheck">
            Check Me
          </label>
        </div>
      </div>
      <button type='submit' className="btn btn-primary" onClick={handleSubmit}>
        Sign in
      </button>
    </form>
  );
}

export default App;
