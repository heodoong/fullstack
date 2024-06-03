<template>
  <div>
    <h2>관심있는 K-POP가수?</h2>
    <hr />
    <Checkboxitem
      v-for="idol in idols"
      v-bind:key="idol.id"
      v-bind:name="idol.name"
      v-bind:checked="idol.checked"
    ></Checkboxitem>
  </div>
</template>

<script>
import Checkboxitem from "./components/Checkboxitem.vue";
export default {
  name: "app",
  components: { Checkboxitem },
  data() {
    return {
      idols: [
        { id: 1, name: "bts", checked: true },
        { id: 2, name: "black pink", checked: false },
        { id: 3, name: "exo", checked: false },
        { id: 4, name: "itzy", checked: false },
      ],
    };
  },
};
</script>
