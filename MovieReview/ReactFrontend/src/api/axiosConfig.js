import axios from 'axios';

export default axios.create({
    baseURL:'https://9c96-103-106-239-104.ap.ngrok.io',
    headers: {"ngrok-skip-browser-warning": "true"}
    //used for client http request to not be blocked by CORS
    //Cross Origin Resource Sharing
});