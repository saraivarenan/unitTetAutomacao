import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Simulacao {

    //criar validacao tipo veiculo

    public boolean validarAnoCarro(int ano){
        int anolimite =2000;
        return (ano >= anolimite);
    }
    public Boolean validartipoVeiculo(int tipoVeiculo, int anocarro) {
        //1 MOTO
        //2 CARRO
        if (validarAnoCarro(anocarro) ==true){
            if(tipoVeiculo == 1){
                return true;
            }
          else if(tipoVeiculo == 2){
                return true;
            }
        }
        return false;
    }
    private static int getIdade(Date data) {
        Calendar cData = Calendar.getInstance();
        Calendar cHoje= Calendar.getInstance();
        cData.setTime(data);
        cData.set(Calendar.YEAR, cHoje.get(Calendar.YEAR));
        int idade = cData.after(cHoje) ? -1 : 0;
        cData.setTime(data);
        idade += cHoje.get(Calendar.YEAR) - cData.get(Calendar.YEAR);
        return idade;
    }
    public boolean validarClienteMaiorIdade(String data) throws ParseException {
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(data);
        int idadeMinima =18;
        int idadeCliente = getIdade(date1);
        if (idadeCliente >= idadeMinima){
            return  true;
        }else {
            return false;
        }
    }
    public String validarvalorVeiculoSimunacao(int valorVeic){
        if(valorVeic>=5000){
            return "Valor permitido pra financiamento";
        }
        else{
            return "Valor não permitido pra financiamento";
        }
    }
}

