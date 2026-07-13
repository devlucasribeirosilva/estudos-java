# appsec-labs

Anotacoes dos labs praticos feitos depois de cada modulo teorico do AppSec
(PortSwigger Web Security Academy, OWASP Juice Shop, WebGoat). Organizado
por categoria de vulnerabilidade, nao por curso — aqui o que importa e o
tipo de falha, nao de onde veio o exercicio.

## Formato sugerido pra cada lab

Cria um arquivo `.md` dentro da subpasta certa (ex: `sqli/union-based.md`)
com essa estrutura minima:

```markdown
# Nome do lab

- Fonte: PortSwigger / Juice Shop / WebGoat
- Data:
- Dificuldade:

## Vulnerabilidade
O que era, em 1-2 frases.

## Passos / payload
Como foi explorado. Cola o payload, nao precisa narrar cada clique.

## Correcao
Como resolveria isso numa aplicacao real.
```

Nao precisa seguir a risca — o objetivo e so nao anotar cada lab de um jeito
diferente daqui a 3 meses.

## Subpastas

- `sqli/` — SQL injection
- `xss/` — Cross-site scripting
- `access-control/` — IDOR, broken access control, privilege escalation
- `outros/` — tudo que nao se encaixa nas anteriores (SSRF, deserializacao, etc.)
