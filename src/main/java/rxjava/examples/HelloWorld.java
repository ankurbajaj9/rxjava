package rxjava.examples;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorld {
  public static void main(String[] args) {
    SpringApplication.run(HelloWorld.class,args);
    Flowable.just("Hello world").subscribe(System.out::println);

    Integer[] numbers = {1,2,3};
    Observable<Integer> observable = Observable.fromArray(numbers);
    observable.subscribe(System.out::println);
    observable.concatWith(Observable.fromArray(numbers));
    observable.publish();
  }
}
