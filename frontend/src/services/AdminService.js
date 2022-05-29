import axios from "axios";

///api/v1/admins/list
const ADMIN_API_BASE_URL="/api/v1/admins/list";

class AdminService {
   getAdmin(){
       return axios.get(ADMIN_API_BASE_URL);
    }
}

export default AdminService;