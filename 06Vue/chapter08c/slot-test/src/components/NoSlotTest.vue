<template>
  <div>
    <h3>당신이 경험한 프론트 엔드 기술은?(첫번재 :slot사용(x))</h3>
    <CheckBox1
      v-for="item in items"
      :key="item.id"
      :id="item.id"
      :label="item.label"
      :checked="item.checked"
      @check-changed="CheckBoxChanged"
    >
    </CheckBox1>
  </div>
</template>

<script>
import CheckBox1 from "./CheckBox1.vue";
export default {
  name: "NoSlotTest",
  components: { CheckBox1 },
  data() {
    return {
      item: [
        { id: "V", checked: true, label: "Vue" },
        { id: "A", checked: true, label: "Angular" },
        { id: "R", checked: true, label: "React" },
        { id: "S", checked: true, label: "Svelte" },
      ],
    };
  },
  methods: {
    CheckBoxChagned(e) {
      let item = this.items.find((item) => item.id === e.id);
      item.checked = e.checked;
    },
  },
};
</script>

<style scoped></style>
