package p000;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@ovh
@p7e({p7e.EnumC10826a.f69935b})
public final class w1e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC14361b f93108a;

    /* JADX INFO: renamed from: b */
    public final ArrayDeque<jhc> f93109b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c */
    public final ArrayDeque<C14360a> f93110c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d */
    public final PriorityQueue<C14360a> f93111d = new PriorityQueue<>();

    /* JADX INFO: renamed from: e */
    public int f93112e = -1;

    /* JADX INFO: renamed from: f */
    @hib
    public C14360a f93113f;

    /* JADX INFO: renamed from: w1e$a */
    public static final class C14360a implements Comparable<C14360a> {

        /* JADX INFO: renamed from: b */
        public long f93115b = -9223372036854775807L;

        /* JADX INFO: renamed from: a */
        public final List<jhc> f93114a = new ArrayList();

        public void init(long j, jhc jhcVar) {
            v80.checkArgument(j != -9223372036854775807L);
            v80.checkState(this.f93114a.isEmpty());
            this.f93115b = j;
            this.f93114a.add(jhcVar);
        }

        @Override // java.lang.Comparable
        public int compareTo(C14360a c14360a) {
            return Long.compare(this.f93115b, c14360a.f93115b);
        }
    }

    /* JADX INFO: renamed from: w1e$b */
    public interface InterfaceC14361b {
        void consume(long j, jhc jhcVar);
    }

    public w1e(InterfaceC14361b interfaceC14361b) {
        this.f93108a = interfaceC14361b;
    }

    private jhc copy(jhc jhcVar) {
        jhc jhcVar2 = this.f93109b.isEmpty() ? new jhc() : this.f93109b.pop();
        jhcVar2.reset(jhcVar.bytesLeft());
        System.arraycopy(jhcVar.getData(), jhcVar.getPosition(), jhcVar2.getData(), 0, jhcVar2.bytesLeft());
        return jhcVar2;
    }

    private void flushQueueDownToSize(int i) {
        while (this.f93111d.size() > i) {
            C14360a c14360a = (C14360a) t0i.castNonNull(this.f93111d.poll());
            for (int i2 = 0; i2 < c14360a.f93114a.size(); i2++) {
                this.f93108a.consume(c14360a.f93115b, c14360a.f93114a.get(i2));
                this.f93109b.push(c14360a.f93114a.get(i2));
            }
            c14360a.f93114a.clear();
            C14360a c14360a2 = this.f93113f;
            if (c14360a2 != null && c14360a2.f93115b == c14360a.f93115b) {
                this.f93113f = null;
            }
            this.f93110c.push(c14360a);
        }
    }

    public void add(long j, jhc jhcVar) {
        int i = this.f93112e;
        if (i == 0 || (i != -1 && this.f93111d.size() >= this.f93112e && j < ((C14360a) t0i.castNonNull(this.f93111d.peek())).f93115b)) {
            this.f93108a.consume(j, jhcVar);
            return;
        }
        jhc jhcVarCopy = copy(jhcVar);
        C14360a c14360a = this.f93113f;
        if (c14360a != null && j == c14360a.f93115b) {
            c14360a.f93114a.add(jhcVarCopy);
            return;
        }
        C14360a c14360a2 = this.f93110c.isEmpty() ? new C14360a() : this.f93110c.pop();
        c14360a2.init(j, jhcVarCopy);
        this.f93111d.add(c14360a2);
        this.f93113f = c14360a2;
        int i2 = this.f93112e;
        if (i2 != -1) {
            flushQueueDownToSize(i2);
        }
    }

    public void clear() {
        this.f93111d.clear();
    }

    public void flush() {
        flushQueueDownToSize(0);
    }

    public int getMaxSize() {
        return this.f93112e;
    }

    public void setMaxSize(int i) {
        v80.checkState(i >= 0);
        this.f93112e = i;
        flushQueueDownToSize(i);
    }
}
