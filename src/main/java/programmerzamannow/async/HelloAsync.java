package programmerzamannow.async;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Slf4j
@Component
public class HelloAsync {

  @Async
  @SneakyThrows
  public void hello(){
    Thread.sleep(Duration.ofSeconds(2));
    log.info("hello after 2 seconds {}", Thread.currentThread());
  }

}
