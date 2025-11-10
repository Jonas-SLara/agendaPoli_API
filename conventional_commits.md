# Padrões de Commit (Conventional Commits)

Siga o Conventional Commits para mensagens de commit claras e automatizáveis.

Formato básico:

```
<tipo>: <descrição curta>

<corpo opcional>

<footer opcional>
```

Tipos comuns:
- feat: nova funcionalidade
- fix: correção de bug
- docs: documentação
- style: formatação, ponto e vírgula faltando, sem impacto no código
- refactor: refatoração de código (sem feature e sem fix)
- perf: mudança que melhora performance
- test: adicionar ou corrigir testes
- chore: mudanças na build ou tarefas auxiliares
- build: mudanças que afetam o sistema de build
- ci: mudanças em config de CI

Exemplos:

```
feat: adicionar endpoint de refresh token
fix: corrigir busca por email nulo
docs: documentar execução via docker-compose
```

Recomendações:
- Escreva a descrição curta no imperativo (ex: "adicionar", "corrigir").