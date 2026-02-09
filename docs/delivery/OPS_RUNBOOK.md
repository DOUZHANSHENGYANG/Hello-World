# Operations Runbook

## 1. Service inventory

- Frontend: Vue static app
- Backend: Spring Boot API
- Database: SQLite file store

## 2. Monitoring baseline

- API success rate
- API p95 latency
- Frontend error events
- Log error count per 5 minutes

## 3. Incident triage

1. Confirm scope (single endpoint or platform-wide)
2. Check logs and latest deployment diff
3. Validate DB file health and disk permissions
4. Apply rollback or hotfix based on severity

## 4. Common issues

### Backend fails to start

- Check datasource path exists.
- Check file permission for SQLite DB directory.
- Confirm profile-specific config.

### Frontend blank screen

- Check static asset path/base URL.
- Check router history fallback config on hosting.

## 5. Recovery checklist

- [ ] Service recovered
- [ ] Root cause identified
- [ ] Action items captured in postmortem
