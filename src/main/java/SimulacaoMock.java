public class SimulacaoMock {

    private int score;
    private boolean validaScore;

    public SimulacaoMock(){
    }
    public boolean getValidaScore() { return validaScore;}
    public void setValidaScore(boolean validaScore) {
        this.validaScore = validaScore;
    }
    private void setScore(int score) {
        this.score = score;
    }
    public int getScore(){
        return score;
    }
    public boolean validarScoreCliente(int scoreCliente){ setScore(getScore() + scoreCliente);if (this.score > 0 ) {setValidaScore(true); } else {setValidaScore(false);}return getValidaScore(); }}
