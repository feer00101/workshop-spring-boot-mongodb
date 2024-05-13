package com.nilofer.workshopmongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.nilofer.workshopmongo.domain.Post;
import com.nilofer.workshopmongo.domain.User;
import com.nilofer.workshopmongo.repository.PostRespository;
import com.nilofer.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRespository postRespository;

    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();
        postRespository.deleteAll();

        User maria = new User(null, "Maria", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Brown", "bob@gmail.com");

        Post post1 = new Post(null, sdf.parse("21/03/2018"), "Partiu Viagem", "Vou viajar para São Paulo", maria);
        Post post2 = new Post(null, sdf.parse("23/03/2019"), "Bom Dia", "Acordei feliz hj !", maria);

        userRepository.saveAll(Arrays.asList(maria, alex, bob));
        postRespository.saveAll(Arrays.asList(post1, post2));

    }

}
