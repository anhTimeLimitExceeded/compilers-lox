package com.craftinginterpreters.lox.complete;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.craftinginterpreters.lox.util.Util;

public class LoxTest {
    @Test
    void test() throws IOException {
        List<String> sourceDirs = List.of("src/test/lox/ch08", "src/test/lox/ch09", "src/test/lox/ch10",
                "src/test/lox/ch11", "src/test/lox/ch12", "src/test/lox/ch13");
        assertTrue(Util.runFiles(sourceDirs, s -> {
            Lox.reset();
            Lox.run(s);
        }), "Not all files produced expected output");
    }

    @Test
    void project1() throws IOException {
        List<String> sourceDirs = List.of("src/test/lox/project1");
        assertTrue(Util.runFiles(sourceDirs, s -> {
            Lox.reset();
            Lox.run(s);
        }), "Not all files produced expected output");
    }

    @Test
    void custom() throws IOException {
        List<String> sourceDirs = List.of("src/test/lox/ch08/number");
        assertTrue(Util.runFiles(sourceDirs, s -> {
            Lox.reset();
            Lox.run(s);
        }), "Not all files produced expected output");
    }
}
