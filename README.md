# LP_II_Trabalho
Trabalho de LP II - Fatec BD - 3° SEM

### Alunos
* Henrique Castro
* Kleber Nascimento
* Maria Clara
* Matheus Luiz
* Otavio Raposo
* Robson Sousa
* Vanessa Bessa

### Reqisitos

[trabalho-final](https://github.com/oliveiramclaraa/LP_II_Trabalho/blob/master/requisitos/trabalho-final.pdf)

### Links Uteis

https://medium.com/danieldiasjava/criando-uma-aplica%C3%A7%C3%A3o-rest-com-javalin-b59f5c19999f


### Comandos GIT
|                   		**Comando Git**                   		   |								**Descrição**             			|
|----------------------------------------------------------------------|--------------------------------------------------------------------|
|**git config --global user.name "Nome do Usuário"**  				   | Configurar o nome do usuário (aplica-se a todos projetos)			|
|**git config --global user.email "Email do Usuário"**				   | Configurar o email do usuário (aplica-se a todos projetos) 		|
|**git init**														   | Inicializar um repositório GIT (executar na raiz do projeto 		|
|**git status**														   | Exibir o status do projeto											|
|**git log**														   | Exibir o log (histórico) do commits realizados						|
|**git shortlog**													   | Exibir um log resumido dos commits realizados			 			|
|**git diff --staged**												   | Exibir a diferença entre os arquivos adicionados à áre de Stage	|
|**git remote -v**													   | Listar os repositórios remotos										|
|**git clone https://github.com/oliveiramclaraa/LP_II_Trabalho.git**   | Clonar um repositório remoto para a máquina local (HTTPS)			|
|**git clone git@github.com:oliveiramclaraa/LP_II_Trabalho.git**	   | Clonar um repositório remoto para a máquina local (SSH)			|
|**git remote set-url origin https://github.com/user/url_repositorio** | Editar a url do repositório remoto									|
|**git remote add origin https://github.com/user/url_repositorio**	   | Adicionar a url do repositório remoto (vazio) ao projeto local		|
|**git add .**														   | Adicionar todos arquivos modificados a área de Stage				|
|**git add .gitignore**												   | Adicionar o arquivo ".gitignore" a área de Stage					|
|**git commit -m** "Meu primeiro commit"							   | Comando seguido do parâmetro -m indica uma descrição para o commit	|
|**git fetch -a**													   | Rastrear as branchs remotas										|
|**git branch -a**													   | Rastrear as branchs locais											|
|**git brach**														   | Exibir as branchs locais											|
|**git branch development**											   | Criar uma nova branch de nome "development"						|
|**git checkout development**										   | Mover para a branch de nome "development"							|
|**git checkout -b production**										   | Criar uma nova branch de nome "production" e mover para a mesma	|
|**git reset --hard cedc856**										   | Resetar o commit para o commit com o identificar hash informado	|
|**git reset --hard HEAD~3**										   | Resetar o commit para 3 commits anteriores ao atual				|
|**git reset --soft HEAD~2**										   | Resetar o commit para 2 commits anterirores ao atual				|
|**git rm -r --cached**												   | Limpar o cache de todos os arquivos adicionados à área de Stage	|
**git rm -r --cached** diretorio/arquivo							   | Limpar o cache do arquivo no diretório adicionado à área de Stage	|
|----------------------------------------------------------------------|--------------------------------------------------------------------|
|								**Opcional** 						   | 							**Descrição**							|
|----------------------------------------------------------------------|--------------------------------------------------------------------|
|**git config --local user.name "Nome do Usuário"**  				   | Configurar o nome do usuário (aplica-se a todos projetos)			|
|**git config --local user.email "Email do Usuário"**				   | Configurar o email do usuário (aplica-se a todos projetos) 		|
|----------------------------------------------------------------------|--------------------------------------------------------------------|

**Observação**: é possível configurar duas contas de usuários de Github (ou Bitbucket, Gitlab) em uma mesma máquina, desde que claro, os emails sejam diferentes.
Mas afinal, para que isso? Um só é suficiente. Claro que sim!

Só que um dia se você precisar fazer testes de comandos GIT, permissões para executar PUSH RESQUESTS, MERGE entre outras
coisas, e quiser saber como o outro usuário tem acesso, ou simplesmente praticar resoluções de problemas que podem acontecer, fica aí a sugestão.

Funciona assim, primeiramente vamos pensar nas contas como usuario1 e usuario2, cada um com seu respectivo email usuario1@dominio.com e usuario2@dominio.com

Configure o usuario1 no git, como --global. Esse usuário é o que será configurado para todos projetos, cada qual com seu repositório remoto.

Para o usuario2 crie uma nova pasta para salvar o projeto localmente, afinal, queremos simular duas pessoas na mesma máquina.

Configure o usuario2 no git como --local. Esse usuário será configurado para cada projeto específico, ou seja, se dentro de C:\projetos\local\ tiver
os projetos: projeto1, projeto2, projeto_n, para cada um deles terá que ser configurado (nome e email).

Por exemplo:

Usuario1
Caminho: C:\projetos\global\projeto-teste
git config --global user.name "Usuario 1"
git config --global user.email "usuario1@dominio.com"

Usuario2
Caminho: C:\projetos\local\projeto-teste
git config --local user.name "Usuario 2"
git config --local user.email "usuario2@dominio.com"


Lembrando que: "projeto-teste" em global é o mesmo "projeto-teste" em local.

Assim cada usuário trabalha em sua pasta, abra um terminal GIT na raiz do projeto de cada usuário. E agora você pode trabalhar na sua máquina, simulando interações com outro desenvolvedor.

### ALIAS (Apelidos para comandos ou conjunto de instruções)

Alias ou apelidos para comandos podem ser bastante úteis, especialmente quando executamos um determinado comando ínúmeras vezes. Como por
exemplo, o comando git status. Não seria melhor ter um apelido para ele? Veja como é simples criar alias para GIT e para o terminal Bash.

**alias gs="git status"**

Contudo, é importante saber que há pelo menos duas formas de criar alias:

* aliás temporários: 

	Alias temporários serão perdidos toda vez que você encerrar o terminal do GIT BASH.

	Para crialos é bastante simples. Abaixo alguns exemplos. Depois você pode criar os que achar conveniente.
	
	**alias cls="clear"**	Limpa a tela do terminal;
	
	**alias h="history"** 	Este aliás de nome "h" é o agora o apelido para history. O comando history mostra o histórico de comandos digitados no terminal;
	
	**alias documentos="cd /c/Users/usuario/Documments"** O aliás de nome **documentos** permite que se navegue até o diretório Documments do usuário de forma simples;
	
	**alias original="git push -u origin master"** O primeiro commit é sempre enviado para a branch Master. E digitar "original" é bem mais simples;
	
	**alias llog="git log --graph --pretty=format:'%Cred%h%Creset -%C(yellow)%d%Creset %s %Cgreen(%cr) %C(bold blue)<%an>%Creset' --abbrev-commit"**;
	
	Nesse último foi criado um alias de nome **llog** que exibe um log resumido e colorido. Muito útil quando se tem muitos commits.

* alias permanentes:

	Para criar alias permanentes caso você esteja utilizando sistemas Windows. Abra o terminal do GIT BASH em modo Administrador, assim, os alias poderão
	ser executados por qualquer usuário do sistema (caso queira). Além de que o arquivo que precisamos editar em modo de escrita só pode ser feito em modo
	Administrador;

	Para isto, abra o arquivo **.bash.bashrc** localizado em **/etc** com um editor da sua escolha, por exemplo: vi, nano ou notepad.
	Em qualquer lugar desse arquivo (*.bash.bashrc*) de preferência no início, adicione os comandos alias descritos no exemplos dos alias temporários.
	Caso você edite o arquivo de modo errado, basta **não salvá-lo**;

	Tanto os alias temporários, quanto os alias permanentes tem a mesma sintaxe. Observe que o alias abaixo pode ser feito de tanto de forma permanente,
	como foi feito acima (temporária);

	**alias llog="git log --graph --pretty=format:'%Cred%h%Creset -%C(yellow)%d%Creset %s %Cgreen(%cr) %C(bold blue)<%an>%Creset' --abbrev-commit"**;

	Dessa forma, utilize sua criatividade para criar quantos alias achar necessário. Mas lembre-se: antes de criar um aliás, verifique se o
	nome do seu alias não é o nome de um comando existente. De preferência, utilize nomes que você tem certeza que não existem;

	Criar alias permanentes no Linux é basicamente feito da mesma forma, só que deve ser feito em modo sudo ou su (administrador em ambientes Linux)
	caso você queira que os outros usuário possam executa-los. Além disso, independente da versão Linux que se utilize, o arquivo está contido geralmente 
	mesmo diretório **/etc**. No entanto, o nome dele pode variar de uma distribuição para outra: por exemplo, no CentOS, Fedora **/etc/bash.bashrc**. Talvez no Ubuntu seja apenas **/etc/bashrc**;

	**Observação:** caso você esqueça o alias que você criou: crie um alias para exibir o conteúdo do arquivo .bash.bashrc. Assim: **alias printar="cat /etc/bash.bashrc"**;
	

Por fim, é possível criar alias especificos **SOMENTE para o GIT**. E o processo é mais simples ainda. Mas aqui vou deixar apenas um exemplo. Se você gostar, então você poderá criar outros.

**git config --global alias.logline "log --graph --pretty=format:'%Cred%h%Creset -%C(yellow)%d%Creset %s %Cgreen(%cr) %C(bold blue)<%an>%Creset' --abbrev-commit"**

Criado esse aliás, digite no terminal o seguinte comando: git logline

Em resumo: você pode criar alias para executar um simples comando ou um conjunto de intruções (dos mais variados), navegar entre diretórios, dar permissões, etc.
