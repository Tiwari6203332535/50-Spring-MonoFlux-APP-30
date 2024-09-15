package in.happy.rest;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class MyRestController {
	@GetMapping("/single")
	public Mono<String> singleResponse(){
		return Mono.just("Hlow How are you");
		//return Mono.justOrEmpty("Hlow How are you");
	}
	@GetMapping("/multiple")
	public Flux<Integer>multipleResponse(){
		return Flux.range(1, 10);
		//return Flux.range(1, 10).delayElements(Duration.ofMinutes(0));
	}

}
