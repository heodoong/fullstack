import router from "./router";
import "bootstrap/dist/css/bootstrap.min.css";
import { createApp } from "vue";
import App from "./App.vue";

const app = createApp(App);

app.use(router);

app.mount("#app");
