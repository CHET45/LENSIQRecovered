package p000;

import android.app.slice.Slice;
import android.app.slice.SliceSpec;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o63 {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C10204a f66532c = new C10204a(null);

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f66533a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final py0 f66534b;

    /* JADX INFO: renamed from: o63$a */
    public static final class C10204a {
        public /* synthetic */ C10204a(jt3 jt3Var) {
            this();
        }

        @c5e(28)
        @do8
        @gib
        public final o63 createFrom$credentials_release(@yfb Slice slice) {
            md8.checkNotNullParameter(slice, "slice");
            try {
                SliceSpec spec = slice.getSpec();
                String type = spec != null ? spec.getType() : null;
                if (md8.areEqual(type, oic.f67748g)) {
                    pic picVarFromSlice = pic.f70993m.fromSlice(slice);
                    md8.checkNotNull(picVarFromSlice);
                    return picVarFromSlice;
                }
                if (md8.areEqual(type, jjd.f50722f)) {
                    mjd mjdVarFromSlice = mjd.f61145m.fromSlice(slice);
                    md8.checkNotNull(mjdVarFromSlice);
                    return mjdVarFromSlice;
                }
                uc3 uc3VarFromSlice = uc3.f87492n.fromSlice(slice);
                md8.checkNotNull(uc3VarFromSlice);
                return uc3VarFromSlice;
            } catch (Exception unused) {
                return uc3.f87492n.fromSlice(slice);
            }
        }

        @c5e(28)
        @do8
        @gib
        public final Slice toSlice$credentials_release(@yfb o63 o63Var) {
            md8.checkNotNullParameter(o63Var, "entry");
            if (o63Var instanceof pic) {
                return pic.f70993m.toSlice((pic) o63Var);
            }
            if (o63Var instanceof mjd) {
                return mjd.f61145m.toSlice((mjd) o63Var);
            }
            if (o63Var instanceof uc3) {
                return uc3.f87492n.toSlice((uc3) o63Var);
            }
            return null;
        }

        private C10204a() {
        }
    }

    public o63(@yfb String str, @yfb py0 py0Var) {
        md8.checkNotNullParameter(str, "type");
        md8.checkNotNullParameter(py0Var, "beginGetCredentialOption");
        this.f66533a = str;
        this.f66534b = py0Var;
    }

    @yfb
    public final py0 getBeginGetCredentialOption() {
        return this.f66534b;
    }

    @yfb
    @p7e({p7e.EnumC10826a.f69935b})
    public String getType() {
        return this.f66533a;
    }
}
