package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.widget.TextView;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.bumptech.glide.RequestBuilder;
import java.util.HashMap;
import java.util.Map;
import p000.mu9;
import p000.vu9;

/* JADX INFO: loaded from: classes7.dex */
public class d77 extends AbstractC14875x2 {

    /* JADX INFO: renamed from: a */
    public final C4654b f28691a;

    /* JADX INFO: renamed from: d77$a */
    public class C4653a implements InterfaceC4655c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ g4e f28692a;

        public C4653a(g4e g4eVar) {
            this.f28692a = g4eVar;
        }

        @Override // p000.d77.InterfaceC4655c
        public void cancel(@efb jmg<?> jmgVar) {
            this.f28692a.clear(jmgVar);
        }

        @Override // p000.d77.InterfaceC4655c
        @efb
        public RequestBuilder<Drawable> load(@efb m90 m90Var) {
            return this.f28692a.load(m90Var.getDestination());
        }
    }

    /* JADX INFO: renamed from: d77$b */
    public static class C4654b extends n90 {

        /* JADX INFO: renamed from: a */
        public final InterfaceC4655c f28693a;

        /* JADX INFO: renamed from: b */
        public final Map<m90, jmg<?>> f28694b = new HashMap(2);

        /* JADX INFO: renamed from: d77$b$a */
        public class a extends xd3<Drawable> {

            /* JADX INFO: renamed from: d */
            public final m90 f28695d;

            public a(@efb m90 m90Var) {
                this.f28695d = m90Var;
            }

            @Override // p000.jmg
            public void onLoadCleared(@hib Drawable drawable) {
                if (this.f28695d.isAttached()) {
                    this.f28695d.clearResult();
                }
            }

            @Override // p000.xd3, p000.jmg
            public void onLoadFailed(@hib Drawable drawable) {
                if (C4654b.this.f28694b.remove(this.f28695d) == null || drawable == null || !this.f28695d.isAttached()) {
                    return;
                }
                sq4.applyIntrinsicBoundsIfEmpty(drawable);
                this.f28695d.setResult(drawable);
            }

            @Override // p000.xd3, p000.jmg
            public void onLoadStarted(@hib Drawable drawable) {
                if (drawable == null || !this.f28695d.isAttached()) {
                    return;
                }
                sq4.applyIntrinsicBoundsIfEmpty(drawable);
                this.f28695d.setResult(drawable);
            }

            @Override // p000.jmg
            public /* bridge */ /* synthetic */ void onResourceReady(@efb Object obj, @hib afh afhVar) {
                onResourceReady((Drawable) obj, (afh<? super Drawable>) afhVar);
            }

            public void onResourceReady(@efb Drawable drawable, @hib afh<? super Drawable> afhVar) {
                if (C4654b.this.f28694b.remove(this.f28695d) == null || !this.f28695d.isAttached()) {
                    return;
                }
                sq4.applyIntrinsicBoundsIfEmpty(drawable);
                this.f28695d.setResult(drawable);
            }
        }

        public C4654b(@efb InterfaceC4655c interfaceC4655c) {
            this.f28693a = interfaceC4655c;
        }

        @Override // p000.n90
        public void cancel(@efb m90 m90Var) {
            jmg<?> jmgVarRemove = this.f28694b.remove(m90Var);
            if (jmgVarRemove != null) {
                this.f28693a.cancel(jmgVarRemove);
            }
        }

        @Override // p000.n90
        public void load(@efb m90 m90Var) {
            a aVar = new a(m90Var);
            this.f28694b.put(m90Var, aVar);
            this.f28693a.load(m90Var).into(aVar);
        }

        @Override // p000.n90
        @hib
        public Drawable placeholder(@efb m90 m90Var) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d77$c */
    public interface InterfaceC4655c {
        void cancel(@efb jmg<?> jmgVar);

        @efb
        RequestBuilder<Drawable> load(@efb m90 m90Var);
    }

    public d77(@efb InterfaceC4655c interfaceC4655c) {
        this.f28691a = new C4654b(interfaceC4655c);
    }

    @efb
    public static d77 create(@efb Context context) {
        return create(ComponentCallbacks2C2485a.with(context));
    }

    @Override // p000.AbstractC14875x2, p000.tu9
    public void afterSetText(@efb TextView textView) {
        p90.schedule(textView);
    }

    @Override // p000.AbstractC14875x2, p000.tu9
    public void beforeSetText(@efb TextView textView, @efb Spanned spanned) {
        p90.unschedule(textView);
    }

    @Override // p000.AbstractC14875x2, p000.tu9
    public void configureConfiguration(@efb mu9.C9528b c9528b) {
        c9528b.asyncDrawableLoader(this.f28691a);
    }

    @Override // p000.AbstractC14875x2, p000.tu9
    public void configureSpansFactory(@efb vu9.InterfaceC14262a interfaceC14262a) {
        interfaceC14262a.setFactory(os7.class, new zv7());
    }

    @efb
    public static d77 create(@efb g4e g4eVar) {
        return create(new C4653a(g4eVar));
    }

    @efb
    public static d77 create(@efb InterfaceC4655c interfaceC4655c) {
        return new d77(interfaceC4655c);
    }
}
