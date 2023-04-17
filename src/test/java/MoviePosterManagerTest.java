import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoviePosterManagerTest {
    @Test
    public void testFindAll1() {
        MoviePosterManager manager = new MoviePosterManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAFindAll2() {
        MoviePosterManager manager = new MoviePosterManager();

        manager.add("FilmI");

        String[] expected = {"FilmI"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAll3() {
        MoviePosterManager manager = new MoviePosterManager();

        manager.add("FilmI");
        manager.add("FilmII");
        manager.add("FilmIII");

        String[] expected = {"FilmI", "FilmII", "FilmIII"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast1() {
        MoviePosterManager manager = new MoviePosterManager();

        String[] expected = {};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast2() {
        MoviePosterManager manager = new MoviePosterManager();

        manager.add("FilmI");

        String[] expected = {"FilmI"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast3() {
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
    public void testFindLast4() {
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

    @Test
    public void testFindLast5() {
        MoviePosterManager manager = new MoviePosterManager();

        manager.add("FilmI");
        manager.add("FilmII");
        manager.add("FilmIII");
        manager.add("FilmIV");
        manager.add("FilmV");
        manager.add("FilmVI");

        String[] expected = {"FilmVI", "FilmV", "FilmIV", "FilmIII", "FilmII"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}