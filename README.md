# Vue3 + SpringBoot Engineering Starter

> Stack: Vue 3 + Pinia + View UI Plus + pnpm + Spring Boot + MyBatis-Plus + SQLite  
> Target standards: Google-style frontend engineering mindset, Alibaba-style Java layering, Clean Code, and Material Design UI principles.

## 1. Repository layout

```text
apps/
  web/        # Vue3 frontend
  api/        # SpringBoot backend
tests/
  e2e/        # Playwright end-to-end tests
docs/
  standards/  # Engineering standards and checklists
  delivery/   # Deployment and handover docs
  reports/    # Weekly/test/release report templates
scripts/
  start-ci.sh # Local CI helper script
```

## 2. Quick start

### Prerequisites

- Node.js 20+
- pnpm 9+
- JDK 17+
- Maven 3.9+

### Install and run frontend

```bash
pnpm install
pnpm --filter @app/web dev
```

### Run backend

```bash
mvn -f apps/api/pom.xml spring-boot:run
```

## 3. CI checks

CI pipeline includes:

1. Frontend lint + unit test + build
2. Backend tests
3. Playwright smoke E2E

See `.github/workflows/ci.yml`.

## 4. Engineering standards mapping

- Frontend development conventions: `docs/standards/frontend-google-style.md`
- Backend conventions (Alibaba-oriented): `docs/standards/backend-alibaba-java.md`
- Clean Code checklist: `docs/standards/clean-code-checklist.md`
- Material Design UI baseline: `docs/standards/ui-material-design.md`

## 5. Delivery docs & reporting

- Deployment runbook: `docs/delivery/DEPLOYMENT.md`
- Operations runbook: `docs/delivery/OPS_RUNBOOK.md`
- Weekly report template: `docs/reports/WEEKLY_YYYY-MM-DD.md`
- Test report template: `docs/reports/TEST_REPORT_YYYY-MM-DD.md`
- Release notes template: `docs/reports/RELEASE_NOTE_vX.Y.Z.md`
