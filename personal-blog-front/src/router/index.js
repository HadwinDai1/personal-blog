import Vue from 'vue'
import VueRouter from 'vue-router'
import IndexView from '../layout/index.vue'
import Home from  '../views/index'
Vue.use(VueRouter)

const routes = [
  // 登入路由配置
  {
    path: '/login',
    name: 'login',
  },
  // 首页路由
  {
    path: '/', // 路径
    name: 'index',
    component: IndexView, // 组件
    redirect: '/index', // 重定向
    children: [
      {
        path: '/index',
        component: (resolve) => require(['@/views/index'], resolve),
        children: [

        ]
      },
      {
        path: '/blog',
        component: (resolve) => require(['@/views/Login'], resolve),
        children: [

        ]
      }
    ]
  },
  

]

const router = new VueRouter({
  mode: 'history',
  routes
})

export default router;
