#!/usr/bin/env bash
set -euo pipefail

pnpm --filter @app/web build
pnpm --filter @app/web preview --host 0.0.0.0 --port 4173 &

pnpm --filter @tests/e2e exec wait-on http://127.0.0.1:4173
echo "Frontend preview is ready at http://127.0.0.1:4173"
