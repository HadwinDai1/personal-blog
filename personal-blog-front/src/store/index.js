import Vue from 'vue'
import Vuex from 'vuex'
import {getFooterInfo} from '@/api/footer'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    count: 1,
    footerInfo: {
      author: undefined,
      icpNumber: undefined,
      policeNumber: undefined,
    },
  },
  getters: {
  },
  mutations: {
    // 获取页脚信息
    getFooterInfo(){
      getFooterInfo().then((res) => {
        this.state.footerInfo.icpNumber = res.data.icpNumber;
        this.state.footerInfo.policeNumber = res.data.policeNumber;
        this.state.footerInfo.author = res.data.author;
      }).finally(() => {
      this.loading = false;
      });
    },
  },
  actions: {
    
  },
  modules: {
  },
  
})
