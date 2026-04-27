package p000;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public class wq4 {

    /* JADX INFO: renamed from: a */
    public final Drawable f95066a;

    /* JADX INFO: renamed from: b */
    public final int f95067b;

    /* JADX INFO: renamed from: c */
    public final int f95068c;

    public wq4(Drawable drawable, int i, int i2) {
        this.f95066a = drawable;
        this.f95067b = i;
        this.f95068c = i2;
    }

    public void drawBottom(View view, Canvas canvas) {
        int left = view.getLeft() - this.f95067b;
        int bottom = view.getBottom();
        this.f95066a.setBounds(left, bottom, view.getRight() + this.f95067b, this.f95068c + bottom);
        this.f95066a.draw(canvas);
    }

    public void drawLeft(View view, Canvas canvas) {
        int left = view.getLeft() - this.f95067b;
        this.f95066a.setBounds(left, view.getTop() - this.f95068c, this.f95067b + left, view.getBottom() + this.f95068c);
        this.f95066a.draw(canvas);
    }

    public void drawRight(View view, Canvas canvas) {
        int right = view.getRight();
        this.f95066a.setBounds(right, view.getTop() - this.f95068c, this.f95067b + right, view.getBottom() + this.f95068c);
        this.f95066a.draw(canvas);
    }

    public void drawTop(View view, Canvas canvas) {
        int left = view.getLeft() - this.f95067b;
        int top = view.getTop() - this.f95068c;
        this.f95066a.setBounds(left, top, view.getRight() + this.f95067b, this.f95068c + top);
        this.f95066a.draw(canvas);
    }
}
