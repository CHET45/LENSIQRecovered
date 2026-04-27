package p000;

import p000.gwe;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class ewe {

    /* JADX INFO: renamed from: g */
    public static final int f34320g = hug.f44911g;

    /* JADX INFO: renamed from: a */
    public final long f34321a;

    /* JADX INFO: renamed from: b */
    public final int f34322b;

    /* JADX INFO: renamed from: c */
    public final int f34323c;

    /* JADX INFO: renamed from: d */
    public final int f34324d;

    /* JADX INFO: renamed from: e */
    public final int f34325e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final hug f34326f;

    public ewe(long j, int i, int i2, int i3, int i4, @yfb hug hugVar) {
        this.f34321a = j;
        this.f34322b = i;
        this.f34323c = i2;
        this.f34324d = i3;
        this.f34325e = i4;
        this.f34326f = hugVar;
    }

    private final q5e getEndRunDirection() {
        return xwe.getTextDirectionForOffset(this.f34326f, this.f34324d);
    }

    private final q5e getStartRunDirection() {
        return xwe.getTextDirectionForOffset(this.f34326f, this.f34323c);
    }

    @yfb
    public final gwe.C6633a anchorForOffset(int i) {
        return new gwe.C6633a(xwe.getTextDirectionForOffset(this.f34326f, i), i, this.f34321a);
    }

    @yfb
    public final String getInputText() {
        return this.f34326f.getLayoutInput().getText().getText();
    }

    @yfb
    public final z83 getRawCrossStatus() {
        int i = this.f34323c;
        int i2 = this.f34324d;
        return i < i2 ? z83.NOT_CROSSED : i > i2 ? z83.CROSSED : z83.COLLAPSED;
    }

    public final int getRawEndHandleOffset() {
        return this.f34324d;
    }

    public final int getRawPreviousHandleOffset() {
        return this.f34325e;
    }

    public final int getRawStartHandleOffset() {
        return this.f34323c;
    }

    public final long getSelectableId() {
        return this.f34321a;
    }

    public final int getSlot() {
        return this.f34322b;
    }

    @yfb
    public final hug getTextLayoutResult() {
        return this.f34326f;
    }

    public final int getTextLength() {
        return getInputText().length();
    }

    @yfb
    public final gwe makeSingleLayoutSelection(int i, int i2) {
        return new gwe(anchorForOffset(i), anchorForOffset(i2), i > i2);
    }

    public final boolean shouldRecomputeSelection(@yfb ewe eweVar) {
        return (this.f34321a == eweVar.f34321a && this.f34323c == eweVar.f34323c && this.f34324d == eweVar.f34324d) ? false : true;
    }

    @yfb
    public String toString() {
        return "SelectionInfo(id=" + this.f34321a + ", range=(" + this.f34323c + '-' + getStartRunDirection() + C4584d2.f28238g + this.f34324d + '-' + getEndRunDirection() + "), prevOffset=" + this.f34325e + ')';
    }
}
