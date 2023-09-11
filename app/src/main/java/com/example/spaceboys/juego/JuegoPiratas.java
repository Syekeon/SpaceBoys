package com.example.spaceboys.juego;

import com.example.spaceboys.Pantalla;
import com.example.spaceboys.androidimpl.AndroidJuego;

public class JuegoPiratas extends AndroidJuego {
    @Override
    public Pantalla getStartScreen() {
        return new LoadingScreen(this);
    }
}
