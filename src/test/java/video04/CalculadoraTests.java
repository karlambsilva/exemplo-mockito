package video04;
import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTests {
	 
	@Test
	public void test01(){ 
		 
		 Calculadora mockedCalc = mock(Calculadora.class);
		
		 //usando o mock object
		 mockedCalc.setDescricao("Calculadora do CIn");
		 mockedCalc.getDescricao();
	
		 //verificacoes
		 verify(mockedCalc).setDescricao("Calculadora do CIn");
		 verify(mockedCalc).getDescricao();
	}

	@Test
	public void test02(){
		 
		Calculadora mockedCalc = mock(Calculadora.class);
		when(mockedCalc.adicao(3.0, 5.0)).thenReturn(8.0);
		
		Assert.assertEquals(8.0, mockedCalc.adicao(3.0, 5.0), 0.0);
		Assert.assertEquals(11.0, mockedCalc.adicao(6.0, 5.0), 0.0);
	}
}
