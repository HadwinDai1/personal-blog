<template>
    <div class="footer">
        <div class="record">
            <!-- 作者信息 -->
            <div class="ICP">
                <span>{{ yearTime }}@{{ author }}</span>
            </div>
            <!-- 工业和信息化部政务服务平台备案号显示 -->
            <div class="ICP">
                <a href="https://beian.miit.gov.cn/#/Integrated/index" target="_blank">
                    <span>{{ icpNumber }}</span>
                </a>
            </div>
            <!-- 全国互联网安全管理服务平台备案号显示 -->
            <div class="ICP">
                <a href="https://beian.mps.gov.cn/#/query/webSearch" target="_blank">
                    <img src="https://qiniuyun.theboyaply.cn/FinEALw7ifYIV2baxOAzDe1ctz1S" />
                    <span>{{ policeNumber }}</span>
                </a>
            </div>
        </div>
    </div>
</template>

<script>
    import {getFooterInfo} from '@/api/footer'

    export default{
        data(){
            return{
                // ICP备案号
                icpNumber: undefined,
                // 公安备案号
                policeNumber: undefined,
                // 当前年
                yearTime: undefined,
                // 作者
                author: undefined,
            }
        },
        created(){
        },
        // 挂载后
        mounted() {
            // 初始化当前年份
            this.nowYearTime();
            // 初始化页脚信息
            this.getFooterInfo();
        },
        // 方法定义
        methods: {
            // 获取当前年份
            nowYearTime() {
                const date = new Date();
                this.yearTime = date.getFullYear();
            },
            // 获取页脚信息
            getFooterInfo(){
                getFooterInfo().then((res) => {
                    this.icpNumber = res.data.icpNumber;
                    this.policeNumber = res.data.policeNumber;
                    this.author = res.data.author;
                }).finally(() => {
                this.loading = false;
                });
            },
        },
    }
</script>


<style scoped>
.footer{
    margin: 0;
    padding: 0;
    width: 100%;
    height: 100%;
    background-color: rgba(127, 127, 127, 0.607);
    text-align: center;
    color: white
}

.auther{
    box-sizing: border-box;
    margin-top: 10px;
    
}

.ICP {
    padding-top: 10px;
    text-align: center;
}
a {
    text-decoration: none;
    color: inherit;
}

img {
    vertical-align: top
}

</style>