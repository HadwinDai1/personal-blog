<template>
    <div id="app">
        <div class="header">
            <layout-header />
        </div>
        <div class="main">
            <layout-main />
        </div>
        <div class="footer">
            <layout-footer />
        </div>
    </div>
</template>

<script>
import LayoutHeader from './header'
import LayoutMain from './main'
import LayoutFooter from './footer'


export default{
    name: 'Layout',
    components: {
        LayoutHeader,
        LayoutMain,
        LayoutFooter
    },
    data() {
        return{

        }
    },
    created() {
      
    }
}
</script>

<style scoped>
#app {
    background-image: url("../assets/background.jpg");
    background-attachment: fixed; /* 将背景固定 */
    background-size: cover; /* 背景图片覆盖整个元素 */
    height: 100vh;
}


.header {
    height: 10vh;
}

.footer {
    float: bottom;
    height: 15vh;
}

.main {
    height: 75vh;
}
</style>