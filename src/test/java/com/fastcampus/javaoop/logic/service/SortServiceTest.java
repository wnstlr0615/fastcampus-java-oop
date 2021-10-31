package com.fastcampus.javaoop.logic.service;

import com.fastcampus.javaoop.logic.JavaSort;
import com.fastcampus.javaoop.logic.Sort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {
    private SortService sut = new SortService(new JavaSort<String>());

    @Test
    public void test() throws Exception{
        //given

        //when
        List<String> actual = sut.doSort(List.of("3", "2", "1"));

        //then
        assertEquals(List.of("1", "2", "3"), actual);
    }

}