package p000;

import com.eyevue.glassapp.C2558R;

/* JADX INFO: loaded from: classes4.dex */
public class s56 {

    /* JADX INFO: renamed from: g */
    public static s56 f80709g;

    /* JADX INFO: renamed from: a */
    public boolean f80710a = false;

    /* JADX INFO: renamed from: b */
    public boolean f80711b = true;

    /* JADX INFO: renamed from: c */
    public int f80712c = 0;

    /* JADX INFO: renamed from: d */
    public int f80713d = 100;

    /* JADX INFO: renamed from: e */
    public int f80714e = C2558R.layout.layout_floating_view;

    /* JADX INFO: renamed from: f */
    public boolean f80715f = true;

    private s56() {
    }

    public static s56 getInstance() {
        if (f80709g == null) {
            synchronized (s56.class) {
                try {
                    if (f80709g == null) {
                        f80709g = new s56();
                    }
                } finally {
                }
            }
        }
        return f80709g;
    }

    public Boolean getDrag() {
        return Boolean.valueOf(this.f80710a);
    }

    public int getLayoutId() {
        return this.f80714e;
    }

    public Boolean getVisible() {
        return Boolean.valueOf(this.f80711b);
    }

    public int getxPosition() {
        return this.f80712c;
    }

    public int getyPosition() {
        return this.f80713d;
    }

    public boolean isPlayerMusic() {
        return this.f80715f;
    }

    public void setAllParameters(boolean isDrag, boolean isVisible, int xPosition, int yPosition, int layoutId) {
        this.f80710a = isDrag;
        this.f80711b = isVisible;
        this.f80712c = xPosition;
        this.f80713d = yPosition;
        this.f80714e = layoutId;
    }

    public void setDrag(Boolean drag) {
        this.f80710a = drag.booleanValue();
    }

    public void setLayoutId(int layoutId) {
        this.f80714e = layoutId;
    }

    public void setPlayerMusic(boolean playerMusic) {
        this.f80715f = playerMusic;
    }

    public void setVisible(Boolean visible) {
        this.f80711b = visible.booleanValue();
    }

    public void setxPosition(int xPosition) {
        this.f80712c = xPosition;
    }

    public void setyPosition(int yPosition) {
        this.f80713d = yPosition;
    }
}
