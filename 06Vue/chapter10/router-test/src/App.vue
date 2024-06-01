<template>
  <div class="container">
    <Header />
    <router-view></router-view>
  </div>
</template>

<script>
import Header from "./components/Header.vue";
export default {
  name: "app",
  components: { Header },
};
</script>

<style scoped>
.container {
  text-align: center;
  margin-top: 10px;
}
</style>
