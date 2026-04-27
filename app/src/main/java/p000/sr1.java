package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class sr1 {
    public static final void withClip(@yfb Canvas canvas, @yfb Rect rect, @yfb qy6<? super Canvas, bth> qy6Var) {
        int iSave = canvas.save();
        canvas.clipRect(rect);
        try {
            qy6Var.invoke(canvas);
        } finally {
            o28.finallyStart(1);
            canvas.restoreToCount(iSave);
            o28.finallyEnd(1);
        }
    }

    public static final void withMatrix(@yfb Canvas canvas, @yfb Matrix matrix, @yfb qy6<? super Canvas, bth> qy6Var) {
        int iSave = canvas.save();
        canvas.concat(matrix);
        try {
            qy6Var.invoke(canvas);
        } finally {
            o28.finallyStart(1);
            canvas.restoreToCount(iSave);
            o28.finallyEnd(1);
        }
    }

    public static /* synthetic */ void withMatrix$default(Canvas canvas, Matrix matrix, qy6 qy6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            matrix = new Matrix();
        }
        int iSave = canvas.save();
        canvas.concat(matrix);
        try {
            qy6Var.invoke(canvas);
        } finally {
            o28.finallyStart(1);
            canvas.restoreToCount(iSave);
            o28.finallyEnd(1);
        }
    }

    public static final void withRotation(@yfb Canvas canvas, float f, float f2, float f3, @yfb qy6<? super Canvas, bth> qy6Var) {
        int iSave = canvas.save();
        canvas.rotate(f, f2, f3);
        try {
            qy6Var.invoke(canvas);
        } finally {
            o28.finallyStart(1);
            canvas.restoreToCount(iSave);
            o28.finallyEnd(1);
        }
    }

    public static /* synthetic */ void withRotation$default(Canvas canvas, float f, float f2, float f3, qy6 qy6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        int iSave = canvas.save();
        canvas.rotate(f, f2, f3);
        try {
            qy6Var.invoke(canvas);
        } finally {
            o28.finallyStart(1);
            canvas.restoreToCount(iSave);
            o28.finallyEnd(1);
        }
    }

    public static final void withSave(@yfb Canvas canvas, @yfb qy6<? super Canvas, bth> qy6Var) {
        int iSave = canvas.save();
        try {
            qy6Var.invoke(canvas);
        } finally {
            o28.finallyStart(1);
            canvas.restoreToCount(iSave);
            o28.finallyEnd(1);
        }
    }

    public static final void withScale(@yfb Canvas canvas, float f, float f2, float f3, float f4, @yfb qy6<? super Canvas, bth> qy6Var) {
        int iSave = canvas.save();
        canvas.scale(f, f2, f3, f4);
        try {
            qy6Var.invoke(canvas);
        } finally {
            o28.finallyStart(1);
            canvas.restoreToCount(iSave);
            o28.finallyEnd(1);
        }
    }

    public static /* synthetic */ void withScale$default(Canvas canvas, float f, float f2, float f3, float f4, qy6 qy6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        int iSave = canvas.save();
        canvas.scale(f, f2, f3, f4);
        try {
            qy6Var.invoke(canvas);
        } finally {
            o28.finallyStart(1);
            canvas.restoreToCount(iSave);
            o28.finallyEnd(1);
        }
    }

    public static final void withSkew(@yfb Canvas canvas, float f, float f2, @yfb qy6<? super Canvas, bth> qy6Var) {
        int iSave = canvas.save();
        canvas.skew(f, f2);
        try {
            qy6Var.invoke(canvas);
        } finally {
            o28.finallyStart(1);
            canvas.restoreToCount(iSave);
            o28.finallyEnd(1);
        }
    }

    public static /* synthetic */ void withSkew$default(Canvas canvas, float f, float f2, qy6 qy6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        int iSave = canvas.save();
        canvas.skew(f, f2);
        try {
            qy6Var.invoke(canvas);
        } finally {
            o28.finallyStart(1);
            canvas.restoreToCount(iSave);
            o28.finallyEnd(1);
        }
    }

    public static final void withTranslation(@yfb Canvas canvas, float f, float f2, @yfb qy6<? super Canvas, bth> qy6Var) {
        int iSave = canvas.save();
        canvas.translate(f, f2);
        try {
            qy6Var.invoke(canvas);
        } finally {
            o28.finallyStart(1);
            canvas.restoreToCount(iSave);
            o28.finallyEnd(1);
        }
    }

    public static /* synthetic */ void withTranslation$default(Canvas canvas, float f, float f2, qy6 qy6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        int iSave = canvas.save();
        canvas.translate(f, f2);
        try {
            qy6Var.invoke(canvas);
        } finally {
            o28.finallyStart(1);
            canvas.restoreToCount(iSave);
            o28.finallyEnd(1);
        }
    }

    public static final void withClip(@yfb Canvas canvas, @yfb RectF rectF, @yfb qy6<? super Canvas, bth> qy6Var) {
        int iSave = canvas.save();
        canvas.clipRect(rectF);
        try {
            qy6Var.invoke(canvas);
        } finally {
            o28.finallyStart(1);
            canvas.restoreToCount(iSave);
            o28.finallyEnd(1);
        }
    }

    public static final void withClip(@yfb Canvas canvas, int i, int i2, int i3, int i4, @yfb qy6<? super Canvas, bth> qy6Var) {
        int iSave = canvas.save();
        canvas.clipRect(i, i2, i3, i4);
        try {
            qy6Var.invoke(canvas);
        } finally {
            o28.finallyStart(1);
            canvas.restoreToCount(iSave);
            o28.finallyEnd(1);
        }
    }

    public static final void withClip(@yfb Canvas canvas, float f, float f2, float f3, float f4, @yfb qy6<? super Canvas, bth> qy6Var) {
        int iSave = canvas.save();
        canvas.clipRect(f, f2, f3, f4);
        try {
            qy6Var.invoke(canvas);
        } finally {
            o28.finallyStart(1);
            canvas.restoreToCount(iSave);
            o28.finallyEnd(1);
        }
    }

    public static final void withClip(@yfb Canvas canvas, @yfb Path path, @yfb qy6<? super Canvas, bth> qy6Var) {
        int iSave = canvas.save();
        canvas.clipPath(path);
        try {
            qy6Var.invoke(canvas);
        } finally {
            o28.finallyStart(1);
            canvas.restoreToCount(iSave);
            o28.finallyEnd(1);
        }
    }
}
