package p000;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.InterfaceC1254q;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import p000.dda;
import p000.ps3;
import p000.rea;
import p000.u31;
import p000.vs7;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class yy3 implements v1e {

    /* JADX INFO: renamed from: m */
    public static final long f103302m = 5000;

    /* JADX INFO: renamed from: n */
    public static final int f103303n = 0;

    /* JADX INFO: renamed from: o */
    public static final int f103304o = 1;

    /* JADX INFO: renamed from: p */
    public static final int f103305p = 2;

    /* JADX INFO: renamed from: q */
    public static final int f103306q = 50;

    /* JADX INFO: renamed from: r */
    public static final String f103307r = "DefaultRenderersFactory";

    /* JADX INFO: renamed from: a */
    public final Context f103308a;

    /* JADX INFO: renamed from: b */
    public final uw3 f103309b;

    /* JADX INFO: renamed from: e */
    public boolean f103312e;

    /* JADX INFO: renamed from: g */
    public boolean f103314g;

    /* JADX INFO: renamed from: h */
    public boolean f103315h;

    /* JADX INFO: renamed from: i */
    public boolean f103316i;

    /* JADX INFO: renamed from: j */
    public boolean f103317j;

    /* JADX INFO: renamed from: l */
    public boolean f103319l;

    /* JADX INFO: renamed from: c */
    public int f103310c = 0;

    /* JADX INFO: renamed from: d */
    public long f103311d = 5000;

    /* JADX INFO: renamed from: f */
    public zda f103313f = zda.f104850a;

    /* JADX INFO: renamed from: k */
    public long f103318k = -9223372036854775807L;

    /* JADX INFO: renamed from: yy3$a */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC15881a {
    }

    public yy3(Context context) {
        this.f103308a = context;
        this.f103309b = new uw3(context);
    }

    /* JADX INFO: renamed from: a */
    public void m26397a(Context context, int i, zda zdaVar, boolean z, bh0 bh0Var, Handler handler, rg0 rg0Var, ArrayList<InterfaceC1254q> arrayList) {
        bh0 bh0Var2;
        Handler handler2;
        Class cls;
        Class cls2;
        Class cls3;
        String str;
        Context context2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        arrayList.add(new fda(context, m26407k(), zdaVar, z, handler, rg0Var, bh0Var));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                bh0Var2 = bh0Var;
                handler2 = handler;
                cls = Handler.class;
                cls2 = rg0.class;
                cls3 = bh0.class;
                context2 = context;
                try {
                    i2 = size + 1;
                    try {
                        arrayList.add(size, (InterfaceC1254q) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class, Handler.class, rg0.class, bh0.class).newInstance(context2, handler2, rg0Var, bh0Var2));
                        str = "DefaultRenderersFactory";
                        try {
                            xh9.m25146i(str, "Loaded MidiRenderer.");
                        } catch (ClassNotFoundException unused) {
                            size = i2;
                            i2 = size;
                        }
                    } catch (ClassNotFoundException unused2) {
                        str = "DefaultRenderersFactory";
                    }
                } catch (ClassNotFoundException unused3) {
                    str = "DefaultRenderersFactory";
                }
            } catch (ClassNotFoundException unused4) {
                bh0Var2 = bh0Var;
                handler2 = handler;
                cls = Handler.class;
                cls2 = rg0.class;
                cls3 = bh0.class;
                str = "DefaultRenderersFactory";
                context2 = context;
            }
            try {
                try {
                    i3 = i2 + 1;
                    try {
                        arrayList.add(i2, (InterfaceC1254q) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(cls, cls2, cls3).newInstance(handler2, rg0Var, bh0Var2));
                        xh9.m25146i(str, "Loaded LibopusAudioRenderer.");
                    } catch (ClassNotFoundException unused5) {
                        i2 = i3;
                        i3 = i2;
                    }
                } catch (Exception e) {
                    throw new IllegalStateException("Error instantiating Opus extension", e);
                }
            } catch (ClassNotFoundException unused6) {
            }
            try {
                try {
                    i4 = i3 + 1;
                } catch (Exception e2) {
                    throw new IllegalStateException("Error instantiating FLAC extension", e2);
                }
            } catch (ClassNotFoundException unused7) {
            }
            try {
                arrayList.add(i3, (InterfaceC1254q) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(cls, cls2, cls3).newInstance(handler2, rg0Var, bh0Var2));
                xh9.m25146i(str, "Loaded LibflacAudioRenderer.");
            } catch (ClassNotFoundException unused8) {
                i3 = i4;
                i4 = i3;
            }
            try {
                try {
                    i5 = i4 + 1;
                    try {
                        arrayList.add(i4, (InterfaceC1254q) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(cls, cls2, cls3).newInstance(handler2, rg0Var, bh0Var2));
                        xh9.m25146i(str, "Loaded FfmpegAudioRenderer.");
                    } catch (ClassNotFoundException unused9) {
                        i4 = i5;
                        i5 = i4;
                    }
                } catch (Exception e3) {
                    throw new IllegalStateException("Error instantiating FFmpeg extension", e3);
                }
            } catch (ClassNotFoundException unused10) {
            }
            try {
                try {
                    i6 = i5 + 1;
                } catch (Exception e4) {
                    throw new IllegalStateException("Error instantiating IAMF extension", e4);
                }
            } catch (ClassNotFoundException unused11) {
            }
            try {
                arrayList.add(i5, (InterfaceC1254q) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, cls, cls2, cls3).newInstance(context2, handler2, rg0Var, bh0Var2));
                xh9.m25146i(str, "Loaded LibiamfAudioRenderer.");
            } catch (ClassNotFoundException unused12) {
                i5 = i6;
                i6 = i5;
            }
            try {
                arrayList.add(i6, (InterfaceC1254q) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(cls, cls2, cls3).newInstance(handler2, rg0Var, bh0Var2));
                xh9.m25146i(str, "Loaded MpeghAudioRenderer.");
            } catch (ClassNotFoundException unused13) {
            } catch (Exception e5) {
                throw new IllegalStateException("Error instantiating MPEG-H extension", e5);
            }
        } catch (Exception e6) {
            throw new IllegalStateException("Error instantiating MIDI extension", e6);
        }
    }

    @hib
    /* JADX INFO: renamed from: b */
    public bh0 m26398b(Context context, boolean z, boolean z2) {
        return new ps3.C11096h(context).setEnableFloatOutput(z).setEnableAudioTrackPlaybackParams(z2).build();
    }

    /* JADX INFO: renamed from: c */
    public void m26399c(Context context, int i, ArrayList<InterfaceC1254q> arrayList) {
        arrayList.add(new ip1());
    }

    @Override // p000.v1e
    public InterfaceC1254q[] createRenderers(Handler handler, v7i v7iVar, rg0 rg0Var, avg avgVar, fua fuaVar) {
        ArrayList<InterfaceC1254q> arrayList = new ArrayList<>();
        m26406j(this.f103308a, this.f103310c, this.f103313f, this.f103312e, handler, v7iVar, this.f103311d, arrayList);
        bh0 bh0VarM26398b = m26398b(this.f103308a, this.f103314g, this.f103315h);
        if (bh0VarM26398b != null) {
            m26397a(this.f103308a, this.f103310c, this.f103313f, this.f103312e, bh0VarM26398b, handler, rg0Var, arrayList);
        }
        m26405i(this.f103308a, avgVar, handler.getLooper(), this.f103310c, arrayList);
        m26402f(this.f103308a, fuaVar, handler.getLooper(), this.f103310c, arrayList);
        m26399c(this.f103308a, this.f103310c, arrayList);
        m26400d(this.f103308a, arrayList);
        m26403g(this.f103308a, handler, this.f103310c, arrayList);
        return (InterfaceC1254q[]) arrayList.toArray(new InterfaceC1254q[0]);
    }

    @Override // p000.v1e
    @hib
    public InterfaceC1254q createSecondaryRenderer(InterfaceC1254q interfaceC1254q, Handler handler, v7i v7iVar, rg0 rg0Var, avg avgVar, fua fuaVar) {
        if (interfaceC1254q.getTrackType() == 2) {
            return m26404h(interfaceC1254q, this.f103308a, this.f103310c, this.f103313f, this.f103312e, handler, v7iVar, this.f103311d);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public void m26400d(Context context, ArrayList<InterfaceC1254q> arrayList) {
        m26401e(arrayList);
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public void m26401e(ArrayList<InterfaceC1254q> arrayList) {
        arrayList.add(new tv7(m26408l(this.f103308a), null));
    }

    @c5e(34)
    @op1
    public yy3 experimentalSetEnableMediaCodecBufferDecodeOnlyFlag(boolean z) {
        this.f103319l = z;
        return this;
    }

    @op1
    public final yy3 experimentalSetEnableMediaCodecVideoRendererPrewarming(boolean z) {
        this.f103316i = z;
        return this;
    }

    @op1
    public final yy3 experimentalSetLateThresholdToDropDecoderInputUs(long j) {
        this.f103318k = j;
        return this;
    }

    @op1
    public final yy3 experimentalSetMediaCodecAsyncCryptoFlagEnabled(boolean z) {
        this.f103309b.experimentalSetAsyncCryptoFlagEnabled(z);
        return this;
    }

    @op1
    public final yy3 experimentalSetParseAv1SampleDependencies(boolean z) {
        this.f103317j = z;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public void m26402f(Context context, fua fuaVar, Looper looper, int i, ArrayList<InterfaceC1254q> arrayList) {
        arrayList.add(new gua(fuaVar, looper));
        arrayList.add(new gua(fuaVar, looper));
    }

    @op1
    public final yy3 forceDisableMediaCodecAsynchronousQueueing() {
        this.f103309b.forceDisableAsynchronous();
        return this;
    }

    @op1
    public final yy3 forceEnableMediaCodecAsynchronousQueueing() {
        this.f103309b.forceEnableAsynchronous();
        return this;
    }

    /* JADX INFO: renamed from: g */
    public void m26403g(Context context, Handler handler, int i, ArrayList<InterfaceC1254q> arrayList) {
    }

    @hib
    /* JADX INFO: renamed from: h */
    public InterfaceC1254q m26404h(InterfaceC1254q interfaceC1254q, Context context, int i, zda zdaVar, boolean z, Handler handler, v7i v7iVar, long j) {
        if (!this.f103316i || interfaceC1254q.getClass() != rea.class) {
            return null;
        }
        rea.C12040d c12040dExperimentalSetLateThresholdToDropDecoderInputUs = new rea.C12040d(context).setCodecAdapterFactory(m26407k()).setMediaCodecSelector(zdaVar).setAllowedJoiningTimeMs(j).setEnableDecoderFallback(z).setEventHandler(handler).setEventListener(v7iVar).setMaxDroppedFramesToNotify(50).experimentalSetParseAv1SampleDependencies(this.f103317j).experimentalSetLateThresholdToDropDecoderInputUs(this.f103318k);
        if (Build.VERSION.SDK_INT >= 34) {
            c12040dExperimentalSetLateThresholdToDropDecoderInputUs = c12040dExperimentalSetLateThresholdToDropDecoderInputUs.experimentalSetEnableMediaCodecBufferDecodeOnlyFlag(this.f103319l);
        }
        return c12040dExperimentalSetLateThresholdToDropDecoderInputUs.build();
    }

    /* JADX INFO: renamed from: i */
    public void m26405i(Context context, avg avgVar, Looper looper, int i, ArrayList<InterfaceC1254q> arrayList) {
        arrayList.add(new qvg(avgVar, looper));
    }

    /* JADX INFO: renamed from: j */
    public void m26406j(Context context, int i, zda zdaVar, boolean z, Handler handler, v7i v7iVar, long j, ArrayList<InterfaceC1254q> arrayList) {
        int i2;
        int i3;
        rea.C12040d c12040dExperimentalSetLateThresholdToDropDecoderInputUs = new rea.C12040d(context).setCodecAdapterFactory(m26407k()).setMediaCodecSelector(zdaVar).setAllowedJoiningTimeMs(j).setEnableDecoderFallback(z).setEventHandler(handler).setEventListener(v7iVar).setMaxDroppedFramesToNotify(50).experimentalSetParseAv1SampleDependencies(this.f103317j).experimentalSetLateThresholdToDropDecoderInputUs(this.f103318k);
        if (Build.VERSION.SDK_INT >= 34) {
            c12040dExperimentalSetLateThresholdToDropDecoderInputUs = c12040dExperimentalSetLateThresholdToDropDecoderInputUs.experimentalSetEnableMediaCodecBufferDecodeOnlyFlag(this.f103319l);
        }
        arrayList.add(c12040dExperimentalSetLateThresholdToDropDecoderInputUs.build());
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
                throw new IllegalStateException("Error instantiating VP9 extension", e);
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            arrayList.add(size, (InterfaceC1254q) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, v7i.class, Integer.TYPE).newInstance(Long.valueOf(j), handler, v7iVar, 50));
            xh9.m25146i("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
        } catch (ClassNotFoundException unused2) {
            size = i2;
            i2 = size;
        }
        try {
            try {
                i3 = i2 + 1;
            } catch (ClassNotFoundException unused3) {
            }
            try {
                arrayList.add(i2, (InterfaceC1254q) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, v7i.class, Integer.TYPE).newInstance(Long.valueOf(j), handler, v7iVar, 50));
                xh9.m25146i("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
            } catch (ClassNotFoundException unused4) {
                i2 = i3;
                i3 = i2;
            }
            try {
                arrayList.add(i3, (InterfaceC1254q) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(Long.TYPE, Handler.class, v7i.class, Integer.TYPE).newInstance(Long.valueOf(j), handler, v7iVar, 50));
                xh9.m25146i("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
            } catch (ClassNotFoundException unused5) {
            } catch (Exception e2) {
                throw new IllegalStateException("Error instantiating FFmpeg extension", e2);
            }
        } catch (Exception e3) {
            throw new IllegalStateException("Error instantiating AV1 extension", e3);
        }
    }

    /* JADX INFO: renamed from: k */
    public dda.InterfaceC4752b m26407k() {
        return this.f103309b;
    }

    @vp6
    /* JADX INFO: renamed from: l */
    public vs7.InterfaceC14247a m26408l(Context context) {
        return new u31.C13346c(context);
    }

    @op1
    public final yy3 setAllowedVideoJoiningTimeMs(long j) {
        this.f103311d = j;
        return this;
    }

    @op1
    public final yy3 setEnableAudioFloatOutput(boolean z) {
        this.f103314g = z;
        return this;
    }

    @op1
    public final yy3 setEnableAudioTrackPlaybackParams(boolean z) {
        this.f103315h = z;
        return this;
    }

    @op1
    public final yy3 setEnableDecoderFallback(boolean z) {
        this.f103312e = z;
        return this;
    }

    @op1
    public final yy3 setExtensionRendererMode(int i) {
        this.f103310c = i;
        return this;
    }

    @op1
    public final yy3 setMediaCodecSelector(zda zdaVar) {
        this.f103313f = zdaVar;
        return this;
    }
}
