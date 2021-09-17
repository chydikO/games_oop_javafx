package ru.job4j.chess.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.junit.Assert.*;
import static ru.job4j.chess.firuges.Cell.*;

/**
 * Два метода в нем уже реализованы: position, copy. Напишите на них тест-методы.
 *
 * 1. Проверка метода position. Создайте объект и вызовите у него метод position.
 * Проверьте, что он занимает ту же ячейку, что и при создании объекта.
 * 2. Проверка метода copy. Создайте объект и вызовите у него метод copy.
 * Проверьте, что, возвращенный объект имеет правильную позицию.
 *
 * Далее создайте тест-метод для проверки метода way.
 * Для этого создайте объект с начальным положением C1.
 * Вызовите метод way G5. На данном этапе метод еще не реализован
 * и Ваша задача реализовать его таким образом,
 * чтобы он вернул массив из четырех клеток: D2, E3, F4, G5.
 */
public class BishopBlackTest {

    @Test
    public void position() {
        Cell source = B7;
        BishopBlack bishopBlack = new BishopBlack(source);
        assertEquals(bishopBlack.position(), source);
    }

    @Test
    public void copy() {
        Cell dest = B7;
        BishopBlack bishopBlack = new BishopBlack(dest);
        assertEquals(bishopBlack.copy(dest).position(), bishopBlack.position());
    }

    @Test
    public void isValidDiagonal() {
        Cell source = B7;
        Cell dest = E4;
        BishopBlack bishopBlack = new BishopBlack(source);
        assertFalse(!bishopBlack.isDiagonal(source, dest));
    }

    @Test
    public void isNoValidDiagonal() {
        Cell source = E8;
        Cell dest = E4;
        BishopBlack bishopBlack = new BishopBlack(source);
        assertFalse(bishopBlack.isDiagonal(source, dest));
    }

    @Test
    public void way() {
        Cell source = C1;
        BishopBlack bishopBlack = new BishopBlack(source);
        Cell[] result = {D2, E3, F4, G5};
        assertArrayEquals(bishopBlack.way(G5), result);
    }
}