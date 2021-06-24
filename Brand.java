class Brand{
	
	String brandName;
	String turnover;
	String founder;
	String industryType;
	int worldRank;
	String headQuarter;
	
	public static void main(String args[]){
		
		Brand b = new Brand();
		b.brandName = "Apple inc";
		b.turnover = "$323bln";
		b.founder = "Steve Jobs";
		b.industryType = "Electronics & IT";
		b.worldRank = 1;
		b.headQuarter = "California, USA";
		System.out.println(b.brandName+", "+b.turnover+", "+b.founder+", "+b.industryType+", "+b.worldRank+", "+b.headQuarter);
		
		Brand r = new Brand();
		r.brandName = "Amazon";
		r.turnover = "$200.7bln";
		r.founder = "Jeff Bezos";
		r.industryType = "Retail Business";
		r.worldRank = 2;
		r.headQuarter = "Seattle, Washington";
		System.out.println(r.brandName+", "+r.turnover+", "+r.founder+", "+r.industryType+", "+r.worldRank+", "+r.headQuarter);
		
		Brand a = new Brand();
		a.brandName = "Microsoft";
		a.turnover = "$166bln";
		a.founder = "Bill Gates";
		a.industryType = "Software Development";
		a.worldRank = 3;
		a.headQuarter = "Redmond, Washington";
		System.out.println(a.brandName+", "+a.turnover+", "+a.founder+", "+a.industryType+", "+a.worldRank+", "+a.headQuarter);
		
		Brand n = new Brand();
		n.brandName = "Google";
		n.turnover = "$165.4bln";
		n.founder = "Sundar pichai";
		n.industryType = "Internet";
		n.worldRank = 4;
		n.headQuarter = "Mountain view, California";
		System.out.println(n.brandName+", "+n.turnover+", "+n.founder+", "+n.industryType+", "+n.worldRank+", "+n.headQuarter);
		
		Brand d = new Brand();
		d.brandName = "Samsung";
		d.turnover = "$62.3bln";
		d.founder = "Lee Byung-Chul";
		d.industryType = "Electronics";
		d.worldRank = 5;
		d.headQuarter = "Suwon, SouthLorea";
		System.out.println(d.brandName+", "+d.turnover+", "+d.founder+", "+d.industryType+", "+d.worldRank+", "+d.headQuarter);
		
		Brand br = new Brand();
		br.brandName = "Coco Cola";
		br.turnover = "$56.9bln";
		br.founder = "Asa Griggs Candler";
		b.industryType = "Food";
		br.worldRank = 6;
		br.headQuarter = "Atlanta, Georgia, USA";
		System.out.println(br.brandName+", "+br.turnover+", "+br.founder+", "+br.industryType+", "+br.worldRank+", "+br.headQuarter);
		
		Brand bd = new Brand();
		bd.brandName = "Toyota";
		bd.turnover = "$51.6bln";
		bd.founder = "Sakichi Toyoda";
		bd.industryType = "Automobile";
		bd.worldRank = 7;
		bd.headQuarter = "Toyota, Aichi, Japan";
		System.out.println(bd.brandName+", "+bd.turnover+", "+bd.founder+", "+bd.industryType+", "+bd.worldRank+", "+bd.headQuarter);
		
		Brand bnd = new Brand();
		bnd.brandName = "Mercedes-Benz";
		bnd.turnover = "$49.3bln";
		bnd.founder = "Karl Benz";
		bnd.industryType = "Automobile";
		bnd.worldRank = 8;
		bnd.headQuarter = "Stuttgart, Germany";
		System.out.println(bnd.brandName+", "+bnd.turnover+", "+bnd.founder+", "+bnd.industryType+", "+bnd.worldRank+", "+bnd.headQuarter);
		
		Brand ba = new Brand();
		ba.brandName = "McDonald's";
		ba.turnover = "$42.8bln";
		ba.founder = "Mac & Dick McDonald's";
		ba.industryType = "Food";
		ba.worldRank = 9;
		ba.headQuarter = "SanBernardino, California";
		System.out.println(ba.brandName+", "+ba.turnover+", "+ba.founder+", "+ba.industryType+", "+ba.worldRank+", "+ba.headQuarter);
		
		Brand bran = new Brand();
		bran.brandName = "Disney";
		bran.turnover = "$40.8bln";
		bran.founder = "Walt & Roy Disney";
		bran.industryType = "Movie-making, theme parks";
		bran.worldRank = 10;
		bran.headQuarter = "Burbanl, California, USA";
		System.out.println(bran.brandName+", "+bran.turnover+", "+bran.founder+", "+bran.industryType+", "+bran.worldRank+", "+bran.headQuarter);
				
	}

}