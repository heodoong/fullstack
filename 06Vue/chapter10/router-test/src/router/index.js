import { createRouter, createWebHistory } from "vue-router"; //자동생성됨
import Home from "/src/pages/Home.vue";
import About from "/src/pages/About.vue";
import Members from "/src/pages/Members.vue";
import Videos from "/src/pages/Videos.vue";
import NotFound from "/src/pages/NotFound.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    { path: "/", component: Home },
    { path: "/about", component: About },
    { path: "/members", component: Members },
    { path: "/videos", component: Videos },
    { path: ":paths(.*)*", name: "NotFound", component: NotFound },
  ],
});

export default router;
