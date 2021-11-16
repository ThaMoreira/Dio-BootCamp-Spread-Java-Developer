package application;

public class Program {

	public static void main(String[] args) {
		ifFlecha();
		ifsemFlecha();
		ifFerias();
		ifMenor();

		switchSemana();
		

	}

	private static void ifFlecha() {
		int mes = 6;
		if (mes == 1) {
			System.out.println("Janeiro");
		} else {
			if (mes == 2) {
				System.out.println("Fevereiro");
			} else {
				if (mes == 3) {
					System.out.println("Março");
				} else {
					if (mes == 4) {
						System.out.println("Abril");
					} else {
						if (mes == 5) {
							System.out.println("Maio");
						} else {
							if (mes == 6) {
								System.out.println("Junho");
							} else {
								if (mes == 7) {
									System.out.println("Julho");
								} else {
									if (mes == 8) {
										System.out.println("Agosto");
									} else {
										if (mes == 9) {
											System.out.println("Setembro");
										} else {
											if (mes == 10) {
												System.out.println("Outubro");
											} else {
												if (mes == 11) {
													System.out.println("Novembro");
												} else {
													if (mes == 12) {
														System.out.println("Dezembro");
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	private static void ifsemFlecha() {
		int mes = 6;
		if (mes == 1) {
			System.out.println("Janeiro");
		} else if (mes == 2) {
			System.out.println("Fevereiro");
		} else if (mes == 3) {
			System.out.println("Março");
		} else if (mes == 4) {
			System.out.println("Abril");
		} else if (mes == 5) {
			System.out.println("Maio");
		} else if (mes == 6) {
			System.out.println("Junho");
		} else if (mes == 7) {
			System.out.println("Julho");
		} else if (mes == 8) {
			System.out.println("Agosto");
		} else if (mes == 9) {
			System.out.println("Setembro");
		} else if (mes == 10) {
			System.out.println("Outubro");
		} else if (mes == 11) {
			System.out.println("Novembro");
		} else if (mes == 12) {
			System.out.println("Dezembro");
		}
	}

	private static void ifFerias() {
		String mes = "julho";
		if (mes == "julho" || mes == "dezembro" || mes == "janeiro") {
			System.out.println("Férias");
		}

	}

	private static void ifMenor() {
		double salario = 11850.50;
		double mediaSalario = 10500;

		int qtdDeDependentes = 4;
		int mediaDeDependentes = 2;
		if ((salario < mediaSalario) && (qtdDeDependentes >= mediaDeDependentes)) {
			System.out.println("Deve recerber auxílio");
		}

		boolean salarioBaixo = salario < mediaSalario;
		boolean muitosDependentes = qtdDeDependentes >= mediaDeDependentes;

		if ((salarioBaixo) && (muitosDependentes)) {
			System.out.println("deve receber auxílio");

			boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
			if (recebeAuxilio) {
				System.out.println("Deve receber auxilio");
			} else {
				System.out.println("Não deve receber auxilio");
			}
		}
	}
	
	private static void switchSemana() {
		String dia ="Terça";
		switch(dia) {
		case "Segunda":
			System.out.println(2);
			break;
		case "Terça":
			System.out.println(3);
			break;
		case "Quarta":
			System.out.println(4);
			break;
		case "Quinta":
			System.out.println(5);
			break;
		case "Sexta":
			System.out.println(6);
			break;
		case "Sábado":
			System.out.println(7);
			break;
		case "Domingo":
			System.out.println(1);
			break;
			
		}
	}
}
