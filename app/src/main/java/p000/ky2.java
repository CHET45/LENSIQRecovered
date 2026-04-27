package p000;

import java.util.concurrent.TimeoutException;
import p000.it6;
import p000.n4g;
import p000.w2f;

/* JADX INFO: loaded from: classes7.dex */
public final class ky2 {

    /* JADX INFO: renamed from: ky2$a */
    public static class C8552a<ReqT> extends it6.AbstractC7594a<ReqT> {

        /* JADX INFO: renamed from: b */
        public final fx2 f55618b;

        public C8552a(w2f.AbstractC14368a<ReqT> abstractC14368a, fx2 fx2Var) {
            super(abstractC14368a);
            this.f55618b = fx2Var;
        }

        @Override // p000.it6.AbstractC7594a, p000.it6, p000.hic, p000.w2f.AbstractC14368a
        public void onCancel() {
            fx2 fx2VarAttach = this.f55618b.attach();
            try {
                super.onCancel();
            } finally {
                this.f55618b.detach(fx2VarAttach);
            }
        }

        @Override // p000.it6.AbstractC7594a, p000.it6, p000.hic, p000.w2f.AbstractC14368a
        public void onComplete() {
            fx2 fx2VarAttach = this.f55618b.attach();
            try {
                super.onComplete();
            } finally {
                this.f55618b.detach(fx2VarAttach);
            }
        }

        @Override // p000.it6.AbstractC7594a, p000.it6, p000.hic, p000.w2f.AbstractC14368a
        public void onHalfClose() {
            fx2 fx2VarAttach = this.f55618b.attach();
            try {
                super.onHalfClose();
            } finally {
                this.f55618b.detach(fx2VarAttach);
            }
        }

        @Override // p000.it6, p000.w2f.AbstractC14368a
        public void onMessage(ReqT reqt) {
            fx2 fx2VarAttach = this.f55618b.attach();
            try {
                super.onMessage(reqt);
            } finally {
                this.f55618b.detach(fx2VarAttach);
            }
        }

        @Override // p000.it6.AbstractC7594a, p000.it6, p000.hic, p000.w2f.AbstractC14368a
        public void onReady() {
            fx2 fx2VarAttach = this.f55618b.attach();
            try {
                super.onReady();
            } finally {
                this.f55618b.detach(fx2VarAttach);
            }
        }
    }

    private ky2() {
    }

    public static <ReqT, RespT> w2f.AbstractC14368a<ReqT> interceptCall(fx2 fx2Var, w2f<ReqT, RespT> w2fVar, fta ftaVar, y2f<ReqT, RespT> y2fVar) {
        fx2 fx2VarAttach = fx2Var.attach();
        try {
            return new C8552a(y2fVar.startCall(w2fVar, ftaVar), fx2Var);
        } finally {
            fx2Var.detach(fx2VarAttach);
        }
    }

    @lg5("https://github.com/grpc/grpc-java/issues/1975")
    public static n4g statusFromCancelled(fx2 fx2Var) {
        v7d.checkNotNull(fx2Var, "context must not be null");
        if (!fx2Var.isCancelled()) {
            return null;
        }
        Throwable thCancellationCause = fx2Var.cancellationCause();
        if (thCancellationCause == null) {
            return n4g.f63259f.withDescription("io.grpc.Context was cancelled without error");
        }
        if (thCancellationCause instanceof TimeoutException) {
            return n4g.f63262i.withDescription(thCancellationCause.getMessage()).withCause(thCancellationCause);
        }
        n4g n4gVarFromThrowable = n4g.fromThrowable(thCancellationCause);
        return (n4g.EnumC9694b.UNKNOWN.equals(n4gVarFromThrowable.getCode()) && n4gVarFromThrowable.getCause() == thCancellationCause) ? n4g.f63259f.withDescription("Context cancelled").withCause(thCancellationCause) : n4gVarFromThrowable.withCause(thCancellationCause);
    }
}
