package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.material.C3146R;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
public class n8f {

    /* JADX INFO: renamed from: m */
    public static final x03 f63612m = new uxd(0.5f);

    /* JADX INFO: renamed from: a */
    public a13 f63613a;

    /* JADX INFO: renamed from: b */
    public a13 f63614b;

    /* JADX INFO: renamed from: c */
    public a13 f63615c;

    /* JADX INFO: renamed from: d */
    public a13 f63616d;

    /* JADX INFO: renamed from: e */
    public x03 f63617e;

    /* JADX INFO: renamed from: f */
    public x03 f63618f;

    /* JADX INFO: renamed from: g */
    public x03 f63619g;

    /* JADX INFO: renamed from: h */
    public x03 f63620h;

    /* JADX INFO: renamed from: i */
    public jw4 f63621i;

    /* JADX INFO: renamed from: j */
    public jw4 f63622j;

    /* JADX INFO: renamed from: k */
    public jw4 f63623k;

    /* JADX INFO: renamed from: l */
    public jw4 f63624l;

    /* JADX INFO: renamed from: n8f$b */
    public static final class C9745b {

        /* JADX INFO: renamed from: a */
        @efb
        public a13 f63625a;

        /* JADX INFO: renamed from: b */
        @efb
        public a13 f63626b;

        /* JADX INFO: renamed from: c */
        @efb
        public a13 f63627c;

        /* JADX INFO: renamed from: d */
        @efb
        public a13 f63628d;

        /* JADX INFO: renamed from: e */
        @efb
        public x03 f63629e;

        /* JADX INFO: renamed from: f */
        @efb
        public x03 f63630f;

        /* JADX INFO: renamed from: g */
        @efb
        public x03 f63631g;

        /* JADX INFO: renamed from: h */
        @efb
        public x03 f63632h;

        /* JADX INFO: renamed from: i */
        @efb
        public jw4 f63633i;

        /* JADX INFO: renamed from: j */
        @efb
        public jw4 f63634j;

        /* JADX INFO: renamed from: k */
        @efb
        public jw4 f63635k;

        /* JADX INFO: renamed from: l */
        @efb
        public jw4 f63636l;

        public C9745b() {
            this.f63625a = c3a.m3746b();
            this.f63626b = c3a.m3746b();
            this.f63627c = c3a.m3746b();
            this.f63628d = c3a.m3746b();
            this.f63629e = new C12380s(0.0f);
            this.f63630f = new C12380s(0.0f);
            this.f63631g = new C12380s(0.0f);
            this.f63632h = new C12380s(0.0f);
            this.f63633i = c3a.m3747c();
            this.f63634j = c3a.m3747c();
            this.f63635k = c3a.m3747c();
            this.f63636l = c3a.m3747c();
        }

        private static float compatCornerTreatmentSize(a13 a13Var) {
            if (a13Var instanceof wbe) {
                return ((wbe) a13Var).f93911a;
            }
            if (a13Var instanceof le3) {
                return ((le3) a13Var).f57348a;
            }
            return -1.0f;
        }

        @efb
        public n8f build() {
            return new n8f(this);
        }

        @efb
        @op1
        public C9745b setAllCornerSizes(@efb x03 x03Var) {
            return setTopLeftCornerSize(x03Var).setTopRightCornerSize(x03Var).setBottomRightCornerSize(x03Var).setBottomLeftCornerSize(x03Var);
        }

        @efb
        @op1
        public C9745b setAllCorners(int i, @yc4 float f) {
            return setAllCorners(c3a.m3745a(i)).setAllCornerSizes(f);
        }

        @efb
        @op1
        public C9745b setAllEdges(@efb jw4 jw4Var) {
            return setLeftEdge(jw4Var).setTopEdge(jw4Var).setRightEdge(jw4Var).setBottomEdge(jw4Var);
        }

        @efb
        @op1
        public C9745b setBottomEdge(@efb jw4 jw4Var) {
            this.f63635k = jw4Var;
            return this;
        }

        @efb
        @op1
        public C9745b setBottomLeftCorner(int i, @yc4 float f) {
            return setBottomLeftCorner(c3a.m3745a(i)).setBottomLeftCornerSize(f);
        }

        @efb
        @op1
        public C9745b setBottomLeftCornerSize(@yc4 float f) {
            this.f63632h = new C12380s(f);
            return this;
        }

        @efb
        @op1
        public C9745b setBottomRightCorner(int i, @yc4 float f) {
            return setBottomRightCorner(c3a.m3745a(i)).setBottomRightCornerSize(f);
        }

