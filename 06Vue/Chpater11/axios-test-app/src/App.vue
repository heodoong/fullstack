<template>
  <div>
    <h2>콘솔을 확인합니다.</h2>
  </div>
</template>

<script setup>
import axios from "axios";
const requestAPI = () => {
  const url = "https://localhost:8000/todolist/gdhong";
  axios.get(url).then((responae) => {
    console.log("#응답객체:", response);
  });
};
requestAPI();
</script>

<style scoped></style>
