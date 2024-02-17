package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.repository.BookRepository;
import guru.springframework.spring5webapp.repository.PublisherRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublisherController {

    private PublisherRepository publisherRepository;

    public PublisherController(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @RequestMapping("/publisher")
    public String getPublisher(Model model){
        model.addAttribute("publisher", publisherRepository.findAll()); //get a list of all publishers

        return "publisher";
    }

}
