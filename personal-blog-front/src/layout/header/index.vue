<template>
    <div class="header">
        <div class="left">
            <img class="header-logo" src="../../assets/Logo.svg" alt="">
        </div>
        <div class="right"></div>
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
    height: 90px;
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
}
</style>