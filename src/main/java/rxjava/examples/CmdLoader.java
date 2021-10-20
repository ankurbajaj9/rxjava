package rxjava.examples;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import rxjava.examples.model.Member;
import rxjava.examples.model.MemberRepository;

@Component
public class CmdLoader implements CommandLineRunner{

    
    private final MemberRepository repository;

    @Autowired
    public CmdLoader(MemberRepository repository){
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Inside Command Line Runner");
        repository.save(new Member("firstName", "lastName"));
    }
    
}
