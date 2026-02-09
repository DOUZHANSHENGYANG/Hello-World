# Deployment Runbook

## 1. Target environments

- DEV
- TEST
- PROD

## 2. Pre-checklist

- [ ] CI pipeline green
- [ ] DB migration reviewed
- [ ] Release notes ready
- [ ] Rollback plan prepared

## 3. Backend deployment

1. Build:
   ```bash
   mvn -f apps/api/pom.xml clean package -DskipTests
   ```
2. Configure runtime env:
   - `SPRING_PROFILES_ACTIVE`
   - datasource path and permissions
3. Start service:
   ```bash
   java -jar apps/api/target/api-0.1.0.jar
   ```

## 4. Frontend deployment

1. Build:
   ```bash
   pnpm --filter @app/web build
   ```
2. Publish `apps/web/dist` to static hosting/CDN.

## 5. Verification

- [ ] Health endpoint OK
- [ ] Login and key workflows pass
- [ ] Error rate and response latency within baseline

## 6. Rollback

- Revert to previous backend artifact.
- Restore previous frontend static bundle.
- Re-run smoke tests.
