package p000;

import android.graphics.Paint;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class e9f implements sw2 {

    /* JADX INFO: renamed from: a */
    public final String f32270a;

    /* JADX INFO: renamed from: b */
    @hib
    public final C15326xw f32271b;

    /* JADX INFO: renamed from: c */
    public final List<C15326xw> f32272c;

    /* JADX INFO: renamed from: d */
    public final C14811ww f32273d;

    /* JADX INFO: renamed from: e */
    public final C16264zw f32274e;

    /* JADX INFO: renamed from: f */
    public final C15326xw f32275f;

    /* JADX INFO: renamed from: g */
    public final EnumC5208b f32276g;

    /* JADX INFO: renamed from: h */
    public final EnumC5209c f32277h;

    /* JADX INFO: renamed from: i */
    public final float f32278i;

    /* JADX INFO: renamed from: j */
    public final boolean f32279j;

    /* JADX INFO: renamed from: e9f$a */
    public static /* synthetic */ class C5207a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f32280a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f32281b;

        static {
            int[] iArr = new int[EnumC5209c.values().length];
            f32281b = iArr;
            try {
                iArr[EnumC5209c.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32281b[EnumC5209c.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32281b[EnumC5209c.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[EnumC5208b.values().length];
            f32280a = iArr2;
            try {
                iArr2[EnumC5208b.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32280a[EnumC5208b.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32280a[EnumC5208b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: e9f$b */
    public enum EnumC5208b {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int i = C5207a.f32280a[ordinal()];
            return i != 1 ? i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    /* JADX INFO: renamed from: e9f$c */
    public enum EnumC5209c {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int i = C5207a.f32281b[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public e9f(String str, @hib C15326xw c15326xw, List<C15326xw> list, C14811ww c14811ww, C16264zw c16264zw, C15326xw c15326xw2, EnumC5208b enumC5208b, EnumC5209c enumC5209c, float f, boolean z) {
        this.f32270a = str;
        this.f32271b = c15326xw;
        this.f32272c = list;
        this.f32273d = c14811ww;
        this.f32274e = c16264zw;
        this.f32275f = c15326xw2;
        this.f32276g = enumC5208b;
        this.f32277h = enumC5209c;
        this.f32278i = f;
        this.f32279j = z;
    }

    public EnumC5208b getCapType() {
        return this.f32276g;
    }

    public C14811ww getColor() {
        return this.f32273d;
    }

    public C15326xw getDashOffset() {
        return this.f32271b;
    }

    public EnumC5209c getJoinType() {
        return this.f32277h;
    }

    public List<C15326xw> getLineDashPattern() {
        return this.f32272c;
    }

    public float getMiterLimit() {
        return this.f32278i;
    }

    public String getName() {
        return this.f32270a;
    }

    public C16264zw getOpacity() {
        return this.f32274e;
    }

    public C15326xw getWidth() {
        return this.f32275f;
    }

    public boolean isHidden() {
        return this.f32279j;
    }

    @Override // p000.sw2
    public gv2 toContent(go9 go9Var, pr0 pr0Var) {
        return new gag(go9Var, pr0Var, this);
    }
}
