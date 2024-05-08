<template>
    <div class="header">
        <div class="left">
            <img class="header-logo" src="../../assets/Logo.svg" alt="">
        </div>
        <div class="right">
            <div>
                <router-link to="/index"><button class="transparent-btn">首页</button></router-link>
                <router-link to="/index"><button class="transparent-btn">关于</button></router-link>
                <router-link to="/index"><button class="transparent-btn">作品</button></router-link>
                <router-link to="/blog"><button class="transparent-btn">博客</button></router-link>
            </div>
        </div>
    </div>
</template>

<script>
    export default{
        name: 'Header',
        data() {
            return{
                
            }
        },
        methods: {
        }
    }
</script>

<style scoped>
.header{
    margin: 0;
    padding: 0;
    width: 100%;
    height: 100%;
    color: rgb(221, 143, 143);
    /* background-color: black; */
    
}

.header-logo{
    height: 60px;
    display: flex;
    align-items: center;
}

.left{
    padding-top: 15px;
    padding-left: 100px;
    float: left;
}

.right{
    display: flex;
    float: right;
    align-items: center;
}

.transparent-btn {
    background-color: transparent;
    height: 90px;
    width: 120px;
    border: 0px solid #ffffff00; /* 边框样式 */
    color: #fff; /* 文本颜色 */
    padding: 10px 20px; /* 按钮内边距 */
    font-size: 20px; /* 字体大小 */
    transition: background-color 0.3s, color 0.3s; /* 过渡效果 */
}

.transparent-btn:hover {
    background-color: #706f6f3c; /* 鼠标悬停时的背景颜色 */
    /* color: #000; 鼠标悬停时的文本颜色 */
}

</style>