import './App.css';

function App() {
  return (
    <form>
      <div class='form-row'>
        <label for="inputEmail4">Email</label>
        <input type='email' class='form-control' id='inputEmail4' placeholder='Email' />
      </div>
      <div class="form-group col-md-6">
        <label for="inputPassword4">Password</label>
        <input type='password' class="form-control" id='inputPassword' placeholder='Password' />
      </div>
      <div className='form-group'>
        <label for="inputAddress2">Address</label>
        <input type='text' class="form-control" id="iputAddress2" placeholder='Apartment, studio, or floor'></input>
      </div>
    </form>
  );
}

export default App;
