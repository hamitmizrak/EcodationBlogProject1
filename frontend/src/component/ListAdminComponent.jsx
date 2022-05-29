import React, { Component } from "react";
import AdminService from "../services/AdminService";
//rcc ==> TAB
export default class ListAdminComponent extends Component {

  //constructor: state,props,bind
  constructor(props) {
    super(props);

    //durumu
    this.state = {
      adminArray: [],
    };

    //bind: bağlamak
    this.addAdmin=this.addAdmin.bind(this);
    this.addList=this.addList.bind(this);
  }

  //ROUTER ADD  PHP
  addAdmin(){
    this.props.history.push("/add-admin")
  }

  addList(){
    this.props.history.push("/anasayfa")
  }

  //SERVICE
  //adminArray: servisten gelen data ile doldurdum
  componentDidMount() {
    AdminService.getAdmin().then((response) => {
      this.setState({ adminArray: response.data });
    });
  }

  render() {
    return (
      <>
        <h2 className="text-center">Admin Listesi</h2>
  
          <button className="btn btn-warning  btn-sm mt-3 mb-3" style={{"marginRight":"2%"}} onClick={this.addList}>Listeleme ekle</button>
          <button className="btn btn-primary btn-sm mt-3 mb-3" onClick={this.addAdmin}>Müşteri ekle</button>
        <div className="row">
          <table className="table table-striped table-bordered">
            <thead>
              <tr>
                <th>Adı</th>
                <th>Email</th>
                <th>Şifre</th>
                <th>View</th>
                <th>Update</th>
                <th>Delete</th>
              </tr>
            </thead>

            <tbody>
               {/* adminId,adminName,adminEmail ==> AdminDto geliyor dikkat */}
              {
              this.state.adminArray.map(
                admin => 
                <tr key={admin.adminId}>
                  <td>{admin.adminName} </td>
                  <td> {admin.adminEmail} </td>
                  <td>{admin.adminPassword} </td>
                  <td>
                    <i className="fa-solid fa-binoculars text-warning"></i>
                    </td>
                    <td>
                    <i className="fa-solid fa-wrench text-primary"></i>
                    </td>
                    <td>
                    <i className="fa-regular fa-trash-can text-danger"></i>
                    </td>
                </tr>
              )
              }
            </tbody>
          </table>
        </div>
      </>
    );
  }
}
