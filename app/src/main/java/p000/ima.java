package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.mediarouter.C1315R;
import androidx.mediarouter.app.C1325c;
import androidx.mediarouter.media.C1336f;
import androidx.mediarouter.media.C1337g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public class ima extends l20 {

    /* JADX INFO: renamed from: M1 */
    public static final String f47447M1 = "MediaRouteChooserDialog";

    /* JADX INFO: renamed from: V1 */
    public static final int f47448V1 = 0;

    /* JADX INFO: renamed from: Z1 */
    public static final int f47449Z1 = 1;

    /* JADX INFO: renamed from: a2 */
    public static final int f47450a2 = 2;

    /* JADX INFO: renamed from: b2 */
    public static final int f47451b2 = 1;

    /* JADX INFO: renamed from: C */
    public Context f47452C;

    /* JADX INFO: renamed from: F */
    public C1336f f47453F;

    /* JADX INFO: renamed from: H */
    public List<C1337g.i> f47454H;

    /* JADX INFO: renamed from: L */
    public ImageButton f47455L;

    /* JADX INFO: renamed from: M */
    public C7503d f47456M;

    /* JADX INFO: renamed from: N */
    public RecyclerView f47457N;

    /* JADX INFO: renamed from: Q */
    public boolean f47458Q;

    /* JADX INFO: renamed from: X */
    public long f47459X;

    /* JADX INFO: renamed from: Y */
    public long f47460Y;

    /* JADX INFO: renamed from: Z */
    public final Handler f47461Z;

    /* JADX INFO: renamed from: f */
    public final C1337g f47462f;

    /* JADX INFO: renamed from: m */
    public final C7502c f47463m;

    /* JADX INFO: renamed from: ima$a */
    public class HandlerC7500a extends Handler {
        public HandlerC7500a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            ima.this.m13183d((List) message.obj);
        }
    }

    /* JADX INFO: renamed from: ima$b */
    public class ViewOnClickListenerC7501b implements View.OnClickListener {
        public ViewOnClickListenerC7501b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ima.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: ima$c */
    public final class C7502c extends C1337g.b {
        public C7502c() {
        }

        @Override // androidx.mediarouter.media.C1337g.b
        public void onRouteAdded(C1337g c1337g, C1337g.i iVar) {
            ima.this.refreshRoutes();
        }

        @Override // androidx.mediarouter.media.C1337g.b
        public void onRouteChanged(C1337g c1337g, C1337g.i iVar) {
            ima.this.refreshRoutes();
        }

        @Override // androidx.mediarouter.media.C1337g.b
        public void onRouteRemoved(C1337g c1337g, C1337g.i iVar) {
            ima.this.refreshRoutes();
        }

        @Override // androidx.mediarouter.media.C1337g.b
        public void onRouteSelected(C1337g c1337g, C1337g.i iVar) {
            ima.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: ima$d */
    public final class C7503d extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* JADX INFO: renamed from: h */
        public static final String f47467h = "RecyclerAdapter";

        /* JADX INFO: renamed from: a */
        public final ArrayList<b> f47468a = new ArrayList<>();

        /* JADX INFO: renamed from: b */
        public final LayoutInflater f47469b;

        /* JADX INFO: renamed from: c */
        public final Drawable f47470c;

        /* JADX INFO: renamed from: d */
        public final Drawable f47471d;

        /* JADX INFO: renamed from: e */
        public final Drawable f47472e;

        /* JADX INFO: renamed from: f */
        public final Drawable f47473f;

        /* JADX INFO: renamed from: ima$d$a */
        public class a extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a */
            public TextView f47475a;

            public a(View view) {
                super(view);
                this.f47475a = (TextView) view.findViewById(C1315R.id.mr_picker_header_name);
            }

            public void bindHeaderView(b bVar) {
                this.f47475a.setText(bVar.getData().toString());
            }
        }

        /* JADX INFO: renamed from: ima$d$b */
        public class b {

            /* JADX INFO: renamed from: a */
            public final Object f47477a;

            /* JADX INFO: renamed from: b */
            public final int f47478b;

            public b(Object obj) {
                this.f47477a = obj;
                if (obj instanceof String) {
                    this.f47478b = 1;
                } else if (obj instanceof C1337g.i) {
                    this.f47478b = 2;
                } else {
                    this.f47478b = 0;
                    Log.w(C7503d.f47467h, "Wrong type of data passed to Item constructor");
                }
            }

            public Object getData() {
                return this.f47477a;
            }

            public int getType() {
                return this.f47478b;
            }
        }

        /* JADX INFO: renamed from: ima$d$c */
        public class c extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a */
            public final View f47480a;

            /* JADX INFO: renamed from: b */
            public final ImageView f47481b;

            /* JADX INFO: renamed from: c */
            public final ProgressBar f47482c;

            /* JADX INFO: renamed from: d */
            public final TextView f47483d;

            /* JADX INFO: renamed from: ima$d$c$a */
            public class a implements View.OnClickListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C1337g.i f47485a;

                public a(C1337g.i iVar) {
                    this.f47485a = iVar;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    this.f47485a.select();
                    c.this.f47481b.setVisibility(4);
                    c.this.f47482c.setVisibility(0);
                }
            }

            public c(View view) {
                super(view);
                this.f47480a = view;
                this.f47481b = (ImageView) view.findViewById(C1315R.id.mr_picker_route_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(C1315R.id.mr_picker_route_progress_bar);
                this.f47482c = progressBar;
                this.f47483d = (TextView) view.findViewById(C1315R.id.mr_picker_route_name);
                C1325c.m2216p(ima.this.f47452C, progressBar);
            }

            public void bindRouteView(b bVar) {
                C1337g.i iVar = (C1337g.i) bVar.getData();
                this.f47480a.setVisibility(0);
                this.f47482c.setVisibility(4);
                this.f47480a.setOnClickListener(new a(iVar));
                this.f47483d.setText(iVar.getName());
                this.f47481b.setImageDrawable(C7503d.this.m13184a(iVar));
            }
        }

        public C7503d() {
            this.f47469b = LayoutInflater.from(ima.this.f47452C);
            this.f47470c = C1325c.m2207g(ima.this.f47452C);
            this.f47471d = C1325c.m2214n(ima.this.f47452C);
            this.f47472e = C1325c.m2210j(ima.this.f47452C);
            this.f47473f = C1325c.m2211k(ima.this.f47452C);
            m13185b();
        }

        private Drawable getDefaultIconDrawable(C1337g.i iVar) {
            int deviceType = iVar.getDeviceType();
            return deviceType != 1 ? deviceType != 2 ? iVar.isGroup() ? this.f47473f : this.f47470c : this.f47472e : this.f47471d;
        }

        /* JADX INFO: renamed from: a */
        public Drawable m13184a(C1337g.i iVar) {
            Uri iconUri = iVar.getIconUri();
            if (iconUri != null) {
                try {
                    Drawable drawableCreateFromStream = Drawable.createFromStream(ima.this.f47452C.getContentResolver().openInputStream(iconUri), null);
                    if (drawableCreateFromStream != null) {
                        return drawableCreateFromStream;
                    }
                } catch (IOException e) {
                    Log.w(f47467h, "Failed to load " + iconUri, e);
                }
            }
            return getDefaultIconDrawable(iVar);
        }

        /* JADX INFO: renamed from: b */
        public void m13185b() {
            this.f47468a.clear();
            this.f47468a.add(new b(ima.this.f47452C.getString(C1315R.string.mr_chooser_title)));
            Iterator<C1337g.i> it = ima.this.f47454H.iterator();
            while (it.hasNext()) {
                this.f47468a.add(new b(it.next()));
            }
            notifyDataSetChanged();
        }

        public b getItem(int i) {
            return this.f47468a.get(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f47468a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return this.f47468a.get(i).getType();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = getItemViewType(i);
            b item = getItem(i);
            if (itemViewType == 1) {
                ((a) viewHolder).bindHeaderView(item);
            } else if (itemViewType != 2) {
                Log.w(f47467h, "Cannot bind item to ViewHolder because of wrong view type");
            } else {
                ((c) viewHolder).bindRouteView(item);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return new a(this.f47469b.inflate(C1315R.layout.mr_picker_header_item, viewGroup, false));
            }
            if (i == 2) {
                return new c(this.f47469b.inflate(C1315R.layout.mr_picker_route_item, viewGroup, false));
            }
            Log.w(f47467h, "Cannot create ViewHolder because of wrong view type");
            return null;
        }
    }

    /* JADX INFO: renamed from: ima$e */
    public static final class C7504e implements Comparator<C1337g.i> {

        /* JADX INFO: renamed from: a */
        public static final C7504e f47487a = new C7504e();

        @Override // java.util.Comparator
        public int compare(C1337g.i iVar, C1337g.i iVar2) {
            return iVar.getName().compareToIgnoreCase(iVar2.getName());
        }
    }

    public ima(Context context) {
        this(context, 0);
    }

    /* JADX INFO: renamed from: c */
    public void m13182c() {
        getWindow().setLayout(gma.getDialogWidthForDynamicGroup(this.f47452C), gma.getDialogHeight(this.f47452C));
    }

    /* JADX INFO: renamed from: d */
    public void m13183d(List<C1337g.i> list) {
        this.f47460Y = SystemClock.uptimeMillis();
        this.f47454H.clear();
        this.f47454H.addAll(list);
        this.f47456M.m13185b();
    }

    @efb
    public C1336f getRouteSelector() {
        return this.f47453F;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    @un1
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f47458Q = true;
        this.f47462f.addCallback(this.f47453F, this.f47463m, 1);
        refreshRoutes();
    }

    @Override // p000.l20, p000.qj2, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1315R.layout.mr_picker_dialog);
        C1325c.m2215o(this.f47452C, this);
        this.f47454H = new ArrayList();
        ImageButton imageButton = (ImageButton) findViewById(C1315R.id.mr_picker_close_button);
        this.f47455L = imageButton;
        imageButton.setOnClickListener(new ViewOnClickListenerC7501b());
        this.f47456M = new C7503d();
        RecyclerView recyclerView = (RecyclerView) findViewById(C1315R.id.mr_picker_list);
        this.f47457N = recyclerView;
        recyclerView.setAdapter(this.f47456M);
        this.f47457N.setLayoutManager(new LinearLayoutManager(this.f47452C));
        m13182c();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    @un1
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f47458Q = false;
        this.f47462f.removeCallback(this.f47463m);
        this.f47461Z.removeMessages(1);
    }

    public boolean onFilterRoute(@efb C1337g.i iVar) {
        return !iVar.isDefaultOrBluetooth() && iVar.isEnabled() && iVar.matchesSelector(this.f47453F);
    }

    public void onFilterRoutes(@efb List<C1337g.i> list) {
        int size = list.size();
        while (true) {
            int i = size - 1;
            if (size <= 0) {
                return;
            }
            if (!onFilterRoute(list.get(i))) {
                list.remove(i);
            }
            size = i;
        }
    }

    public void refreshRoutes() {
        if (this.f47458Q) {
            ArrayList arrayList = new ArrayList(this.f47462f.getRoutes());
            onFilterRoutes(arrayList);
            Collections.sort(arrayList, C7504e.f47487a);
            if (SystemClock.uptimeMillis() - this.f47460Y >= this.f47459X) {
                m13183d(arrayList);
                return;
            }
            this.f47461Z.removeMessages(1);
            Handler handler = this.f47461Z;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.f47460Y + this.f47459X);
        }
    }

    public void setRouteSelector(@efb C1336f c1336f) {
        if (c1336f == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f47453F.equals(c1336f)) {
            return;
        }
        this.f47453F = c1336f;
        if (this.f47458Q) {
            this.f47462f.removeCallback(this.f47463m);
            this.f47462f.addCallback(c1336f, this.f47463m, 1);
        }
        refreshRoutes();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ima(Context context, int i) {
        Context contextM2202b = C1325c.m2202b(context, i, false);
        super(contextM2202b, C1325c.m2203c(contextM2202b));
        this.f47453F = C1336f.f10289d;
        this.f47461Z = new HandlerC7500a();
        Context context2 = getContext();
        this.f47462f = C1337g.getInstance(context2);
        this.f47463m = new C7502c();
        this.f47452C = context2;
        this.f47459X = context2.getResources().getInteger(C1315R.integer.mr_update_routes_delay_ms);
    }
}
