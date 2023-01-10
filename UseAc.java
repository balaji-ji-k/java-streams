package com.onesoft.Streams;
import java.util.*;
import java.util.stream.Collectors;
public class UseAc {
	public static void main(String[] args) {
		
		ArrayList<Ac> ac = new ArrayList<>();
		ac.add(new Ac("Samsung","White",10,40000,true,1.5f));
		ac.add(new Ac("LG","Blue",12,45000,true,2.0f));
		ac.add(new Ac("Voltas","Red",10,36000,false,1.0f));
		ac.add(new Ac("OGeneral","Grey",12,30000,false,1.5f));
		ac.add(new Ac("Whirlpool","AshWhite",10,34000,true,2.0f));
		ac.add(new Ac("Croma","Green",12,32000,false,1.0f));
		
		List<Ac> highPriceList= ac.stream().filter(x->x.getPrice()>35000).collect(Collectors.toList());
		highPriceList.forEach(x->System.out.println(x));
		List<String> highPriceBrandList = ac.stream().filter(x->x.getPrice()>35000).map(y->y.getBrand()).collect(Collectors.toList());
		highPriceBrandList.forEach(x->System.out.println(x));
		System.out.println();
		List<Ac> sortedAcList = ac.stream().sorted(Comparator.comparing(Ac::getBrand)).collect(Collectors.toList());
		sortedAcList.forEach(x->System.out.println(x));
		System.out.println();
		List<Ac> priceList = ac.stream().filter(x->x.getPrice()<40000).sorted(Comparator.comparingInt(Ac::getPrice)).collect(Collectors.toList());
		priceList.forEach(x->System.out.println(x));
	}

}
