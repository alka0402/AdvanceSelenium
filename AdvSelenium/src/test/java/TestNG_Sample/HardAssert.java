package TestNG_Sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void m12() {
		System.out.println("step1");
		System.out.println("step2");
		Assert.assertEquals(true, "all");
		System.out.println("step3");
		System.out.println("step4");
	}
	@Test
	public void m1() {
		String actData="Ram";
		String EXp="Ram";
		Assert.assertEquals(actData,EXp);
	}
	@Test
	public void m2() {
		String actData="Ram";
		String EXp="Ram";
		Assert.assertEquals(actData,EXp,"AssertFail");
		System.out.println("AssertPass");
	}
	@Test
	public void m3() {
		int i=10;
		int j=20;
		Assert.assertEquals(j,i,"fail");
		System.out.println("pass");
	}
	@Test
	public void m4() {
		String actData="Ram";
		String EXp="Ram  ";
		Assert.assertNotEquals(actData, EXp,"Assert Equal");
		System.out.println("assert not equal");
	}
	@Test
	public void m5() {
		String actData="Ram";
		String EXp="Ram  ";
		Assert.assertTrue(actData.equals(EXp),"Assert not Equal");
		System.out.println("assert  equal");
	}
	@Test
	public void m6() {
		String actData="Ram";
		String EXp="Ram";
		Assert.assertTrue(actData.equals(EXp),"Assert not Equal");
		System.out.println("assert  equal");
	}
	@Test
	public void m7() {
		String actData="Ram";
		String EXp="Ram  ";
		Assert.assertFalse(actData.equals(EXp),"Assert Fail");
		System.out.println("assert equal");
	}
	
	@Test
	public void m8() {
		String actData="Ram";
		
		Assert.assertNull(actData,"Assert not null");
		System.out.println("assert null");
	}
	@Test
	public void m9() {
		String actData=null;
		
		Assert.assertNull(actData,"Assert not null");
		System.out.println("assert null");
	}
	@Test
	public void m10() {
		String actData="Ram";
		
		Assert.assertNotNull(actData,"Assert not null");
		System.out.println("assert null");
	}
	@Test
	public void m11() {
		String actData=null;
		
		Assert.assertNotNull(actData,"Assert not null");
		System.out.println("assert null");
	}
	@Test
	public void m13() {
		String actData="Ram";
		String EXp="Ram";
		
		Assert.assertSame(actData,EXp,"Assert not same");
		System.out.println("assert same");
	}
	@Test
	public void m14() {
		String actData="Ram";
		String EXp="Ram  ";
		
		Assert.assertSame(actData,EXp,"Assert not same");
		System.out.println("assert same");
	}
	@Test
	public void m15() {
		String actData="Ram";
		String EXp="Ram";
		
		Assert.assertNotSame(actData,EXp,"Assert not same");
		System.out.println("assert same");
	}
	@Test
	public void m16() {
		String actData="Ram";
		String EXp="Ram  ";
		
		Assert.assertNotSame(actData,EXp,"Assert not same");
		System.out.println("assert same");
	}
	
	

}
