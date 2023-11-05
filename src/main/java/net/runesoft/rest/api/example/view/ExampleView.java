package net.runesoft.rest.api.example.view;

import lombok.Getter;
import lombok.Setter;

public class ExampleView {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String mail;

    @Getter
    @Setter
    private int age = 0;

    @Getter
    @Setter
    private boolean registered = false;
}
