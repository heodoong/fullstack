<template>
  <div>
    <li><input type="checkbox" v-model="checked" /> 옵션1</li>
  </div>
</template>

<script>
export default {
  name: "Checkboxitem",
  data() {
    return {
      checked: false,
    };
  },
};
</script>

<style scoped></style>
