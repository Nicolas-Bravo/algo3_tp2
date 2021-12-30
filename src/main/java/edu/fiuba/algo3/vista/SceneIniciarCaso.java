package edu.fiuba.algo3.vista;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.paint.Paint;

public class SceneIniciarCaso extends Scene {







    public SceneIniciarCaso(Parent parent) {
        super(parent);
    }

    public SceneIniciarCaso(Parent parent, double v, double v1) {
        super(parent, v, v1);
    }

    public SceneIniciarCaso(Parent parent, Paint paint) {
        super(parent, paint);
    }

    public SceneIniciarCaso(Parent parent, double v, double v1, Paint paint) {
        super(parent, v, v1, paint);
    }

    public SceneIniciarCaso(Parent parent, double v, double v1, boolean b) {
        super(parent, v, v1, b);
    }

    public SceneIniciarCaso(Parent parent, double v, double v1, boolean b, SceneAntialiasing sceneAntialiasing) {
        super(parent, v, v1, b, sceneAntialiasing);
    }
}
