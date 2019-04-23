package com.pl.ptaq.project_manager.user.domain;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@DataJpaTest
@RunWith(SpringRunner.class)
public class UserFacadeTest {

//    @Autowired
//    UserRepository userRepository;

    @Autowired
    UserService userService;
//    @Autowired
//    UserFacade userService;

    @Before
    public void setUp(){
    }

    @Test
    public void addUser() {
        String login = "testUser";
        String password = "testtest";
        String email = "test@test.com";
        String nick = "testtest";

        String[] testUser = new String[] {login,password,email,nick};

        assertTrue(userService.addUser(testUser[0],testUser[1],testUser[2],testUser[3]));
    }

    @Test
    public void findUser() {
    }

    @Test
    public void isUserExist() {
    }

    @Test
    public void updateUser() {
    }

    @Test
    public void deleteUser() {
    }
}