public class SimulacaoMock {

    private int score;

    public SimulacaoMock(){
    }
    private void setScore(int score) {
        this.score = score;
    }

    public int getScore(){
        return score;
    }
    public boolean validarScoreCliente(int scoreCliente){
        setScore(getScore() + scoreCliente);

                if (getScore() > 0 ) {
                   return true;
                } else {
                  return false;
                }
    }




}
