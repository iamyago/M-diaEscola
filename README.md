# 📝 Verificador de Média de Notas em Java

Este projeto é um programa simples em Java que solicita notas de um aluno, calcula a média aritmética e informa sua situação acadêmica: aprovado, em recuperação ou reprovado.

---

## 📋 Descrição

O programa executa as seguintes etapas:
1. Solicita ao usuário a **quantidade de provas** (notas) a serem inseridas.
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
6. Exibe a média final e a situação correspondente.

---

## 🛠 Destaques Técnicos

### 📚 Manipulação de Arrays
- As notas são armazenadas em um array de ponto flutuante:
  ```java
  float[] notas1 = new float[tamanho];

O array é percorrido com um for para ler os valores e calcular a soma:

for (int i = 0; i < tamanho; i++) {
    notas1[i] = scanner.nextFloat();
    soma += notas1[i];
}

➕ Uso de Preposições da Lógica Matemática
As estruturas condicionais if-else utilizam preposições para tomada de decisão:

if (media >= mediaMinima) {
    System.out.println("Aluno APROVADO!");
} else if (media >= notaminima) {
    System.out.println("Ainda consegue recuperar");
} else {
    System.out.println("Aluno REPROVADO!");
}


Comparações lógicas usadas:

• ≥ (maior ou igual)

• < (menor)

• Intervalo: 5 ≤ média < 6

Essas preposições simulam o raciocínio lógico-matemático aplicado na programação.

💻 Como executar
Pré-requisitos:
Java JDK 8 ou superior

IDE ou Terminal para compilação e execução

Passos:
1. Clone o repositório:
   git clone https://github.com/seu-usuario/seu-repositorio.git
   
2. Compile o código:
   javac Main.java

3. Execute o programa:
   java Main

O usuário será guiado pelas instruções no terminal para inserir a quantidade de provas e as notas correspondentes.

📎 Exemplo de uso
Informe a quantidade de notas:
4 // Quantidade de provas e medias que a escola possui.
Prova 1: 7.0 // nota digitada pelo aluno
Prova 2: 5.5
Prova 3: 6.0
Prova 4: 8.0
Aluno APROVADO! // verficador de reprovação, aprovação ou em recuperação.
A média do aluno é: 6.625

🎯 Critérios de Aprovação
Média final | Situação
≥ 6 | Aprovado ✅
≥ 5 e < 6 | Em recuperação ⚠️
< 5 | Reprovado ❌

🙋 Autoria
Mini projetinho desenvolvido por Yago Erik, como prática de manipulação de arrays, estruturas de repetição e lógica matemática em Java.
