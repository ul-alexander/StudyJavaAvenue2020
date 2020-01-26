package Lesson11;

public class Main {
    public static void main(String[] args) {

        Game game = new Game();

        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();

        player1.setPlayerName("Игрок 1");
        player2.setPlayerName("Игрок 2");
        player3.setPlayerName("Игрок 3");
        player4.setPlayerName("Игрок 4");
        //Дилер
        Dealer playerD = new Dealer();
        playerD.setPlayerName("Крупье");
        playerD.setDealer(true);

        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);
        game.addPlayer(player4);
        game.addPlayer(playerD);

        //start game
        game.doFirstRound();
        //Вывод руки игроков
        game.printPlayersHand();
        game.doActionPlayers();
        game.doActionDealer();

        //Вскрываемся
        game.printAllPlayersHand();

        //Winner
        game.printWinner();
    }
}
