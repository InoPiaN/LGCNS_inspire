import lgcns.inspire.control.game.GuessGame;

public class GuessGameApp {
    /*
     * 목표는 해당 answer값을 맞추는 것
     */
    public static void main(String[] args) {
        int answer = GuessGame.generatorNan();

        System.out.println("정답:" + answer);
        GuessGame game = new GuessGame();
        game.gameStart(answer);
    }

}
