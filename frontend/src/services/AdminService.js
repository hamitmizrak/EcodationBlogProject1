import axios from "axios";

 //http://localhost:8080/api/v1/admins/list
const EMPLOYEE_API_BASE_URL="/api/v1/admins/list";

class AdminService {
  getAdmin() {
    return axios.get(EMPLOYEE_API_BASE_URL);
  }

 
}

export default new AdminService()