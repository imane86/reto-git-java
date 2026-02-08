# Reto Git Java – Simulador de Inversión

## Descripción
Este proyecto es un **simulador de inversión en acciones** desarrollado en Java.  
Permite al usuario:
- Introducir capital inicial, precio de acciones y cantidad.
- Calcular total invertido.
- Introducir nuevo precio y calcular valor actual de la inversión.
- Mostrar ganancia o pérdida.

El objetivo del proyecto es practicar **flujo de trabajo profesional en Git**, incluyendo:
- Ramas `develop`, `feature/*`, `fix/*`.
- Pull Requests.
- Resolución de conflictos.
- Versionado mediante tags.

---

## Ramas del proyecto

- **main**: Rama principal, contiene la versión estable.
- **develop**: Rama de desarrollo, donde se integran cambios.
- **feature/menu**: Implementación de menú y opciones iniciales.
- **feature/validaciones**: Validaciones de entradas del simulador.
- **fix/error-calculo**: Correcciones de cálculo y salida de resultados.

---

## Normas de commits

- Los commits deben ser **claros y descriptivos**, por ejemplo:
  - `Añade menú de opciones inicial`
  - `Mejora validación de números negativos`
  - `Corrige cálculo total`
- Evitar commits vacíos o poco descriptivos.

---

## Versionado

- **v0.1**: Proyecto base, simulador inicial.  
- **v1.0**: Proyecto completo con validaciones y correcciones.

---

## Flujo de trabajo

1. Trabajar en ramas `feature/*` desde `develop`.
2. Hacer mínimo 2 commits por feature.
3. Crear Pull Request hacia `develop`.
4. Revisar y aprobar PR antes de hacer merge.
5. Resolver conflictos localmente si aparecen.
6. Taggear versiones importantes.