        @efb
        @op1
        public C9745b setBottomRightCornerSize(@yc4 float f) {
            this.f63631g = new C12380s(f);
            return this;
        }

        @efb
        @op1
        public C9745b setLeftEdge(@efb jw4 jw4Var) {
            this.f63636l = jw4Var;
            return this;
        }

        @efb
        @op1
        public C9745b setRightEdge(@efb jw4 jw4Var) {
            this.f63634j = jw4Var;
            return this;
        }

        @efb
        @op1
        public C9745b setTopEdge(@efb jw4 jw4Var) {
            this.f63633i = jw4Var;
            return this;
        }

        @efb
        @op1
        public C9745b setTopLeftCorner(int i, @yc4 float f) {
            return setTopLeftCorner(c3a.m3745a(i)).setTopLeftCornerSize(f);
        }

        @efb
        @op1
        public C9745b setTopLeftCornerSize(@yc4 float f) {
            this.f63629e = new C12380s(f);
            return this;
        }

        @efb
        @op1
        public C9745b setTopRightCorner(int i, @yc4 float f) {
            return setTopRightCorner(c3a.m3745a(i)).setTopRightCornerSize(f);
        }

        @efb
        @op1
        public C9745b setTopRightCornerSize(@yc4 float f) {
            this.f63630f = new C12380s(f);
            return this;
        }

        @efb
        @op1
        public C9745b setBottomLeftCornerSize(@efb x03 x03Var) {
            this.f63632h = x03Var;
            return this;
        }

        @efb
        @op1
        public C9745b setBottomRightCornerSize(@efb x03 x03Var) {
            this.f63631g = x03Var;
            return this;
        }

        @efb
        @op1
        public C9745b setTopLeftCornerSize(@efb x03 x03Var) {
            this.f63629e = x03Var;
            return this;
        }

        @efb
        @op1
        public C9745b setTopRightCornerSize(@efb x03 x03Var) {
            this.f63630f = x03Var;
            return this;
        }

        @efb
        @op1
        public C9745b setAllCorners(@efb a13 a13Var) {
            return setTopLeftCorner(a13Var).setTopRightCorner(a13Var).setBottomRightCorner(a13Var).setBottomLeftCorner(a13Var);
        }

        @efb
        @op1
        public C9745b setBottomLeftCorner(int i, @efb x03 x03Var) {
            return setBottomLeftCorner(c3a.m3745a(i)).setBottomLeftCornerSize(x03Var);
        }

        @efb
        @op1
        public C9745b setBottomRightCorner(int i, @efb x03 x03Var) {
            return setBottomRightCorner(c3a.m3745a(i)).setBottomRightCornerSize(x03Var);
        }

        @efb
        @op1
        public C9745b setTopLeftCorner(int i, @efb x03 x03Var) {
            return setTopLeftCorner(c3a.m3745a(i)).setTopLeftCornerSize(x03Var);
        }

        @efb
        @op1
        public C9745b setTopRightCorner(int i, @efb x03 x03Var) {
            return setTopRightCorner(c3a.m3745a(i)).setTopRightCornerSize(x03Var);
        }

        @efb
        @op1
        public C9745b setAllCornerSizes(@yc4 float f) {
            return setTopLeftCornerSize(f).setTopRightCornerSize(f).setBottomRightCornerSize(f).setBottomLeftCornerSize(f);
        }

        @efb
        @op1
        public C9745b setBottomLeftCorner(@efb a13 a13Var) {
            this.f63628d = a13Var;
            float fCompatCornerTreatmentSize = compatCornerTreatmentSize(a13Var);
            if (fCompatCornerTreatmentSize != -1.0f) {
                setBottomLeftCornerSize(fCompatCornerTreatmentSize);
            }
            return this;
        }

        @efb
        @op1
        public C9745b setBottomRightCorner(@efb a13 a13Var) {
            this.f63627c = a13Var;
            float fCompatCornerTreatmentSize = compatCornerTreatmentSize(a13Var);
            if (fCompatCornerTreatmentSize != -1.0f) {
                setBottomRightCornerSize(fCompatCornerTreatmentSize);
            }
            return this;
        }

        @efb
        @op1
        public C9745b setTopLeftCorner(@efb a13 a13Var) {
            this.f63625a = a13Var;
            float fCompatCornerTreatmentSize = compatCornerTreatmentSize(a13Var);
            if (fCompatCornerTreatmentSize != -1.0f) {
                setTopLeftCornerSize(fCompatCornerTreatmentSize);
            }
            return this;
        }

