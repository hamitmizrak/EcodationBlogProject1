import React, { Component } from "react";

//Java ile Frontend arasındaki köprüdür.
import axios from "axios";

export default class CreateAdminComponent extends Component {

  //constructor:props: containerler arasıda veri alıp göndermek state: durum bind: bağlamak
  constructor(props) {

    super(props);

    //state durum demektir. default değerler vermek 
    this.state = {
      adminName: "",
      adminEmail: "",
      adminPassword:"",
      adminId: "",
    };

    //bind: bağlamak
    this.changeAdminName = this.changeAdminName.bind(this);
    this.changeAdminEmail = this.changeAdminEmail.bind(this);
    this.changeAdminPassword = this.changeAdminPassword.bind(this);
    this.changeAdminId = this.changeAdminId.bind(this);
  }

  //inputtan gelen dataları almak ve işlemek
  changeAdminName = (event) => {
    this.setState({ adminName: event.target.value });
  };

  changeAdminEmail = (event) => {
    this.setState({ adminEmail: event.target.value });
  };

  changeAdminPassword = (event) => {
    this.setState({ adminPassword: event.target.value });
  };

  changeAdminId = (event) => {
    this.setState({ adminId: event.target.value });
  };


  //kaydetmek
  saveAdmin = (save) => {
    //form göndermeden öncesinden buradan çalış
    save.preventDefault();

    let admin = {
      adminName: this.state.adminName,
      adminEmail: this.state.adminEmail,
      adminPassword: this.state.adminPassword,
      adminId: this.state.adminId,
    };
    console.log("admin ==> " + JSON.stringify(admin));

    axios.post("/api/v1/admins", admin).then((res) => {
      this.props.history.push("/admins");
    });
  };

  //temizle
  cancel() {
    this.props.history.push("/add-admin");
  }

  render() {
    return (
      <div>
        <div className="container">
          <div className="row">
            <div className="card col-md-6 offset-md-3 offset-md-3">
              <h3 className="text-center">Admin Ekle</h3>
              <div className="card-body">
                <form>
                  <div className="form-group mb-3">
                    <label>Admin Adı</label>
                    <input placeholder="admin Adı giriniz" name="adminName" className="form-control" value={this.state.adminName} onChange={this.changeAdminName} />
                  </div>

                  <div className="form-group mb-3">
                    <label>adminEmail</label>
                    <input placeholder="admin Email giriniz" name="adminEmail" className="form-control" value={this.state.adminEmail} onChange={this.changeAdminEmail} />
                  </div>

                  <div className="form-group mb-3">
                    <label>adminPassword</label>
                    <input type="password" placeholder="admin Şifre giriniz" name="adminPassword" className="form-control" value={this.state.adminPassword} onChange={this.changeAdminPassword} />
                  </div>

                  <div className="form-group mb-3">
                    <label>adminId</label>
                    <input placeholder="adminId giriniz" name="adminId" className="form-control" value={this.state.adminId} onChange={this.changeEmailId} />
                  </div>
                  <button className="btn btn-success" onClick={this.saveAdmin} > Kaydet </button>
                  <button className="btn btn-danger" onClick={this.cancel.bind(this)} > Temizle </button>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    );
  }
}
