package p000;

import android.os.Bundle;
import android.view.View;
import p000.p7e;

/* JADX INFO: renamed from: p7 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC10809p7 {

    /* JADX INFO: renamed from: p7$a */
    public static abstract class a {

        /* JADX INFO: renamed from: a */
        public Bundle f69862a;

        @p7e({p7e.EnumC10826a.f69936c})
        public void setBundle(@hib Bundle bundle) {
            this.f69862a = bundle;
        }
    }

    /* JADX INFO: renamed from: p7$b */
    public static final class b extends a {
        public boolean getExtendSelection() {
            return this.f69862a.getBoolean(C6730h7.f42568Y);
        }

        public int getGranularity() {
            return this.f69862a.getInt(C6730h7.f42566W);
        }
    }

    /* JADX INFO: renamed from: p7$c */
    public static final class c extends a {
        @hib
        public String getHTMLElement() {
            return this.f69862a.getString(C6730h7.f42567X);
        }
    }

    /* JADX INFO: renamed from: p7$d */
    public static final class d extends a {
        public int getX() {
            return this.f69862a.getInt(C6730h7.f42578f0);
        }

        public int getY() {
            return this.f69862a.getInt(C6730h7.f42580g0);
        }
    }

    /* JADX INFO: renamed from: p7$e */
    public static final class e extends a {
        public int getColumn() {
            return this.f69862a.getInt(C6730h7.f42574d0);
        }

        public int getRow() {
            return this.f69862a.getInt(C6730h7.f42572c0);
        }
    }

    /* JADX INFO: renamed from: p7$f */
    public static final class f extends a {
        public float getProgress() {
            return this.f69862a.getFloat(C6730h7.f42576e0);
        }
    }

    /* JADX INFO: renamed from: p7$g */
    public static final class g extends a {
        public int getEnd() {
            return this.f69862a.getInt(C6730h7.f42570a0);
        }

        public int getStart() {
            return this.f69862a.getInt(C6730h7.f42569Z);
        }
    }

    /* JADX INFO: renamed from: p7$h */
    public static final class h extends a {
        @hib
        public CharSequence getText() {
            return this.f69862a.getCharSequence(C6730h7.f42571b0);
        }
    }

    boolean perform(@efb View view, @hib a aVar);
}
