import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testUnit {
    // Validar carro para financiamento
    Simulacao sim = new Simulacao();

    @Test()
    //cobertura de desvio
    public void validaMaiordeIdade() throws ParseException {
        //arrange
        String dataNasc ="01/02/2000";

        //act
      boolean idadeOk =  sim.validarClienteMaiorIdade(dataNasc);

        //assert
        Assert.assertTrue("Cliente Menor de Idade",idadeOk ==true);
    }
    @Test()
    //cobertura de desvio
    public void validaMenorDeIdade() throws ParseException {
        //arrange
        String dataNasc ="01/02/2010";

        //act
        boolean idadeOk =  sim.validarClienteMaiorIdade(dataNasc);

        //assert
        Assert.assertTrue("Cliente Maior de IDade",idadeOk ==false);
    }
    @Test
    //cobertuda de comando
    public void validarAnoCarro(){
        //arrange
        int anoCarro =2001;
        //act
        boolean anoveiculoValidar = sim.validarAnoCarro(anoCarro);
        //assert
        Assert.assertTrue("Valor ano carro menor do que o permitido", anoveiculoValidar== true );

    }
    @Test
    public void validarAnoVeiculoOKTipoVeiculoOK(){
        //arrange
        int tipoVeiculo =1;
        int anocarro =2000;
        boolean esperado =true;
        //act
        boolean validarAnoVeic = sim.validartipoVeiculo(tipoVeiculo,anocarro);
        //assert
        Assert.assertTrue("Carro Invalido",validarAnoVeic == esperado );

    }
    @Test
    public void validarCarroValidoEAnoInvalido(){
        //arrange
        int tipoVeiculo =1;
        int anocarro =1999;
        boolean esperado =false;
        //act
        boolean validarAnoVeic = sim.validartipoVeiculo(tipoVeiculo,anocarro);
        //assert
        Assert.assertTrue(validarAnoVeic == esperado );

    }
    @Test
    public void validarMotoValidoEAnoInvalido(){
        //arrange
        int tipoVeiculo =2;
        int anocarro =1999;
        boolean esperado =false;
        //act
        boolean validarAnoVeic = sim.validartipoVeiculo(tipoVeiculo,anocarro);
        //assert
        Assert.assertTrue(validarAnoVeic == esperado );

    }
    @Test
    public void validarMotoValidoEAnoValido(){
        //arrange
        int tipoVeiculo =2;
        int anocarro =2001;
        boolean esperado =true;
        //act
        boolean validarAnoVeic = sim.validartipoVeiculo(tipoVeiculo,anocarro);
        //assert
        Assert.assertTrue(validarAnoVeic == esperado );

    }


}
