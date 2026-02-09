$ErrorActionPreference = "Stop"

pnpm.cmd --filter @app/web build
Start-Process -NoNewWindow -FilePath "pnpm.cmd" -ArgumentList "--filter @app/web preview --host 0.0.0.0 --port 4173"

pnpm.cmd --filter @tests/e2e exec wait-on http://127.0.0.1:4173
Write-Host "Frontend preview is ready at http://127.0.0.1:4173"
