import "./Admin.css";
import ListAdminComponent from "./component/ListAdminComponent";//list
import HeaderComponent from "./component/HeaderComponent";//header
import FooterComponent from "./component/FooterComponent";//footer

import { BrowserRouter as Router, Route, Switch } from "react-router-dom"; //path
import CreateAdminComponent from "./component/CreateAdminComponent"; //ekleme

function Admin() {
  return (
    <div>
      <Router>
          <HeaderComponent />
          <div className="container">
            <Switch>
              <Route path="/" exact component={ListAdminComponent}></Route>
              <Route path="/anasayfa" component={ListAdminComponent}></Route>
              <Route path="/add-admin" component={CreateAdminComponent}></Route>
              <ListAdminComponent />
            </Switch>
          </div>
          <FooterComponent />
      </Router>
    </div>
  );
}

export default Admin;
