import axios from "axios";


const EMPLOYEE_API_BASE_URL="/api/v1/admins/list";

class EmployeeService {
  getEmployees() {
    return axios.get(EMPLOYEE_API_BASE_URL);
  }

 
}

export default new EmployeeService()