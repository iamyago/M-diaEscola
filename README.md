
# 📝 Verificador de Média de Notas em Java

Este projeto é um programa simples em Java que solicita notas de um aluno, calcula a média aritmética e informa sua situação acadêmica: aprovado, em recuperação ou reprovado.

---

## 📋 Descrição

O programa executa as seguintes etapas:
1. Solicita ao usuário a **quantidade de provas** (notas) que serão inseridas.
2. Utiliza um **array** (`float[] notas1`) para armazenar todas as notas fornecidas.
3. Percorre o array usando um **laço `for`** para acumular as notas e calcular a **soma total**.
4. Calcula a **média aritmética**:

   \[
   \text{média} = \frac{\text{soma total das notas}}{\text{quantidade de notas}}
   \]

5. Classifica a situação do aluno com base em **operações lógicas usando preposições matemáticas**:
   - Se **média ≥ 6**: Aluno **Aprovado** ✅
   - Se **5 ≤ média < 6**: Aluno **em Recuperação** ⚠️
   - Se **média < 5**: Aluno **Reprovado** ❌
6. Exibe a **média final** e a **situação correspondente**.

---

## 🛠 Destaques Técnicos

### 📚 Manipulação de Arrays

As notas são armazenadas em um array do tipo `float`, de tamanho dinâmico baseado na entrada do usuário:

```java
float[] notas1 = new float[tamanho];
```

O array é percorrido utilizando um laço `for`, onde cada nota é lida do usuário e somada:

```java
for (int i = 0; i < tamanho; i++) {
    System.out.print("Prova " + (i + 1) + ": ");
    notas1[i] = scanner.nextFloat();
    soma += notas1[i];
}
```

### ➕ Uso de Preposições da Lógica Matemática

O programa utiliza comparações matemáticas dentro das estruturas `if-else` para tomada de decisão:

```java
if (media >= mediaMinima) {
    System.out.println("Aluno APROVADO!");
} else if (media >= notaminima) {
    System.out.println("Ainda consegue recuperar");
} else {
    System.out.println("Aluno REPROVADO!");
}
```

Preposições utilizadas:

• **≥** (maior ou igual)
• **<** (menor)
• **Intervalo entre valores**: 5 ≤ média < 6

Essas condições são fundamentais para classificar corretamente o aluno segundo a média obtida.

---

## 💻 Como Executar

### Pré-requisitos

- Java JDK 8 ou superior
- Terminal ou IDE (Eclipse, IntelliJ IDEA, VSCode)

### Instruções

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   ```

2. Compile o arquivo:

   ```bash
   javac Main.java
   ```

3. Execute o programa:

   ```bash
   java Main
   ```

Durante a execução, siga as instruções para informar a quantidade de provas e as notas correspondentes.

---

## 📎 Exemplo de Uso

```bash
Informe a quantidade de notas:
4
Prova 1: 7.0
Prova 2: 5.5
Prova 3: 6.0
Prova 4: 8.0
Aluno APROVADO!
A média do aluno é: 6.625
```

---

## 🎯 Critérios de Aprovação

| Média Final   | Situação           |
|---------------|--------------------|
| ≥ 6           | Aprovado ✅         |
| ≥ 5 e < 6     | Em Recuperação ⚠️  |
| < 5           | Reprovado ❌        |

---

## 🙋 Autoria

Mini projetinho desenvolvido por Yago Erik, como prática de manipulação de arrays, estruturas de repetição e lógica matemática em Java.
