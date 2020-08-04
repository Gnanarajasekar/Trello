package uicheck_test;

import org.testng.annotations.Test;

import uicheck.TrelloUI;

public class TrelloUI_Test {

	TrelloUI obj;
	
	@Test
	public void UITesting()
	{
		obj=new TrelloUI();
		obj.UI();
	}
}
