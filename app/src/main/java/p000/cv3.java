package p000;

import android.net.Uri;
import androidx.media3.common.C1213a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.peg;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class cv3 implements ik5 {

    /* JADX INFO: renamed from: s */
    public static final int[] f27726s = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: t */
    public static final C4520a f27727t = new C4520a(new C4520a.a() { // from class: zu3
        @Override // p000.cv3.C4520a.a
        public final Constructor getConstructor() {
            return cv3.getFlacExtractorConstructor();
        }
    });

    /* JADX INFO: renamed from: u */
    public static final C4520a f27728u = new C4520a(new C4520a.a() { // from class: bv3
        @Override // p000.cv3.C4520a.a
        public final Constructor getConstructor() {
            return cv3.getMidiExtractorConstructor();
        }
    });

    /* JADX INFO: renamed from: b */
    public boolean f27729b;

    /* JADX INFO: renamed from: c */
    public boolean f27730c;

    /* JADX INFO: renamed from: d */
    public int f27731d;

    /* JADX INFO: renamed from: e */
    public int f27732e;

    /* JADX INFO: renamed from: f */
    public int f27733f;

    /* JADX INFO: renamed from: g */
    public int f27734g;

    /* JADX INFO: renamed from: h */
    public int f27735h;

    /* JADX INFO: renamed from: i */
    public int f27736i;

    /* JADX INFO: renamed from: j */
    public int f27737j;

    /* JADX INFO: renamed from: l */
    public int f27739l;

    /* JADX INFO: renamed from: m */
    @hib
    public kx7<C1213a> f27740m;

    /* JADX INFO: renamed from: q */
    public int f27744q;

    /* JADX INFO: renamed from: r */
    public int f27745r;

    /* JADX INFO: renamed from: k */
    public int f27738k = 1;

    /* JADX INFO: renamed from: n */
    public int f27741n = 112800;

    /* JADX INFO: renamed from: p */
    public peg.InterfaceC10936a f27743p = new oz3();

    /* JADX INFO: renamed from: o */
    public boolean f27742o = true;

    /* JADX INFO: renamed from: cv3$a */
    public static final class C4520a {

        /* JADX INFO: renamed from: a */
        public final a f27746a;

        /* JADX INFO: renamed from: b */
        public final AtomicBoolean f27747b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c */
        @xc7("extensionLoaded")
        @hib
        public Constructor<? extends xj5> f27748c;

        /* JADX INFO: renamed from: cv3$a$a */
        public interface a {
            @hib
            Constructor<? extends xj5> getConstructor() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException;
        }

        public C4520a(a aVar) {
            this.f27746a = aVar;
        }

        @hib
        private Constructor<? extends xj5> maybeLoadExtractorConstructor() {
            synchronized (this.f27747b) {
                if (this.f27747b.get()) {
                    return this.f27748c;
                }
                try {
                    return this.f27746a.getConstructor();
                } catch (ClassNotFoundException unused) {
                    this.f27747b.set(true);
                    return this.f27748c;
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
        }

        @hib
        public xj5 getExtractor(Object... objArr) {
            Constructor<? extends xj5> constructorMaybeLoadExtractorConstructor = maybeLoadExtractorConstructor();
            if (constructorMaybeLoadExtractorConstructor == null) {
                return null;
            }
            try {
                return constructorMaybeLoadExtractorConstructor.newInstance(objArr);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating extractor", e);
            }
        }
    }

    private void addExtractorsForFileType(int i, List<xj5> list) {
        switch (i) {
            case 0:
                list.add(new C10193o5());
                break;
            case 1:
                list.add(new C14391w5());
                break;
            case 2:
                list.add(new C9356mi((this.f27730c ? 2 : 0) | this.f27731d | (this.f27729b ? 1 : 0)));
                break;
            case 3:
                list.add(new C11029pn((this.f27730c ? 2 : 0) | this.f27732e | (this.f27729b ? 1 : 0)));
                break;
            case 4:
                xj5 extractor = f27727t.getExtractor(Integer.valueOf(this.f27733f));
                if (extractor == null) {
                    list.add(new u26(this.f27733f));
                } else {
                    list.add(extractor);
                }
                break;
            case 5:
                list.add(new km6());
                break;
            case 6:
                list.add(new f4a(this.f27743p, (this.f27742o ? 0 : 2) | this.f27734g));
                break;
            case 7:
                list.add(new r0b((this.f27730c ? 2 : 0) | this.f27737j | (this.f27729b ? 1 : 0)));
                break;
            case 8:
                list.add(new bv6(this.f27743p, this.f27736i | bv6.codecsToParseWithinGopSampleDependenciesAsFlags(this.f27744q) | (this.f27742o ? 0 : 32)));
                list.add(new e1b(this.f27743p, (this.f27742o ? 0 : 16) | this.f27735h | e1b.codecsToParseWithinGopSampleDependenciesAsFlags(this.f27744q)));
                break;
            case 9:
                list.add(new vzb());
                break;
            case 10:
                list.add(new cjd());
                break;
            case 11:
                if (this.f27740m == null) {
                    this.f27740m = kx7.m15110of();
                }
                list.add(new akh(this.f27738k, !this.f27742o ? 1 : 0, this.f27743p, new h2h(0L), new l24(this.f27739l, this.f27740m), this.f27741n));
                break;
            case 12:
                list.add(new ohi());
                break;
            case 14:
                list.add(new yj8(this.f27745r));
                break;
            case 15:
                xj5 extractor2 = f27728u.getExtractor(new Object[0]);
                if (extractor2 != null) {
                    list.add(extractor2);
                }
                break;
            case 16:
                list.add(new vm0(!this.f27742o ? 1 : 0, this.f27743p));
                break;
            case 17:
                list.add(new l1d());
                break;
            case 18:
                list.add(new nji());
                break;
            case 19:
                list.add(new ca1());
                break;
            case 20:
                int i2 = this.f27735h;
                if ((i2 & 2) == 0 && (i2 & 4) == 0) {
                    list.add(new jj7());
                    break;
                }
                break;
            case 21:
                list.add(new bn0());
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @hib
    public static Constructor<? extends xj5> getFlacExtractorConstructor() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(xj5.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends xj5> getMidiExtractorConstructor() throws NoSuchMethodException, ClassNotFoundException {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(xj5.class).getConstructor(null);
    }

    @Override // p000.ik5
    public synchronized xj5[] createExtractors() {
        return createExtractors(Uri.EMPTY, new HashMap());
    }

    @op1
    public synchronized cv3 setAdtsExtractorFlags(int i) {
        this.f27731d = i;
        return this;
    }

    @op1
    public synchronized cv3 setAmrExtractorFlags(int i) {
        this.f27732e = i;
        return this;
    }

    @op1
    public synchronized cv3 setConstantBitrateSeekingAlwaysEnabled(boolean z) {
        this.f27730c = z;
        return this;
    }

    @op1
    public synchronized cv3 setConstantBitrateSeekingEnabled(boolean z) {
        this.f27729b = z;
        return this;
    }

    @op1
    public synchronized cv3 setFlacExtractorFlags(int i) {
        this.f27733f = i;
        return this;
    }

    @op1
    public synchronized cv3 setFragmentedMp4ExtractorFlags(int i) {
        this.f27736i = i;
        return this;
    }

    @op1
    public synchronized cv3 setJpegExtractorFlags(int i) {
        this.f27745r = i;
        return this;
    }

    @op1
    public synchronized cv3 setMatroskaExtractorFlags(int i) {
        this.f27734g = i;
        return this;
    }

    @op1
    public synchronized cv3 setMp3ExtractorFlags(int i) {
        this.f27737j = i;
        return this;
    }

    @op1
    public synchronized cv3 setMp4ExtractorFlags(int i) {
        this.f27735h = i;
        return this;
    }

    @op1
    @Deprecated
    public synchronized cv3 setTextTrackTranscodingEnabled(boolean z) {
        return experimentalSetTextTrackTranscodingEnabled(z);
    }

    @op1
    public synchronized cv3 setTsExtractorFlags(int i) {
        this.f27739l = i;
        return this;
    }

    @op1
    public synchronized cv3 setTsExtractorMode(int i) {
        this.f27738k = i;
        return this;
    }

    @op1
    public synchronized cv3 setTsExtractorTimestampSearchBytes(int i) {
        this.f27741n = i;
        return this;
    }

    @op1
    public synchronized cv3 setTsSubtitleFormats(List<C1213a> list) {
        this.f27740m = kx7.copyOf((Collection) list);
        return this;
    }

    @Override // p000.ik5
    public synchronized xj5[] createExtractors(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        try {
            int[] iArr = f27726s;
            arrayList = new ArrayList(iArr.length);
            int iInferFileTypeFromResponseHeaders = nt5.inferFileTypeFromResponseHeaders(map);
            if (iInferFileTypeFromResponseHeaders != -1) {
                addExtractorsForFileType(iInferFileTypeFromResponseHeaders, arrayList);
            }
            int iInferFileTypeFromUri = nt5.inferFileTypeFromUri(uri);
            if (iInferFileTypeFromUri != -1 && iInferFileTypeFromUri != iInferFileTypeFromResponseHeaders) {
                addExtractorsForFileType(iInferFileTypeFromUri, arrayList);
            }
            for (int i : iArr) {
                if (i != iInferFileTypeFromResponseHeaders && i != iInferFileTypeFromUri) {
                    addExtractorsForFileType(i, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (xj5[]) arrayList.toArray(new xj5[0]);
    }

    @Override // p000.ik5
    @op1
    public synchronized cv3 experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        this.f27744q = i;
        return this;
    }

    @Override // p000.ik5
    @Deprecated
    public synchronized cv3 experimentalSetTextTrackTranscodingEnabled(boolean z) {
        this.f27742o = z;
        return this;
    }

    @Override // p000.ik5
    @op1
    public synchronized cv3 setSubtitleParserFactory(peg.InterfaceC10936a interfaceC10936a) {
        this.f27743p = interfaceC10936a;
        return this;
    }
}
