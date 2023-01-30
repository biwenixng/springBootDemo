<script setup>
import HelloWorld from './components/HelloWorld.vue'
import TheWelcome from './components/TheWelcome.vue'
</script>

<template>
  <header>
    <img alt="Vue logo" class="logo" src="./assets/logo.svg" width="125" height="125" />

    <div class="wrapper">
      <HelloWorld msg="You did it!" />
    </div>
  </header>

  <main>
    <template>
      <div>
        <p>vue-json-editor使用</p>
        <!--在模板中使用vue-json-editor-->
        <vue-json-editor v-model="json" :showBtns="true" @json-change="onJsonChange"></vue-json-editor>
      </div>
    </template>
  </main>
</template>

<script>
// 引入vue-json-editor模块
import vueJsonEditor from 'vue-json-editor'
export default {
  data () {
    json: {
      msg: 'demo of jsoneditor'
    }
  },

  // 注入vueJsonEditor组件
  components: {
    vueJsonEditor
  },

  methods: {
    onJsonChange (value) {
      console.log('value:', value)
    }
  }
}
</script>
<style scoped>
header {
  line-height: 1.5;
}

.logo {
  display: block;
  margin: 0 auto 2rem;
}

@media (min-width: 1024px) {
  header {
    display: flex;
    place-items: center;
    padding-right: calc(var(--section-gap) / 2);
  }

  .logo {
    margin: 0 2rem 0 0;
  }

  header .wrapper {
    display: flex;
    place-items: flex-start;
    flex-wrap: wrap;
  }
}
</style>
