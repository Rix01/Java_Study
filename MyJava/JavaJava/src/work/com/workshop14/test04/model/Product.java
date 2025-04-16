package work.com.workshop14.test04.model;

import java.sql.Date;

public record Product (
		int pdno,
		String pdname,
		String pdsubname,
		int factno,
		Date pddate,
		int pdcost,
		int pdprice,
		int pdamount
		){}
