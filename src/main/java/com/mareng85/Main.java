package com.mareng85;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        SwingUtilities.invokeLater(() -> new TetrisGame());
    }
}