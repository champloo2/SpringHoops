package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Hoopshop;
import dmacc.beans.Hulahoop;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.HulahoopRepository;
@SpringBootApplication
public class SpringHoops1Application implements CommandLineRunner {

	
	
	public static void main(String[] args) 
	{
		SpringApplication.run(SpringHoops1Application.class, args);
	}
	@Autowired
	HulahoopRepository repo;

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Hulahoop h = appContext.getBean("hulahoop", Hulahoop.class);
		h.setPolyPro(true);
		repo.save(h);
		Hulahoop hoop = new Hulahoop ("pink", 28);
		Hoopshop shop = new Hoopshop ("lunar landings", "etsy", "@lunarlandings");
		hoop.setHoopShop(shop);
		repo.save(hoop);
		
		List<Hulahoop> allHoops = repo.findAll();
		for(Hulahoop currentHoop: allHoops)
		{
			System.out.println(currentHoop.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}

}
