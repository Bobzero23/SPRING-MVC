package com.example.website.controller;

/*imports*/
import com.example.website.model.Contact;
import com.example.website.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

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
    public String displayContactPage(){
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
    public ModelAndView saveMessage(Contact contact){
        contactService.saveMessageDetails(contact);
        return new ModelAndView("redirect:/contact");
    }

}
