# Backend Module (`apps/api`)

## Architecture

- `controller` → API layer (validation + response envelope)
- `service` → business logic + transactions
- `mapper` → MyBatis-Plus persistence
- `entity/dto/vo` → model separation for clean boundaries
- `common` → shared exceptions and response wrappers

## Local run

```bash
mvn spring-boot:run
```

Default SQLite path: `apps/api/data/app.db`
