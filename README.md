# jokenpo-spring

Jogo de JokenPo usando Spring Boot

As opções de jogadas são

    Spock
    Scissor
    Paper
    Stone
    Lizard
    
Para executar voce pode usar o comando "gradlew build" e então rodar o jar gerado localizado na pasta /build/libs ou usar o   
comando "gradlew bootRun" para executar diretamente.

Para jogar usar o serviço (TODOS SÃO GET APENAS POR PADRÃO)
    
    /move/save?name=<Nome>&move=<Jogada>
exemplo
    
    http://localhost:8080/move/save?name=Gabriel&move=Paper
para adicionar uma jogava nova e enfim use o serviço

    /game
    
para calcular e gerar o resultado. (a lista de jogadas é zerada a partir de cada resultado gerado)
