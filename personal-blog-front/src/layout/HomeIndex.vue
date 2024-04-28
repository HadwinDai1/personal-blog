<template>
  <div class="common-layout">
    <el-container>
      <el-aside width="20%">Aside</el-aside>
      <el-main><main-index /></el-main>
    </el-container>
  </div>
</template>

<script>

import MainIndex from '@/layout/main/MainIndex.vue'

export default {
  components: { MainIndex },
  component: {
  },
}
</script>

<style scoped>
  .common-layout{
    margin:0px;
  background: url(E:\code\Personal_code_git\PersonalBlog\personal-blog\personal-blog-front\src\assets\bg-wool-dark.png) no-repeat;
  background-size:100% 100%;
  background-attachment:fixed;

  }

  .el-aside{
    padding: 0;
    margin: 0;
  }

  .el-main{
    padding: 0;
    margin: 0;
  }
</style>