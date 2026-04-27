package p000;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ce0 {

    /* JADX INFO: renamed from: a */
    public final int f16320a;

    /* JADX INFO: renamed from: b */
    public final AudioManager.OnAudioFocusChangeListener f16321b;

    /* JADX INFO: renamed from: c */
    public final Handler f16322c;

    /* JADX INFO: renamed from: d */
    public final uc0 f16323d;

    /* JADX INFO: renamed from: e */
    public final boolean f16324e;

    /* JADX INFO: renamed from: f */
    @hib
    public final Object f16325f;

    /* JADX INFO: renamed from: ce0$b */
    public static final class C2286b {

        /* JADX INFO: renamed from: a */
        public int f16326a;

        /* JADX INFO: renamed from: b */
        @hib
        public AudioManager.OnAudioFocusChangeListener f16327b;

        /* JADX INFO: renamed from: c */
        @hib
        public Handler f16328c;

        /* JADX INFO: renamed from: d */
        public uc0 f16329d;

        /* JADX INFO: renamed from: e */
        public boolean f16330e;

        private static boolean isValidFocusGain(int i) {
            return i == 1 || i == 2 || i == 3 || i == 4;
        }

        public ce0 build() {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f16327b;
            if (onAudioFocusChangeListener != null) {
                return new ce0(this.f16326a, onAudioFocusChangeListener, (Handler) v80.checkNotNull(this.f16328c), this.f16329d, this.f16330e);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        @op1
        public C2286b setAudioAttributes(uc0 uc0Var) {
            v80.checkNotNull(uc0Var);
            this.f16329d = uc0Var;
            return this;
        }

        @op1
        public C2286b setFocusGain(int i) {
            v80.checkArgument(isValidFocusGain(i));
            this.f16326a = i;
            return this;
        }

        @op1
        public C2286b setOnAudioFocusChangeListener(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
            return setOnAudioFocusChangeListener(onAudioFocusChangeListener, new Handler(Looper.getMainLooper()));
        }

        @op1
        public C2286b setWillPauseWhenDucked(boolean z) {
            this.f16330e = z;
            return this;
        }

        public C2286b(int i) {
            this.f16329d = uc0.f87467h;
            this.f16326a = i;
        }

        @op1
        public C2286b setOnAudioFocusChangeListener(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            v80.checkNotNull(onAudioFocusChangeListener);
            v80.checkNotNull(handler);
            this.f16327b = onAudioFocusChangeListener;
            this.f16328c = handler;
            return this;
        }

        private C2286b(ce0 ce0Var) {
            this.f16326a = ce0Var.getFocusGain();
            this.f16327b = ce0Var.getOnAudioFocusChangeListener();
            this.f16328c = ce0Var.getFocusChangeHandler();
            this.f16329d = ce0Var.getAudioAttributes();
            this.f16330e = ce0Var.willPauseWhenDucked();
        }
    }

    /* JADX INFO: renamed from: ce0$c */
    public static class C2287c implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: a */
        public final Handler f16331a;

        /* JADX INFO: renamed from: b */
        public final AudioManager.OnAudioFocusChangeListener f16332b;

        public C2287c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.f16332b = onAudioFocusChangeListener;
            this.f16331a = t0i.createHandler(handler.getLooper(), null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAudioFocusChange$0(int i) {
            this.f16332b.onAudioFocusChange(i);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i) {
            t0i.postOrRun(this.f16331a, new Runnable() { // from class: de0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f29455a.lambda$onAudioFocusChange$0(i);
                }
            });
        }
    }

    public ce0(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, uc0 uc0Var, boolean z) {
        this.f16320a = i;
        this.f16322c = handler;
        this.f16323d = uc0Var;
        this.f16324e = z;
        this.f16321b = onAudioFocusChangeListener;
        this.f16325f = new AudioFocusRequest.Builder(i).setAudioAttributes(uc0Var.getAudioAttributesV21().f87481a).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
    }

    @c5e(26)
    /* JADX INFO: renamed from: a */
    public AudioFocusRequest m3912a() {
        return (AudioFocusRequest) v80.checkNotNull(this.f16325f);
    }

    public C2286b buildUpon() {
        return new C2286b();
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce0)) {
            return false;
        }
        ce0 ce0Var = (ce0) obj;
        return this.f16320a == ce0Var.f16320a && this.f16324e == ce0Var.f16324e && Objects.equals(this.f16321b, ce0Var.f16321b) && Objects.equals(this.f16322c, ce0Var.f16322c) && Objects.equals(this.f16323d, ce0Var.f16323d);
    }

    public uc0 getAudioAttributes() {
        return this.f16323d;
    }

    public Handler getFocusChangeHandler() {
        return this.f16322c;
    }

    public int getFocusGain() {
        return this.f16320a;
    }

    public AudioManager.OnAudioFocusChangeListener getOnAudioFocusChangeListener() {
        return this.f16321b;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16320a), this.f16321b, this.f16322c, this.f16323d, Boolean.valueOf(this.f16324e));
    }

    public boolean willPauseWhenDucked() {
        return this.f16324e;
    }
}
