// import { from } from "core-js/core/array";
import {createRouter, createWebHistory} from "vue-router"; 

import HomeIndex from '@/layout/HomeIndex' 



const routes = [
  { path: '/', component: HomeIndex},
];
 

const router = createRouter({
  routes,
  history: createWebHistory()
})


export default router;