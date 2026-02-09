# Clean Code Checklist (PR Gate)

## Naming

- [ ] Variables, functions, classes use intention-revealing names.
- [ ] No ambiguous abbreviations unless domain-standard.

## Functions / Methods

- [ ] Methods are short and single-purpose.
- [ ] Function arguments are minimal and meaningful.
- [ ] Side effects are explicit.

## Readability

- [ ] Control flow is straightforward.
- [ ] Magic numbers are replaced with constants.
- [ ] No dead code or commented-out legacy blocks.

## Error handling

- [ ] Errors are handled or propagated intentionally.
- [ ] Domain errors use explicit exception types and codes.

## Architecture

- [ ] Layer boundaries respected (no controller-to-mapper shortcuts).
- [ ] DTO/VO separation maintained.

## Testing

- [ ] Unit/integration/e2e tests cover critical behavior.
- [ ] Tests describe behavior, not implementation detail.

## Documentation

- [ ] API changes reflected in docs.
- [ ] Operational impacts and migration notes documented.
