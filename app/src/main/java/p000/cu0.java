package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.util.Map;
import p000.cu0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class cu0<T extends cu0<T>> implements Cloneable {

    /* JADX INFO: renamed from: A2 */
    public static final int f27543A2 = 1048576;

    /* JADX INFO: renamed from: g2 */
    public static final int f27544g2 = -1;

    /* JADX INFO: renamed from: h2 */
    public static final int f27545h2 = 2;

    /* JADX INFO: renamed from: i2 */
    public static final int f27546i2 = 4;

    /* JADX INFO: renamed from: j2 */
    public static final int f27547j2 = 8;

    /* JADX INFO: renamed from: k2 */
    public static final int f27548k2 = 16;

    /* JADX INFO: renamed from: l2 */
    public static final int f27549l2 = 32;

    /* JADX INFO: renamed from: m2 */
    public static final int f27550m2 = 64;

    /* JADX INFO: renamed from: n2 */
    public static final int f27551n2 = 128;

    /* JADX INFO: renamed from: o2 */
    public static final int f27552o2 = 256;

    /* JADX INFO: renamed from: p2 */
    public static final int f27553p2 = 512;

    /* JADX INFO: renamed from: q2 */
    public static final int f27554q2 = 1024;

    /* JADX INFO: renamed from: r2 */
    public static final int f27555r2 = 2048;

    /* JADX INFO: renamed from: s2 */
    public static final int f27556s2 = 4096;

    /* JADX INFO: renamed from: t2 */
    public static final int f27557t2 = 8192;

    /* JADX INFO: renamed from: u2 */
    public static final int f27558u2 = 16384;

    /* JADX INFO: renamed from: v2 */
    public static final int f27559v2 = 32768;

    /* JADX INFO: renamed from: w2 */
    public static final int f27560w2 = 65536;

    /* JADX INFO: renamed from: x2 */
    public static final int f27561x2 = 131072;

    /* JADX INFO: renamed from: y2 */
    public static final int f27562y2 = 262144;

    /* JADX INFO: renamed from: z2 */
    public static final int f27563z2 = 524288;

    /* JADX INFO: renamed from: C */
    public int f27564C;

    /* JADX INFO: renamed from: N */
    public boolean f27570N;

    /* JADX INFO: renamed from: X */
    @hib
    public Drawable f27573X;

    /* JADX INFO: renamed from: Y */
    public int f27574Y;

    /* JADX INFO: renamed from: Z1 */
    public boolean f27576Z1;

    /* JADX INFO: renamed from: a */
    public int f27577a;

    /* JADX INFO: renamed from: a2 */
    @hib
    public Resources.Theme f27578a2;

    /* JADX INFO: renamed from: b2 */
    public boolean f27580b2;

    /* JADX INFO: renamed from: c2 */
    public boolean f27582c2;

    /* JADX INFO: renamed from: d2 */
    public boolean f27584d2;

    /* JADX INFO: renamed from: e */
    @hib
    public Drawable f27585e;

    /* JADX INFO: renamed from: f */
    public int f27587f;

    /* JADX INFO: renamed from: f2 */
    public boolean f27588f2;

    /* JADX INFO: renamed from: m */
    @hib
    public Drawable f27589m;

    /* JADX INFO: renamed from: b */
    public float f27579b = 1.0f;

    /* JADX INFO: renamed from: c */
    @efb
    public ne4 f27581c = ne4.f64121e;

    /* JADX INFO: renamed from: d */
    @efb
    public Priority f27583d = Priority.NORMAL;

    /* JADX INFO: renamed from: F */
    public boolean f27565F = true;

    /* JADX INFO: renamed from: H */
    public int f27566H = -1;

    /* JADX INFO: renamed from: L */
    public int f27567L = -1;

    /* JADX INFO: renamed from: M */
    @efb
    public eq8 f27568M = v05.obtain();

    /* JADX INFO: renamed from: Q */
    public boolean f27571Q = true;

    /* JADX INFO: renamed from: Z */
    @efb
    public i7c f27575Z = new i7c();

    /* JADX INFO: renamed from: M1 */
    @efb
    public Map<Class<?>, ceh<?>> f27569M1 = new wm1();

    /* JADX INFO: renamed from: V1 */
    @efb
    public Class<?> f27572V1 = Object.class;

    /* JADX INFO: renamed from: e2 */
    public boolean f27586e2 = true;

    private static boolean isSet(int i, int i2) {
        return (i & i2) != 0;
    }

    @efb
    private T optionalScaleOnlyTransform(@efb hn4 hn4Var, @efb ceh<Bitmap> cehVar) {
        return (T) scaleOnlyTransform(hn4Var, cehVar, false);
    }

    @efb
    private T scaleOnlyTransform(@efb hn4 hn4Var, @efb ceh<Bitmap> cehVar) {
        return (T) scaleOnlyTransform(hn4Var, cehVar, true);
    }

    private T self() {
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8692a() {
        return this.f27580b2;
    }

    @efb
    @yx1
    public T apply(@efb cu0<?> cu0Var) {
        if (this.f27580b2) {
            return (T) mo28231clone().apply(cu0Var);
        }
        if (isSet(cu0Var.f27577a, 2)) {
            this.f27579b = cu0Var.f27579b;
        }
        if (isSet(cu0Var.f27577a, 262144)) {
            this.f27582c2 = cu0Var.f27582c2;
        }
        if (isSet(cu0Var.f27577a, 1048576)) {
            this.f27588f2 = cu0Var.f27588f2;
        }
        if (isSet(cu0Var.f27577a, 4)) {
            this.f27581c = cu0Var.f27581c;
        }
        if (isSet(cu0Var.f27577a, 8)) {
            this.f27583d = cu0Var.f27583d;
        }
        if (isSet(cu0Var.f27577a, 16)) {
            this.f27585e = cu0Var.f27585e;
            this.f27587f = 0;
            this.f27577a &= -33;
        }
        if (isSet(cu0Var.f27577a, 32)) {
            this.f27587f = cu0Var.f27587f;
            this.f27585e = null;
            this.f27577a &= -17;
        }
        if (isSet(cu0Var.f27577a, 64)) {
            this.f27589m = cu0Var.f27589m;
            this.f27564C = 0;
            this.f27577a &= -129;
        }
        if (isSet(cu0Var.f27577a, 128)) {
            this.f27564C = cu0Var.f27564C;
            this.f27589m = null;
            this.f27577a &= -65;
        }
        if (isSet(cu0Var.f27577a, 256)) {
            this.f27565F = cu0Var.f27565F;
        }
        if (isSet(cu0Var.f27577a, 512)) {
            this.f27567L = cu0Var.f27567L;
            this.f27566H = cu0Var.f27566H;
        }
        if (isSet(cu0Var.f27577a, 1024)) {
            this.f27568M = cu0Var.f27568M;
        }
        if (isSet(cu0Var.f27577a, 4096)) {
            this.f27572V1 = cu0Var.f27572V1;
        }
        if (isSet(cu0Var.f27577a, 8192)) {
            this.f27573X = cu0Var.f27573X;
            this.f27574Y = 0;
            this.f27577a &= -16385;
        }
        if (isSet(cu0Var.f27577a, 16384)) {
            this.f27574Y = cu0Var.f27574Y;
            this.f27573X = null;
            this.f27577a &= -8193;
        }
        if (isSet(cu0Var.f27577a, 32768)) {
            this.f27578a2 = cu0Var.f27578a2;
        }
        if (isSet(cu0Var.f27577a, 65536)) {
            this.f27571Q = cu0Var.f27571Q;
        }
        if (isSet(cu0Var.f27577a, 131072)) {
            this.f27570N = cu0Var.f27570N;
        }
        if (isSet(cu0Var.f27577a, 2048)) {
            this.f27569M1.putAll(cu0Var.f27569M1);
            this.f27586e2 = cu0Var.f27586e2;
        }
        if (isSet(cu0Var.f27577a, 524288)) {
            this.f27584d2 = cu0Var.f27584d2;
        }
        if (!this.f27571Q) {
            this.f27569M1.clear();
            int i = this.f27577a;
            this.f27570N = false;
            this.f27577a = i & (-133121);
            this.f27586e2 = true;
        }
        this.f27577a |= cu0Var.f27577a;
        this.f27575Z.putAll(cu0Var.f27575Z);
        return (T) m8695d();
    }

    @efb
    public T autoClone() {
        if (this.f27576Z1 && !this.f27580b2) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f27580b2 = true;
        return (T) lock();
    }

    /* JADX INFO: renamed from: b */
    public boolean m8693b() {
        return this.f27586e2;
    }

    @efb
    /* JADX INFO: renamed from: c */
    public final T m8694c(@efb hn4 hn4Var, @efb ceh<Bitmap> cehVar) {
        if (this.f27580b2) {
            return (T) mo28231clone().m8694c(hn4Var, cehVar);
        }
        downsample(hn4Var);
        return (T) m8697f(cehVar, false);
    }

    @efb
    @yx1
    public T centerCrop() {
        return (T) m8696e(hn4.f44196e, new mt1());
    }

    @efb
    @yx1
    public T centerInside() {
        return (T) scaleOnlyTransform(hn4.f44195d, new nt1());
    }

    @efb
    @yx1
    public T circleCrop() {
        return (T) m8696e(hn4.f44195d, new xz1());
    }

    @efb
    /* JADX INFO: renamed from: d */
    public final T m8695d() {
        if (this.f27576Z1) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return (T) self();
    }

    @efb
    @yx1
    public T decode(@efb Class<?> cls) {
        if (this.f27580b2) {
            return (T) mo28231clone().decode(cls);
        }
        this.f27572V1 = (Class) t7d.checkNotNull(cls);
        this.f27577a |= 4096;
        return (T) m8695d();
    }

    @efb
    @yx1
    public T disallowHardwareConfig() {
        return (T) set(in4.f47584k, Boolean.FALSE);
    }

    @efb
    @yx1
    public T diskCacheStrategy(@efb ne4 ne4Var) {
        if (this.f27580b2) {
            return (T) mo28231clone().diskCacheStrategy(ne4Var);
        }
        this.f27581c = (ne4) t7d.checkNotNull(ne4Var);
        this.f27577a |= 4;
        return (T) m8695d();
    }

    @efb
    @yx1
    public T dontAnimate() {
        return (T) set(n67.f63384b, Boolean.TRUE);
    }

    @efb
    @yx1
    public T dontTransform() {
        if (this.f27580b2) {
            return (T) mo28231clone().dontTransform();
        }
        this.f27569M1.clear();
        int i = this.f27577a;
        this.f27570N = false;
        this.f27571Q = false;
        this.f27577a = (i & (-133121)) | 65536;
        this.f27586e2 = true;
        return (T) m8695d();
    }

    @efb
    @yx1
    public T downsample(@efb hn4 hn4Var) {
        return (T) set(hn4.f44199h, t7d.checkNotNull(hn4Var));
    }

    @efb
    @yx1
    /* JADX INFO: renamed from: e */
    public final T m8696e(@efb hn4 hn4Var, @efb ceh<Bitmap> cehVar) {
        if (this.f27580b2) {
            return (T) mo28231clone().m8696e(hn4Var, cehVar);
        }
        downsample(hn4Var);
        return (T) transform(cehVar);
    }

    @efb
    @yx1
    public T encodeFormat(@efb Bitmap.CompressFormat compressFormat) {
        return (T) set(s31.f80485c, t7d.checkNotNull(compressFormat));
    }

    @efb
    @yx1
    public T encodeQuality(@h78(from = 0, m12174to = 100) int i) {
        return (T) set(s31.f80484b, Integer.valueOf(i));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof cu0)) {
            return false;
        }
        cu0 cu0Var = (cu0) obj;
        return Float.compare(cu0Var.f27579b, this.f27579b) == 0 && this.f27587f == cu0Var.f27587f && v0i.bothNullOrEqual(this.f27585e, cu0Var.f27585e) && this.f27564C == cu0Var.f27564C && v0i.bothNullOrEqual(this.f27589m, cu0Var.f27589m) && this.f27574Y == cu0Var.f27574Y && v0i.bothNullOrEqual(this.f27573X, cu0Var.f27573X) && this.f27565F == cu0Var.f27565F && this.f27566H == cu0Var.f27566H && this.f27567L == cu0Var.f27567L && this.f27570N == cu0Var.f27570N && this.f27571Q == cu0Var.f27571Q && this.f27582c2 == cu0Var.f27582c2 && this.f27584d2 == cu0Var.f27584d2 && this.f27581c.equals(cu0Var.f27581c) && this.f27583d == cu0Var.f27583d && this.f27575Z.equals(cu0Var.f27575Z) && this.f27569M1.equals(cu0Var.f27569M1) && this.f27572V1.equals(cu0Var.f27572V1) && v0i.bothNullOrEqual(this.f27568M, cu0Var.f27568M) && v0i.bothNullOrEqual(this.f27578a2, cu0Var.f27578a2);
    }

    @efb
    @yx1
    public T error(@hib Drawable drawable) {
        if (this.f27580b2) {
            return (T) mo28231clone().error(drawable);
        }
        this.f27585e = drawable;
        int i = this.f27577a | 16;
        this.f27587f = 0;
        this.f27577a = i & (-33);
        return (T) m8695d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @efb
    /* JADX INFO: renamed from: f */
    public T m8697f(@efb ceh<Bitmap> cehVar, boolean z) {
        if (this.f27580b2) {
            return (T) mo28231clone().m8697f(cehVar, z);
        }
        kq4 kq4Var = new kq4(cehVar, z);
        m8698g(Bitmap.class, cehVar, z);
        m8698g(Drawable.class, kq4Var, z);
        m8698g(BitmapDrawable.class, kq4Var.asBitmapDrawable(), z);
        m8698g(GifDrawable.class, new j67(cehVar), z);
        return (T) m8695d();
    }

    @efb
    @yx1
    public T fallback(@hib Drawable drawable) {
        if (this.f27580b2) {
            return (T) mo28231clone().fallback(drawable);
        }
        this.f27573X = drawable;
        int i = this.f27577a | 8192;
        this.f27574Y = 0;
        this.f27577a = i & (-16385);
        return (T) m8695d();
    }

    @efb
    @yx1
    public T fitCenter() {
        return (T) scaleOnlyTransform(hn4.f44194c, new n16());
    }

    @efb
    @yx1
    public T format(@efb bl3 bl3Var) {
        t7d.checkNotNull(bl3Var);
        return (T) set(in4.f47580g, bl3Var).set(n67.f63383a, bl3Var);
    }

    @efb
    @yx1
    public T frame(@h78(from = 0) long j) {
        return (T) set(f6i.f35537g, Long.valueOf(j));
    }

    @efb
    /* JADX INFO: renamed from: g */
    public <Y> T m8698g(@efb Class<Y> cls, @efb ceh<Y> cehVar, boolean z) {
        if (this.f27580b2) {
            return (T) mo28231clone().m8698g(cls, cehVar, z);
        }
        t7d.checkNotNull(cls);
        t7d.checkNotNull(cehVar);
        this.f27569M1.put(cls, cehVar);
        int i = this.f27577a;
        this.f27571Q = true;
        this.f27577a = 67584 | i;
        this.f27586e2 = false;
        if (z) {
            this.f27577a = i | 198656;
            this.f27570N = true;
        }
        return (T) m8695d();
    }

    @efb
    public final ne4 getDiskCacheStrategy() {
        return this.f27581c;
    }

    public final int getErrorId() {
        return this.f27587f;
    }

    @hib
    public final Drawable getErrorPlaceholder() {
        return this.f27585e;
    }

    @hib
    public final Drawable getFallbackDrawable() {
        return this.f27573X;
    }

    public final int getFallbackId() {
        return this.f27574Y;
    }

    public final boolean getOnlyRetrieveFromCache() {
        return this.f27584d2;
    }

    @efb
    public final i7c getOptions() {
        return this.f27575Z;
    }

    public final int getOverrideHeight() {
        return this.f27566H;
    }

    public final int getOverrideWidth() {
        return this.f27567L;
    }

    @hib
    public final Drawable getPlaceholderDrawable() {
        return this.f27589m;
    }

    public final int getPlaceholderId() {
        return this.f27564C;
    }

    @efb
    public final Priority getPriority() {
        return this.f27583d;
    }

    @efb
    public final Class<?> getResourceClass() {
        return this.f27572V1;
    }

    @efb
    public final eq8 getSignature() {
        return this.f27568M;
    }

    public final float getSizeMultiplier() {
        return this.f27579b;
    }

    @hib
    public final Resources.Theme getTheme() {
        return this.f27578a2;
    }

    @efb
    public final Map<Class<?>, ceh<?>> getTransformations() {
        return this.f27569M1;
    }

    public final boolean getUseAnimationPool() {
        return this.f27588f2;
    }

    public final boolean getUseUnlimitedSourceGeneratorsPool() {
        return this.f27582c2;
    }

    public int hashCode() {
        return v0i.hashCode(this.f27578a2, v0i.hashCode(this.f27568M, v0i.hashCode(this.f27572V1, v0i.hashCode(this.f27569M1, v0i.hashCode(this.f27575Z, v0i.hashCode(this.f27583d, v0i.hashCode(this.f27581c, v0i.hashCode(this.f27584d2, v0i.hashCode(this.f27582c2, v0i.hashCode(this.f27571Q, v0i.hashCode(this.f27570N, v0i.hashCode(this.f27567L, v0i.hashCode(this.f27566H, v0i.hashCode(this.f27565F, v0i.hashCode(this.f27573X, v0i.hashCode(this.f27574Y, v0i.hashCode(this.f27589m, v0i.hashCode(this.f27564C, v0i.hashCode(this.f27585e, v0i.hashCode(this.f27587f, v0i.hashCode(this.f27579b)))))))))))))))))))));
    }

    public final boolean isDiskCacheStrategySet() {
        return isSet(4);
    }

    public final boolean isLocked() {
        return this.f27576Z1;
    }

    public final boolean isMemoryCacheable() {
        return this.f27565F;
    }

    public final boolean isPrioritySet() {
        return isSet(8);
    }

    public final boolean isSkipMemoryCacheSet() {
        return isSet(256);
    }

    public final boolean isTransformationAllowed() {
        return this.f27571Q;
    }

    public final boolean isTransformationRequired() {
        return this.f27570N;
    }

    public final boolean isTransformationSet() {
        return isSet(2048);
    }

    public final boolean isValidOverride() {
        return v0i.isValidDimensions(this.f27567L, this.f27566H);
    }

    @efb
    public T lock() {
        this.f27576Z1 = true;
        return (T) self();
    }

    @efb
    @yx1
    public T onlyRetrieveFromCache(boolean z) {
        if (this.f27580b2) {
            return (T) mo28231clone().onlyRetrieveFromCache(z);
        }
        this.f27584d2 = z;
        this.f27577a |= 524288;
        return (T) m8695d();
    }

    @efb
    @yx1
    public T optionalCenterCrop() {
        return (T) m8694c(hn4.f44196e, new mt1());
    }

    @efb
    @yx1
    public T optionalCenterInside() {
        return (T) optionalScaleOnlyTransform(hn4.f44195d, new nt1());
    }

    @efb
    @yx1
    public T optionalCircleCrop() {
        return (T) m8694c(hn4.f44196e, new xz1());
    }

    @efb
    @yx1
    public T optionalFitCenter() {
        return (T) optionalScaleOnlyTransform(hn4.f44194c, new n16());
    }

    @efb
    @yx1
    public T optionalTransform(@efb ceh<Bitmap> cehVar) {
        return (T) m8697f(cehVar, false);
    }

    @efb
    @yx1
    public T override(int i, int i2) {
        if (this.f27580b2) {
            return (T) mo28231clone().override(i, i2);
        }
        this.f27567L = i;
        this.f27566H = i2;
        this.f27577a |= 512;
        return (T) m8695d();
    }

    @efb
    @yx1
    public T placeholder(@hib Drawable drawable) {
        if (this.f27580b2) {
            return (T) mo28231clone().placeholder(drawable);
        }
        this.f27589m = drawable;
        int i = this.f27577a | 64;
        this.f27564C = 0;
        this.f27577a = i & (-129);
        return (T) m8695d();
    }

    @efb
    @yx1
    public T priority(@efb Priority priority) {
        if (this.f27580b2) {
            return (T) mo28231clone().priority(priority);
        }
        this.f27583d = (Priority) t7d.checkNotNull(priority);
        this.f27577a |= 8;
        return (T) m8695d();
    }

    @efb
    @yx1
    public <Y> T set(@efb v6c<Y> v6cVar, @efb Y y) {
        if (this.f27580b2) {
            return (T) mo28231clone().set(v6cVar, y);
        }
        t7d.checkNotNull(v6cVar);
        t7d.checkNotNull(y);
        this.f27575Z.set(v6cVar, y);
        return (T) m8695d();
    }

    @efb
    @yx1
    public T signature(@efb eq8 eq8Var) {
        if (this.f27580b2) {
            return (T) mo28231clone().signature(eq8Var);
        }
        this.f27568M = (eq8) t7d.checkNotNull(eq8Var);
        this.f27577a |= 1024;
        return (T) m8695d();
    }

    @efb
    @yx1
    public T sizeMultiplier(@y46(from = 0.0d, m25645to = 1.0d) float f) {
        if (this.f27580b2) {
            return (T) mo28231clone().sizeMultiplier(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f27579b = f;
        this.f27577a |= 2;
        return (T) m8695d();
    }

    @efb
    @yx1
    public T skipMemoryCache(boolean z) {
        if (this.f27580b2) {
            return (T) mo28231clone().skipMemoryCache(true);
        }
        this.f27565F = !z;
        this.f27577a |= 256;
        return (T) m8695d();
    }

    @efb
    @yx1
    public T theme(@hib Resources.Theme theme) {
        if (this.f27580b2) {
            return (T) mo28231clone().theme(theme);
        }
        this.f27578a2 = theme;
        this.f27577a |= 32768;
        return (T) m8695d();
    }

    @efb
    @yx1
    public T timeout(@h78(from = 0) int i) {
        return (T) set(fo7.f37237b, Integer.valueOf(i));
    }

    @efb
    @yx1
    public T transform(@efb ceh<Bitmap> cehVar) {
        return (T) m8697f(cehVar, true);
    }

    @efb
    @yx1
    @Deprecated
    public T transforms(@efb ceh<Bitmap>... cehVarArr) {
        return (T) m8697f(new g3b(cehVarArr), true);
    }

    @efb
    @yx1
    public T useAnimationPool(boolean z) {
        if (this.f27580b2) {
            return (T) mo28231clone().useAnimationPool(z);
        }
        this.f27588f2 = z;
        this.f27577a |= 1048576;
        return (T) m8695d();
    }

    @efb
    @yx1
    public T useUnlimitedSourceGeneratorsPool(boolean z) {
        if (this.f27580b2) {
            return (T) mo28231clone().useUnlimitedSourceGeneratorsPool(z);
        }
        this.f27582c2 = z;
        this.f27577a |= 262144;
        return (T) m8695d();
    }

    private boolean isSet(int i) {
        return isSet(this.f27577a, i);
    }

    @efb
    private T scaleOnlyTransform(@efb hn4 hn4Var, @efb ceh<Bitmap> cehVar, boolean z) {
        T t = z ? (T) m8696e(hn4Var, cehVar) : (T) m8694c(hn4Var, cehVar);
        t.f27586e2 = true;
        return t;
    }

    @Override // 
    @yx1
    /* JADX INFO: renamed from: clone */
    public T mo28231clone() {
        try {
            T t = (T) super.clone();
            i7c i7cVar = new i7c();
            t.f27575Z = i7cVar;
            i7cVar.putAll(this.f27575Z);
            wm1 wm1Var = new wm1();
            t.f27569M1 = wm1Var;
            wm1Var.putAll(this.f27569M1);
            t.f27576Z1 = false;
            t.f27580b2 = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @efb
    @yx1
    public <Y> T optionalTransform(@efb Class<Y> cls, @efb ceh<Y> cehVar) {
        return (T) m8698g(cls, cehVar, false);
    }

    @efb
    @yx1
    public T transform(@efb ceh<Bitmap>... cehVarArr) {
        return cehVarArr.length > 1 ? (T) m8697f(new g3b(cehVarArr), true) : cehVarArr.length == 1 ? (T) transform(cehVarArr[0]) : (T) m8695d();
    }

    @efb
    @yx1
    public T override(int i) {
        return (T) override(i, i);
    }

    @efb
    @yx1
    public <Y> T transform(@efb Class<Y> cls, @efb ceh<Y> cehVar) {
        return (T) m8698g(cls, cehVar, true);
    }

    @efb
    @yx1
    public T error(@gq4 int i) {
        if (this.f27580b2) {
            return (T) mo28231clone().error(i);
        }
        this.f27587f = i;
        int i2 = this.f27577a | 32;
        this.f27585e = null;
        this.f27577a = i2 & (-17);
        return (T) m8695d();
    }

    @efb
    @yx1
    public T fallback(@gq4 int i) {
        if (this.f27580b2) {
            return (T) mo28231clone().fallback(i);
        }
        this.f27574Y = i;
        int i2 = this.f27577a | 16384;
        this.f27573X = null;
        this.f27577a = i2 & (-8193);
        return (T) m8695d();
    }

    @efb
    @yx1
    public T placeholder(@gq4 int i) {
        if (this.f27580b2) {
            return (T) mo28231clone().placeholder(i);
        }
        this.f27564C = i;
        int i2 = this.f27577a | 128;
        this.f27589m = null;
        this.f27577a = i2 & (-65);
        return (T) m8695d();
    }
}
