import axios from "axios";

const http = axios.create({
    baseURL: '/dev-api', // 设置基础 URL
    timeout: 60000,
    // 其他配置...
});