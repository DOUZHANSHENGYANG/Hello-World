# Design Plan: Vue3 + SpringBoot Engineering Baseline (2026-02-09)

## Goal

Create a production-oriented starter baseline that supports:

- standardized frontend development (Vue3 + Pinia + View UI Plus)
- standardized backend development (SpringBoot + MyBatis-Plus + SQLite)
- end-to-end engineering flow (lint, tests, CI, docs, reports)

## Design decisions

1. **Monorepo layout**
   - Frontend and E2E managed via pnpm workspace.
   - Backend managed with Maven for Java ecosystem compatibility.

2. **Layered backend model**
   - Controller/Service/Mapper/Entity/DTO/VO split to preserve clean boundaries.

3. **UI baseline**
   - Keep View UI Plus as component library.
   - Apply Material-inspired design tokens for consistent visual language.

4. **Quality gate**
   - Frontend: lint + unit + build
   - Backend: integration tests
   - E2E: Playwright smoke

5. **Documentation-first delivery**
   - standards, deployment, ops, weekly/test/release templates included from day one.

## Non-goals (v1)

- Multi-module microservices decomposition
- Full RBAC implementation
- Complete observability stack (metrics/log aggregation/tracing)
