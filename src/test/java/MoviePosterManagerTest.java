import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoviePosterManagerTest {
    @Test
    public void test() {
        MoviePosterManager manager = new MoviePosterManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAdd1() {
        MoviePosterManager manager = new MoviePosterManager();

        manager.add("FilmI");

        String[] expected = {"FilmI"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAdd2() {
        MoviePosterManager manager = new MoviePosterManager();

        manager.add("FilmI");
        manager.add("FilmII");
        manager.add("FilmIII");

        String[] expected = {"FilmI", "FilmII", "FilmIII"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLast1() {
        MoviePosterManager manager = new MoviePosterManager();

        manager.add("FilmI");
        manager.add("FilmII");
        manager.add("FilmIII");
        manager.add("FilmIV");

        String[] expected = {"FilmIV", "FilmIII", "FilmII", "FilmI"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLast2() {
        MoviePosterManager manager = new MoviePosterManager();

        manager.add("FilmI");
        manager.add("FilmII");
        manager.add("FilmIII");
        manager.add("FilmIV");
        manager.add("FilmV");

        String[] expected = {"FilmV", "FilmIV", "FilmIII", "FilmII", "FilmI"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}