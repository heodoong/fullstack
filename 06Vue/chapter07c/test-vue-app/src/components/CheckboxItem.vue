<template>
  <div>
    <li><input type="checkbox" v-model="checked" />{{ name }}</li>
  </div>
</template>

<script>
export default {
  name: "CheckboxItem",
  props: ["name", "checked"],
  data() {
    return {
      checked: false,
    };
  },
};
</script>
