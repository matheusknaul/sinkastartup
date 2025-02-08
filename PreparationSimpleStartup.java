public class PreparationSimpleStartup{
    //TODO DECLARE um array int para armazenar os locais das células. Chame-o de locationCells.
    //TODO DECLARE um int para armazenar o número de acertos. Chame-o de numOfHits e o DECLARE como 0.

    //MÉTODOS

    //TODO DECLARE um método checkYourself() que receba um int para o palpite dos usuários (1,3 etc), que verifique
    //esse palpite e retorne o resultado representado um "acertou", "errou" ou "abateu".
    //No código, "hit", "miss" ou "kill".

    //TODO DECLARE um método setter setLocationCells() que receba um array int (que armazene os três
    //locais das células como ints (2,3,4 etc)).

    //TODO MÉTODO: String checkYourself(int userGuess)
        //OBTÉM o palpite do usuário como um parâmetro int
        //REPETE isso com cada uma das células de locais no array int
            //COMPARA o palpite do usuário com a célula de locais
            //SE o palpite do usuário estiver correto
                //INCREMENTA o número de acertos
                //VERIFICA se foi a última célula de local:
                //SE o número de acertos for 3:, RETORNA "kill", como resultado
                //SE NÃO for "kill" RETORNA "hit"
                //FIM DO SE
            //SE NÃO estiver correto o palpite, RETORNA "miss"
            //FIM DO SE
        //FIM DA REPETIÇÃO
    //FIM DO MÉTODO

    //TODO MÉTODO: void setLocationCells(int[] cellLocations)
        //GET (recupera a localização com um parâmetro array do tipo int)
        //ASSIGN(atribui a localização passada como parâmetro à variável instância da localização)
    //END METHOD
}