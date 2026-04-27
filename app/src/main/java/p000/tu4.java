package p000;

import android.app.Activity;
import android.graphics.Bitmap;
import p000.p7e;
import p000.su4;

/* JADX INFO: loaded from: classes5.dex */
public class tu4 {

    /* JADX INFO: renamed from: e */
    public static final su4.InterfaceC12789f f85941e = new C13240a();

    /* JADX INFO: renamed from: f */
    public static final su4.InterfaceC12788e f85942f = new C13241b();

    /* JADX INFO: renamed from: a */
    @dbg
    public final int f85943a;

    /* JADX INFO: renamed from: b */
    @efb
    public final su4.InterfaceC12789f f85944b;

    /* JADX INFO: renamed from: c */
    @efb
    public final su4.InterfaceC12788e f85945c;

    /* JADX INFO: renamed from: d */
    @hib
    public Integer f85946d;

    /* JADX INFO: renamed from: tu4$a */
    public class C13240a implements su4.InterfaceC12789f {
        @Override // p000.su4.InterfaceC12789f
        public boolean shouldApplyDynamicColors(@efb Activity activity, int i) {
            return true;
        }
    }

    /* JADX INFO: renamed from: tu4$b */
    public class C13241b implements su4.InterfaceC12788e {
        @Override // p000.su4.InterfaceC12788e
        public void onApplied(@efb Activity activity) {
        }
    }

    /* JADX INFO: renamed from: tu4$c */
    public static class C13242c {

        /* JADX INFO: renamed from: a */
        @dbg
        public int f85947a;

        /* JADX INFO: renamed from: b */
        @efb
        public su4.InterfaceC12789f f85948b = tu4.f85941e;

        /* JADX INFO: renamed from: c */
        @efb
        public su4.InterfaceC12788e f85949c = tu4.f85942f;

        /* JADX INFO: renamed from: d */
        @hib
        public Bitmap f85950d;

        @efb
        public tu4 build() {
            return new tu4(this, null);
        }

        @efb
        @op1
        @p7e({p7e.EnumC10826a.f69935b})
        public C13242c setContentBasedSource(@efb Bitmap bitmap) {
            this.f85950d = bitmap;
            return this;
        }

        @efb
        @op1
        public C13242c setOnAppliedCallback(@efb su4.InterfaceC12788e interfaceC12788e) {
            this.f85949c = interfaceC12788e;
            return this;
        }

        @efb
        @op1
        public C13242c setPrecondition(@efb su4.InterfaceC12789f interfaceC12789f) {
            this.f85948b = interfaceC12789f;
            return this;
        }

        @efb
        @op1
        public C13242c setThemeOverlay(@dbg int i) {
            this.f85947a = i;
            return this;
        }
    }

    public /* synthetic */ tu4(C13242c c13242c, C13240a c13240a) {
        this(c13242c);
    }

    private static int extractSeedColorFromImage(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return cre.score(zkd.quantize(iArr, 128)).get(0).intValue();
    }

    @hib
    public Integer getContentBasedSeedColor() {
        return this.f85946d;
    }

    @efb
    public su4.InterfaceC12788e getOnAppliedCallback() {
        return this.f85945c;
    }

    @efb
    public su4.InterfaceC12789f getPrecondition() {
        return this.f85944b;
    }

    @dbg
    public int getThemeOverlay() {
        return this.f85943a;
    }

    private tu4(C13242c c13242c) {
        this.f85943a = c13242c.f85947a;
        this.f85944b = c13242c.f85948b;
        this.f85945c = c13242c.f85949c;
        if (c13242c.f85950d != null) {
            this.f85946d = Integer.valueOf(extractSeedColorFromImage(c13242c.f85950d));
        }
    }
}
