package com.example.website.service;

/*imports*/
import com.example.website.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Slf4j
@Service
//@RequestScope -> when you use this each time you submit to the backend the counter will not be incremented
//@SessionScope /* -> when you use this each time your submit to the backend the counter will be incremented*/
@ApplicationScope /* and this is how you use the @ApplicationScope*/
public class ContactService {

    /*initializing the counter*/
    private int counter = 0;

    /*constructor*/
     public ContactService(){
        System.out.println("Contact service Bean initialize");
    }

    /*creating a log object*/
    /*I used the lombok annotation for log, so it handles the rest*/
//     private static Logger log = LoggerFactory.getLogger(ContactService.class);

    /*save contact detail into DB*/
    public boolean saveMessageDetails(Contact contact){
        boolean isSaved = true;
        //TODO - ned to persist the data into the DB table
        log.info(contact.toString());
        return isSaved;
    }

    /*GETTER AND SETTER FOR THE COUNTER*/
    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
