import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import reportWebVitals from './reportWebVitals';
import './boostrap_data.scss'
import 'bootstrap/dist/css/bootstrap.min.css'
import Admin from "./Admin";


//<Login />
ReactDOM.render(
    <React.StrictMode>
        <Admin/>
    </React.StrictMode>,
    document.getElementById("root")
);


reportWebVitals();
