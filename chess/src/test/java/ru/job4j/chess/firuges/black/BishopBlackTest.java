package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {

    @Test
    public void testPosition() {
        Cell start = Cell.E4;
        BishopBlack bishopBlack = new BishopBlack(start);
        assertThat(bishopBlack.position(), is(start));
    }

    @Test
    public void testWay() throws ImpossibleMoveException {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] way = bishopBlack.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(way, is(expected));
    }

    @Test
    public void testCopy() {
        Cell step = Cell.E4;
        BishopBlack bishopBlack = new BishopBlack(Cell.D3);
        assertThat(bishopBlack.copy(step).position(), is(step));
    }
}