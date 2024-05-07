import axios from "axios";

const service = axios.create({
    baseURL: '/dev-api', // 设置基础 URL
    timeout: 60000,
    headers: {
        'Content-Type': 'application/json', // 设置默认请求头
    },
    // 其他配置...
});

export const get = (url, params = {}) => {
    return instance.get(url, { params })
      .then(response => response.data)
      .catch(error => {
        console.error('GET request error:', error);
        throw error;
    });
};

// 封装 POST 请求
export const post = (url, data = {}) => {
    return instance.post(url, data)
      .then(response => response.data)
      .catch(error => {
        console.error('POST request error:', error);
        throw error;
    });
};

export default service;