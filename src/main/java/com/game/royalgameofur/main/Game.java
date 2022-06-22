package com.game.royalgameofur.main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.*;

public class Game extends Application implements StateTransition {

    State currentState;

    //TODO: Check java.awt.event.KeyListener/KeyAdapter/MouseListener/MouseAdapter

    private Image imageback = new Image("file:src/main/resources/images/background.jpg");
    private FlowPane cards = new FlowPane(Orientation.HORIZONTAL);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setBackground(background);


        Scene scene = new Scene(grid, 1600, 900, Color.BLACK);

        primaryStage.setTitle("RoyalGameOfUr");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    void initGame() {

        //TODO: Write a test
        public Piece[] makePlayerPieces(Player player) {
            Piece[] pieces = new Piece[7];
            for (int i = 0; i < 7; i++) {
                pieces[i] = new Piece(player);
            }
            return pieces;
        }
    }

}
