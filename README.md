<div data-target="readme-toc.content" class="Box-body px-5 pb-5">
            <article class="markdown-body entry-content container-lg" itemprop="text">
<h2 dir="auto"><a id="user-content-Desafio-de-gerenciamento-de-pessoas-em-api-rest-com-spring-boot" class="anchor" aria-hidden="true"
href="#Desafio-de-gerenciamento-de-pessoas-em-api-rest-com-spring-boot"><svg class="octicon octicon-link" viewBox="0 0 16 16"
version="1.1" width="16" height="16" aria-hidden="true">

</path></svg></a>API basica de gerenciamento de pessoas com Spring Boot</h2>
<hr>
<h3 dir="auto">Desafio tecnico Back-end Attornatus de uma API para gerenciar pessoas, criada com o Spring Boot.</h3>
<h4 dir="auto"><a id="user-content-desenvolvimento" class="anchor" aria-hidden="true" href="#desenvolvimento"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>Desenvolvimento</h4>
<p dir="auto">Foram desenvolvidas as seguintes tarefas:</p>
<ul dir="auto">
<li>Configurações iniciais de um projeto com o Spring Boot Initialzr</li>
<li>Criação de modelo de dados para o mapeamento de entidades em bancos de dados</li>
<li>Desenvolvimento de operações de gerenciamento de pessoas  (Criar uma pessoa, editar uam pessoa, consultar uma pessoa, listar todas as pessoas, criar endereço para pessoa, listar endereços da pessoa, poder informar qual é o endereço principal da pessoa) com o padrão arquitetural REST (GET, POST, PUT, PATCH e DELETE)</li>
<li>Desenvolvimento do perfil de testes com criação de pessoas no banco de dados (só para o método instaciaBaseDaDeDados)</li>
</ul>
<h4 dir="auto"><a id="user-content-tecnologias-e-dependências-utilizadas" class="anchor" aria-hidden="true" href="#tecnologias-e-dependências-utilizadas"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>Tecnologias e Dependências utilizadas</h4>
<ul dir="auto">
<li>Spring tools Suit</li>
<li>Java 11</li>
<li>DBs</li>
<ul dir="auto">
<li><strong>MySql Database</strong></li>
<li><strong>H2 Database</strong></li>
</ul>
</li>
<li>Spring Boot (2.2.11.RELEASE)
<ul dir="auto">
<li>
<p dir="auto"><strong>Spring Boot DevTools</strong></p>
</li>
<li>
<p dir="auto"><strong>Spring Web</strong></p>
</li>
<li>
<p dir="auto"><strong>Spring Data JPA</strong></p>
</li>
<li>
<p dir="auto"><strong>Validation</strong></p>
</li>
<li>
<p dir="auto"><strong>H2</strong></p>
</li>
<li>
<p dir="auto"><strong>MySql</strong></p>
</li>
</ul>
</li>
<li>Git/GitHub para versionamento do código</li>
</ul>
  
<p dir="auto">Para ver em funcionamento apenas abrir o endereço <code>http://localhost:8080/</code> e visualizar a execução do projeto:</p>
<p dir="auto">Gerenciar a pessoa</p>
<table>
<thead>
<tr>
<th>MÉTODO</th>
<th>RECURSO</th>
<th>RESULTADO</th>
</tr>
</thead>
<tbody>
<tr>
<td>GET</td>
<td>/pessoa</td>
<td>retorna lista de pessoas</td>
</tr>
<tr>
<td>GET</td>
<td>/pessoa/{id}</td>
<td>retorna uma pessoa específica com seus endereços</td>
</tr>
<tr>
<td>POST</td>
<td>/pessoa</td>
<td>cria uma nova pessoa</td>
</tr>
<tr>
<td>PUT</td>
<td>/pessoa/{id}</td>
<td>atualiza, de forma integral, uma pessoa</td>
</tr>
<tr>
<td>DELETE</td>
<td>/pessoa/{id}</td>
<td>deleta uma pessoa</td>
</tr>
</tbody>
</table>

<p dir="auto">Gerenciar endereços</p>
<table>
<thead>
<tr>
<th>MÉTODO</th>
<th>ENDEREÇO</th>
<th>RESULTADO</th>
</tr>
</thead>
<tbody>
<tr>
<td>GET</td>
<td><code>http://localhost:8080endereco?pessoa={id}</td>
<td>retorna lista de todos endereços de uma pessoa</td>
</tr>

<td>POST</td>
<td><code>http://localhost:8080endereco?pessoa={id}</code></td>
<td>cria um novo endereço para uma pessoa</td>
</tr>
<tr>
<td>PUT</td>
<td><code>http://localhost:8080endereco/endereco/{id}</td>
<td>atualiza TODO endereço</td>
</tr>
</tr>
</tbody>
</table>

<p dir="Atualiza ou escolhe apenas endereço principal"></p>
<table>
<thead>
<tr>
<th>MÉTODO</th>
<th>ENDEREÇO</th>
<th>RESULTADO</th>
<th>EXEMPLO DE JSON</th>
</tr>
</thead>
<tbody>
<td>PATCH</td>
<td><code>http://localhost:8080endereco/{id}</td>
<td>atualiza APENAS endereço principal</td>
<td>{"enderecoPrincipal": true}</td>
</tr>

</tbody>
</table>

</ul>
</article>
</div>
