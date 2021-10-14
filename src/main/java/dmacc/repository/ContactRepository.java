package dmacc.repository;

/**
 * @author kevin.cook - Kevin Cook
 *CIS175 - Fall 2021 
 * Oct 14, 2021
 */

import org.springframework.data.jpa.repository.JpaRepository;

import dmacc.beans.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long>{

}