# Frontend Engineering Standard (Google-style Mindset + Vue3 Adaptation)

## 1. Core principles

1. **Clarity first**: prefer readable code over clever code.
2. **Consistency over personal preference**: follow project conventions strictly.
3. **Small composable units**: keep components focused and testable.
4. **Type safety by default**: TypeScript strict mode enabled.
5. **Automated quality gates**: lint + unit test + e2e are mandatory before merge.

## 2. Vue 3 conventions

- Use `<script setup lang="ts">`.
- Prefer Composition API and composables for reusable logic.
- Keep component files ideally under 300 lines.
- Keep one component responsible for one visual and behavioral concern.
- Use Pinia for app-level state; avoid hidden shared mutable state.

## 3. Naming conventions

- Components: `PascalCase.vue` (e.g., `UserTable.vue`)
- Composables: `useXxx.ts` (e.g., `useAsyncTask.ts`)
- Stores: `useXxxStore` in files like `app.store.ts` or `app.ts`
- Route names: kebab-case (`user-list`, `system-settings`)

## 4. Frontend architecture

- `views/` for page-level composition
- `components/` for reusable UI blocks
- `composables/` for business-independent logic
- `services/` for HTTP/API access
- `stores/` for global state

## 5. Quality baseline

- ESLint must pass with zero errors.
- Each critical composable or state store should have tests.
- Playwright smoke test required for major flows:
  - login/auth flow
  - CRUD happy path
  - error feedback visibility
