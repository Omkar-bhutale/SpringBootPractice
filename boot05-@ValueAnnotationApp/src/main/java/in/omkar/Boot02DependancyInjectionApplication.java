package in.omkar;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.omkar.comp.BillGenrater;
import in.omkar.comp.ItemsInfo;

@SpringBootApplication
public class Boot02DependancyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Boot02DependancyInjectionApplication.class, args);
		System.out.println("beans Definations ::" + Arrays.toString(context.getBeanDefinitionNames()));
		ItemsInfo itemsInfo = context.getBean(ItemsInfo.class);
		System.out.println(itemsInfo);
		BillGenrater billGenrater = context.getBean(BillGenrater.class);
		System.out.println(billGenrater);
	}

}
