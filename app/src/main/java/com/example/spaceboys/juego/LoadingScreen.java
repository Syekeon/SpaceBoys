package com.example.spaceboys.juego;

import com.example.spaceboys.Juego;
import com.example.spaceboys.Graficos;
import com.example.spaceboys.Pantalla;
import com.example.spaceboys.Graficos.PixmapFormat;

public class LoadingScreen extends Pantalla{
    public LoadingScreen(Juego juego) {
        super(juego);
    }

    @Override
    public void update(float deltaTime) {
        Graficos g = juego.getGraphics();
        Assets.fondo = g.newPixmap("fondo.png", PixmapFormat.RGB565);
        Assets.logo = g.newPixmap("logo.png", PixmapFormat.ARGB4444);
        Assets.menuprincipal = g.newPixmap("menuprincipal.png", PixmapFormat.ARGB4444);
        Assets.derecha = g.newPixmap("derecha.png", PixmapFormat.ARGB4444);
        Assets.izquierda = g.newPixmap("izquierda.png", PixmapFormat.ARGB4444);
        Assets.ayuda1 = g.newPixmap("ayuda1.png", PixmapFormat.ARGB4444);
        Assets.ayuda2 = g.newPixmap("ayuda2.png", PixmapFormat.ARGB4444);
        Assets.ayuda3 = g.newPixmap("ayuda3.png", PixmapFormat.ARGB4444);
        Assets.ayuda4 = g.newPixmap("ayuda4.png", PixmapFormat.ARGB4444);
        Assets.ayuda5 = g.newPixmap("ayuda5.png", PixmapFormat.ARGB4444);
        Assets.numeros = g.newPixmap("numeros.png", PixmapFormat.ARGB4444);
        Assets.preparado = g.newPixmap("preparado.png", PixmapFormat.ARGB4444);

        Assets.reanudar = g.newPixmap("reanudar.png", PixmapFormat.ARGB4444);
        Assets.quitar = g.newPixmap("quitar.png", PixmapFormat.ARGB4444);

        Assets.finjuego = g.newPixmap("lose.png", PixmapFormat.ARGB4444);
        Assets.barcoarriba = g.newPixmap("barcoarriba.png", PixmapFormat.ARGB4444);
        Assets.barcoizquierda = g.newPixmap("barcoizquierda.png", PixmapFormat.ARGB4444);
        Assets.barcoabajo = g.newPixmap("barcoabajo.png", PixmapFormat.ARGB4444);
        Assets.barcoderecha = g.newPixmap("barcoderecha.png", PixmapFormat.ARGB4444);
        Assets.tripulacion = g.newPixmap("tripulacion.png", PixmapFormat.ARGB4444);
        Assets.x = g.newPixmap("x.png", PixmapFormat.ARGB4444);
        Assets.botin1 = g.newPixmap("botin1.png", PixmapFormat.ARGB4444);
        Assets.botin2 = g.newPixmap("botin2.png", PixmapFormat.ARGB4444);
        Assets.botin3 = g.newPixmap("botin3.png", PixmapFormat.ARGB4444);
        Assets.nomusic = g.newPixmap("nomusic.png", PixmapFormat.ARGB4444);
        Assets.music = g.newPixmap("music.png", PixmapFormat.ARGB4444);
        Assets.pause = g.newPixmap("pause.png", PixmapFormat.ARGB4444);
        Assets.pulsar = juego.getAudio().nuevoSonido("pulsar.ogg");
        Assets.ataque = juego.getAudio().nuevoSonido("ataque.ogg");
        Assets.derrota = juego.getAudio().nuevoSonido("derrota.ogg");


        Configuraciones.cargar(juego.getFileIO());
        juego.setScreen(new MainMenuScreen(juego));
    }

    @Override
    public void present(float deltaTime) {

    }

    @Override
    public void pause() {

    }


    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}