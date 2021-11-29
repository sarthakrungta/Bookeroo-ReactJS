package com.rmit.sept.bk_loginservices;

import com.rmit.sept.bk_loginservices.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class UserModelTest {

    @Test
    @Rollback
    public void setId_test() {
        User user = new User();
        Long expected = 1L;
        user.setId(expected);
        Long testcase = user.getId();
        assertThat(testcase).isEqualTo(expected);
    }

    @Test
    @Rollback
    public void setEmail_test() {
        User user = new User();
        String expected = "1353664988@qq.com";
        user.setEmail(expected);

        String testcase = user.getEmail();
        assertThat(testcase).isEqualTo(expected);
    }

    @Test
    @Rollback
    public void setUserName_test() {
        User user = new User();
        String expected = "chen666";
        user.setUsername(expected);

        String testcase = user.getUsername();
        assertThat(testcase).isEqualTo(expected);
    }

    @Test
    @Rollback
    public void setFullName_test() {
        User user = new User();
        String expected = "chen wang";
        user.setFullName(expected);

        String testcase = user.getFullName();
        assertThat(testcase).isEqualTo(expected);
    }

    @Test
    @Rollback
    public void setPassword_test() {
        User user = new User();
        String expected = "123456";
        user.setPassword(expected);

        String testcase = user.getPassword();
        assertThat(testcase).isEqualTo(expected);
    }

    @Test
    @Rollback
    public void setConfirmPassword_test() {
        User user = new User();
        String expected = "123456";
        user.setConfirmPassword(expected);

        String testcase = user.getConfirmPassword();
        assertThat(testcase).isEqualTo(expected);
    }

    @Test
    @Rollback
    public void setRole_test() {
        User user = new User();
        String expected = "Admin";
        user.setRole(expected);

        String testcase = user.getRole();
        assertThat(testcase).isEqualTo(expected);
    }

    @Test
    @Rollback
    public void setCreateDate_test() {
        User user = new User();
        Date expected = new Date();
        user.setCreate_At(expected);

        Date testcase = user.getCreate_At();
        assertThat(testcase).isEqualTo(expected);
    }

    @Test
    @Rollback
    public void setUpdateDate_test() {
        User user = new User();
        Date expected = new Date();
        user.setUpdate_At(expected);

        Date testcase = user.getUpdate_At();
        assertThat(testcase).isEqualTo(expected);
    }

    @Test
    @Rollback
    public void getId_test() {
        User user = new User();
        user.setId(1L);
        Long testcase = user.getId();
        assertThat(testcase).isEqualTo(1L);
    }

    @Test
    @Rollback
    public void getEmail_test() {
        User user = new User();
        user.setEmail("1353664988@qq.com");
        String testcase = user.getEmail();
        assertThat(testcase).isEqualTo("1353664988@qq.com");
    }

    @Test
    @Rollback
    public void getUserName_test() {
        User user = new User();
        user.setUsername("chen");
        String testcase = user.getUsername();
        assertThat(testcase).isEqualTo("chen");
    }

    @Test
    @Rollback
    public void getFullName_test() {
        User user = new User();
        user.setFullName("chen wang");
        String testcase = user.getFullName();
        assertThat(testcase).isEqualTo("chen wang");
    }

    @Test
    @Rollback
    public void getPassword_test() {
        User user = new User();
        user.setPassword("123456");
        String testcase = user.getPassword();
        assertThat(testcase).isEqualTo("123456");
    }

    @Test
    @Rollback
    public void getConfirmPassword_test() {
        User user = new User();
        user.setConfirmPassword("123456");
        String testcase = user.getConfirmPassword();
        assertThat(testcase).isEqualTo("123456");
    }

    @Test
    @Rollback
    public void getRole_test() {
        User user = new User();
        user.setRole("Admin");
        String testcase = user.getRole();
        assertThat(testcase).isEqualTo("Admin");
    }

    @Test
    @Rollback
    public void getCreateDate_test() {
        User user = new User();
        Date date = new Date();
        user.setCreate_At(date);
        Date testcase = user.getCreate_At();
        assertThat(testcase).isEqualTo(date);
    }

    @Test
    @Rollback
    public void getUpdateDate_test() {
        User user = new User();
        Date date = new Date();
        user.setUpdate_At(date);
        Date testcase = user.getUpdate_At();
        assertThat(testcase).isEqualTo(date);
    }

}
