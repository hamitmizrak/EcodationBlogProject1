import { BrowserRouter as  Router , Route , Switch } from 'react-router-dom'
// import { Route } from 'react-router-dom'
// import { Switch } from 'react-router-dom'
// import { Router } from 'react-router-dom'

import './App.css'
import CreateAdminComponent from './components/CreateAdminComponent'
import FooterComponent from './components/FooterComponent'
import HeaderComponent from './components/HeaderComponent'
import ListAdminComponent from './components/ListAdminComponent'
import ViewAdminComponent from './components/ViewAdminComponent'

//rfc ==> TAB
function App() {
  return (
    <>
     <Router>
        <HeaderComponent />
          <div className='container'>
            <Switch>
              <Route path="/" exact component={ListAdminComponent}></Route>
              <Route path="/admins" component={ListAdminComponent}></Route>
              <Route path="/add-admin/:id" component={CreateAdminComponent}></Route>
              <Route path="/view-admin/:id" component={ViewAdminComponent}></Route>
            </Switch>
          </div>
        <FooterComponent />
        </Router>
    </>
  )
}

export default App
