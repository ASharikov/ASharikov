package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import java.util.StringJoiner;

/**
 * @author Alexander Sharikov (alexsander.sharikov@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class PaintTest {
   @Test
   public void whenPyramid4Right() {
       Paint paint = new Paint();
       String rst = paint.rightTrl(4);
       System.out.println(rst);
       assertThat(rst, is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
               .add("^   ")
               .add("^^  ")
               .add("^^^ ")
               .add("^^^^")
               .toString()
       ));
   }

    @Test
    public void whenPyramid4Left() {
        Paint paint = new Paint();
        String rst = paint.leftTrl(4);
        System.out.println(rst);
        assertThat(rst, is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("   ^")
                .add("  ^^")
                .add(" ^^^")
                .add("^^^^")
                .toString()
        ));
    }
    @Test
    public void whenPyramid4Triangle() {
        Paint paint = new Paint();
        String rst = paint.piramid(4);
        System.out.println(rst);
        assertThat(rst, is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("   ^   ")
                .add("  ^^^  ")
                .add(" ^^^^^ ")
                .add("^^^^^^^")
                .toString()
        ));
    }
}
