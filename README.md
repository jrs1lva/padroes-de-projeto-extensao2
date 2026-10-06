# Padrões de Projetos: Categoria Extensão

**Instituição:** Universidade Católica do Salvador (UCSAL)
**Aluno:** Adailton da Cruz Silva Júnior
**Repositório Github:** [https://github.com/jrs1lva/padroes-de-projeto-extensao2.git]

Este repositório explora três Padrões de Projeto pertencentes à categoria de **Extensão** (padrões comportamentais e estruturais que estendem o comportamento de objetos e coleções). O domínio escolhido para simular um problema do mundo real foi um **Sistema Bancário e de Auditoria de Usuários**.

---

## 1. Padrão Decorator (Estrutural / Extensão)

**Conceito:** O padrão Decorator permite adicionar novos comportamentos ou responsabilidades a um objeto de forma dinâmica, sem alterar a sua estrutura original. É uma alternativa flexível à herança para estender funcionalidades. Em vez de criar dezenas de subclasses para cada combinação possível, o Decorator "envelopa" o objeto original, agregando novas camadas de serviço dinamicamente.

**Exemplo no Mundo Real (Sistema Bancário):** 
Em um banco, um cliente possui inicialmente uma `ContaBasica`. No entanto, com o passar do tempo, ele pode querer contratar serviços adicionais, como um "Seguro de Vida" ou um serviço de "Notificação por SMS", que aumentam a tarifa mensal da conta. Utilizando o Decorator, podemos aplicar esses novos serviços (comportamentos) à conta do cliente em tempo de execução, somando as tarifas e listando os serviços contratados, sem precisar criar classes rígidas como `ContaComSeguro` ou `ContaComSeguroESMS`.

---

## 2. Padrão Iterator (Comportamental / Extensão de Acesso)

**Conceito:** O padrão Iterator fornece uma maneira de acessar sequencialmente os elementos de um objeto agregado (como listas, arrays ou árvores) sem expor a sua representação interna. Ele extrai o comportamento de travessia (loop) da coleção principal, permitindo que a aplicação itere sobre diferentes estruturas de dados usando a mesma interface padronizada, reduzindo o acoplamento.

**Exemplo no Mundo Real (Auditoria de Usuários):** 
Um módulo de segurança do banco precisa auditar todos os usuários cadastrados. O módulo de auditoria não precisa saber se os dados dos usuários estão armazenados internamente em um `Array` fixo, em um `ArrayList` dinâmico ou em uma estrutura de banco de dados. O Iterator encapsula toda a lógica de avanço de posições e verificação de limites, permitindo que o sistema de auditoria apenas peça o "próximo usuário" até que a coleção termine, mantendo a estrutura de dados original protegida.

---

## 3. Padrão Visitor (Comportamental / Extensão de Operações)

**Conceito:** O padrão Visitor permite separar algoritmos e rotinas operacionais dos objetos estruturais sobre os quais eles operam. Ele consegue adicionar novas operações a uma hierarquia de classes sem modificar o código original dessas classes. Para isso, utiliza o conceito de *Double Dispatch* (Despacho Duplo), onde o objeto "recebe" a visita e passa a si mesmo como parâmetro para o algoritmo adequado.

**Exemplo no Mundo Real (Rotinas de Fechamento Bancário):** 
No final do mês, o sistema bancário precisa processar o fechamento de todas as contas ativas. A regra de negócio para o fechamento de uma `ContaCorrente` (que cobra uma taxa fixa de manutenção) é completamente diferente da regra de uma `ContaPoupanca` (que aplica juros de rendimento ao saldo). Em vez de poluir as classes de conta com dezenas de verificações (como `ifs` ou `instanceof`) ou métodos engessados, cria-se um "Visitante" (ex: `FechamentoMensalVisitor`). O visitante percorre a lista genérica de contas e aplica automaticamente o cálculo correto dependendo do tipo da conta visitada em tempo de execução.
