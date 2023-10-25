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
      <div class="form-group">
          <label for="inputAddress">Address</label>
          <input type='text' class="form-control" id='inputAddress' placeholder='1234 Main St'></input>
      </div>
      <div class='form-group'>
        <label for="inputAddress2">Address 2</label>
        <input type='text' class="form-control" id="iputAddress2" placeholder='Apartment, studio, or floor'></input>
      </div>
      <div class="form-row">
        <div class="form-group col-md-6">
          <label for="inputCity">City</label>
          <input type='text' class="form-control" id='inputCity'></input>
        </div>
      </div>
    </form>
  );
}

export default App;