        @efb
        @op1
        public C9745b setTopRightCorner(@efb a13 a13Var) {
            this.f63626b = a13Var;
            float fCompatCornerTreatmentSize = compatCornerTreatmentSize(a13Var);
            if (fCompatCornerTreatmentSize != -1.0f) {
                setTopRightCornerSize(fCompatCornerTreatmentSize);
            }
            return this;
        }

        public C9745b(@efb n8f n8fVar) {
            this.f63625a = c3a.m3746b();
            this.f63626b = c3a.m3746b();
            this.f63627c = c3a.m3746b();
            this.f63628d = c3a.m3746b();
            this.f63629e = new C12380s(0.0f);
            this.f63630f = new C12380s(0.0f);
            this.f63631g = new C12380s(0.0f);
            this.f63632h = new C12380s(0.0f);
            this.f63633i = c3a.m3747c();
            this.f63634j = c3a.m3747c();
            this.f63635k = c3a.m3747c();
            this.f63636l = c3a.m3747c();
            this.f63625a = n8fVar.f63613a;
            this.f63626b = n8fVar.f63614b;
            this.f63627c = n8fVar.f63615c;
            this.f63628d = n8fVar.f63616d;
            this.f63629e = n8fVar.f63617e;
            this.f63630f = n8fVar.f63618f;
            this.f63631g = n8fVar.f63619g;
            this.f63632h = n8fVar.f63620h;
            this.f63633i = n8fVar.f63621i;
            this.f63634j = n8fVar.f63622j;
            this.f63635k = n8fVar.f63623k;
            this.f63636l = n8fVar.f63624l;
        }
    }

    /* JADX INFO: renamed from: n8f$c */
    @p7e({p7e.EnumC10826a.f69935b})
    public interface InterfaceC9746c {
        @efb
        x03 apply(@efb x03 x03Var);
    }

    @efb
    public static C9745b builder() {
        return new C9745b();
    }

