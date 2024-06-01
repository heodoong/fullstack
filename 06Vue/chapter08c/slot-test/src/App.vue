<template>
  <div>
    <no-slot-test />
  </div>
</template>

<script>
import NoSlotTest from "./components/NoSlotTest.vue";
export default {
  name: "app,",
  components: { NoSlotTest },
};
</script>

<style scoped></style>
