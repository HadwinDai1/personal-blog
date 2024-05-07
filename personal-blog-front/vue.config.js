const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  devServer: {
    port: 80, // 你想要使用的新端口号
    proxy: {
      '/dev-api': {

        // target: `http://10.0.85.95:8080`,
         target: `http://localhost:8080`,
         // target:`http://10.30.2.60:8080`,
         changeOrigin: true,
         pathRewrite: {
           '^/dev-api' : '',
         },
       },
    }
  },
  // configureWebpack: {
  //   name: "PersonalBlog",
  //   resolve: {
  //     alias: {
  //       '@': resolve('src'),
  //     },
  //   },
  // },
})
