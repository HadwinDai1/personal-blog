const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  devServer: {
    port: 8081 // 你想要使用的新端口号
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
