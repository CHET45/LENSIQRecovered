package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.resources.C0437R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000.qd2;
import p000.zp4;

/* JADX INFO: loaded from: classes.dex */
public class q2g extends zp4 {

    /* JADX INFO: renamed from: M1 */
    public static final String f73074M1 = "StateListDrawableCompat";

    /* JADX INFO: renamed from: V1 */
    public static final boolean f73075V1 = false;

    /* JADX INFO: renamed from: Y */
    public C11281a f73076Y;

    /* JADX INFO: renamed from: Z */
    public boolean f73077Z;

    /* JADX INFO: renamed from: q2g$a */
    public static class C11281a extends zp4.AbstractC16210d {

        /* JADX INFO: renamed from: J */
        public int[][] f73078J;

        public C11281a(C11281a c11281a, q2g q2gVar, Resources resources) {
            super(c11281a, q2gVar, resources);
            if (c11281a != null) {
                this.f73078J = c11281a.f73078J;
            } else {
                this.f73078J = new int[m26941d()][];
            }
        }

        @Override // p000.zp4.AbstractC16210d
        /* JADX INFO: renamed from: f */
        public void mo20028f() {
            int[][] iArr = this.f73078J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.f73078J[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.f73078J = iArr2;
        }

        @Override // p000.zp4.AbstractC16210d
        public void growArray(int i, int i2) {
            super.growArray(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f73078J, 0, iArr, 0, i);
            this.f73078J = iArr;
        }

        /* JADX INFO: renamed from: i */
        public int m20029i(int[] iArr, Drawable drawable) {
            int iAddChild = addChild(drawable);
            this.f73078J[iAddChild] = iArr;
            return iAddChild;
        }

        /* JADX INFO: renamed from: j */
        public int m20030j(int[] iArr) {
            int[][] iArr2 = this.f73078J;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @efb
        public Drawable newDrawable() {
            return new q2g(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @efb
        public Drawable newDrawable(Resources resources) {
            return new q2g(this, resources);
        }
    }

    public q2g() {
        this(null, null);
    }

    private void inflateChildElements(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        C11281a c11281a = this.f73076Y;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next2 == 3) {
                return;
            }
            if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayObtainAttributes = vmh.obtainAttributes(resources, theme, attributeSet, C0437R.styleable.StateListDrawableItem);
                int resourceId = typedArrayObtainAttributes.getResourceId(C0437R.styleable.StateListDrawableItem_android_drawable, -1);
                Drawable drawable = resourceId > 0 ? n6e.get().getDrawable(context, resourceId) : null;
                typedArrayObtainAttributes.recycle();
                int[] iArrM20022k = m20022k(attributeSet);
                if (drawable == null) {
                    do {
                        next = xmlPullParser.next();
                    } while (next == 4);
                    if (next != 2) {
                        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + C13266tx.f86222j2);
                    }
                    drawable = qd2.C11437c.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                }
                c11281a.m20029i(iArrM20022k, drawable);
            }
        }
    }

    private void updateStateFromTypedArray(TypedArray typedArray) {
        C11281a c11281a = this.f73076Y;
        c11281a.f105677d |= qd2.C11437c.getChangingConfigurations(typedArray);
        c11281a.f105682i = typedArray.getBoolean(C0437R.styleable.StateListDrawable_android_variablePadding, c11281a.f105682i);
        c11281a.f105685l = typedArray.getBoolean(C0437R.styleable.StateListDrawable_android_constantSize, c11281a.f105685l);
        c11281a.f105665A = typedArray.getInt(C0437R.styleable.StateListDrawable_android_enterFadeDuration, c11281a.f105665A);
        c11281a.f105666B = typedArray.getInt(C0437R.styleable.StateListDrawable_android_exitFadeDuration, c11281a.f105666B);
        c11281a.f105697x = typedArray.getBoolean(C0437R.styleable.StateListDrawable_android_dither, c11281a.f105697x);
    }

    public void addState(int[] iArr, Drawable drawable) {
        if (drawable != null) {
            this.f73076Y.m20029i(iArr, drawable);
            onStateChange(getState());
        }
    }

    @Override // p000.zp4, android.graphics.drawable.Drawable
    @c5e(21)
    public void applyTheme(@efb Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // p000.zp4
    /* JADX INFO: renamed from: b */
    public void mo20018b() {
        super.mo20018b();
        this.f73077Z = false;
    }

    @Override // p000.zp4
    /* JADX INFO: renamed from: g */
    public void mo20020g(@efb zp4.AbstractC16210d abstractC16210d) {
        super.mo20020g(abstractC16210d);
        if (abstractC16210d instanceof C11281a) {
            this.f73076Y = (C11281a) abstractC16210d;
        }
    }

    public void inflate(@efb Context context, @efb Resources resources, @efb XmlPullParser xmlPullParser, @efb AttributeSet attributeSet, @hib Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = vmh.obtainAttributes(resources, theme, attributeSet, C0437R.styleable.StateListDrawable);
        setVisible(typedArrayObtainAttributes.getBoolean(C0437R.styleable.StateListDrawable_android_visible, true), true);
        updateStateFromTypedArray(typedArrayObtainAttributes);
        m26937i(resources);
        typedArrayObtainAttributes.recycle();
        inflateChildElements(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    @Override // p000.zp4, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p000.zp4
    /* JADX INFO: renamed from: j */
    public C11281a mo20021j() {
        return new C11281a(this.f73076Y, this, null);
    }

    /* JADX INFO: renamed from: k */
    public int[] m20022k(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    /* JADX INFO: renamed from: l */
    public int m20023l() {
        return this.f73076Y.getChildCount();
    }

    /* JADX INFO: renamed from: m */
    public Drawable m20024m(int i) {
        return this.f73076Y.getChild(i);
    }

    @Override // p000.zp4, android.graphics.drawable.Drawable
    @efb
    public Drawable mutate() {
        if (!this.f73077Z && super.mutate() == this) {
            this.f73076Y.mo20028f();
            this.f73077Z = true;
        }
        return this;
    }

    /* JADX INFO: renamed from: n */
    public int m20025n(int[] iArr) {
        return this.f73076Y.m20030j(iArr);
    }

    /* JADX INFO: renamed from: o */
    public C11281a m20026o() {
        return this.f73076Y;
    }

    @Override // p000.zp4, android.graphics.drawable.Drawable
    public boolean onStateChange(@efb int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        int iM20030j = this.f73076Y.m20030j(iArr);
        if (iM20030j < 0) {
            iM20030j = this.f73076Y.m20030j(StateSet.WILD_CARD);
        }
        return m26935f(iM20030j) || zOnStateChange;
    }

    /* JADX INFO: renamed from: p */
    public int[] m20027p(int i) {
        return this.f73076Y.f73078J[i];
    }

    public q2g(C11281a c11281a, Resources resources) {
        mo20020g(new C11281a(c11281a, this, resources));
        onStateChange(getState());
    }

    public q2g(@hib C11281a c11281a) {
        if (c11281a != null) {
            mo20020g(c11281a);
        }
    }
}
