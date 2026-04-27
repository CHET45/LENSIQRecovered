package p000;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class qf5 implements zdg {

    /* JADX INFO: renamed from: f */
    public static final int f74276f = 0;

    /* JADX INFO: renamed from: g */
    public static final int f74277g = 1;

    /* JADX INFO: renamed from: h */
    public static final int f74278h = 2;

    /* JADX INFO: renamed from: i */
    public static final int f74279i = 2;

    /* JADX INFO: renamed from: a */
    public final p93 f74280a = new p93();

    /* JADX INFO: renamed from: b */
    public final ieg f74281b = new ieg();

    /* JADX INFO: renamed from: c */
    public final Deque<keg> f74282c = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    public int f74283d;

    /* JADX INFO: renamed from: e */
    public boolean f74284e;

    /* JADX INFO: renamed from: qf5$a */
    public class C11463a extends keg {
        public C11463a() {
        }

        @Override // p000.ul3
        public void release() {
            qf5.this.releaseOutputBuffer(this);
        }
    }

    /* JADX INFO: renamed from: qf5$b */
    public static final class C11464b implements xdg {

        /* JADX INFO: renamed from: a */
        public final long f74286a;

        /* JADX INFO: renamed from: b */
        public final kx7<o93> f74287b;

        public C11464b(long j, kx7<o93> kx7Var) {
            this.f74286a = j;
            this.f74287b = kx7Var;
        }

        @Override // p000.xdg
        public List<o93> getCues(long j) {
            return j >= this.f74286a ? this.f74287b : kx7.m15110of();
        }

        @Override // p000.xdg
        public long getEventTime(int i) {
            u80.checkArgument(i == 0);
            return this.f74286a;
        }

        @Override // p000.xdg
        public int getEventTimeCount() {
            return 1;
        }

        @Override // p000.xdg
        public int getNextEventTimeIndex(long j) {
            return this.f74286a > j ? 0 : -1;
        }
    }

    public qf5() {
        for (int i = 0; i < 2; i++) {
            this.f74282c.addFirst(new C11463a());
        }
        this.f74283d = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseOutputBuffer(keg kegVar) {
        u80.checkState(this.f74282c.size() < 2);
        u80.checkArgument(!this.f74282c.contains(kegVar));
        kegVar.clear();
        this.f74282c.addFirst(kegVar);
    }

    @Override // p000.il3
    public void flush() {
        u80.checkState(!this.f74284e);
        this.f74281b.clear();
        this.f74283d = 0;
    }

    @Override // p000.il3
    public String getName() {
        return "ExoplayerCuesDecoder";
    }

    @Override // p000.il3
    public void release() {
        this.f74284e = true;
    }

    @Override // p000.zdg
    public void setPositionUs(long j) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.il3
    @hib
    public ieg dequeueInputBuffer() throws beg {
        u80.checkState(!this.f74284e);
        if (this.f74283d != 0) {
            return null;
        }
        this.f74283d = 1;
        return this.f74281b;
    }

    @Override // p000.il3
    @hib
    public keg dequeueOutputBuffer() throws beg {
        u80.checkState(!this.f74284e);
        if (this.f74283d != 2 || this.f74282c.isEmpty()) {
            return null;
        }
        keg kegVarRemoveFirst = this.f74282c.removeFirst();
        if (this.f74281b.isEndOfStream()) {
            kegVarRemoveFirst.addFlag(4);
        } else {
            ieg iegVar = this.f74281b;
            kegVarRemoveFirst.setContent(this.f74281b.f82164f, new C11464b(iegVar.f82164f, this.f74280a.decode(((ByteBuffer) u80.checkNotNull(iegVar.f82162d)).array())), 0L);
        }
        this.f74281b.clear();
        this.f74283d = 0;
        return kegVarRemoveFirst;
    }

    @Override // p000.il3
    public void queueInputBuffer(ieg iegVar) throws beg {
        u80.checkState(!this.f74284e);
        u80.checkState(this.f74283d == 1);
        u80.checkArgument(this.f74281b == iegVar);
        this.f74283d = 2;
    }
}
