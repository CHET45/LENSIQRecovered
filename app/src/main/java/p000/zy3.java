package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.metadata.C3018a;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import p000.eda;
import p000.us3;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class zy3 implements u1e {

    /* JADX INFO: renamed from: j */
    public static final long f106418j = 5000;

    /* JADX INFO: renamed from: k */
    public static final int f106419k = 0;

    /* JADX INFO: renamed from: l */
    public static final int f106420l = 1;

    /* JADX INFO: renamed from: m */
    public static final int f106421m = 2;

    /* JADX INFO: renamed from: n */
    public static final int f106422n = 50;

    /* JADX INFO: renamed from: o */
    public static final String f106423o = "DefaultRenderersFactory";

    /* JADX INFO: renamed from: a */
    public final Context f106424a;

    /* JADX INFO: renamed from: e */
    public boolean f106428e;

    /* JADX INFO: renamed from: g */
    public boolean f106430g;

    /* JADX INFO: renamed from: h */
    public boolean f106431h;

    /* JADX INFO: renamed from: i */
    public boolean f106432i;

    /* JADX INFO: renamed from: b */
    public final tw3 f106425b = new tw3();

    /* JADX INFO: renamed from: c */
    public int f106426c = 0;

    /* JADX INFO: renamed from: d */
    public long f106427d = 5000;

    /* JADX INFO: renamed from: f */
    public yda f106429f = yda.f101240a;

    /* JADX INFO: renamed from: zy3$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC16314a {
    }

    public zy3(Context context) {
        this.f106424a = context;
    }

    /* JADX INFO: renamed from: a */
    public void m27127a(Context context, int i, yda ydaVar, boolean z, ch0 ch0Var, Handler handler, sg0 sg0Var, ArrayList<n1e> arrayList) {
        int i2;
        ch0 ch0Var2;
        Handler handler2;
        String str;
        int i3;
        int i4;
        arrayList.add(new gda(context, m27134h(), ydaVar, z, handler, sg0Var, ch0Var));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i2 = size + 1;
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating MIDI extension", e);
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            arrayList.add(size, (n1e) Class.forName("com.google.android.exoplayer2.decoder.midi.MidiRenderer").getConstructor(null).newInstance(null));
            yh9.m25917i("DefaultRenderersFactory", "Loaded MidiRenderer.");
        } catch (ClassNotFoundException unused2) {
            size = i2;
            i2 = size;
        }
        try {
            try {
                ch0Var2 = ch0Var;
                handler2 = handler;
                str = "DefaultRenderersFactory";
                try {
                    i3 = i2 + 1;
                } catch (ClassNotFoundException unused3) {
                }
                try {
                    arrayList.add(i2, (n1e) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, sg0.class, ch0.class).newInstance(handler2, sg0Var, ch0Var2));
                    yh9.m25917i(str, "Loaded LibopusAudioRenderer.");
                } catch (ClassNotFoundException unused4) {
                    i2 = i3;
                    i3 = i2;
                }
            } catch (ClassNotFoundException unused5) {
                ch0Var2 = ch0Var;
                handler2 = handler;
                str = "DefaultRenderersFactory";
            }
            try {
                try {
                    i4 = i3 + 1;
                } catch (ClassNotFoundException unused6) {
                }
                try {
                    arrayList.add(i3, (n1e) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, sg0.class, ch0.class).newInstance(handler2, sg0Var, ch0Var2));
                    yh9.m25917i(str, "Loaded LibflacAudioRenderer.");
                } catch (ClassNotFoundException unused7) {
                    i3 = i4;
                    i4 = i3;
                }
                try {
                    arrayList.add(i4, (n1e) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, sg0.class, ch0.class).newInstance(handler2, sg0Var, ch0Var2));
                    yh9.m25917i(str, "Loaded FfmpegAudioRenderer.");
                } catch (ClassNotFoundException unused8) {
                } catch (Exception e2) {
                    throw new RuntimeException("Error instantiating FFmpeg extension", e2);
                }
            } catch (Exception e3) {
                throw new RuntimeException("Error instantiating FLAC extension", e3);
            }
        } catch (Exception e4) {
            throw new RuntimeException("Error instantiating Opus extension", e4);
        }
    }

    @hib
    /* JADX INFO: renamed from: b */
    public ch0 m27128b(Context context, boolean z, boolean z2, boolean z3) {
        return new us3.C13682h(context).setEnableFloatOutput(z).setEnableAudioTrackPlaybackParams(z2).setOffloadMode(z3 ? 1 : 0).build();
    }

    /* JADX INFO: renamed from: c */
    public void m27129c(Context context, int i, ArrayList<n1e> arrayList) {
        arrayList.add(new hp1());
    }

    @Override // p000.u1e
    public n1e[] createRenderers(Handler handler, w7i w7iVar, sg0 sg0Var, zug zugVar, eua euaVar) {
        ArrayList<n1e> arrayList = new ArrayList<>();
        m27133g(this.f106424a, this.f106426c, this.f106429f, this.f106428e, handler, w7iVar, this.f106427d, arrayList);
        ch0 ch0VarM27128b = m27128b(this.f106424a, this.f106430g, this.f106431h, this.f106432i);
        if (ch0VarM27128b != null) {
            m27127a(this.f106424a, this.f106426c, this.f106429f, this.f106428e, ch0VarM27128b, handler, sg0Var, arrayList);
        }
        m27132f(this.f106424a, zugVar, handler.getLooper(), this.f106426c, arrayList);
        m27130d(this.f106424a, euaVar, handler.getLooper(), this.f106426c, arrayList);
        m27129c(this.f106424a, this.f106426c, arrayList);
        m27131e(this.f106424a, handler, this.f106426c, arrayList);
        return (n1e[]) arrayList.toArray(new n1e[0]);
    }

    /* JADX INFO: renamed from: d */
    public void m27130d(Context context, eua euaVar, Looper looper, int i, ArrayList<n1e> arrayList) {
        arrayList.add(new C3018a(euaVar, looper));
    }

    /* JADX INFO: renamed from: e */
    public void m27131e(Context context, Handler handler, int i, ArrayList<n1e> arrayList) {
    }

    @op1
    public zy3 experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled(boolean z) {
        this.f106425b.experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled(z);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public void m27132f(Context context, zug zugVar, Looper looper, int i, ArrayList<n1e> arrayList) {
        arrayList.add(new pvg(zugVar, looper));
    }

    @op1
    public zy3 forceDisableMediaCodecAsynchronousQueueing() {
        this.f106425b.forceDisableAsynchronous();
        return this;
    }

    @op1
    public zy3 forceEnableMediaCodecAsynchronousQueueing() {
        this.f106425b.forceEnableAsynchronous();
        return this;
    }

    /* JADX INFO: renamed from: g */
    public void m27133g(Context context, int i, yda ydaVar, boolean z, Handler handler, w7i w7iVar, long j, ArrayList<n1e> arrayList) {
        Handler handler2;
        Class cls;
        String str;
        int i2;
        arrayList.add(new sea(context, m27134h(), ydaVar, j, z, handler, w7iVar, 50));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                handler2 = handler;
                cls = Handler.class;
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating VP9 extension", e);
            }
        } catch (ClassNotFoundException unused) {
            handler2 = handler;
            cls = Handler.class;
        }
        try {
            try {
                i2 = size + 1;
                try {
                    arrayList.add(size, (n1e) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, w7i.class, Integer.TYPE).newInstance(Long.valueOf(j), handler2, w7iVar, 50));
                    str = "DefaultRenderersFactory";
                } catch (ClassNotFoundException unused2) {
                    str = "DefaultRenderersFactory";
                }
                try {
                    yh9.m25917i(str, "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused3) {
                    size = i2;
                    i2 = size;
                }
            } catch (ClassNotFoundException unused4) {
                str = "DefaultRenderersFactory";
                i2 = size;
                arrayList.add(i2, (n1e) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, cls, w7i.class, Integer.TYPE).newInstance(Long.valueOf(j), handler2, w7iVar, 50));
                yh9.m25917i(str, "Loaded Libgav1VideoRenderer.");
            }
            arrayList.add(i2, (n1e) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, cls, w7i.class, Integer.TYPE).newInstance(Long.valueOf(j), handler2, w7iVar, 50));
            yh9.m25917i(str, "Loaded Libgav1VideoRenderer.");
        } catch (ClassNotFoundException unused5) {
        } catch (Exception e2) {
            throw new RuntimeException("Error instantiating AV1 extension", e2);
        }
    }

    /* JADX INFO: renamed from: h */
    public eda.InterfaceC5266b m27134h() {
        return this.f106425b;
    }

    @op1
    public zy3 setAllowedVideoJoiningTimeMs(long j) {
        this.f106427d = j;
        return this;
    }

    @op1
    public zy3 setEnableAudioFloatOutput(boolean z) {
        this.f106430g = z;
        return this;
    }

    @op1
    public zy3 setEnableAudioOffload(boolean z) {
        this.f106432i = z;
        return this;
    }

    @op1
    public zy3 setEnableAudioTrackPlaybackParams(boolean z) {
        this.f106431h = z;
        return this;
    }

    @op1
    public zy3 setEnableDecoderFallback(boolean z) {
        this.f106428e = z;
        return this;
    }

    @op1
    public zy3 setExtensionRendererMode(int i) {
        this.f106426c = i;
        return this;
    }

    @op1
    public zy3 setMediaCodecSelector(yda ydaVar) {
        this.f106429f = ydaVar;
        return this;
    }
}
