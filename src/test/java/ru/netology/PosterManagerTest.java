package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PosterManagerTest {

    PosterManager film1 = new PosterManager(1);
    PosterManager film2 = new PosterManager(2);
    PosterManager film3 = new PosterManager(3);
    PosterManager film4 = new PosterManager(4);
    PosterManager film5 = new PosterManager(5);
    PosterManager film6 = new PosterManager(6);
    PosterManager film7 = new PosterManager(7);

    @Test
    public void TestAdd() {
        PosterManager poster = new PosterManager(5);
        poster.add(film1);
        poster.add(film2);
        poster.add(film3);
        poster.add(film4);
        poster.add(film5);

        PosterManager[] expected = {film1, film2, film3, film4, film5};
        PosterManager[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void TestAdd2() {
        PosterManager poster = new PosterManager(3);
        poster.add(film1);
        poster.add(film2);
        poster.add(film3);

        PosterManager[] expected = {film1, film2, film3};
        PosterManager[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void TestAdd3() {
        PosterManager poster = new PosterManager(7);
        poster.add(film1);
        poster.add(film2);
        poster.add(film3);
        poster.add(film4);
        poster.add(film5);
        poster.add(film6);
        poster.add(film7);

        PosterManager[] expected = {film1, film2, film3, film4, film5, film6, film7};
        PosterManager[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void TestFindLast() {
        PosterManager poster = new PosterManager(7);
        poster.add(film1);
        poster.add(film2);
        poster.add(film3);
        poster.add(film4);
        poster.add(film5);
        poster.add(film6);
        poster.add(film7);


        PosterManager[] expected = {film7, film6, film5, film4, film3, film2, film1};
        PosterManager[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void TestFindLast2() {
        PosterManager poster = new PosterManager(7);
        poster.add(film1);
        poster.add(film2);
        poster.add(film3);
        poster.add(film4);
        poster.add(film5);



        PosterManager[] expected = {film5, film4, film3, film2, film1};
        PosterManager[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestFindLast3() {
        PosterManager poster = new PosterManager(5);
        poster.add(film1);
        poster.add(film2);
        poster.add(film3);
        poster.add(film4);
        poster.add(film5);
        poster.add(film6);
        poster.add(film7);


        PosterManager[] expected = {film7, film6, film5, film4, film3 };
        PosterManager[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}
