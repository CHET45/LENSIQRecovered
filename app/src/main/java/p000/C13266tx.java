package p000;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.Xml;
import androidx.appcompat.resources.C0437R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000.q2g;
import p000.qd2;
import p000.zp4;

/* JADX INFO: renamed from: tx */
/* JADX INFO: loaded from: classes.dex */
public class C13266tx extends q2g implements p2h {

    /* JADX INFO: renamed from: e2 */
    public static final String f86217e2 = "tx";

    /* JADX INFO: renamed from: f2 */
    public static final String f86218f2 = "transition";

    /* JADX INFO: renamed from: g2 */
    public static final String f86219g2 = "item";

    /* JADX INFO: renamed from: h2 */
    public static final String f86220h2 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";

    /* JADX INFO: renamed from: i2 */
    public static final String f86221i2 = ": <transition> tag requires 'fromId' & 'toId' attributes";

    /* JADX INFO: renamed from: j2 */
    public static final String f86222j2 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";

    /* JADX INFO: renamed from: Z1 */
    public c f86223Z1;

    /* JADX INFO: renamed from: a2 */
    public g f86224a2;

    /* JADX INFO: renamed from: b2 */
    public int f86225b2;

    /* JADX INFO: renamed from: c2 */
    public int f86226c2;

    /* JADX INFO: renamed from: d2 */
    public boolean f86227d2;

    /* JADX INFO: renamed from: tx$b */
    public static class b extends g {

        /* JADX INFO: renamed from: a */
        public final Animatable f86228a;

        public b(Animatable animatable) {
            super();
            this.f86228a = animatable;
        }

        @Override // p000.C13266tx.g
        public void start() {
            this.f86228a.start();
        }

        @Override // p000.C13266tx.g
        public void stop() {
            this.f86228a.stop();
        }
    }

    /* JADX INFO: renamed from: tx$c */
    public static class c extends q2g.C11281a {

        /* JADX INFO: renamed from: M */
        public static final long f86229M = 4294967296L;

        /* JADX INFO: renamed from: N */
        public static final long f86230N = 8589934592L;

        /* JADX INFO: renamed from: K */
        public zl9<Long> f86231K;

        /* JADX INFO: renamed from: L */
        public mxf<Integer> f86232L;

        public c(@hib c cVar, @efb C13266tx c13266tx, @hib Resources resources) {
            super(cVar, c13266tx, resources);
            if (cVar != null) {
                this.f86231K = cVar.f86231K;
                this.f86232L = cVar.f86232L;
            } else {
                this.f86231K = new zl9<>();
                this.f86232L = new mxf<>();
            }
        }

