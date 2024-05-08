<template>
    <div class="index">
        <div class="index-image">
            <img src="../assets/headerImage.jpg" alt="头像" class="circle-img" />
        </div>
        <div class="name font">
            <span>HadwinDai</span>
        </div>
        <div class="call font">
            <span>总是这样轻言放弃的话，无论过多久，都只会原地踏步。</span>
        </div>
        <div class="index-url" style="margin-top: 20px">
            <a href="https://gitee.com/HadwinDai">
                <img style="width: 40px;" src="../assets/git-logo.png" alt="gitee图标">
            </a>
            <a href="https://gitee.com/HadwinDai">
                <img style="width: 40px;" src="../assets/git-logo.png" alt="gitee图标">
            </a>
            <a href="https://gitee.com/HadwinDai">
                <img style="width: 40px;" src="../assets/git-logo.png" alt="gitee图标">
            </a>
        </div>
    </div>
</template>

<style>
    @font-face {
        font-family: 'LongCang'; /* 自定义字体名称 */
        src: url('@/assets/font/LongCang-Regular.ttf') format('truetype'); /* TTF 文件路径 */
        /* 其他字体属性 */
    }

    .name{
        margin-top: 20px;
    }
    
    .call{
        padding-top: 20px;
    }

    .index {
        text-align: center;
        align-items: center;
        color: rgb(255,215,0);
    }

    .circle-img{
        margin-top: 150px;
        width: 200px; /* 设置容器宽度 */
        height: 200px; /* 设置容器高度 */   
        object-fit: cover; /* 保持图片比例并填充容器 */
        border-radius: 50%; /* 圆形容器 */
    }

    .font{
        font-family: 'LongCang';
        font-size: 50px;
        color: rgb(255, 255, 255);
        
    }

    a {
        margin-left: 10px;
        margin-right: 10px;
    }
</style>
