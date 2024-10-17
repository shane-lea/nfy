package com.nfy.module.system.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TestServiceImplTest {

    @Mock
    private JdbcTemplate mockJdbcTemplate;

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
}
