void cadastrarAluno(Aluno listaAlunos[TAM], int *contAluno)
{
	printf("Fazer o cadastro do aluno\n");
	
	printf("digite o numero de matricula:\n");
	scanf("%d", &listaAlunos[*contAluno].matricula);
	
	printf("digite o nome do aluno:\n");
	scanf("%s", listaAlunos[*contAluno].nome);
	getchar();
	
	fflush(stdin);
	
	printf("digite data de nascimento do aluno:\n");
	scanf("%s", listaAlunos[*contAluno].datadenascimento);
	getchar();
	
	fflush(stdin);
	
	printf("digite o seu cpf:\n");
	scanf("%d", &listaAlunos[*contAluno].cpf);
	
	printf("digite m para homem ou f para mulher:\n");
	scanf("%s", listaAlunos[*contAluno].sexo);
	
	getchar();
	
	fflush(stdin);
	*contAluno = *contAluno + 1;
	
}

