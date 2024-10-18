package com.nfy.module.system.service;

import com.nfy.module.system.mapper.UserMapper;
import com.nfy.module.system.model.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TestServiceImplTest {

    @Mock
    private JdbcTemplate mockJdbcTemplate;

    @Mock
    private UserMapper mockUserMapper;

    @InjectMocks
    private TestServiceImpl mockTestServiceImpl;

    @Test
    void testToUpperCase() {
        assertThat(mockTestServiceImpl.toUpperCase("var")).isEqualTo("VAR");
        assertThat(mockTestServiceImpl.toUpperCase("")).isEqualTo("");
    }

    @Test
    void testMybatis(){
        List list = mockTestServiceImpl.testMybatis();
        Assertions.assertTrue(list.isEmpty());
    }

    @Test
    void testUserMapper() {
        User user = User.builder().id(11L).userAccount("account").userAvatar("avatar").userName("Jim").userProfile("333").build();
        Mockito.when(mockUserMapper.selectList(Mockito.any())).thenReturn(Arrays.asList(user));

        List<User> users = mockTestServiceImpl.testUserMapper("Jimmy");
        Assertions.assertTrue(!users.isEmpty());
    }


}