    @efb
    private static x03 getCornerSize(TypedArray typedArray, int i, @efb x03 x03Var) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return x03Var;
        }
        int i2 = typedValuePeekValue.type;
        return i2 == 5 ? new C12380s(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new uxd(typedValuePeekValue.getFraction(1.0f, 1.0f)) : x03Var;
    }

    @efb
    public jw4 getBottomEdge() {
        return this.f63623k;
    }

    @efb
    public a13 getBottomLeftCorner() {
        return this.f63616d;
    }

    @efb
    public x03 getBottomLeftCornerSize() {
        return this.f63620h;
    }

    @efb
    public a13 getBottomRightCorner() {
        return this.f63615c;
    }

    @efb
    public x03 getBottomRightCornerSize() {
        return this.f63619g;
    }

    @efb
    public jw4 getLeftEdge() {
        return this.f63624l;
    }

    @efb
    public jw4 getRightEdge() {
        return this.f63622j;
    }

    @efb
    public jw4 getTopEdge() {
        return this.f63621i;
    }

    @efb
    public a13 getTopLeftCorner() {
        return this.f63613a;
    }

    @efb
    public x03 getTopLeftCornerSize() {
        return this.f63617e;
    }

    @efb
    public a13 getTopRightCorner() {
        return this.f63614b;
    }

    @efb
    public x03 getTopRightCornerSize() {
        return this.f63618f;
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public boolean isRoundRect(@efb RectF rectF) {
        boolean z = this.f63624l.getClass().equals(jw4.class) && this.f63622j.getClass().equals(jw4.class) && this.f63621i.getClass().equals(jw4.class) && this.f63623k.getClass().equals(jw4.class);
        float cornerSize = this.f63617e.getCornerSize(rectF);
        return z && ((this.f63618f.getCornerSize(rectF) > cornerSize ? 1 : (this.f63618f.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0 && (this.f63620h.getCornerSize(rectF) > cornerSize ? 1 : (this.f63620h.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0 && (this.f63619g.getCornerSize(rectF) > cornerSize ? 1 : (this.f63619g.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0) && ((this.f63614b instanceof wbe) && (this.f63613a instanceof wbe) && (this.f63615c instanceof wbe) && (this.f63616d instanceof wbe));
    }

    @efb
    public C9745b toBuilder() {
        return new C9745b(this);
    }

    @efb
    public n8f withCornerSize(float f) {
        return toBuilder().setAllCornerSizes(f).build();
    }

    @efb
    @p7e({p7e.EnumC10826a.f69935b})
    public n8f withTransformedCornerSizes(@efb InterfaceC9746c interfaceC9746c) {
        return toBuilder().setTopLeftCornerSize(interfaceC9746c.apply(getTopLeftCornerSize())).setTopRightCornerSize(interfaceC9746c.apply(getTopRightCornerSize())).setBottomLeftCornerSize(interfaceC9746c.apply(getBottomLeftCornerSize())).setBottomRightCornerSize(interfaceC9746c.apply(getBottomRightCornerSize())).build();
    }

    private n8f(@efb C9745b c9745b) {
        this.f63613a = c9745b.f63625a;
        this.f63614b = c9745b.f63626b;
        this.f63615c = c9745b.f63627c;
        this.f63616d = c9745b.f63628d;
        this.f63617e = c9745b.f63629e;
        this.f63618f = c9745b.f63630f;
        this.f63619g = c9745b.f63631g;
        this.f63620h = c9745b.f63632h;
        this.f63621i = c9745b.f63633i;
        this.f63622j = c9745b.f63634j;
        this.f63623k = c9745b.f63635k;
        this.f63624l = c9745b.f63636l;
    }

    @efb
    public static C9745b builder(@efb Context context, AttributeSet attributeSet, @gc0 int i, @dbg int i2) {
        return builder(context, attributeSet, i, i2, 0);
    }

    @efb
    public n8f withCornerSize(@efb x03 x03Var) {
        return toBuilder().setAllCornerSizes(x03Var).build();
    }

    @efb
    public static C9745b builder(@efb Context context, AttributeSet attributeSet, @gc0 int i, @dbg int i2, int i3) {
        return builder(context, attributeSet, i, i2, new C12380s(i3));
    }

    @efb
    public static C9745b builder(@efb Context context, AttributeSet attributeSet, @gc0 int i, @dbg int i2, @efb x03 x03Var) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3146R.styleable.MaterialShape, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C3146R.styleable.MaterialShape_shapeAppearance, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C3146R.styleable.MaterialShape_shapeAppearanceOverlay, 0);
        typedArrayObtainStyledAttributes.recycle();
        return builder(context, resourceId, resourceId2, x03Var);
    }

    @efb
    public static C9745b builder(Context context, @dbg int i, @dbg int i2) {
        return builder(context, i, i2, 0);
    }

    @efb
    private static C9745b builder(Context context, @dbg int i, @dbg int i2, int i3) {
        return builder(context, i, i2, new C12380s(i3));
    }

    @efb
    private static C9745b builder(Context context, @dbg int i, @dbg int i2, @efb x03 x03Var) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(C3146R.styleable.ShapeAppearance);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(C3146R.styleable.ShapeAppearance_cornerFamily, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(C3146R.styleable.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(C3146R.styleable.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(C3146R.styleable.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(C3146R.styleable.ShapeAppearance_cornerFamilyBottomLeft, i3);
            x03 cornerSize = getCornerSize(typedArrayObtainStyledAttributes, C3146R.styleable.ShapeAppearance_cornerSize, x03Var);
            x03 cornerSize2 = getCornerSize(typedArrayObtainStyledAttributes, C3146R.styleable.ShapeAppearance_cornerSizeTopLeft, cornerSize);
            x03 cornerSize3 = getCornerSize(typedArrayObtainStyledAttributes, C3146R.styleable.ShapeAppearance_cornerSizeTopRight, cornerSize);
            x03 cornerSize4 = getCornerSize(typedArrayObtainStyledAttributes, C3146R.styleable.ShapeAppearance_cornerSizeBottomRight, cornerSize);
            return new C9745b().setTopLeftCorner(i4, cornerSize2).setTopRightCorner(i5, cornerSize3).setBottomRightCorner(i6, cornerSize4).setBottomLeftCorner(i7, getCornerSize(typedArrayObtainStyledAttributes, C3146R.styleable.ShapeAppearance_cornerSizeBottomLeft, cornerSize));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public n8f() {
        this.f63613a = c3a.m3746b();
        this.f63614b = c3a.m3746b();
        this.f63615c = c3a.m3746b();
        this.f63616d = c3a.m3746b();
        this.f63617e = new C12380s(0.0f);
        this.f63618f = new C12380s(0.0f);
        this.f63619g = new C12380s(0.0f);
        this.f63620h = new C12380s(0.0f);
        this.f63621i = c3a.m3747c();
        this.f63622j = c3a.m3747c();
        this.f63623k = c3a.m3747c();
        this.f63624l = c3a.m3747c();
    }
}
