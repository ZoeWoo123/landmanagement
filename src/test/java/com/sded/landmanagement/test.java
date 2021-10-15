package com.sded.landmanagement;

import com.opendoors.landmanagement.domain.Owner;
import com.opendoors.landmanagement.service.UserService;

import org.junit.jupiter.api.Test;

public class test {
    @Test
    public void test(){
        UserService us = new UserService();
        Owner owner = us.getUserBySeqNbr("6");
        System.out.println(owner.getFullName());
    }

}
