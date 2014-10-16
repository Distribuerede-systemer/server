package model.QOTD;

import model.Model;

public class QOTDTest {

	public static void main(String[] args) {

		QOTDModel qm = new QOTDModel();
		Model m = new Model();
		
		m.doQuery("");
		
		qm.saveQuote();
	}

}
