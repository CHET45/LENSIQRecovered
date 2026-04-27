package p000;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p000.gh1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class o93 implements gh1 {

    /* JADX INFO: renamed from: V1 */
    public static final float f66836V1 = -3.4028235E38f;

    /* JADX INFO: renamed from: Z1 */
    public static final int f66837Z1 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: a2 */
    public static final int f66838a2 = 0;

    /* JADX INFO: renamed from: b2 */
    public static final int f66839b2 = 1;

    /* JADX INFO: renamed from: c2 */
    public static final int f66840c2 = 2;

    /* JADX INFO: renamed from: d2 */
    public static final int f66841d2 = 0;

    /* JADX INFO: renamed from: e2 */
    public static final int f66842e2 = 1;

    /* JADX INFO: renamed from: f2 */
    public static final int f66843f2 = 0;

    /* JADX INFO: renamed from: g2 */
    public static final int f66844g2 = 1;

    /* JADX INFO: renamed from: h2 */
    public static final int f66845h2 = 2;

    /* JADX INFO: renamed from: i2 */
    public static final int f66846i2 = 1;

    /* JADX INFO: renamed from: j2 */
    public static final int f66847j2 = 2;

    /* JADX INFO: renamed from: C */
    public final float f66864C;

    /* JADX INFO: renamed from: F */
    public final int f66865F;

    /* JADX INFO: renamed from: H */
    public final float f66866H;

    /* JADX INFO: renamed from: L */
    public final float f66867L;

    /* JADX INFO: renamed from: M */
    public final boolean f66868M;

    /* JADX INFO: renamed from: N */
    public final int f66869N;

    /* JADX INFO: renamed from: Q */
    public final int f66870Q;

    /* JADX INFO: renamed from: X */
    public final float f66871X;

    /* JADX INFO: renamed from: Y */
    public final int f66872Y;

    /* JADX INFO: renamed from: Z */
    public final float f66873Z;

    /* JADX INFO: renamed from: a */
    @hib
    public final CharSequence f66874a;

    /* JADX INFO: renamed from: b */
    @hib
    public final Layout.Alignment f66875b;

    /* JADX INFO: renamed from: c */
    @hib
    public final Layout.Alignment f66876c;

    /* JADX INFO: renamed from: d */
    @hib
    public final Bitmap f66877d;

    /* JADX INFO: renamed from: e */
    public final float f66878e;

    /* JADX INFO: renamed from: f */
    public final int f66879f;

    /* JADX INFO: renamed from: m */
    public final int f66880m;

    /* JADX INFO: renamed from: M1 */
    public static final o93 f66835M1 = new C10261c().setText("").build();

    /* JADX INFO: renamed from: k2 */
    public static final String f66848k2 = x0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: l2 */
    public static final String f66849l2 = x0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: m2 */
    public static final String f66850m2 = x0i.intToStringMaxRadix(2);

    /* JADX INFO: renamed from: n2 */
    public static final String f66851n2 = x0i.intToStringMaxRadix(3);

    /* JADX INFO: renamed from: o2 */
    public static final String f66852o2 = x0i.intToStringMaxRadix(4);

    /* JADX INFO: renamed from: p2 */
    public static final String f66853p2 = x0i.intToStringMaxRadix(5);

    /* JADX INFO: renamed from: q2 */
    public static final String f66854q2 = x0i.intToStringMaxRadix(6);

    /* JADX INFO: renamed from: r2 */
    public static final String f66855r2 = x0i.intToStringMaxRadix(7);

    /* JADX INFO: renamed from: s2 */
    public static final String f66856s2 = x0i.intToStringMaxRadix(8);

    /* JADX INFO: renamed from: t2 */
    public static final String f66857t2 = x0i.intToStringMaxRadix(9);

    /* JADX INFO: renamed from: u2 */
    public static final String f66858u2 = x0i.intToStringMaxRadix(10);

    /* JADX INFO: renamed from: v2 */
    public static final String f66859v2 = x0i.intToStringMaxRadix(11);

    /* JADX INFO: renamed from: w2 */
    public static final String f66860w2 = x0i.intToStringMaxRadix(12);

    /* JADX INFO: renamed from: x2 */
    public static final String f66861x2 = x0i.intToStringMaxRadix(13);

    /* JADX INFO: renamed from: y2 */
    public static final String f66862y2 = x0i.intToStringMaxRadix(14);

    /* JADX INFO: renamed from: z2 */
    public static final String f66863z2 = x0i.intToStringMaxRadix(15);

    /* JADX INFO: renamed from: A2 */
    public static final String f66833A2 = x0i.intToStringMaxRadix(16);

    /* JADX INFO: renamed from: B2 */
    public static final gh1.InterfaceC6311a<o93> f66834B2 = new gh1.InterfaceC6311a() { // from class: m93
        @Override // p000.gh1.InterfaceC6311a
        public final gh1 fromBundle(Bundle bundle) {
            return o93.fromBundle(bundle);
        }
    };

    /* JADX INFO: renamed from: o93$b */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC10260b {
    }

    /* JADX INFO: renamed from: o93$c */
    public static final class C10261c {

        /* JADX INFO: renamed from: a */
        @hib
        public CharSequence f66881a;

        /* JADX INFO: renamed from: b */
        @hib
        public Bitmap f66882b;

        /* JADX INFO: renamed from: c */
        @hib
        public Layout.Alignment f66883c;

        /* JADX INFO: renamed from: d */
        @hib
        public Layout.Alignment f66884d;

        /* JADX INFO: renamed from: e */
        public float f66885e;

        /* JADX INFO: renamed from: f */
        public int f66886f;

        /* JADX INFO: renamed from: g */
        public int f66887g;

        /* JADX INFO: renamed from: h */
        public float f66888h;

        /* JADX INFO: renamed from: i */
        public int f66889i;

        /* JADX INFO: renamed from: j */
        public int f66890j;

        /* JADX INFO: renamed from: k */
        public float f66891k;

        /* JADX INFO: renamed from: l */
        public float f66892l;

        /* JADX INFO: renamed from: m */
        public float f66893m;

        /* JADX INFO: renamed from: n */
        public boolean f66894n;

        /* JADX INFO: renamed from: o */
        @g92
        public int f66895o;

        /* JADX INFO: renamed from: p */
        public int f66896p;

        /* JADX INFO: renamed from: q */
        public float f66897q;

        public o93 build() {
            return new o93(this.f66881a, this.f66883c, this.f66884d, this.f66882b, this.f66885e, this.f66886f, this.f66887g, this.f66888h, this.f66889i, this.f66890j, this.f66891k, this.f66892l, this.f66893m, this.f66894n, this.f66895o, this.f66896p, this.f66897q);
        }

        @op1
        public C10261c clearWindowColor() {
            this.f66894n = false;
            return this;
        }

        @bkd
        @hib
        public Bitmap getBitmap() {
            return this.f66882b;
        }

        @bkd
        public float getBitmapHeight() {
            return this.f66893m;
        }

        @bkd
        public float getLine() {
            return this.f66885e;
        }

        @bkd
        public int getLineAnchor() {
            return this.f66887g;
        }

        @bkd
        public int getLineType() {
            return this.f66886f;
        }

        @bkd
        public float getPosition() {
            return this.f66888h;
        }

        @bkd
        public int getPositionAnchor() {
            return this.f66889i;
        }

        @bkd
        public float getSize() {
            return this.f66892l;
        }

        @bkd
        @hib
        public CharSequence getText() {
            return this.f66881a;
        }

        @bkd
        @hib
        public Layout.Alignment getTextAlignment() {
            return this.f66883c;
        }

        @bkd
        public float getTextSize() {
            return this.f66891k;
        }

        @bkd
        public int getTextSizeType() {
            return this.f66890j;
        }

        @bkd
        public int getVerticalType() {
            return this.f66896p;
        }

        @bkd
        @g92
        public int getWindowColor() {
            return this.f66895o;
        }

        public boolean isWindowColorSet() {
            return this.f66894n;
        }

        @op1
        public C10261c setBitmap(Bitmap bitmap) {
            this.f66882b = bitmap;
            return this;
        }

        @op1
        public C10261c setBitmapHeight(float f) {
            this.f66893m = f;
            return this;
        }

        @op1
        public C10261c setLine(float f, int i) {
            this.f66885e = f;
            this.f66886f = i;
            return this;
        }

        @op1
        public C10261c setLineAnchor(int i) {
            this.f66887g = i;
            return this;
        }

        @op1
        public C10261c setMultiRowAlignment(@hib Layout.Alignment alignment) {
            this.f66884d = alignment;
            return this;
        }

        @op1
        public C10261c setPosition(float f) {
            this.f66888h = f;
            return this;
        }

        @op1
        public C10261c setPositionAnchor(int i) {
            this.f66889i = i;
            return this;
        }

        @op1
        public C10261c setShearDegrees(float f) {
            this.f66897q = f;
            return this;
        }

        @op1
        public C10261c setSize(float f) {
            this.f66892l = f;
            return this;
        }

        @op1
        public C10261c setText(CharSequence charSequence) {
            this.f66881a = charSequence;
            return this;
        }

        @op1
        public C10261c setTextAlignment(@hib Layout.Alignment alignment) {
            this.f66883c = alignment;
            return this;
        }

        @op1
        public C10261c setTextSize(float f, int i) {
            this.f66891k = f;
            this.f66890j = i;
            return this;
        }

        @op1
        public C10261c setVerticalType(int i) {
            this.f66896p = i;
            return this;
        }

        @op1
        public C10261c setWindowColor(@g92 int i) {
            this.f66895o = i;
            this.f66894n = true;
            return this;
        }

        public C10261c() {
            this.f66881a = null;
            this.f66882b = null;
            this.f66883c = null;
            this.f66884d = null;
            this.f66885e = -3.4028235E38f;
            this.f66886f = Integer.MIN_VALUE;
            this.f66887g = Integer.MIN_VALUE;
            this.f66888h = -3.4028235E38f;
            this.f66889i = Integer.MIN_VALUE;
            this.f66890j = Integer.MIN_VALUE;
            this.f66891k = -3.4028235E38f;
            this.f66892l = -3.4028235E38f;
            this.f66893m = -3.4028235E38f;
            this.f66894n = false;
            this.f66895o = -16777216;
            this.f66896p = Integer.MIN_VALUE;
        }

        private C10261c(o93 o93Var) {
            this.f66881a = o93Var.f66874a;
            this.f66882b = o93Var.f66877d;
            this.f66883c = o93Var.f66875b;
            this.f66884d = o93Var.f66876c;
            this.f66885e = o93Var.f66878e;
            this.f66886f = o93Var.f66879f;
            this.f66887g = o93Var.f66880m;
            this.f66888h = o93Var.f66864C;
            this.f66889i = o93Var.f66865F;
            this.f66890j = o93Var.f66870Q;
            this.f66891k = o93Var.f66871X;
            this.f66892l = o93Var.f66866H;
            this.f66893m = o93Var.f66867L;
            this.f66894n = o93Var.f66868M;
            this.f66895o = o93Var.f66869N;
            this.f66896p = o93Var.f66872Y;
            this.f66897q = o93Var.f66873Z;
        }
    }

    /* JADX INFO: renamed from: o93$d */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC10262d {
    }

    /* JADX INFO: renamed from: o93$e */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC10263e {
    }

    /* JADX INFO: renamed from: o93$f */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC10264f {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o93 fromBundle(Bundle bundle) {
        C10261c c10261c = new C10261c();
        CharSequence charSequence = bundle.getCharSequence(f66848k2);
        if (charSequence != null) {
            c10261c.setText(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f66849l2);
        if (alignment != null) {
            c10261c.setTextAlignment(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f66850m2);
        if (alignment2 != null) {
            c10261c.setMultiRowAlignment(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f66851n2);
        if (bitmap != null) {
            c10261c.setBitmap(bitmap);
        }
        String str = f66852o2;
        if (bundle.containsKey(str)) {
            String str2 = f66853p2;
            if (bundle.containsKey(str2)) {
                c10261c.setLine(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = f66854q2;
        if (bundle.containsKey(str3)) {
            c10261c.setLineAnchor(bundle.getInt(str3));
        }
        String str4 = f66855r2;
        if (bundle.containsKey(str4)) {
            c10261c.setPosition(bundle.getFloat(str4));
        }
        String str5 = f66856s2;
        if (bundle.containsKey(str5)) {
            c10261c.setPositionAnchor(bundle.getInt(str5));
        }
        String str6 = f66858u2;
        if (bundle.containsKey(str6)) {
            String str7 = f66857t2;
            if (bundle.containsKey(str7)) {
                c10261c.setTextSize(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = f66859v2;
        if (bundle.containsKey(str8)) {
            c10261c.setSize(bundle.getFloat(str8));
        }
        String str9 = f66860w2;
        if (bundle.containsKey(str9)) {
            c10261c.setBitmapHeight(bundle.getFloat(str9));
        }
        String str10 = f66861x2;
        if (bundle.containsKey(str10)) {
            c10261c.setWindowColor(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(f66862y2, false)) {
            c10261c.clearWindowColor();
        }
        String str11 = f66863z2;
        if (bundle.containsKey(str11)) {
            c10261c.setVerticalType(bundle.getInt(str11));
        }
        String str12 = f66833A2;
        if (bundle.containsKey(str12)) {
            c10261c.setShearDegrees(bundle.getFloat(str12));
        }
        return c10261c.build();
    }

    public C10261c buildUpon() {
        return new C10261c();
    }

    public boolean equals(@hib Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || o93.class != obj.getClass()) {
            return false;
        }
        o93 o93Var = (o93) obj;
        return TextUtils.equals(this.f66874a, o93Var.f66874a) && this.f66875b == o93Var.f66875b && this.f66876c == o93Var.f66876c && ((bitmap = this.f66877d) != null ? !((bitmap2 = o93Var.f66877d) == null || !bitmap.sameAs(bitmap2)) : o93Var.f66877d == null) && this.f66878e == o93Var.f66878e && this.f66879f == o93Var.f66879f && this.f66880m == o93Var.f66880m && this.f66864C == o93Var.f66864C && this.f66865F == o93Var.f66865F && this.f66866H == o93Var.f66866H && this.f66867L == o93Var.f66867L && this.f66868M == o93Var.f66868M && this.f66869N == o93Var.f66869N && this.f66870Q == o93Var.f66870Q && this.f66871X == o93Var.f66871X && this.f66872Y == o93Var.f66872Y && this.f66873Z == o93Var.f66873Z;
    }

    public int hashCode() {
        return okb.hashCode(this.f66874a, this.f66875b, this.f66876c, this.f66877d, Float.valueOf(this.f66878e), Integer.valueOf(this.f66879f), Integer.valueOf(this.f66880m), Float.valueOf(this.f66864C), Integer.valueOf(this.f66865F), Float.valueOf(this.f66866H), Float.valueOf(this.f66867L), Boolean.valueOf(this.f66868M), Integer.valueOf(this.f66869N), Integer.valueOf(this.f66870Q), Float.valueOf(this.f66871X), Integer.valueOf(this.f66872Y), Float.valueOf(this.f66873Z));
    }

    @Override // p000.gh1
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(f66848k2, this.f66874a);
        bundle.putSerializable(f66849l2, this.f66875b);
        bundle.putSerializable(f66850m2, this.f66876c);
        bundle.putParcelable(f66851n2, this.f66877d);
        bundle.putFloat(f66852o2, this.f66878e);
        bundle.putInt(f66853p2, this.f66879f);
        bundle.putInt(f66854q2, this.f66880m);
        bundle.putFloat(f66855r2, this.f66864C);
        bundle.putInt(f66856s2, this.f66865F);
        bundle.putInt(f66857t2, this.f66870Q);
        bundle.putFloat(f66858u2, this.f66871X);
        bundle.putFloat(f66859v2, this.f66866H);
        bundle.putFloat(f66860w2, this.f66867L);
        bundle.putBoolean(f66862y2, this.f66868M);
        bundle.putInt(f66861x2, this.f66869N);
        bundle.putInt(f66863z2, this.f66872Y);
        bundle.putFloat(f66833A2, this.f66873Z);
        return bundle;
    }

    private o93(@hib CharSequence charSequence, @hib Layout.Alignment alignment, @hib Layout.Alignment alignment2, @hib Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            u80.checkNotNull(bitmap);
        } else {
            u80.checkArgument(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f66874a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f66874a = charSequence.toString();
        } else {
            this.f66874a = null;
        }
        this.f66875b = alignment;
        this.f66876c = alignment2;
        this.f66877d = bitmap;
        this.f66878e = f;
        this.f66879f = i;
        this.f66880m = i2;
        this.f66864C = f2;
        this.f66865F = i3;
        this.f66866H = f4;
        this.f66867L = f5;
        this.f66868M = z;
        this.f66869N = i5;
        this.f66870Q = i4;
        this.f66871X = f3;
        this.f66872Y = i6;
        this.f66873Z = f6;
    }
}
