import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import reportWebVitals from './reportWebVitals';
import './boostrap_data.scss'
import 'bootstrap/dist/css/bootstrap.min.css'
import Employee from "./Employee";


//<Login />
ReactDOM.render(
    <React.StrictMode>
        <Employee/>
    </React.StrictMode>,
    document.getElementById("root")
);


reportWebVitals();
