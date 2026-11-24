# 0001: Technology stack

Status: Accepted

## Context

Travel Tracker is a portfolio project for the US job market. It has to show the tools that mid-level backend roles ask for. One developer, about 40 hours a week, about 6 months. The domain is a nature-focused travel tracker: places, species, documentaries and travel deals.

## Decision

- Backend: Java 21, Spring Boot 3, Spring Data JPA, Spring Security.
- Database: PostgreSQL with PostGIS, schema managed by Flyway.
- Frontend: React, TypeScript, Vite, Tailwind CSS, MapLibre.
- Local environment: Docker Compose.
- CI: GitHub Actions. Deployment: AWS.
- Redis, Kafka and Kubernetes will be added later, each with its own ADR.

## Consequences

- The stack matches what many job postings ask for.
- PostGIS makes geographic queries simple.
- More tools to learn means a longer schedule. If time runs out, Kubernetes is cut first.
- A separate frontend adds scope, but gives a visual result that is easy to demo.
