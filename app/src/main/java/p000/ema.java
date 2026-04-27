package p000;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.mediarouter.C1315R;
import androidx.mediarouter.app.C1325c;
import androidx.mediarouter.media.C1336f;
import androidx.mediarouter.media.C1337g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ema extends l20 {

    /* JADX INFO: renamed from: M1 */
    public static final int f33477M1 = 1;

    /* JADX INFO: renamed from: Y */
    public static final String f33478Y = "MediaRouteChooserDialog";

    /* JADX INFO: renamed from: Z */
    public static final long f33479Z = 300;

    /* JADX INFO: renamed from: C */
    public TextView f33480C;

    /* JADX INFO: renamed from: F */
    public C1336f f33481F;

    /* JADX INFO: renamed from: H */
    public ArrayList<C1337g.i> f33482H;

    /* JADX INFO: renamed from: L */
    public C5387c f33483L;

    /* JADX INFO: renamed from: M */
    public ListView f33484M;

    /* JADX INFO: renamed from: N */
    public boolean f33485N;

    /* JADX INFO: renamed from: Q */
    public long f33486Q;

    /* JADX INFO: renamed from: X */
    public final Handler f33487X;

    /* JADX INFO: renamed from: f */
    public final C1337g f33488f;

    /* JADX INFO: renamed from: m */
    public final C5386b f33489m;

    /* JADX INFO: renamed from: ema$a */
    public class HandlerC5385a extends Handler {
        public HandlerC5385a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            ema.this.m10128d((List) message.obj);
        }
    }

    /* JADX INFO: renamed from: ema$b */
    public final class C5386b extends C1337g.b {
        public C5386b() {
        }

        @Override // androidx.mediarouter.media.C1337g.b
        public void onRouteAdded(C1337g c1337g, C1337g.i iVar) {
            ema.this.refreshRoutes();
        }

        @Override // androidx.mediarouter.media.C1337g.b
        public void onRouteChanged(C1337g c1337g, C1337g.i iVar) {
            ema.this.refreshRoutes();
        }

        @Override // androidx.mediarouter.media.C1337g.b
        public void onRouteRemoved(C1337g c1337g, C1337g.i iVar) {
            ema.this.refreshRoutes();
        }

        @Override // androidx.mediarouter.media.C1337g.b
        public void onRouteSelected(C1337g c1337g, C1337g.i iVar) {
            ema.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: ema$c */
    public final class C5387c extends ArrayAdapter<C1337g.i> implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a */
        public final LayoutInflater f33492a;

        /* JADX INFO: renamed from: b */
        public final Drawable f33493b;

        /* JADX INFO: renamed from: c */
        public final Drawable f33494c;

        /* JADX INFO: renamed from: d */
        public final Drawable f33495d;

        /* JADX INFO: renamed from: e */
        public final Drawable f33496e;

        public C5387c(Context context, List<C1337g.i> list) {
            super(context, 0, list);
            this.f33492a = LayoutInflater.from(context);
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{C1315R.attr.mediaRouteDefaultIconDrawable, C1315R.attr.mediaRouteTvIconDrawable, C1315R.attr.mediaRouteSpeakerIconDrawable, C1315R.attr.mediaRouteSpeakerGroupIconDrawable});
            this.f33493b = typedArrayObtainStyledAttributes.getDrawable(0);
            this.f33494c = typedArrayObtainStyledAttributes.getDrawable(1);
            this.f33495d = typedArrayObtainStyledAttributes.getDrawable(2);
            this.f33496e = typedArrayObtainStyledAttributes.getDrawable(3);
            typedArrayObtainStyledAttributes.recycle();
        }

        private Drawable getDefaultIconDrawable(C1337g.i iVar) {
            int deviceType = iVar.getDeviceType();
            return deviceType != 1 ? deviceType != 2 ? iVar.isGroup() ? this.f33496e : this.f33493b : this.f33495d : this.f33494c;
        }

        private Drawable getIconDrawable(C1337g.i iVar) {
            Uri iconUri = iVar.getIconUri();
            if (iconUri != null) {
                try {
                    Drawable drawableCreateFromStream = Drawable.createFromStream(getContext().getContentResolver().openInputStream(iconUri), null);
                    if (drawableCreateFromStream != null) {
                        return drawableCreateFromStream;
                    }
                } catch (IOException e) {
                    Log.w("MediaRouteChooserDialog", "Failed to load " + iconUri, e);
                }
            }
            return getDefaultIconDrawable(iVar);
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return false;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = this.f33492a.inflate(C1315R.layout.mr_chooser_list_item, viewGroup, false);
            }
            C1337g.i iVar = (C1337g.i) getItem(i);
            TextView textView = (TextView) view.findViewById(C1315R.id.mr_chooser_route_name);
            TextView textView2 = (TextView) view.findViewById(C1315R.id.mr_chooser_route_desc);
            textView.setText(iVar.getName());
            String description = iVar.getDescription();
            if ((iVar.getConnectionState() == 2 || iVar.getConnectionState() == 1) && !TextUtils.isEmpty(description)) {
                textView.setGravity(80);
                textView2.setVisibility(0);
                textView2.setText(description);
            } else {
                textView.setGravity(16);
                textView2.setVisibility(8);
                textView2.setText("");
            }
            view.setEnabled(iVar.isEnabled());
            ImageView imageView = (ImageView) view.findViewById(C1315R.id.mr_chooser_route_icon);
            if (imageView != null) {
                imageView.setImageDrawable(getIconDrawable(iVar));
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i) {
            return ((C1337g.i) getItem(i)).isEnabled();
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C1337g.i iVar = (C1337g.i) getItem(i);
            if (iVar.isEnabled()) {
                iVar.select();
                ema.this.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: ema$d */
    public static final class C5388d implements Comparator<C1337g.i> {

        /* JADX INFO: renamed from: a */
        public static final C5388d f33498a = new C5388d();

        @Override // java.util.Comparator
        public int compare(C1337g.i iVar, C1337g.i iVar2) {
            return iVar.getName().compareToIgnoreCase(iVar2.getName());
        }
    }

    public ema(Context context) {
        this(context, 0);
    }

    /* JADX INFO: renamed from: c */
    public void m10127c() {
        getWindow().setLayout(gma.getDialogWidth(getContext()), -2);
    }

    /* JADX INFO: renamed from: d */
    public void m10128d(List<C1337g.i> list) {
        this.f33486Q = SystemClock.uptimeMillis();
        this.f33482H.clear();
        this.f33482H.addAll(list);
        this.f33483L.notifyDataSetChanged();
    }

    @efb
    public C1336f getRouteSelector() {
        return this.f33481F;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33485N = true;
        this.f33488f.addCallback(this.f33481F, this.f33489m, 1);
        refreshRoutes();
    }

    @Override // p000.l20, p000.qj2, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1315R.layout.mr_chooser_dialog);
        this.f33482H = new ArrayList<>();
        this.f33483L = new C5387c(getContext(), this.f33482H);
        ListView listView = (ListView) findViewById(C1315R.id.mr_chooser_list);
        this.f33484M = listView;
        listView.setAdapter((ListAdapter) this.f33483L);
        this.f33484M.setOnItemClickListener(this.f33483L);
        this.f33484M.setEmptyView(findViewById(R.id.empty));
        this.f33480C = (TextView) findViewById(C1315R.id.mr_chooser_title);
        m10127c();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f33485N = false;
        this.f33488f.removeCallback(this.f33489m);
        this.f33487X.removeMessages(1);
        super.onDetachedFromWindow();
    }

    public boolean onFilterRoute(@efb C1337g.i iVar) {
        return !iVar.isDefaultOrBluetooth() && iVar.isEnabled() && iVar.matchesSelector(this.f33481F);
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
        if (this.f33485N) {
            ArrayList arrayList = new ArrayList(this.f33488f.getRoutes());
            onFilterRoutes(arrayList);
            Collections.sort(arrayList, C5388d.f33498a);
            if (SystemClock.uptimeMillis() - this.f33486Q >= 300) {
                m10128d(arrayList);
                return;
            }
            this.f33487X.removeMessages(1);
            Handler handler = this.f33487X;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.f33486Q + 300);
        }
    }

    public void setRouteSelector(@efb C1336f c1336f) {
        if (c1336f == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f33481F.equals(c1336f)) {
            return;
        }
        this.f33481F = c1336f;
        if (this.f33485N) {
            this.f33488f.removeCallback(this.f33489m);
            this.f33488f.addCallback(c1336f, this.f33489m, 1);
        }
        refreshRoutes();
    }

    @Override // p000.l20, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.f33480C.setText(charSequence);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ema(Context context, int i) {
        Context contextM2202b = C1325c.m2202b(context, i, false);
        super(contextM2202b, C1325c.m2203c(contextM2202b));
        this.f33481F = C1336f.f10289d;
        this.f33487X = new HandlerC5385a();
        this.f33488f = C1337g.getInstance(getContext());
        this.f33489m = new C5386b();
    }

    @Override // p000.l20, android.app.Dialog
    public void setTitle(int i) {
        this.f33480C.setText(i);
    }
}
