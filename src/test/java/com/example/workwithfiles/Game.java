package com.example.workwithfiles;

import lombok.Data;

@Data
public class Game {

    private String name;
    private double price;
    private boolean available;
    private double version;
    private String[] functions;

}
