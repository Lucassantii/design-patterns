**Padrões Criacionais**
**Abstract Factory**
Este padrão fornece uma interface para criar famílias de objetos relacionados, sem precisar especificar as classes concretas desses objetos. Ele facilita a criação de diferentes tipos de objetos de uma forma flexível e desacoplada.

**Builder**
O padrão Builder é utilizado quando precisamos construir objetos complexos com muitos atributos. Ele separa o processo de construção do objeto da sua representação final, permitindo que o objeto seja montado de forma gradual, passo a passo.

**Factory Method**
O Factory Method define uma interface para criar objetos, mas permite que as subclasses decidam qual classe concreta instanciar. Esse padrão facilita a adição de novas classes no sistema sem precisar modificar o código existente, promovendo maior flexibilidade e manutenção.

**Padrões Estruturais**
**Adapter**
O Adapter serve para fazer a conexão entre componentes que possuem interfaces incompatíveis. Ele "adapta" a interface de uma classe para que ela seja compatível com o que o sistema espera, permitindo que classes diferentes colaborem entre si.

**Bridge**
O padrão Bridge tem como objetivo separar a abstração de sua implementação, permitindo que ambas possam variar de forma independente. Ele facilita a alteração de implementações sem afetar a abstração e vice-versa, promovendo mais flexibilidade no design.

**Padrões Comportamentais**
**Chain of Responsibility**
O Chain of Responsibility permite que um objeto seja processado por uma cadeia de manipuladores, desacoplando o remetente do objeto que processa a requisição. Esse padrão permite que múltiplos objetos processem a solicitação de forma sequencial, sem que o remetente precise saber qual objeto tratará a requisição.

**Strategy**
O padrão Strategy define uma família de algoritmos ou comportamentos intercambiáveis, permitindo que um objeto altere seu comportamento em tempo de execução. Em vez de ter múltiplas condições if-else ou switch-case, ele usa o conceito de "estratégias" para encapsular diferentes comportamentos, promovendo maior flexibilidade e reutilização de código.
