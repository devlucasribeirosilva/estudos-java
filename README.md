# estudos-java

Exercicios praticos das trilhas de estudo em Java + AppSec. Cada fonte de curso
tem seu proprio pacote/pasta para não misturar codigo, mas tudo vive num repo
so pra nao espalhar o perfil do GitHub em varios repositorios soltos.

O projeto principal aplicado (API real, nao exercicio de curso) fica num repo
separado: **FinTrack API** (link aqui quando publicar).

## Estrutura

```
estudos-java/
├── pom.xml
├── src/main/java/com/lucas/estudos/
│   ├── devdojo/              -> Maratona Java Virado no Jiraya (DevDojo)
│   ├── loiane/basico/        -> Curso de Java Basico (Loiane Groner)
│   ├── loiane/intermediario/ -> Curso de Java Modulo 2 (Loiane Groner)
│   ├── loiane/estruturasdados/ -> Estrutura de Dados e Algoritmos (Loiane Groner)
│   └── nelioalves/           -> Java Orientado a Objetos (Nelio Alves)
├── appsec-labs/               -> Labs praticos de AppSec (PortSwigger, Juice Shop, WebGoat)
│   ├── sqli/
│   ├── xss/
│   ├── access-control/
│   └── outros/
└── fiap/                      -> Exercicios da pos FIAP (comeca mais pra frente)
```

Cada pacote em `src/main/java` corresponde a uma fonte do
[checklist de estudos](.) — o nome do pacote/pasta é sempre o mesmo prefixo
usado no commit (ver convenção abaixo).

`appsec-labs/` e `fiap/` ficam fora do `src/main/java` de proposito: o
conteudo ali normalmente nao e codigo Java compilavel (anotacoes de lab,
payloads, screenshots, notas de curso), entao nao faz sentido forcar dentro
da arvore Maven.

## Convenção de commit

Um commit por bloco de aula (a mesma granularidade dos blocos que aparecem
no calendario/checklist), nunca um commit por exercicio individual — a
Loiane em especial passa muito exercicio, e commit por exercicio so vira
ruido no historico.

Formato: `[pasta] descricao curta do bloco`

```
[devdojo] aulas 10-14: tipos primitivos pt 01 a pt 05
[loiane-basico] aula 17: loop for + correcao de exercicios
[loiane-intermediario] aula 67: garbage collector
[loiane-estruturasdados] pilhas: introducao + desafio torre de hanoi
[nelioalves] secao 5: expressoes comparativas e logicas
[appsec-labs/sqli] portswigger: sqli em contexto UNION
```

Isso permite filtrar o progresso por fonte com:

```
git log --grep="loiane-basico"
```

## Rodando

Projeto Maven padrao. No IntelliJ: `File > Open`, aponta pro `pom.xml` da
raiz, deixa importar. Cada exercicio pode virar uma classe com `main` dentro
do pacote correspondente, ou uma classe de teste em `src/test/java` quando
fizer mais sentido validar com JUnit em vez de rodar e olhar o console.

## AppSec labs

Cada subpasta de `appsec-labs/` tem um `README.md` com o formato sugerido
pra anotar: alvo, vulnerabilidade, payload/passos, correcao. Nao precisa
seguir a risca, e so um ponto de partida pra nao anotar cada lab de um jeito
diferente.
