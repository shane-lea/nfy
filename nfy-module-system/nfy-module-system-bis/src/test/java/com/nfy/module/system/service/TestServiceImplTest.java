package com.nfy.module.system.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TestServiceImplTest {

    @InjectMocks
    private TestServiceImpl mockTestServiceImpl;

    @Test
    void testToUpperCase() {
        assertThat(mockTestServiceImpl.toUpperCase("var")).isEqualTo("VAR");
        assertThat(mockTestServiceImpl.toUpperCase("")).isEqualTo("");
    }
}
