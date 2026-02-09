<template>
  <header class="top-bar">
    <div class="title-group">
      <h1>Engineering Platform</h1>
      <p>Vue3 + SpringBoot + MyBatis-Plus + SQLite</p>
    </div>
    <Button type="primary">New Task</Button>
  </header>
</template>

<style scoped>
.top-bar {
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 16px 24px;
  border-bottom: 1px solid var(--md-sys-color-outline-variant);
  background: var(--md-sys-color-surface-container-low);
}

.title-group h1 {
  margin: 0;
  font-size: 24px;
  line-height: 32px;
}

.title-group p {
  margin: 4px 0 0;
  color: var(--md-sys-color-on-surface-variant);
  font-size: 14px;
}
</style>
