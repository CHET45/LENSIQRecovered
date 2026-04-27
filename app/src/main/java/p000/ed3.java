package p000;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class ed3 {

    /* JADX INFO: renamed from: a */
    public final Map<String, String> f32680a;

    /* JADX INFO: renamed from: ed3$a */
    public static class C5263a {

        /* JADX INFO: renamed from: a */
        public Map<String, String> f32681a = new HashMap();

        @efb
        public ed3 build() {
            return new ed3(this);
        }

        @efb
        public C5263a putBoolean(@efb String str, boolean z) {
            this.f32681a.put(str, Boolean.toString(z));
            return this;
        }

        @efb
        public C5263a putDouble(@efb String str, double d) {
            this.f32681a.put(str, Double.toString(d));
            return this;
        }

        @efb
        public C5263a putFloat(@efb String str, float f) {
            this.f32681a.put(str, Float.toString(f));
            return this;
        }

        @efb
        public C5263a putInt(@efb String str, int i) {
            this.f32681a.put(str, Integer.toString(i));
            return this;
        }

        @efb
        public C5263a putLong(@efb String str, long j) {
            this.f32681a.put(str, Long.toString(j));
            return this;
        }

        @efb
        public C5263a putString(@efb String str, @efb String str2) {
            this.f32681a.put(str, str2);
            return this;
        }
    }

    public ed3(@efb C5263a c5263a) {
        this.f32680a = c5263a.f32681a;
    }
}
