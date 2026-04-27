package p000;

import android.media.VolumeProvider;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ggi {

    /* JADX INFO: renamed from: g */
    public static final int f39782g = 0;

    /* JADX INFO: renamed from: h */
    public static final int f39783h = 1;

    /* JADX INFO: renamed from: i */
    public static final int f39784i = 2;

    /* JADX INFO: renamed from: a */
    public final int f39785a;

    /* JADX INFO: renamed from: b */
    public final int f39786b;

    /* JADX INFO: renamed from: c */
    public final String f39787c;

    /* JADX INFO: renamed from: d */
    public int f39788d;

    /* JADX INFO: renamed from: e */
    public AbstractC6307d f39789e;

    /* JADX INFO: renamed from: f */
    public VolumeProvider f39790f;

    /* JADX INFO: renamed from: ggi$a */
    public class C6304a extends VolumeProvider {
        public C6304a(int i, int i2, int i3, String str) {
            super(i, i2, i3, str);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i) {
            ggi.this.onAdjustVolume(i);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i) {
            ggi.this.onSetVolumeTo(i);
        }
    }

    /* JADX INFO: renamed from: ggi$b */
    public class C6305b extends VolumeProvider {
        public C6305b(int i, int i2, int i3) {
            super(i, i2, i3);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i) {
            ggi.this.onAdjustVolume(i);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i) {
            ggi.this.onSetVolumeTo(i);
        }
    }

    /* JADX INFO: renamed from: ggi$c */
    @c5e(21)
    public static class C6306c {
        private C6306c() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static void m11683a(VolumeProvider volumeProvider, int i) {
            volumeProvider.setCurrentVolume(i);
        }
    }

    /* JADX INFO: renamed from: ggi$d */
    public static abstract class AbstractC6307d {
        public abstract void onVolumeChanged(ggi ggiVar);
    }

    /* JADX INFO: renamed from: ggi$e */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69936c})
    public @interface InterfaceC6308e {
    }

    public ggi(int i, int i2, int i3) {
        this(i, i2, i3, null);
    }

    public final int getCurrentVolume() {
        return this.f39788d;
    }

    public final int getMaxVolume() {
        return this.f39786b;
    }

    public final int getVolumeControl() {
        return this.f39785a;
    }

    @hib
    @p7e({p7e.EnumC10826a.f69936c})
    public final String getVolumeControlId() {
        return this.f39787c;
    }

    public Object getVolumeProvider() {
        if (this.f39790f == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f39790f = new C6304a(this.f39785a, this.f39786b, this.f39788d, this.f39787c);
            } else {
                this.f39790f = new C6305b(this.f39785a, this.f39786b, this.f39788d);
            }
        }
        return this.f39790f;
    }

    public void onAdjustVolume(int i) {
    }

    public void onSetVolumeTo(int i) {
    }

    public void setCallback(AbstractC6307d abstractC6307d) {
        this.f39789e = abstractC6307d;
    }

    public final void setCurrentVolume(int i) {
        this.f39788d = i;
        C6306c.m11683a((VolumeProvider) getVolumeProvider(), i);
        AbstractC6307d abstractC6307d = this.f39789e;
        if (abstractC6307d != null) {
            abstractC6307d.onVolumeChanged(this);
        }
    }

    @p7e({p7e.EnumC10826a.f69936c})
    public ggi(int i, int i2, int i3, @hib String str) {
        this.f39785a = i;
        this.f39786b = i2;
        this.f39788d = i3;
        this.f39787c = str;
    }
}
