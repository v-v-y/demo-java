package com.example.demo;

import java.util.function.Predicate;

public class ErrorPredicate implements Predicate<Exception> {
    @Override
    public boolean test(Exception e) {
        return true;
    }
}
