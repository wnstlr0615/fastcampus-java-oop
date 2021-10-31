package com.fastcampus.javaoop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {

    @Test
    @DisplayName("자바소트 - 리스트를 넣으면 정령도니 결과를 보여준다")
    void given_List_WhenExecuting_ThenReturnSortedList(){
        //Given
        JavaSort<Integer> JavaSort = new JavaSort<>();

        //When
        List<Integer> actual = JavaSort.sort(List.of(3, 2, 4, 5, 1));

        //Then
        assertEquals(List.of(1, 2, 3, 4, 5), actual);
    }

}