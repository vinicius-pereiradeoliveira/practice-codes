package com.example.code;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class ExampleCode {
	
	final static List<String> testList = new ArrayList<>();
	final static List<Integer> testListTwo = new ArrayList<>();
	
	public static void testStream() {
		List<String> testListLocal = createListOne();
		List<Integer> testListTwoLocal = createListTwo();
		
		// code 01 - iterando a Lista testList com forEach e imprimindo os valores.
		testListLocal.forEach(s -> {
			System.out.println("Print values of the List testList: "+ s);
		});
		
		// code 02 - igual código 01, mas aqui uma sintaxe mais simples
		testListLocal.forEach(s -> System.out.println("Print values of the List testList (simple code): "+s));
		
		// code 03 - Usando filter. Com o filter de stream(), é realizada uma iteração na Lista.
		//		   - Durante esta iteração, é realizado um teste condicional boolean e cada vez que o teste retorna true, guarda em uma nova lista os resultados que correspondem ao valor true do teste.
		List<String> newListafterFilter = testListLocal.stream().filter((s -> s.equals("item2"))).collect(Collectors.toList());
		
		// code 04 - itera e imprime valores da nova Lista filtrada
		newListafterFilter.forEach(s -> System.out.println("Print values of the new List filtered newListafterFilter: "+s));
		
		// code 05 - Usando distinct() de stream() itera a lista e remove os itens duplicados da mesma
		testListTwoLocal.stream().distinct().forEach(System.out::println);
		
		// code 06 - Usando metodos de Stream() em conjunto para organizar uma Lista
		//         -> Remover itens duplicados, ordenar os itens, iterar a lista organizada e imprimir a lista.
		testListTwoLocal.stream().distinct().sorted().forEach(System.out::println);
	}
	
	private static List<String> createListOne() {
		testList.add("item0");
		testList.add("item1");
		testList.add("item2");
		testList.add("item3");
		testList.add("item4");
		testList.add("item5");
		return testList;
	}
	
	private static List<Integer> createListTwo() {
		testListTwo.add(0);
		testListTwo.add(1);
		testListTwo.add(7);
		testListTwo.add(3);
		testListTwo.add(3);
		testListTwo.add(4);
		testListTwo.add(4);
		testListTwo.add(5);
		testListTwo.add(5);
		testListTwo.add(2);
		testListTwo.add(2);
		testListTwo.add(5);
		testListTwo.add(6);
		testListTwo.add(6);
		testListTwo.add(8);
		return testListTwo;
	}
	
}
