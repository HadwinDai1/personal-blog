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
    }
}
</script>

<style scoped>
#app {
    background-image: url("../assets/background.jpg"); ;
}
</style>