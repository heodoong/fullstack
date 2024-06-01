<template>
  <div>
    <h2>App 컴포넌트</h2>
    <hr />
    <Checkboxitem></Checkboxitem>
  </div>
</template>

<script>
import Checkboxitem from "./components/Checkboxitem.vue";
export default {
  name: "app",
  components: { Checkboxitem },
};
</script>
