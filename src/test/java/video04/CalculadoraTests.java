package video04;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class CalculadoraTests {
	 
	@Test
	public void test01(){ 
		 
		 Calculadora mockedCalc = mock(Calculadora.class);
		
		 //usando o mock object
		 mockedCalc.setNumero1(3.0);
		 mockedCalc.getNumero2();
	
		 //verificacoes
		 verify(mockedCalc).getNumero2();
		 verify(mockedCalc).setNumero1(3.0);
	}
	
	@Test
	public void test02(){ 
		 
		 Calculadora mockedCalc = mock(Calculadora.class);
		
		 //usando o mock object
		 when(mockedCalc.getNumero2()).the
		 mockedCalc.getNumero2();
	
		 //verificacoes
		 verify(mockedCalc).getNumero2();
		 verify(mockedCalc).setNumero1(3.0);
	}
}
