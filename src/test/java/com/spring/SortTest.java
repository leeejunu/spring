package com.spring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


class SortTest {

    Sort sort;

    @BeforeEach
    void beforeEach() {
        sort = new Sort();
    }

    @Test
    void sort() {
        //given

        //when
        List<String> list = sort.sortByLength(Arrays.asList("asd", "asdasdsa", "1"));

        //then
        Assertions.assertThat(list).isEqualTo(List.of("1", "asd", "asdasdsa"));
    }
}