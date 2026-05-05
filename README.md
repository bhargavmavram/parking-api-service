# Parking API Service

Resource API service for the parking system.

## Responsibilities

- Expose parking APIs
- Validate OAuth2 Bearer JWTs issued by `parking-auth-service`
- Protect APIs using roles: `ADMIN`, `USER`, `MANAGER`, `EMPLOYEE`

## Run

```bash
mvn spring-boot:run
```

Service URL: `http://localhost:8081`

## Endpoints

| Method | Path | Description |
| --- | --- | --- |
| GET | `/api/status` | Public service status endpoint. |
| GET | `/api/secure/sample` | Secured sample endpoint. Requires a valid Bearer token with any supported role. |
| GET | `/actuator/health` | Actuator health endpoint. |

## Secured Request Example

```bash
curl -H "Authorization: Bearer <access-token>" http://localhost:8081/api/secure/sample
```

## Swagger / OpenAPI

| Resource | URL |
| --- | --- |
| Swagger UI | `http://localhost:8081/swagger-ui.html` |
| OpenAPI JSON | `http://localhost:8081/v3/api-docs` |

Use the `Authorize` button in Swagger UI with a Bearer token from `parking-auth-service` for secured APIs.
