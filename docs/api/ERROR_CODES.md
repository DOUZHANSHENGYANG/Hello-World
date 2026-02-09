# Error Code Dictionary

| Code | HTTP | Meaning | Suggested Action |
|---|---:|---|---|
| SUCCESS | 200 | Request completed successfully | N/A |
| USER_NOT_FOUND | 400 | Requested user does not exist | Check identifier and retry |
| VALIDATION_ERROR | 400 | Invalid request payload | Correct request fields |
| INTERNAL_ERROR | 500 | Unhandled server error | Retry later and inspect logs |
