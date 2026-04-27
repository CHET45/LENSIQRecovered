package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public class bn9 {

    /* JADX INFO: renamed from: c */
    public Map<String, List<tu8>> f14199c;

    /* JADX INFO: renamed from: d */
    public Map<String, jo9> f14200d;

    /* JADX INFO: renamed from: e */
    public Map<String, yn6> f14201e;

    /* JADX INFO: renamed from: f */
    public List<eu9> f14202f;

    /* JADX INFO: renamed from: g */
    public mxf<bo6> f14203g;

    /* JADX INFO: renamed from: h */
    public zl9<tu8> f14204h;

    /* JADX INFO: renamed from: i */
    public List<tu8> f14205i;

    /* JADX INFO: renamed from: j */
    public Rect f14206j;

    /* JADX INFO: renamed from: k */
    public float f14207k;

    /* JADX INFO: renamed from: l */
    public float f14208l;

    /* JADX INFO: renamed from: m */
    public float f14209m;

    /* JADX INFO: renamed from: n */
    public boolean f14210n;

    /* JADX INFO: renamed from: a */
    public final unc f14197a = new unc();

    /* JADX INFO: renamed from: b */
    public final HashSet<String> f14198b = new HashSet<>();

    /* JADX INFO: renamed from: o */
    public int f14211o = 0;

    /* JADX INFO: renamed from: bn9$b */
    @Deprecated
    public static class C1957b {

        /* JADX INFO: renamed from: bn9$b$a */
        public static final class a implements oo9<bn9>, zp1 {

            /* JADX INFO: renamed from: a */
            public final a2c f14212a;

            /* JADX INFO: renamed from: b */
            public boolean f14213b;

            @Override // p000.zp1
            public void cancel() {
                this.f14213b = true;
            }

            private a(a2c a2cVar) {
                this.f14213b = false;
                this.f14212a = a2cVar;
            }

            @Override // p000.oo9
            public void onResult(bn9 bn9Var) {
                if (this.f14213b) {
                    return;
                }
                this.f14212a.onCompositionLoaded(bn9Var);
            }
        }

        private C1957b() {
        }

        @Deprecated
        public static zp1 fromAssetFileName(Context context, String str, a2c a2cVar) {
            a aVar = new a(a2cVar);
            on9.fromAsset(context, str).addListener(aVar);
            return aVar;
        }

        @xqi
        @hib
        @Deprecated
        public static bn9 fromFileSync(Context context, String str) {
            return on9.fromAssetSync(context, str).getValue();
        }

        @Deprecated
        public static zp1 fromInputStream(InputStream inputStream, a2c a2cVar) {
            a aVar = new a(a2cVar);
            on9.fromJsonInputStream(inputStream, null).addListener(aVar);
            return aVar;
        }

        @xqi
        @hib
        @Deprecated
        public static bn9 fromInputStreamSync(InputStream inputStream) {
            return on9.fromJsonInputStreamSync(inputStream, null).getValue();
        }

        @Deprecated
        public static zp1 fromJsonReader(jm8 jm8Var, a2c a2cVar) {
            a aVar = new a(a2cVar);
            on9.fromJsonReader(jm8Var, null).addListener(aVar);
            return aVar;
        }

        @Deprecated
        public static zp1 fromJsonString(String str, a2c a2cVar) {
            a aVar = new a(a2cVar);
            on9.fromJsonString(str, null).addListener(aVar);
            return aVar;
        }

        @xqi
        @hib
        @Deprecated
        public static bn9 fromJsonSync(Resources resources, JSONObject jSONObject) {
            return on9.fromJsonSync(jSONObject, null).getValue();
        }

        @Deprecated
        public static zp1 fromRawFile(Context context, @wpd int i, a2c a2cVar) {
            a aVar = new a(a2cVar);
            on9.fromRawRes(context, i).addListener(aVar);
            return aVar;
        }

        @xqi
        @hib
        @Deprecated
        public static bn9 fromInputStreamSync(InputStream inputStream, boolean z) {
            if (z) {
                dj9.warning("Lottie now auto-closes input stream!");
            }
            return on9.fromJsonInputStreamSync(inputStream, null).getValue();
        }

        @xqi
        @hib
        @Deprecated
        public static bn9 fromJsonSync(String str) {
            return on9.fromJsonStringSync(str, null).getValue();
        }

        @xqi
        @hib
        @Deprecated
        public static bn9 fromJsonSync(jm8 jm8Var) {
            return on9.fromJsonReaderSync(jm8Var, null).getValue();
        }
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public void addWarning(String str) {
        dj9.warning(str);
        this.f14198b.add(str);
    }

    public Rect getBounds() {
        return this.f14206j;
    }

    public mxf<bo6> getCharacters() {
        return this.f14203g;
    }

    public float getDuration() {
        return (long) ((getDurationFrames() / this.f14209m) * 1000.0f);
    }

    public float getDurationFrames() {
        return this.f14208l - this.f14207k;
    }

    public float getEndFrame() {
        return this.f14208l;
    }

    public Map<String, yn6> getFonts() {
        return this.f14201e;
    }

    public float getFrameForProgress(float f) {
        return awa.lerp(this.f14207k, this.f14208l, f);
    }

    public float getFrameRate() {
        return this.f14209m;
    }

    public Map<String, jo9> getImages() {
        return this.f14200d;
    }

    public List<tu8> getLayers() {
        return this.f14205i;
    }

    @hib
    public eu9 getMarker(String str) {
        int size = this.f14202f.size();
        for (int i = 0; i < size; i++) {
            eu9 eu9Var = this.f14202f.get(i);
            if (eu9Var.matchesName(str)) {
                return eu9Var;
            }
        }
        return null;
    }

    public List<eu9> getMarkers() {
        return this.f14202f;
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public int getMaskAndMatteCount() {
        return this.f14211o;
    }

    public unc getPerformanceTracker() {
        return this.f14197a;
    }

    @hib
    @p7e({p7e.EnumC10826a.f69934a})
    public List<tu8> getPrecomps(String str) {
        return this.f14199c.get(str);
    }

    public float getProgressForFrame(float f) {
        float f2 = this.f14207k;
        return (f - f2) / (this.f14208l - f2);
    }

    public float getStartFrame() {
        return this.f14207k;
    }

    public ArrayList<String> getWarnings() {
        HashSet<String> hashSet = this.f14198b;
        return new ArrayList<>(Arrays.asList((String[]) hashSet.toArray(new String[hashSet.size()])));
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public boolean hasDashPattern() {
        return this.f14210n;
    }

    public boolean hasImages() {
        return !this.f14200d.isEmpty();
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public void incrementMatteOrMaskCount(int i) {
        this.f14211o += i;
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public void init(Rect rect, float f, float f2, float f3, List<tu8> list, zl9<tu8> zl9Var, Map<String, List<tu8>> map, Map<String, jo9> map2, mxf<bo6> mxfVar, Map<String, yn6> map3, List<eu9> list2) {
        this.f14206j = rect;
        this.f14207k = f;
        this.f14208l = f2;
        this.f14209m = f3;
        this.f14205i = list;
        this.f14204h = zl9Var;
        this.f14199c = map;
        this.f14200d = map2;
        this.f14203g = mxfVar;
        this.f14201e = map3;
        this.f14202f = list2;
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public tu8 layerModelForId(long j) {
        return this.f14204h.get(j);
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public void setHasDashPattern(boolean z) {
        this.f14210n = z;
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f14197a.m23462a(z);
    }

    @efb
    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<tu8> it = this.f14205i.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString("\t"));
        }
        return sb.toString();
    }
}
