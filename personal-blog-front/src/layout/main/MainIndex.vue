<template>
    <div class="main">
        <div class="main-index">
            <div>
                <div class="block">
                    <el-avatar :size="200"></el-avatar>
                </div>
                <div style="margin-top: 20px; color: white; font-size: 30px;">戴浩东</div>
                <div style="margin-top: 20px;"><el-button @click="clickGitee()" icon="ChromeFilled">Gitee地址</el-button></div>
            </div>
        </div>
        
    </div>
</template>

<script>

export default{
    name: 'makeInstaller',
    data() {
        return {
            // 
        };
    },
    computed() {

    },
    methods: {
        // 点击前往Gitee主页
        clickGitee() {
            window.open('https://gitee.com/HadwinDai', '_blank');
        },
    },
}

</script>

<style>
    .main{
        margin: 0;
        padding: 0;
        /* display: block; */
        display: flex;
        align-items: center; /* 垂直居中 */
        justify-content: center; /* 水平居中，如果需要的话 */
        height: 100vh; /* 或者其他高度 */
    }

</style>