<script setup lang="ts">
import { computed } from 'vue';
import { useAppStore } from '@/stores/app';

const appStore = useAppStore();

const summaryCards = computed(() => [
  { label: 'Open Tasks', value: appStore.openTasks },
  { label: 'API Health', value: appStore.apiHealth },
  { label: 'Release Stage', value: appStore.releaseStage }
]);
</script>

<template>
  <section>
    <h2 class="section-title">Project Snapshot</h2>
    <div class="card-grid">
      <Card v-for="card in summaryCards" :key="card.label" class="summary-card" dis-hover>
        <p class="card-label">{{ card.label }}</p>
        <strong class="card-value">{{ card.value }}</strong>
      </Card>
    </div>

    <Card class="panel" dis-hover>
      <h3>Engineering Principles</h3>
      <ul>
        <li>Frontend: Composition API + strict TypeScript + lint/test gates</li>
        <li>Backend: layered architecture + unified exception handling</li>
        <li>Clean Code: readable naming, small functions, predictable behavior</li>
        <li>UI: Material-inspired spacing, typography, and interaction feedback</li>
      </ul>
    </Card>
  </section>
</template>

<style scoped>
.section-title {
  margin: 0 0 16px;
  font-size: 22px;
  line-height: 30px;
}

.card-grid {
  display: grid;
  gap: 16px;
  grid-template-columns: repeat(auto-fit, minmax(220px, 1fr));
}

.summary-card {
  border-radius: 16px;
}

.card-label {
  color: var(--md-sys-color-on-surface-variant);
  margin: 0 0 8px;
}

.card-value {
  font-size: 24px;
}

.panel {
  margin-top: 20px;
  border-radius: 16px;
}
</style>
