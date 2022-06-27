package com.cg.java8;
import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;

public class Java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> values = Arrays.asList(1,3,"raji");
		/*Consumer <Object> c = new Consumer<Object>() {

			@Override
			public void accept(Object i) {
				// TODO Auto-generated method stub
				System.out.println(i);
			}
			
		};
		values.forEach(c);*/
		Consumer<Object> val = (Object i)->System.out.println(i);
		values.forEach(val);
		
/*values.forEach(i->System.out.println(i));*/
	}

}
