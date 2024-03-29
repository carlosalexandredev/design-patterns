## Design Patterns
[![Linkedin Badge](https://img.shields.io/badge/-Carlos%20Alexandre-002E74?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/carlosalexandredev/)](https://www.linkedin.com/in/carlosalexandredev/)
[![Gmail Badge](https://img.shields.io/badge/-carlosalexandredev.contato@gmail.com-002E74?style=flat-square&logo=Gmail&logoColor=white&link=mailto:carlosalexandredev.contato@gmail.com)](mailto:carlosalexandredev.contato@gmail.com)


**Design Patterns:**
Padrões de projeto são soluções típicas para problemas comuns em projeto de software. Eles são como plantas de obra pré fabricadas que você pode customizar para resolver um problema de projeto recorrente em seu código.</br>
[Padrões de Projeto - Solucões Reutilizáveis de Software Orientado a Objetos.pdf](https://github.com/carlosalexandredev/desing-patterns/blob/c0ddbf7b49bed10d18ecf1941745d72e97ab6105/Padr%C3%B5es%20de%20Projeto%20-%20Soluc%C3%B5es%20Reutiliz%C3%A1veis%20de%20Software%20Orientado%20a%20Objetos.pdf)
- **[Criacionais(Creational)](#criacionaiscreational)**
    - [Factory Method](#factory-method)
    - [Abstract Factory](#abstract-factory)
    - [Builder](#builder)
    - [Prototype](#prototype)
    - [Singleton](#singleton)
- **[Estruturais(Structural)](#estruturaisstructural)**
    - [Adapter](#adapter)
    - [Bridge](#bridge )
- **Comportamentais(Behavioral)**
- **Outros**

### Criacionais(Creational)

#### Factory Method
O **Factory Method** fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados.</br>
[View Code](src/main/java/dev/carlos/designpatters/creational/factory_method)
#### Abstract Factory
O **Abstract Factory** permite que você produza famílias de objetos relacionados sem ter que especificar suas classes concretas.</br>
[View Code](src/main/java/dev/carlos/designpatters/creational/abstract_method)

#### Builder
O **Builder** permite a você construir objetos complexos passo a passo. O padrão permite que você produza diferentes tipos e representações de um objeto usando o mesmo código de construção.</br>
[View Code](src/main/java/dev/carlos/designpatters/creational/builder)


#### Prototype
O **Prototype** permite copiar objetos existentes sem fazer seu código ficar dependente de suas classes.</br>
[View Code](src/main/java/dev/carlos/designpatters/creational/prototype)

#### Singleton
O **Singleton** permite a você garantir que uma classe tenha apenas uma instância, enquanto provê um ponto de acesso global para essa instância.</br>
[View Code](src/main/java/dev/carlos/designpatters/creational/singleton)

### Estruturais(Structural)

#### Adapter
O **Adapter** permite objetos com interfaces incompatíveis colaborarem entre si.</br>
[View Code](src/main/java/dev/carlos/designpatters/structural/adapter)

#### Bridge
O **Bridge** permite que você divida uma classe grande ou um conjunto de classes intimamente ligadas em duas hierarquias separadas—abstração e implementação—que podem ser desenvolvidas independentemente umas das outras.</br>
[View Code](src/main/java/dev/carlos/designpatters/structural/bridge )