<template>
  <div>
    <li><input type="checkbox" :checked="checked" /> {{ name }}</li>
  </div>
</template>

<script>
export default {
  name: "Checkboxitem",
  props: ["name", "checked"],
};
</script>

<style scoped></style>
