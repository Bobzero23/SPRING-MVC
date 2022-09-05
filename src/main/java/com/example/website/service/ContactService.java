package com.example.website.service;

/*imports*/
import com.example.website.model.Contact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    /*creating a log object*/
     private static Logger log = LoggerFactory.getLogger(ContactService.class);

    /*save contact detail into DB*/
    public boolean saveMessageDetails(Contact contact){
        boolean isSaved = true;
        //TODO - ned to persist the data into the DB table
        log.info(contact.toString());
        return isSaved;
    }
}
