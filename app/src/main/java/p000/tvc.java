package p000;

import android.graphics.Canvas;
import android.graphics.Picture;

/* JADX INFO: loaded from: classes.dex */
public final class tvc {
    @yfb
    public static final Picture record(@yfb Picture picture, int i, int i2, @yfb qy6<? super Canvas, bth> qy6Var) {
        Canvas canvasBeginRecording = picture.beginRecording(i, i2);
        try {
            qy6Var.invoke(canvasBeginRecording);
            return picture;
        } finally {
            o28.finallyStart(1);
            picture.endRecording();
            o28.finallyEnd(1);
        }
    }
}
