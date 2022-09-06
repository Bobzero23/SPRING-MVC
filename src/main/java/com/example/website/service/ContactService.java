package com.example.website.service;

/*imports*/
import com.example.website.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ContactService {

    /*creating a log object*/
    /*I used the lombok annotation for log so it handles the rest*/
//     private static Logger log = LoggerFactory.getLogger(ContactService.class);

    /*save contact detail into DB*/
    public boolean saveMessageDetails(Contact contact){
        boolean isSaved = true;
        //TODO - ned to persist the data into the DB table
        log.info(contact.toString());
        return isSaved;
    }
}
