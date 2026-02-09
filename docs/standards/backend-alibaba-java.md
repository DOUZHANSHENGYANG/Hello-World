# Backend Standard (Alibaba-style Java Development, Spring Boot Adaptation)

## 1. Layering and package structure

Use explicit layered architecture:

- `controller`: request mapping, input validation, output shaping
- `service`: business orchestration and transaction boundaries
- `mapper`: persistence abstraction with MyBatis-Plus
- `entity`: persistence model
- `dto/vo`: request-response models, avoid exposing entity directly
- `common`: shared response, exception, constants, utils

## 2. Controller rules

- Do not embed business logic in controller.
- Validate inputs using `jakarta.validation`.
- Return unified response envelope (`ApiResponse<T>`).
- Keep endpoint naming RESTful and versioned, e.g. `/api/v1/users`.

## 3. Service rules

- Service method names should be business-intent driven.
- Keep methods short and cohesive.
- Transaction boundary defined in service layer (`@Transactional`).
- Throw domain/business exceptions instead of generic runtime exceptions.

## 4. Persistence rules

- MyBatis-Plus base CRUD via `BaseMapper`.
- Complex SQL should be explicit and reviewed (XML or annotation).
- Do not leak SQL concern into service/controller contracts.

## 5. Error handling and observability

- Use global exception handler.
- Define error code catalog and user-facing messages.
- Log key business events with traceable identifiers.

## 6. Security and reliability baseline

- Validate all external input.
- Use principle of least privilege for DB/file access.
- Add integration tests for critical endpoints.
