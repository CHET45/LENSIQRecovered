package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class n93 {

    /* JADX INFO: renamed from: A */
    public static final int f63670A = 0;

    /* JADX INFO: renamed from: B */
    public static final int f63671B = 1;

    /* JADX INFO: renamed from: C */
    public static final int f63672C = 2;

    /* JADX INFO: renamed from: D */
    public static final int f63673D = 1;

    /* JADX INFO: renamed from: E */
    public static final int f63674E = 2;

    /* JADX INFO: renamed from: t */
    public static final float f63696t = -3.4028235E38f;

    /* JADX INFO: renamed from: u */
    public static final int f63697u = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: v */
    public static final int f63698v = 0;

    /* JADX INFO: renamed from: w */
    public static final int f63699w = 1;

    /* JADX INFO: renamed from: x */
    public static final int f63700x = 2;

    /* JADX INFO: renamed from: y */
    public static final int f63701y = 0;

    /* JADX INFO: renamed from: z */
    public static final int f63702z = 1;

    /* JADX INFO: renamed from: a */
    @hib
    public final CharSequence f63703a;

    /* JADX INFO: renamed from: b */
    @hib
    public final Layout.Alignment f63704b;

    /* JADX INFO: renamed from: c */
    @hib
    public final Layout.Alignment f63705c;

    /* JADX INFO: renamed from: d */
    @hib
    public final Bitmap f63706d;

    /* JADX INFO: renamed from: e */
    public final float f63707e;

    /* JADX INFO: renamed from: f */
    public final int f63708f;

    /* JADX INFO: renamed from: g */
    public final int f63709g;

    /* JADX INFO: renamed from: h */
    public final float f63710h;

    /* JADX INFO: renamed from: i */
    public final int f63711i;

    /* JADX INFO: renamed from: j */
    public final float f63712j;

    /* JADX INFO: renamed from: k */
    public final float f63713k;

    /* JADX INFO: renamed from: l */
    public final boolean f63714l;

    /* JADX INFO: renamed from: m */
    public final int f63715m;

    /* JADX INFO: renamed from: n */
    public final int f63716n;

    /* JADX INFO: renamed from: o */
    public final float f63717o;

    /* JADX INFO: renamed from: p */
    public final int f63718p;

    /* JADX INFO: renamed from: q */
    public final float f63719q;

    /* JADX INFO: renamed from: r */
    @ovh
    public final int f63720r;

    /* JADX INFO: renamed from: s */
    @Deprecated
    public static final n93 f63695s = new C9750c().setText("").build();

    /* JADX INFO: renamed from: F */
    public static final String f63675F = t0i.intToStringMaxRadix(0);

    /* JADX INFO: renamed from: G */
    public static final String f63676G = t0i.intToStringMaxRadix(17);

    /* JADX INFO: renamed from: H */
    public static final String f63677H = t0i.intToStringMaxRadix(1);

    /* JADX INFO: renamed from: I */
    public static final String f63678I = t0i.intToStringMaxRadix(2);

    /* JADX INFO: renamed from: J */
    public static final String f63679J = t0i.intToStringMaxRadix(3);

    /* JADX INFO: renamed from: K */
    public static final String f63680K = t0i.intToStringMaxRadix(18);

    /* JADX INFO: renamed from: L */
    public static final String f63681L = t0i.intToStringMaxRadix(4);

    /* JADX INFO: renamed from: M */
    public static final String f63682M = t0i.intToStringMaxRadix(5);

    /* JADX INFO: renamed from: N */
    public static final String f63683N = t0i.intToStringMaxRadix(6);

    /* JADX INFO: renamed from: O */
    public static final String f63684O = t0i.intToStringMaxRadix(7);

    /* JADX INFO: renamed from: P */
    public static final String f63685P = t0i.intToStringMaxRadix(8);

    /* JADX INFO: renamed from: Q */
    public static final String f63686Q = t0i.intToStringMaxRadix(9);

    /* JADX INFO: renamed from: R */
    public static final String f63687R = t0i.intToStringMaxRadix(10);

    /* JADX INFO: renamed from: S */
    public static final String f63688S = t0i.intToStringMaxRadix(11);

    /* JADX INFO: renamed from: T */
    public static final String f63689T = t0i.intToStringMaxRadix(12);

    /* JADX INFO: renamed from: U */
    public static final String f63690U = t0i.intToStringMaxRadix(13);

    /* JADX INFO: renamed from: V */
    public static final String f63691V = t0i.intToStringMaxRadix(14);

    /* JADX INFO: renamed from: W */
    public static final String f63692W = t0i.intToStringMaxRadix(15);

    /* JADX INFO: renamed from: X */
    public static final String f63693X = t0i.intToStringMaxRadix(16);

    /* JADX INFO: renamed from: Y */
    public static final String f63694Y = t0i.intToStringMaxRadix(19);

    /* JADX INFO: renamed from: n93$b */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9749b {
    }

    /* JADX INFO: renamed from: n93$c */
    @ovh
    public static final class C9750c {

        /* JADX INFO: renamed from: a */
        @hib
        public CharSequence f63721a;

        /* JADX INFO: renamed from: b */
        @hib
        public Bitmap f63722b;

        /* JADX INFO: renamed from: c */
        @hib
        public Layout.Alignment f63723c;

        /* JADX INFO: renamed from: d */
        @hib
        public Layout.Alignment f63724d;

        /* JADX INFO: renamed from: e */
        public float f63725e;

        /* JADX INFO: renamed from: f */
        public int f63726f;

        /* JADX INFO: renamed from: g */
        public int f63727g;

        /* JADX INFO: renamed from: h */
        public float f63728h;

        /* JADX INFO: renamed from: i */
        public int f63729i;

        /* JADX INFO: renamed from: j */
        public int f63730j;

        /* JADX INFO: renamed from: k */
        public float f63731k;

        /* JADX INFO: renamed from: l */
        public float f63732l;

        /* JADX INFO: renamed from: m */
        public float f63733m;

        /* JADX INFO: renamed from: n */
        public boolean f63734n;

        /* JADX INFO: renamed from: o */
        @g92
        public int f63735o;

        /* JADX INFO: renamed from: p */
        public int f63736p;

        /* JADX INFO: renamed from: q */
        public float f63737q;

        /* JADX INFO: renamed from: r */
        public int f63738r;

        public n93 build() {
            return new n93(this.f63721a, this.f63723c, this.f63724d, this.f63722b, this.f63725e, this.f63726f, this.f63727g, this.f63728h, this.f63729i, this.f63730j, this.f63731k, this.f63732l, this.f63733m, this.f63734n, this.f63735o, this.f63736p, this.f63737q, this.f63738r);
        }

        @op1
        public C9750c clearWindowColor() {
            this.f63734n = false;
            return this;
        }

        @bkd
        @hib
        public Bitmap getBitmap() {
            return this.f63722b;
        }

        @bkd
        public float getBitmapHeight() {
            return this.f63733m;
        }

        @bkd
        public float getLine() {
            return this.f63725e;
        }

        @bkd
        public int getLineAnchor() {
            return this.f63727g;
        }

        @bkd
        public int getLineType() {
            return this.f63726f;
        }

        @bkd
        public float getPosition() {
            return this.f63728h;
        }

        @bkd
        public int getPositionAnchor() {
            return this.f63729i;
        }

        @bkd
        public float getSize() {
            return this.f63732l;
        }

        @bkd
        @hib
        public CharSequence getText() {
            return this.f63721a;
        }

        @bkd
        @hib
        public Layout.Alignment getTextAlignment() {
            return this.f63723c;
        }

        @bkd
        public float getTextSize() {
            return this.f63731k;
        }

        @bkd
        public int getTextSizeType() {
            return this.f63730j;
        }

        @bkd
        public int getVerticalType() {
            return this.f63736p;
        }

        @bkd
        @g92
        public int getWindowColor() {
            return this.f63735o;
        }

        @bkd
        public int getZIndex() {
            return this.f63738r;
        }

        public boolean isWindowColorSet() {
            return this.f63734n;
        }

        @op1
        public C9750c setBitmap(Bitmap bitmap) {
            this.f63722b = bitmap;
            this.f63721a = null;
            return this;
        }

        @op1
        public C9750c setBitmapHeight(float f) {
            this.f63733m = f;
            return this;
        }

        @op1
        public C9750c setLine(float f, int i) {
            this.f63725e = f;
            this.f63726f = i;
            return this;
        }

        @op1
        public C9750c setLineAnchor(int i) {
            this.f63727g = i;
            return this;
        }

        @op1
        public C9750c setMultiRowAlignment(@hib Layout.Alignment alignment) {
            this.f63724d = alignment;
            return this;
        }

        @op1
        public C9750c setPosition(float f) {
            this.f63728h = f;
            return this;
        }

        @op1
        public C9750c setPositionAnchor(int i) {
            this.f63729i = i;
            return this;
        }

        @op1
        public C9750c setShearDegrees(float f) {
            this.f63737q = f;
            return this;
        }

        @op1
        public C9750c setSize(float f) {
            this.f63732l = f;
            return this;
        }

        @op1
        public C9750c setText(CharSequence charSequence) {
            this.f63721a = charSequence;
            this.f63722b = null;
            return this;
        }

        @op1
        public C9750c setTextAlignment(@hib Layout.Alignment alignment) {
            this.f63723c = alignment;
            return this;
        }

        @op1
        public C9750c setTextSize(float f, int i) {
            this.f63731k = f;
            this.f63730j = i;
            return this;
        }

        @op1
        public C9750c setVerticalType(int i) {
            this.f63736p = i;
            return this;
        }

        @op1
        public C9750c setWindowColor(@g92 int i) {
            this.f63735o = i;
            this.f63734n = true;
            return this;
        }

        @op1
        public C9750c setZIndex(int i) {
            this.f63738r = i;
            return this;
        }

        public C9750c() {
            this.f63721a = null;
            this.f63722b = null;
            this.f63723c = null;
            this.f63724d = null;
            this.f63725e = -3.4028235E38f;
            this.f63726f = Integer.MIN_VALUE;
            this.f63727g = Integer.MIN_VALUE;
            this.f63728h = -3.4028235E38f;
            this.f63729i = Integer.MIN_VALUE;
            this.f63730j = Integer.MIN_VALUE;
            this.f63731k = -3.4028235E38f;
            this.f63732l = -3.4028235E38f;
            this.f63733m = -3.4028235E38f;
            this.f63734n = false;
            this.f63735o = -16777216;
            this.f63736p = Integer.MIN_VALUE;
        }

        private C9750c(n93 n93Var) {
            this.f63721a = n93Var.f63703a;
            this.f63722b = n93Var.f63706d;
            this.f63723c = n93Var.f63704b;
            this.f63724d = n93Var.f63705c;
            this.f63725e = n93Var.f63707e;
            this.f63726f = n93Var.f63708f;
            this.f63727g = n93Var.f63709g;
            this.f63728h = n93Var.f63710h;
            this.f63729i = n93Var.f63711i;
            this.f63730j = n93Var.f63716n;
            this.f63731k = n93Var.f63717o;
            this.f63732l = n93Var.f63712j;
            this.f63733m = n93Var.f63713k;
            this.f63734n = n93Var.f63714l;
            this.f63735o = n93Var.f63715m;
            this.f63736p = n93Var.f63718p;
            this.f63737q = n93Var.f63719q;
            this.f63738r = n93Var.f63720r;
        }
    }

    /* JADX INFO: renamed from: n93$d */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9751d {
    }

    /* JADX INFO: renamed from: n93$e */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9752e {
    }

    /* JADX INFO: renamed from: n93$f */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC9753f {
    }

    @ovh
    public static n93 fromBundle(Bundle bundle) {
        C9750c c9750c = new C9750c();
        CharSequence charSequence = bundle.getCharSequence(f63675F);
        if (charSequence != null) {
            c9750c.setText(charSequence);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f63676G);
            if (parcelableArrayList != null) {
                SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    ld3.unbundleAndApplyCustomSpan((Bundle) it.next(), spannableStringValueOf);
                }
                c9750c.setText(spannableStringValueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f63677H);
        if (alignment != null) {
            c9750c.setTextAlignment(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f63678I);
        if (alignment2 != null) {
            c9750c.setMultiRowAlignment(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f63679J);
        if (bitmap != null) {
            c9750c.setBitmap(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(f63680K);
            if (byteArray != null) {
                c9750c.setBitmap(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        String str = f63681L;
        if (bundle.containsKey(str)) {
            String str2 = f63682M;
            if (bundle.containsKey(str2)) {
                c9750c.setLine(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = f63683N;
        if (bundle.containsKey(str3)) {
            c9750c.setLineAnchor(bundle.getInt(str3));
        }
        String str4 = f63684O;
        if (bundle.containsKey(str4)) {
            c9750c.setPosition(bundle.getFloat(str4));
        }
        String str5 = f63685P;
        if (bundle.containsKey(str5)) {
            c9750c.setPositionAnchor(bundle.getInt(str5));
        }
        String str6 = f63687R;
        if (bundle.containsKey(str6)) {
            String str7 = f63686Q;
            if (bundle.containsKey(str7)) {
                c9750c.setTextSize(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = f63688S;
        if (bundle.containsKey(str8)) {
            c9750c.setSize(bundle.getFloat(str8));
        }
        String str9 = f63689T;
        if (bundle.containsKey(str9)) {
            c9750c.setBitmapHeight(bundle.getFloat(str9));
        }
        String str10 = f63690U;
        if (bundle.containsKey(str10)) {
            c9750c.setWindowColor(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(f63691V, false)) {
            c9750c.clearWindowColor();
        }
        String str11 = f63692W;
        if (bundle.containsKey(str11)) {
            c9750c.setVerticalType(bundle.getInt(str11));
        }
        String str12 = f63693X;
        if (bundle.containsKey(str12)) {
            c9750c.setShearDegrees(bundle.getFloat(str12));
        }
        String str13 = f63694Y;
        if (bundle.containsKey(str13)) {
            c9750c.setZIndex(bundle.getInt(str13));
        }
        return c9750c.build();
    }

    private Bundle toBundleWithoutBitmap() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f63703a;
        if (charSequence != null) {
            bundle.putCharSequence(f63675F, charSequence);
            CharSequence charSequence2 = this.f63703a;
            if (charSequence2 instanceof Spanned) {
                ArrayList<Bundle> arrayListBundleCustomSpans = ld3.bundleCustomSpans((Spanned) charSequence2);
                if (!arrayListBundleCustomSpans.isEmpty()) {
                    bundle.putParcelableArrayList(f63676G, arrayListBundleCustomSpans);
                }
            }
        }
        bundle.putSerializable(f63677H, this.f63704b);
        bundle.putSerializable(f63678I, this.f63705c);
        bundle.putFloat(f63681L, this.f63707e);
        bundle.putInt(f63682M, this.f63708f);
        bundle.putInt(f63683N, this.f63709g);
        bundle.putFloat(f63684O, this.f63710h);
        bundle.putInt(f63685P, this.f63711i);
        bundle.putInt(f63686Q, this.f63716n);
        bundle.putFloat(f63687R, this.f63717o);
        bundle.putFloat(f63688S, this.f63712j);
        bundle.putFloat(f63689T, this.f63713k);
        bundle.putBoolean(f63691V, this.f63714l);
        bundle.putInt(f63690U, this.f63715m);
        bundle.putInt(f63692W, this.f63718p);
        bundle.putFloat(f63693X, this.f63719q);
        bundle.putInt(f63694Y, this.f63720r);
        return bundle;
    }

    @ovh
    public C9750c buildUpon() {
        return new C9750c();
    }

    public boolean equals(@hib Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || n93.class != obj.getClass()) {
            return false;
        }
        n93 n93Var = (n93) obj;
        return TextUtils.equals(this.f63703a, n93Var.f63703a) && this.f63704b == n93Var.f63704b && this.f63705c == n93Var.f63705c && ((bitmap = this.f63706d) != null ? !((bitmap2 = n93Var.f63706d) == null || !bitmap.sameAs(bitmap2)) : n93Var.f63706d == null) && this.f63707e == n93Var.f63707e && this.f63708f == n93Var.f63708f && this.f63709g == n93Var.f63709g && this.f63710h == n93Var.f63710h && this.f63711i == n93Var.f63711i && this.f63712j == n93Var.f63712j && this.f63713k == n93Var.f63713k && this.f63714l == n93Var.f63714l && this.f63715m == n93Var.f63715m && this.f63716n == n93Var.f63716n && this.f63717o == n93Var.f63717o && this.f63718p == n93Var.f63718p && this.f63719q == n93Var.f63719q && this.f63720r == n93Var.f63720r;
    }

    public int hashCode() {
        return Objects.hash(this.f63703a, this.f63704b, this.f63705c, this.f63706d, Float.valueOf(this.f63707e), Integer.valueOf(this.f63708f), Integer.valueOf(this.f63709g), Float.valueOf(this.f63710h), Integer.valueOf(this.f63711i), Float.valueOf(this.f63712j), Float.valueOf(this.f63713k), Boolean.valueOf(this.f63714l), Integer.valueOf(this.f63715m), Integer.valueOf(this.f63716n), Float.valueOf(this.f63717o), Integer.valueOf(this.f63718p), Float.valueOf(this.f63719q), Integer.valueOf(this.f63720r));
    }

    @ovh
    public Bundle toBinderBasedBundle() {
        Bundle bundleWithoutBitmap = toBundleWithoutBitmap();
        Bitmap bitmap = this.f63706d;
        if (bitmap != null) {
            bundleWithoutBitmap.putParcelable(f63679J, bitmap);
        }
        return bundleWithoutBitmap;
    }

    @ovh
    @Deprecated
    public Bundle toBundle() {
        return toBinderBasedBundle();
    }

    @ovh
    public Bundle toSerializableBundle() {
        Bundle bundleWithoutBitmap = toBundleWithoutBitmap();
        if (this.f63706d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            v80.checkState(this.f63706d.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundleWithoutBitmap.putByteArray(f63680K, byteArrayOutputStream.toByteArray());
        }
        return bundleWithoutBitmap;
    }

    private n93(@hib CharSequence charSequence, @hib Layout.Alignment alignment, @hib Layout.Alignment alignment2, @hib Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6, int i7) {
        if (charSequence == null) {
            v80.checkNotNull(bitmap);
        } else {
            v80.checkArgument(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f63703a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f63703a = charSequence.toString();
        } else {
            this.f63703a = null;
        }
        this.f63704b = alignment;
        this.f63705c = alignment2;
        this.f63706d = bitmap;
        this.f63707e = f;
        this.f63708f = i;
        this.f63709g = i2;
        this.f63710h = f2;
        this.f63711i = i3;
        this.f63712j = f4;
        this.f63713k = f5;
        this.f63714l = z;
        this.f63715m = i5;
        this.f63716n = i4;
        this.f63717o = f3;
        this.f63718p = i6;
        this.f63719q = f6;
        this.f63720r = i7;
    }
}