        private static long generateTransitionKey(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        @Override // p000.q2g.C11281a, p000.zp4.AbstractC16210d
        /* JADX INFO: renamed from: f */
        public void mo20028f() {
            this.f86231K = this.f86231K.clone();
            this.f86232L = this.f86232L.clone();
        }

        /* JADX INFO: renamed from: k */
        public int m22891k(@efb int[] iArr, @efb Drawable drawable, int i) {
            int iM20029i = super.m20029i(iArr, drawable);
            this.f86232L.put(iM20029i, Integer.valueOf(i));
            return iM20029i;
        }

        /* JADX INFO: renamed from: l */
        public int m22892l(int i, int i2, @efb Drawable drawable, boolean z) {
            int iAddChild = super.addChild(drawable);
            long jGenerateTransitionKey = generateTransitionKey(i, i2);
            long j = z ? 8589934592L : 0L;
            long j2 = iAddChild;
            this.f86231K.append(jGenerateTransitionKey, Long.valueOf(j2 | j));
            if (z) {
                this.f86231K.append(generateTransitionKey(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return iAddChild;
        }

        /* JADX INFO: renamed from: m */
        public int m22893m(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f86232L.get(i, 0).intValue();
        }

        /* JADX INFO: renamed from: n */
        public int m22894n(@efb int[] iArr) {
            int iM20030j = super.m20030j(iArr);
            return iM20030j >= 0 ? iM20030j : super.m20030j(StateSet.WILD_CARD);
        }

        @Override // p000.q2g.C11281a, android.graphics.drawable.Drawable.ConstantState
        @efb
        public Drawable newDrawable() {
            return new C13266tx(this, null);
        }

        /* JADX INFO: renamed from: o */
        public int m22895o(int i, int i2) {
            return (int) this.f86231K.get(generateTransitionKey(i, i2), -1L).longValue();
        }

        /* JADX INFO: renamed from: p */
        public boolean m22896p(int i, int i2) {
            return (this.f86231K.get(generateTransitionKey(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        /* JADX INFO: renamed from: q */
        public boolean m22897q(int i, int i2) {
            return (this.f86231K.get(generateTransitionKey(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // p000.q2g.C11281a, android.graphics.drawable.Drawable.ConstantState
        @efb
        public Drawable newDrawable(Resources resources) {
            return new C13266tx(this, resources);
        }
    }

    /* JADX INFO: renamed from: tx$d */
    public static class d extends g {

        /* JADX INFO: renamed from: a */
        public final C13752ux f86233a;

        public d(C13752ux c13752ux) {
            super();
            this.f86233a = c13752ux;
        }

        @Override // p000.C13266tx.g
        public void start() {
            this.f86233a.start();
        }

        @Override // p000.C13266tx.g
        public void stop() {
            this.f86233a.stop();
        }
    }

    /* JADX INFO: renamed from: tx$e */
    public static class e extends g {

        /* JADX INFO: renamed from: a */
        public final ObjectAnimator f86234a;

        /* JADX INFO: renamed from: b */
        public final boolean f86235b;

        public e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            qd2.C11436b.setAutoCancel(objectAnimatorOfInt, true);
            objectAnimatorOfInt.setDuration(fVar.m22898a());
            objectAnimatorOfInt.setInterpolator(fVar);
            this.f86235b = z2;
            this.f86234a = objectAnimatorOfInt;
        }

        @Override // p000.C13266tx.g
        public boolean canReverse() {
            return this.f86235b;
        }

        @Override // p000.C13266tx.g
        public void reverse() {
            this.f86234a.reverse();
        }

        @Override // p000.C13266tx.g
        public void start() {
            this.f86234a.start();
        }

        @Override // p000.C13266tx.g
        public void stop() {
            this.f86234a.cancel();
        }
    }

    /* JADX INFO: renamed from: tx$f */
    public static class f implements TimeInterpolator {

        /* JADX INFO: renamed from: a */
        public int[] f86236a;

        /* JADX INFO: renamed from: b */
        public int f86237b;

        /* JADX INFO: renamed from: c */
        public int f86238c;

        public f(AnimationDrawable animationDrawable, boolean z) {
            m22899b(animationDrawable, z);
        }

        /* JADX INFO: renamed from: a */
        public int m22898a() {
            return this.f86238c;
        }

        /* JADX INFO: renamed from: b */
        public int m22899b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f86237b = numberOfFrames;
            int[] iArr = this.f86236a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f86236a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f86236a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f86238c = i;
            return i;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i = (int) ((f * this.f86238c) + 0.5f);
            int i2 = this.f86237b;
            int[] iArr = this.f86236a;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = iArr[i3];
                if (i < i4) {
                    break;
                }
                i -= i4;
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.f86238c : 0.0f);
        }
    }

    /* JADX INFO: renamed from: tx$g */
    public static abstract class g {
        private g() {
        }

        public boolean canReverse() {
            return false;
        }

        public void reverse() {
        }

        public abstract void start();

        public abstract void stop();
    }

    public C13266tx() {
        this(null, null);
    }

    @hib
    public static C13266tx create(@efb Context context, @gq4 int i, @hib Resources.Theme theme) {
        int next;
        try {
            Resources resources = context.getResources();
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return createFromXmlInner(context, resources, xml, attributeSetAsAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e2) {
            Log.e(f86217e2, "parser error", e2);
            return null;
        } catch (XmlPullParserException e3) {
            Log.e(f86217e2, "parser error", e3);
            return null;
        }
    }

    @efb
    public static C13266tx createFromXmlInner(@efb Context context, @efb Resources resources, @efb XmlPullParser xmlPullParser, @efb AttributeSet attributeSet, @hib Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C13266tx c13266tx = new C13266tx();
            c13266tx.inflate(context, resources, xmlPullParser, attributeSet, theme);
            return c13266tx;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void inflateChildElements(@efb Context context, @efb Resources resources, @efb XmlPullParser xmlPullParser, @efb AttributeSet attributeSet, @hib Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    parseItem(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals(f86218f2)) {
                    parseTransition(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    private void init() {
        onStateChange(getState());
    }

    private int parseItem(@efb Context context, @efb Resources resources, @efb XmlPullParser xmlPullParser, @efb AttributeSet attributeSet, @hib Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayObtainAttributes = vmh.obtainAttributes(resources, theme, attributeSet, C0437R.styleable.AnimatedStateListDrawableItem);
        int resourceId = typedArrayObtainAttributes.getResourceId(C0437R.styleable.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = typedArrayObtainAttributes.getResourceId(C0437R.styleable.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable drawable = resourceId2 > 0 ? n6e.get().getDrawable(context, resourceId2) : null;
        typedArrayObtainAttributes.recycle();
        int[] iArrM20022k = m20022k(attributeSet);
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f86222j2);
            }
            drawable = xmlPullParser.getName().equals(i3i.f45632Y) ? i3i.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : qd2.C11437c.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawable != null) {
            return this.f86223Z1.m22891k(iArrM20022k, drawable, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f86222j2);
    }

    private int parseTransition(@efb Context context, @efb Resources resources, @efb XmlPullParser xmlPullParser, @efb AttributeSet attributeSet, @hib Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayObtainAttributes = vmh.obtainAttributes(resources, theme, attributeSet, C0437R.styleable.AnimatedStateListDrawableTransition);
        int resourceId = typedArrayObtainAttributes.getResourceId(C0437R.styleable.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = typedArrayObtainAttributes.getResourceId(C0437R.styleable.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = typedArrayObtainAttributes.getResourceId(C0437R.styleable.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable drawable = resourceId3 > 0 ? n6e.get().getDrawable(context, resourceId3) : null;
        boolean z = typedArrayObtainAttributes.getBoolean(C0437R.styleable.AnimatedStateListDrawableTransition_android_reversible, false);
        typedArrayObtainAttributes.recycle();
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f86220h2);
            }
            drawable = xmlPullParser.getName().equals(C13752ux.f89302H) ? C13752ux.createFromXmlInner(context, resources, xmlPullParser, attributeSet, theme) : qd2.C11437c.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawable == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f86220h2);
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.f86223Z1.m22892l(resourceId, resourceId2, drawable, z);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + f86221i2);
    }

    private boolean selectTransition(int i) {
        int iM26934d;
        int iM22895o;
        g bVar;
        g gVar = this.f86224a2;
        if (gVar == null) {
            iM26934d = m26934d();
        } else {
            if (i == this.f86225b2) {
                return true;
            }
            if (i == this.f86226c2 && gVar.canReverse()) {
                gVar.reverse();
                this.f86225b2 = this.f86226c2;
                this.f86226c2 = i;
                return true;
            }
            iM26934d = this.f86225b2;
            gVar.stop();
        }
        this.f86224a2 = null;
        this.f86226c2 = -1;
        this.f86225b2 = -1;
        c cVar = this.f86223Z1;
        int iM22893m = cVar.m22893m(iM26934d);
        int iM22893m2 = cVar.m22893m(i);
        if (iM22893m2 == 0 || iM22893m == 0 || (iM22895o = cVar.m22895o(iM22893m, iM22893m2)) < 0) {
            return false;
        }
        boolean zM22897q = cVar.m22897q(iM22893m, iM22893m2);
        m26935f(iM22895o);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.m22896p(iM22893m, iM22893m2), zM22897q);
        } else {
            if (!(current instanceof C13752ux)) {
                if (current instanceof Animatable) {
                    bVar = new b((Animatable) current);
                }
                return false;
            }
            bVar = new d((C13752ux) current);
        }
        bVar.start();
        this.f86224a2 = bVar;
        this.f86226c2 = iM26934d;
        this.f86225b2 = i;
        return true;
    }

    private void updateStateFromTypedArray(TypedArray typedArray) {
        c cVar = this.f86223Z1;
        cVar.f105677d |= qd2.C11437c.getChangingConfigurations(typedArray);
        cVar.setVariablePadding(typedArray.getBoolean(C0437R.styleable.AnimatedStateListDrawableCompat_android_variablePadding, cVar.f105682i));
        cVar.setConstantSize(typedArray.getBoolean(C0437R.styleable.AnimatedStateListDrawableCompat_android_constantSize, cVar.f105685l));
        cVar.setEnterFadeDuration(typedArray.getInt(C0437R.styleable.AnimatedStateListDrawableCompat_android_enterFadeDuration, cVar.f105665A));
        cVar.setExitFadeDuration(typedArray.getInt(C0437R.styleable.AnimatedStateListDrawableCompat_android_exitFadeDuration, cVar.f105666B));
        setDither(typedArray.getBoolean(C0437R.styleable.AnimatedStateListDrawableCompat_android_dither, cVar.f105697x));
    }

    public void addState(@efb int[] iArr, @efb Drawable drawable, int i) {
        pkb.requireNonNull(drawable);
        this.f86223Z1.m22891k(iArr, drawable, i);
        onStateChange(getState());
    }

    public <T extends Drawable & Animatable> void addTransition(int i, int i2, @efb T t, boolean z) {
        pkb.requireNonNull(t);
        this.f86223Z1.m22892l(i, i2, t, z);
    }

    @Override // p000.q2g, p000.zp4
    /* JADX INFO: renamed from: b */
    public void mo20018b() {
        super.mo20018b();
        this.f86227d2 = false;
    }

    @Override // p000.q2g, p000.zp4
    /* JADX INFO: renamed from: g */
    public void mo20020g(@efb zp4.AbstractC16210d abstractC16210d) {
        super.mo20020g(abstractC16210d);
        if (abstractC16210d instanceof c) {
            this.f86223Z1 = (c) abstractC16210d;
        }
    }

    @Override // p000.q2g
    public void inflate(@efb Context context, @efb Resources resources, @efb XmlPullParser xmlPullParser, @efb AttributeSet attributeSet, @hib Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = vmh.obtainAttributes(resources, theme, attributeSet, C0437R.styleable.AnimatedStateListDrawableCompat);
        setVisible(typedArrayObtainAttributes.getBoolean(C0437R.styleable.AnimatedStateListDrawableCompat_android_visible, true), true);
        updateStateFromTypedArray(typedArrayObtainAttributes);
        m26937i(resources);
        typedArrayObtainAttributes.recycle();
        inflateChildElements(context, resources, xmlPullParser, attributeSet, theme);
        init();
    }

    @Override // p000.q2g, p000.zp4, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p000.zp4, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f86224a2;
        if (gVar != null) {
            gVar.stop();
            this.f86224a2 = null;
            m26935f(this.f86225b2);
            this.f86225b2 = -1;
            this.f86226c2 = -1;
        }
    }

    @Override // p000.q2g, p000.zp4, android.graphics.drawable.Drawable
    @efb
    public Drawable mutate() {
        if (!this.f86227d2 && super.mutate() == this) {
            this.f86223Z1.mo20028f();
            this.f86227d2 = true;
        }
        return this;
    }

    @Override // p000.q2g, p000.zp4, android.graphics.drawable.Drawable
    public boolean onStateChange(@efb int[] iArr) {
        int iM22894n = this.f86223Z1.m22894n(iArr);
        boolean z = iM22894n != m26934d() && (selectTransition(iM22894n) || m26935f(iM22894n));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    @Override // p000.q2g
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public c mo20021j() {
        return new c(this.f86223Z1, this, null);
    }

    @Override // p000.zp4, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        g gVar = this.f86224a2;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.start();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public C13266tx(@hib c cVar, @hib Resources resources) {
        super(null);
        this.f86225b2 = -1;
        this.f86226c2 = -1;
        mo20020g(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
