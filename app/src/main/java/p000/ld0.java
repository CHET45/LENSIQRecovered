package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.provider.Settings;
import android.util.Pair;
import java.util.Arrays;
import p000.dy7;
import p000.kx7;
import p000.ox7;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ld0 {

    /* JADX INFO: renamed from: c */
    public static final int f57215c = 10;

    /* JADX INFO: renamed from: d */
    @fdi
    public static final int f57216d = 48000;

    /* JADX INFO: renamed from: e */
    public static final ld0 f57217e = new ld0(new int[]{2}, 10);

    /* JADX INFO: renamed from: f */
    public static final kx7<Integer> f57218f = kx7.m15113of(2, 5, 6);

    /* JADX INFO: renamed from: g */
    public static final ox7<Integer, Integer> f57219g = new ox7.C10705d().put(5, 6).put(17, 6).put(7, 6).put(30, 10).put(18, 6).put(6, 8).put(8, 8).put(14, 8).buildOrThrow();

    /* JADX INFO: renamed from: h */
    public static final String f57220h = "external_surround_sound_enabled";

    /* JADX INFO: renamed from: a */
    public final int[] f57221a;

    /* JADX INFO: renamed from: b */
    public final int f57222b;

    /* JADX INFO: renamed from: ld0$a */
    @c5e(23)
    public static final class C8772a {
        private C8772a() {
        }

        @ih4
        private static final dy7<Integer> getAllBluetoothDeviceTypes() {
            dy7.C5007a c5007aAdd = new dy7.C5007a().add((Object[]) new Integer[]{8, 7});
            int i = x0i.f95978a;
            if (i >= 31) {
                c5007aAdd.add((Object[]) new Integer[]{26, 27});
            }
            if (i >= 33) {
                c5007aAdd.add(30);
            }
            return c5007aAdd.build();
        }

        @ih4
        public static final boolean isBluetoothConnected(Context context) {
            AudioDeviceInfo[] devices = ((AudioManager) u80.checkNotNull((AudioManager) context.getSystemService("audio"))).getDevices(2);
            dy7<Integer> allBluetoothDeviceTypes = getAllBluetoothDeviceTypes();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (allBluetoothDeviceTypes.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ld0$b */
    @c5e(29)
    public static final class C8773b {

        /* JADX INFO: renamed from: a */
        public static final AudioAttributes f57223a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        private C8773b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @ih4
        public static kx7<Integer> getDirectPlaybackSupportedEncodings() {
            kx7.C8541a c8541aBuilder = kx7.builder();
            quh it = ld0.f57219g.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (x0i.f95978a >= 34 || iIntValue != 30) {
                    if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), f57223a)) {
                        c8541aBuilder.add(num);
                    }
                }
            }
            c8541aBuilder.add(2);
            return c8541aBuilder.build();
        }

        @ih4
        public static int getMaxSupportedChannelCountForPassthrough(int i, int i2) {
            for (int i3 = 10; i3 > 0; i3--) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(x0i.getAudioTrackChannelConfig(i3)).build(), f57223a)) {
                    return i3;
                }
            }
            return 0;
        }
    }

    public ld0(@hib int[] iArr, int i) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f57221a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f57221a = new int[0];
        }
        this.f57222b = i;
    }

    @igg({"InlinedApi"})
    /* JADX INFO: renamed from: b */
    public static ld0 m16093b(Context context, @hib Intent intent) {
        int i = x0i.f95978a;
        if (i >= 23 && C8772a.isBluetoothConnected(context)) {
            return f57217e;
        }
        dy7.C5007a c5007a = new dy7.C5007a();
        if (deviceMaySetExternalSurroundSoundGlobalSetting() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            c5007a.addAll((Iterable) f57218f);
        }
        if (i >= 29 && (x0i.isTv(context) || x0i.isAutomotive(context))) {
            c5007a.addAll((Iterable) C8773b.getDirectPlaybackSupportedEncodings());
            return new ld0(rd8.toArray(c5007a.build()), 10);
        }
        if (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            dy7 dy7VarBuild = c5007a.build();
            return !dy7VarBuild.isEmpty() ? new ld0(rd8.toArray(dy7VarBuild), 10) : f57217e;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            c5007a.addAll((Iterable) rd8.asList(intArrayExtra));
        }
        return new ld0(rd8.toArray(c5007a.build()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10));
    }

    @hib
    /* JADX INFO: renamed from: c */
    public static Uri m16094c() {
        if (deviceMaySetExternalSurroundSoundGlobalSetting()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    private static boolean deviceMaySetExternalSurroundSoundGlobalSetting() {
        if (x0i.f95978a >= 17) {
            String str = x0i.f95980c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static ld0 getCapabilities(Context context) {
        return m16093b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    private static int getChannelConfigForPassthrough(int i) {
        int i2 = x0i.f95978a;
        if (i2 <= 28) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (i2 <= 26 && "fugu".equals(x0i.f95979b) && i == 1) {
            i = 2;
        }
        return x0i.getAudioTrackChannelConfig(i);
    }

    private static int getMaxSupportedChannelCountForPassthrough(int i, int i2) {
        return x0i.f95978a >= 29 ? C8773b.getMaxSupportedChannelCountForPassthrough(i, i2) : ((Integer) u80.checkNotNull(f57219g.getOrDefault(Integer.valueOf(i), 0))).intValue();
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld0)) {
            return false;
        }
        ld0 ld0Var = (ld0) obj;
        return Arrays.equals(this.f57221a, ld0Var.f57221a) && this.f57222b == ld0Var.f57222b;
    }

    @hib
    public Pair<Integer, Integer> getEncodingAndChannelConfigForPassthrough(kq6 kq6Var) {
        int encoding = sva.getEncoding((String) u80.checkNotNull(kq6Var.f54989M), kq6Var.f54986F);
        if (!f57219g.containsKey(Integer.valueOf(encoding))) {
            return null;
        }
        if (encoding == 18 && !supportsEncoding(18)) {
            encoding = 6;
        } else if ((encoding == 8 && !supportsEncoding(8)) || (encoding == 30 && !supportsEncoding(30))) {
            encoding = 7;
        }
        if (!supportsEncoding(encoding)) {
            return null;
        }
        int maxSupportedChannelCountForPassthrough = kq6Var.f55007e2;
        if (maxSupportedChannelCountForPassthrough == -1 || encoding == 18) {
            int i = kq6Var.f55009f2;
            if (i == -1) {
                i = 48000;
            }
            maxSupportedChannelCountForPassthrough = getMaxSupportedChannelCountForPassthrough(encoding, i);
        } else if (kq6Var.f54989M.equals("audio/vnd.dts.uhd;profile=p2")) {
            if (maxSupportedChannelCountForPassthrough > 10) {
                return null;
            }
        } else if (maxSupportedChannelCountForPassthrough > this.f57222b) {
            return null;
        }
        int channelConfigForPassthrough = getChannelConfigForPassthrough(maxSupportedChannelCountForPassthrough);
        if (channelConfigForPassthrough == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(encoding), Integer.valueOf(channelConfigForPassthrough));
    }

    public int getMaxChannelCount() {
        return this.f57222b;
    }

    public int hashCode() {
        return this.f57222b + (Arrays.hashCode(this.f57221a) * 31);
    }

    public boolean isPassthroughPlaybackSupported(kq6 kq6Var) {
        return getEncodingAndChannelConfigForPassthrough(kq6Var) != null;
    }

    public boolean supportsEncoding(int i) {
        return Arrays.binarySearch(this.f57221a, i) >= 0;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f57222b + ", supportedEncodings=" + Arrays.toString(this.f57221a) + "]";
    }
}
