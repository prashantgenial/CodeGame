package com.mine;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayIntTosort {


	private static final String[] tensNames = {
		    "",
		    " ten",
		    " twenty",
		    " thirty",
		    " forty",
		    " fifty",
		    " sixty",
		    " seventy",
		    " eighty",
		    " ninety"
		  };

		  private static final String[] numNames = {
		    "",
		    " one",
		    " two",
		    " three",
		    " four",
		    " five",
		    " six",
		    " seven",
		    " eight",
		    " nine",
		    " ten",
		    " eleven",
		    " twelve",
		    " thirteen",
		    " fourteen",
		    " fifteen",
		    " sixteen",
		    " seventeen",
		    " eighteen",
		    " nineteen"
		  };

		  private ArrayIntTosort() {}

		  private static String convertLessThanOneThousand(int number) {
		    String soFar;

		    if (number % 100 < 20){
		      soFar = numNames[number % 100];
		      number /= 100;
		    }
		    else {
		      soFar = numNames[number % 10];
		      number /= 10;

		      soFar = tensNames[number % 10] + soFar;
		      number /= 10;
		    }
		    if (number == 0) return soFar;
		    return numNames[number] + " hundred" + soFar;
		  }


		  public static String convert(long number) {
		    // 0 to 999 999 999 999
		    if (number == 0) { return "zero"; }

		    String snumber = Long.toString(number);

		    // pad with "0"
		    String mask = "000000000000";
		    DecimalFormat df = new DecimalFormat(mask);
		    snumber = df.format(number);

		    // XXXnnnnnnnnn
		    int billions = Integer.parseInt(snumber.substring(0,3));
		    // nnnXXXnnnnnn
		    int millions  = Integer.parseInt(snumber.substring(3,6));
		    // nnnnnnXXXnnn
		    int hundredThousands = Integer.parseInt(snumber.substring(6,9));
		    // nnnnnnnnnXXX
		    int thousands = Integer.parseInt(snumber.substring(9,12));

		    String tradBillions;
		    switch (billions) {
		    case 0:
		      tradBillions = "";
		      break;
		    case 1 :
		      tradBillions = convertLessThanOneThousand(billions)
		      + " billion ";
		      break;
		    default :
		      tradBillions = convertLessThanOneThousand(billions)
		      + " billion ";
		    }
		    String result =  tradBillions;

		    String tradMillions;
		    switch (millions) {
		    case 0:
		      tradMillions = "";
		      break;
		    case 1 :
		      tradMillions = convertLessThanOneThousand(millions)
		         + " million ";
		      break;
		    default :
		      tradMillions = convertLessThanOneThousand(millions)
		         + " million ";
		    }
		    result =  result + tradMillions;

		    String tradHundredThousands;
		    switch (hundredThousands) {
		    case 0:
		      tradHundredThousands = "";
		      break;
		    case 1 :
		      tradHundredThousands = "one thousand ";
		      break;
		    default :
		      tradHundredThousands = convertLessThanOneThousand(hundredThousands)
		         + " thousand ";
		    }
		    result =  result + tradHundredThousands;

		    String tradThousand;
		    tradThousand = convertLessThanOneThousand(thousands);
		    result =  result + tradThousand;

		    // remove extra spaces!
		    return result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
		  }

		  /**
		   * testing
		   * @param args
		   */
		  
		    
	public static void main(String[] s) {
		
		Integer[] a = {1,2,3,7};
		/*System.out.println("*** " + ArrayIntTosort.convert(0));
	    System.out.println("*** " + ArrayIntTosort.convert(1));
	    System.out.println("*** " + ArrayIntTosort.convert(16));
	    System.out.println("*** " + ArrayIntTosort.convert(100));
	    System.out.println("*** " + ArrayIntTosort.convert(118));
	    System.out.println("*** " + ArrayIntTosort.convert(200));
	    System.out.println("*** " + ArrayIntTosort.convert(219));
	    System.out.println("*** " + ArrayIntTosort.convert(800));
	    System.out.println("*** " + ArrayIntTosort.convert(801));
	    System.out.println("*** " + ArrayIntTosort.convert(1316));
	    System.out.println("*** " + ArrayIntTosort.convert(1000000));
	    System.out.println("*** " + ArrayIntTosort.convert(2000000));
	    System.out.println("*** " + ArrayIntTosort.convert(3000200));
	    System.out.println("*** " + ArrayIntTosort.convert(700000));
	    System.out.println("*** " + ArrayIntTosort.convert(9000000));
	    System.out.println("*** " + ArrayIntTosort.convert(9001000));
	    System.out.println("*** " + ArrayIntTosort.convert(123456789));
	    System.out.println("*** " + ArrayIntTosort.convert(2147483647));
	    System.out.println("*** " + ArrayIntTosort.convert(3000000010L));*/
		
		Map<Integer,String> map = new HashMap<>();
		//1. prepare a map with number and word
	   for(Integer item: a) {
		   map.put(item,converter.convertLessThanOneThousand(item));
	   }
	   
	   //2. sort map by value
	   LinkedHashMap<Integer, String> items = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
               LinkedHashMap::new));
	   
	      
	   //3 get keys
	   Set<Integer> keys = items.keySet();
	   
	   //4. get array from set
	   Integer[] array = keys.toArray(new Integer[keys.size()]);

	   for(Integer arr: array) {
		   System.out.println(arr);
	   }
	
	   // Arrays.stream(a).map((x) -> converter.convertLessThanOneThousand(x)).sorted().forEach(System.out::println);
	   //List<String> collect = Arrays.stream(a).map((x) -> converter.convertLessThanOneThousand(x)).sorted().collect(Collectors.toList());
	   
	   //Arrays.stream(a).map( (x) -> map.put(x,converter.convertLessThanOneThousand(x))).sorted();
	   /*for (Map.Entry<Integer,String> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}*/
	 //  Integer[] array = Arrays.stream(a).map((x) -> converter.convertLessThanOneThousand(x)).sorted().toArray(size -> new Integer[size]);
	   //System.out.println(array.toString());
	   
	}
	
	static class  converter {
		  private final static String[] numNames = {
				    "",
				    " one",
				    " two",
				    " three",
				    " four",
				    " five",
				    " six",
				    " seven",
				    " eight",
				    " nine",
				    " ten",
				    " eleven",
				    " twelve",
				    " thirteen",
				    " fourteen",
				    " fifteen",
				    " sixteen",
				    " seventeen",
				    " eighteen",
				    " nineteen"
				  };
		  

		  private static final String[] tensNames = {
				    "",
				    " ten",
				    " twenty",
				    " thirty",
				    " forty",
				    " fifty",
				    " sixty",
				    " seventy",
				    " eighty",
				    " ninety"
				  };

		  

		  private static String convertLessThanOneThousand(Integer number) {
			    String soFar;

			    if (number % 100 < 20){
			      soFar = numNames[number % 100];
			      number /= 100;
			    }
			    else {
			      soFar = numNames[number % 10];
			      number /= 10;

			      soFar = tensNames[number % 10] + soFar;
			      number /= 10;
			    }
			    if (number == 0) return soFar;
			    return numNames[number] + " hundred" + soFar;
			  }
	}
}
