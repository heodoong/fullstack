<template>
  <div>
    <h2>탕탕후루후루탕탕후루후루</h2>
  </div>
</template>

<script setup>
import axios from "axios";
const requestAPI = () => {
  // const url = "http://localhost:3000/todos/1";
  const url = "/api/todos/2";
  axios.get(url).then((response) => {
    console.log("#응답객체:", response);
  });
};
requestAPI();
</script>

<style scoped></style>
