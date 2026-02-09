import axios from 'axios';

const http = axios.create({
  baseURL: '/api',
  timeout: 10_000
});

http.interceptors.response.use(
  (response) => response,
  (error) => {
    return Promise.reject(error);
  }
);

export default http;
