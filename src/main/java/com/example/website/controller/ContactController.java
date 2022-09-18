package com.example.website.controller;

/*imports*/
import com.example.website.model.Contact;
import com.example.website.service.ContactService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Slf4j
@Controller
public class ContactController {

    /*field*/
    private final ContactService contactService;

    /*creating a log object*/
   // private static Logger log = LoggerFactory.getLogger(ContactController.class);

    @Autowired
    /*constructor and auto wiring*/
    public ContactController(ContactService contactService){
        this.contactService = contactService;
    }

    @RequestMapping("/contact")
    public String displayContactPage(Model model){
        model.addAttribute("contact", new Contact());
        return "contact.html";
    }

//    @RequestMapping(value = "/saveMsg",method = POST)
//    public ModelAndView saveMessage(@RequestParam String name, @RequestParam String mobileNum,
//                                    @RequestParam String email, @RequestParam String subject, @RequestParam String message) {
//        log.info("Name : " + name);
//        log.info("Mobile Number : " + mobileNum);
//        log.info("Email Address : " + email);
//        log.info("Subject : " + subject);
//        log.info("Message : " + message);
//        return new ModelAndView("redirect:/contact");
//    }


    @RequestMapping(value = "/saveMsg",method = POST)
    /*this method will redirect the user to the fresh new page*/
    public String saveMessage(@Valid @ModelAttribute("contact") Contact contact, Errors errors){
        contactService.saveMessageDetails(contact);
        /*checking if there is any errors and acts accordingly*/
        if (errors.hasErrors()){
            log.error("Contact form validation failed due to: " + errors.toString());
            return "contact.html";
        }
        /*incrementing the counter by one every single time a user submitting a message to backend*/
        contactService.saveMessageDetails(contact);
        contactService.setCounter(contactService.getCounter() + 1);
        log.info("Number of times the contact form is submitted: " + contactService.getCounter());
        return "redirect:/contact";
    }

}
