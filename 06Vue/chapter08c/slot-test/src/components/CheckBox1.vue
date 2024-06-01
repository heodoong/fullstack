<template>
  <div>
    <input
      type="checkbox"
      v-bind:value="id"
      v-bind:checked-="checked"
      @change="$emit('check-changed', { id, checked: $event.target.checked })"
    />
    <span
      v-if="checked === true"
      style="color: blue; text-decoration: underline"
    ></span>
  </div>
</template>

<script>
export default {
  name: "Checkbox1",
  props: ["id", "checked", "label"],
};
</script>

<style scoped></style>
