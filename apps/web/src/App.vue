<script setup lang="ts">
import AppTopBar from '@/components/layout/AppTopBar.vue';
</script>

<template>
  <div class="app-shell">
    <AppTopBar />
    <main class="page-container">
      <RouterView />
    </main>
  </div>
</template>

<style scoped>
.app-shell {
  min-height: 100vh;
  background: var(--md-sys-color-surface);
}

.page-container {
  max-width: 1120px;
  margin: 0 auto;
  padding: 24px;
}
</style>
