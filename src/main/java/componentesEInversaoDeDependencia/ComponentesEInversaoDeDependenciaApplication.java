package componentesEInversaoDeDependencia;

import componentesEInversaoDeDependencia.entities.Order;
import componentesEInversaoDeDependencia.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComponentesEInversaoDeDependenciaApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(ComponentesEInversaoDeDependenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1309, 95.9, 0.0);
		System.out.println("Pedido código " + order.getCode());
		System.out.println("Valor total: R$ " + orderService.total(order));

	}
}
